package launcher;

import java.awt.Desktop;
import java.net.URI;

import com.launcher.AppLauncher;
import com.menu.MenuOption;

/**
 * ブラウザを起動する。
 *
 * @author t.yoshida
 */
public class BrowserLauncher implements AppLauncher
{
	// URL
	private String _url;

	/**
	 * URLを指定して {@link BrowserLauncher} を生成する。
	 *
	 * @param url URL
	 */
	public BrowserLauncher(String url)
	{
		_url = url;
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
		desktop.browse(new URI(_url));
	}
}
