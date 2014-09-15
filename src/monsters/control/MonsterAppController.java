package monsters.control;

import java.awt.Component;

import monsters.model.MarshmallowMonster;
import monsters.view.MonsterView;

public class MonsterAppController
{
	private MonsterView appView;
	private MarshmallowMonster myMonster;
	
	public MonsterAppController()
	{
		appView = new MonsterView(this);
		myMonster = new MarshmallowMonster("tumadre", .667, 3.01, 4, 12, 2, false);
	}
	
	public void start()
	{
		appView.displayInformation();
	}
	
	public MarshmallowMonster getMyMonster()
	{
		return myMonster;
	}

}
