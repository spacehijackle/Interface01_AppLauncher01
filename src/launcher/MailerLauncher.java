package launcher;

import java.awt.Desktop;
import java.net.URI;

import com.launcher.AppLauncher;
import com.menu.MenuOption;

/**
 * メーラーを起動する。
 *
 * @author t.yoshida
 */
public class MailerLauncher implements AppLauncher
{
	// 送信先アドレス
	private String _mailto;

	/**
	 * 送信先アドレスを指定して {@link MailerLauncher} を生成する。
	 *
	 * @param mailto 送信先アドレス
	 */
	public MailerLauncher(String mailto)
	{
		_mailto = mailto;
	}

	@Override
	public boolean isAvailable()
	{
		return true;
	}

	@Override
	public void launch(MenuOption option) throws Exception
	{
		Desktop desktop = Desktop.getDesktop();
		desktop.mail(new URI("mailto:" + _mailto));
	}
}
