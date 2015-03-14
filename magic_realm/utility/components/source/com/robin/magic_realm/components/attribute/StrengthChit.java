/* 
 * RealmSpeak is the Java application for playing the board game Magic Realm.
 * Copyright (c) 2005-2015 Robin Warren
 * E-mail: robin@dewkid.com
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program. If not, see
 *
 * http://www.gnu.org/licenses/
 */
package com.robin.magic_realm.components.attribute;

import com.robin.game.objects.GameObject;
import com.robin.magic_realm.components.RealmComponent;

public class StrengthChit {
	private GameObject go;
	private Strength strength;
	private Speed speed;
	public StrengthChit(GameObject go,Strength st,Speed sp) {
		this.go = go;
		this.strength = st;
		this.speed = sp;
	}
	public String toString() {
		return "StrengthChit from "+go.toString()+": "+strength.toString()+speed.getSpeedString();
	}
	public RealmComponent getRealmComponent() {
		if (go!=null) {
			return RealmComponent.getRealmComponent(go);
		}
		return null;
	}
	public GameObject getGameObject() {
		return go;
	}
	public Speed getSpeed() {
		return speed;
	}
	public Strength getStrength() {
		return strength;
	}
}