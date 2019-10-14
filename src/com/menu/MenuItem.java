package com.menu;

import com.launcher.AppLauncher;
import com.launcher.AppLauncherException;


/**
 * メニュー項目クラス
 *
 * @author t.yoshida
 */
public class MenuItem
{
	// 項目番号
	private int _no;

	// 項目名
	private String _name;

	// アプリランチャー
	private AppLauncher _launcher;

	/**
	 * メニュー項目を生成する。
	 *
	 * @param no 項目番号
	 * @param name メニュー項目名
	 * @param launcher アプリランチャー
	 */
	MenuItem(int no, String name, AppLauncher launcher)
	{
		_no = no;
		_name = name;
		_launcher = launcher;
	}

	/**
	 * 項目番号を返す。
	 *
	 * @return 項目番号
	 */
	public int getNo()
	{
		return _no;
	}

	/**
	 * 項目名を返す。
	 *
	 * @return 項目名
	 */
	public String getName()
	{
		return _name;
	}

	/**
	 * アプリの起動が可能か否かを返す。
	 *
	 * @return true: アプリの起動が可能な場合
	 */
	public boolean isAvailable()
	{
		return _launcher.isAvailable();
	}

	/**
	 * アプリを起動する。
	 *
	 * @exception アプリ起動中の例外
	 */
	public void launch(MenuOption option) throws AppLauncherException
	{
		try
		{
			_launcher.launch(option);
		}
		catch(Exception ex)
		{
			throw new AppLauncherException(ex);
		}
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + _no;
		return result;
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * 項目番号が等しいか否かで比較する。
	 * </p>
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MenuItem other = (MenuItem) obj;
		if (_no != other._no)
			return false;
		return true;
	}
}
