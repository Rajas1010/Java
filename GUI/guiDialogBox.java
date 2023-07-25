import javax.swing.*;
public class guiDialogBox
{
	public static void main(String args[])
	{
		//JOptionPane.showMessageDialog(null,"NOTHING","popUp",JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null,"TRUE ","popUp",JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null,"REALLY ?","popUp",JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null,"VIRUS","popUp",JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null,"System Failed","popUp",JOptionPane.ERROR_MESSAGE);
		
		//JOptionPane.showConfirmDialog(null,"code/?","popUp",JOptionPane.YES_NO_CANCEL_OPTION);
		//System.out.println(JOptionPane.showConfirmDialog(null,"code/?","popUp",JOptionPane.YES_NO_CANCEL_OPTION));
		
		int answer=JOptionPane.showConfirmDialog(null,"code/?","popUp",JOptionPane.YES_NO_CANCEL_OPTION);
		System.out.println(answer);//yes~0, no~1, cancel~2
		
		//String name = JOptionPane.showInputDialog("your name ?");
		//System.out.println("Hello : "+name);
		
		//String[] s={"good","ooh no","blush"};
		//ImageIcon I=new ImageIcon("icon3.jpg");
		//JOptionPane.showOptionDialog(null,"u r awsm","Secret msg",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,I,s,0);
														//Parent component__message__title__option type__mesageType__icon__options__initial value
	}
}