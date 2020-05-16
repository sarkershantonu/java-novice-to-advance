package org.practice.methodfactory.warProducts.factories;

import org.practice.methodfactory.warProducts.products.IEngine;
import org.practice.methodfactory.warProducts.products.IWeapon;

public interface IEnemyShipFactory {
	public IEngine addESEngine();
	public IWeapon addESGuns();
}
