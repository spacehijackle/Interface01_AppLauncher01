package com.launcher;

import com.menu.MenuOption;


/**
 * アプリランチャー メニュー終了用
 *
 * @author t.yoshida
 */
public class Terminator implements AppLauncher
{
	@Override
	public boolean isAvailable()
	{
		return true;
	}

	@Override
	public void launch(MenuOption option) throws Exception
	{
		option.terminate();
	}
}
