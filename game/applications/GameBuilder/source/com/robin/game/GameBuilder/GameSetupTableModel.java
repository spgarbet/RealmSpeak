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
package com.robin.game.GameBuilder;

import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

import com.robin.general.swing.*;
import com.robin.game.objects.*;

public class GameSetupTableModel extends AbstractTableModel implements ColumnSizable {

	protected String[] columnHeaders = {
		"Setup name",
		"Cmds"
	};
	
	protected ArrayList data;

	public GameSetupTableModel(ArrayList data) {
		this.data = data;
	}
	public int getRowCount() {
		return data.size();
	}
	public int getColumnCount() {
		return columnHeaders.length;
	}
	public String getColumnName(int col) {
		return columnHeaders[col];
	}
	public Class getColumnClass(int col) {
		return col==0?String.class:Integer.class;
	}
	public Object getValueAt(int row,int col) {
		if (row<data.size()) {
			GameSetup setup = (GameSetup)data.get(row);
			switch(col) {
				case 0:
					return setup.getName();
				case 1:
					return new Integer(setup.getCommandCount());
				default:
					throw new IllegalArgumentException("Invalid column index");
			}
		}
		return null;
	}
	
	// ColumnSizable interface
	public void setTableHeaderSize(JTable table) {
		TableColumnModel colModel = table.getColumnModel();
		colModel.getColumn(1).setMaxWidth(40);
	}
}