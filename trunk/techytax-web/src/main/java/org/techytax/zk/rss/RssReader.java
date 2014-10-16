/**
 * Copyright 2014 Hans Beemsterboer
 * 
 * This file is part of the TechyTax program.
 *
 * TechyTax is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * TechyTax is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with TechyTax; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.techytax.zk.rss;

import java.io.Serializable;

import org.zkoss.zrss.RssFeedEntry;
import org.zkoss.zrss.RssFeed;

public class RssReader implements Serializable {

	private static final long serialVersionUID = -5208262237527059554L;
	
	private RssFeed selected;
	private RssFeedEntry selectEntry;
	protected String feedUrl;

	protected void init() {
		try {
			selected = RssFeedCache.getFeed(feedUrl);
			if (selected != null && selected.getFeedEntries().size() > 0) {
				selectEntry = selected.getFeedEntries().get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public RssFeed getSelectedFeed() {
		return selected;
	}

	public RssFeedEntry getSelectedEntry() {
		return selectEntry;
	}

	public void setSelectedEntry(RssFeedEntry selectedEntry) {
		this.selectEntry = selectedEntry;
	}
}
