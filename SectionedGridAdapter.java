/*
 * Copyright 2013 Hari Krishna Dulipudi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.dworks.libs.astickyheader;

import java.util.Arrays;
import java.util.Comparator;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import dev.dworks.libs.astickyheader.ui.PinnedSectionGridView;
import dev.dworks.libs.astickyheader.ui.PinnedSectionGridView.PinnedSectionGridAdapter;

public abstract class SectionedGridAdapter extends BaseAdapter implements PinnedSectionGridAdapter {
	protected static final int TYPE_NORMAL_CELL = 0;
	protected static final int TYPE_FILLER = -1;
	protected static final int TYPE_HEADER = -2;
	protected static final int TYPE_HEADER_FILLER = -3;
	private boolean mValid = true;
	private ListAdapter mBaseAdapter;
	private SparseArray<Section> mSections = new SparseArray<Section>();
	private Context mContext;
	private int mNumColumns;
	private int mWidth;
	private int mColumnWidth;
	private int mHorizontalSpacing;
	private int mStrechMode;
	private int requestedColumnWidth;
	private int requestedHorizontalSpacing;
	private GridView mGridView;
	private int mHeaderHeight;
	private int mNormalCellHeight;

	
			return (T) childView;
		}
	}
}