import java.awt.Container;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
public class MineSweeper {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建JFrame对象作为容器
		JFrame w = new JFrame();
		// 创建mainPanel对象,初始化一个20*30的方格窗体
		GamePanel mainPanel = new GamePanel(20, 30);
		// 获取JFrame应给设置的宽度和高度
		int[] a = mainPanel.returnSize();
		// 设置JFame宽和高
		w.setSize(a[0], a[1]);
		//标题
		w.setTitle("扫雷");
		//窗体关闭则程序退出
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = w.getContentPane();
		c.add(mainPanel);
		w.setVisible(true);
	}
}
/******************************************************/
class GamePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	// 界面行数
	private int rows;
	// 界面列数
	private int cols;
	// 炸弹数
	private int bombCount;
	// 每个方格宽度
	private final int BLOCKWIDTH = 20;
	// 每个方格长度
	private final int BLOCKHEIGHT = 20;
	// 存储界面中每一个方格的绘制信息
	private JLabel[][] labels;
	private  MyButton[][] buttons;
	private final int[][] offset = {{-1, -1}, {0, -1}, {1, -1}, {1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}};
 
	// 构造方法,初始化参数
	public GamePanel(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		this.bombCount = rows * cols / 10;
		this.labels = new JLabel[rows][cols];
		this.buttons = new MyButton[rows][cols];
		this.setLayout(null);
		this.initButtons();
		this.initLabels();
	}
 
	// 界面初始化,绘制扫雷的边框
	private void initLabels(){
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.cols; j++) {
				JLabel l = new JLabel("", JLabel.CENTER);
				// 设置每个小方格的边界
				l.setBounds(j * BLOCKWIDTH, i * BLOCKHEIGHT, BLOCKWIDTH, BLOCKHEIGHT);
				// 绘制方格边框
				l.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				// 设置方格为透明,便于我们填充颜色
				l.setOpaque(true);
				// 背景填充为黄色
				l.setBackground(Color.YELLOW);
				// 将方格加入到容器中(即面板JPanel)
				this.add(l);
				// 将方格存到类变量中,方便公用
				labels[i][j] = l;
			}
		}
		randomBomb();
		writeNumber();
	}
 
 
	// 产生bombCount个炸弹,并在labels中用"*"标注出来
	private void randomBomb() {
		for (int i = 0; i < this.bombCount; i++) {
			// 生成一个随机数表示行坐标
			int rRow = (int) (Math.random() * this.rows);
			// 生成一个随机数表示列坐标
			int rCol = (int) (Math.random() * this.cols);
			// 根据坐标确定JLabel的位置,并显示*
			this.labels[rRow][rCol].setText("*");
			// 设置背景颜色
			this.labels[rRow][rCol].setBackground(Color.DARK_GRAY);
			// 设置*的颜色
			this.labels[rRow][rCol].setForeground(Color.RED);
		}
	}
 
	// 将炸弹的周围标注上数字
	private void writeNumber() {
		for (int  i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.cols; j++) {
				// 如果是炸弹,不标注任何数字
				if (labels[i][j].getText().equals("*")) {
					continue;
				}
				// 如果不是炸弹,遍历它周围的八个方块,将炸弹的总个数标注在这个方格上
				// 方块周围的8个方块中炸弹个数
				int bombCount = 0;
				// 通过偏移量数组循环遍历8个方块
				for (int[] off: offset) {
					int row = i + off[1];
					int col = j + off[0];
					// 判断是否越界,是否为炸弹
					if (verify(row, col) && labels[row][col].getText().equals("*")) {
						bombCount++;
					}
				}
				// 如果炸弹的个数不为0,标注出来
				if (bombCount > 0) {
					labels[i][j].setText(String.valueOf(bombCount));
				}
			}
		}
	}
 
	// 判断位置是否越界
	private boolean verify(int row, int col) {
		return row >= 0 && row < this.rows && col >= 0 && col < this.cols;
	}
 
	// 初始化按钮,将JLabel覆盖住
	private void initButtons() {
		// 循环生成按钮
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				MyButton btn = new MyButton();
				// 根据JLabel大小设置按钮的大小边界
				btn.setBounds(j * BLOCKWIDTH, i * BLOCKHEIGHT, BLOCKWIDTH, BLOCKHEIGHT);
				this.add(btn);
				// 将按钮存在类变量中(当然,实际上存的是对象的引用地址)
				buttons[i][j] = btn;
				btn.row = i;
				btn.col = j;
				// 给按钮添加监听器,注册点击事件
				// (单机按钮时,将执行内部类ActionListener()中的actionPerformed(ActionEvent e)方法)
				btn.addActionListener(new ActionListener() {
 
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						open((MyButton) e.getSource());
					}});
			}
		}
	}
 
	// 单击按钮时打开或成片打开
	private void open(MyButton btn) {
		// 先将当期按钮设置为不可见,即打开了按钮
		btn.setVisible(false);
		// 判断按钮中 是否为数字还是空
		switch (labels[btn.row][btn.col].getText()) {
			// 如果是炸弹则将全部按钮都打开,游戏结束
			case "*" :
				for (int i = 0; i < rows; i++) {
					for (int j = 0; j < cols; j++) {
						buttons[i][j].setVisible(false);
					}
				}
				break;
			// 如果是空的则将他周围空的按钮都打开,进入递归
			case "" :
				for (int[] off: offset) {
					int newRow = btn.row + off[0];
					int newCol = btn.col + off[1];
					if (verify(newRow, newCol)) {
						MyButton sButton = buttons[newRow][newCol];
						if (sButton.isVisible()) {
							open(sButton);
						}
					}
				}
			default:
		}
	}
 
	// 计算宽和高,并传给容器
	public int[] returnSize() {
		// 因为窗体的菜单栏,边框也要占用像素,所以加上20和40修正大小
		int[] a = {this.cols * BLOCKWIDTH + 20, this.rows * BLOCKHEIGHT + 40};
		return a;
	}
}

/***********************************************************/

/*按钮*/
class MyButton extends JButton {
	private static final long serialVersionUID = 1L;
	//按钮坐标值
	protected int row;
	protected int col;
}


