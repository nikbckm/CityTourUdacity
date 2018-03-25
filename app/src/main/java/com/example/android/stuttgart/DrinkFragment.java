/*
 * Copyright (C) 2016 The Android Open Source Project
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
package com.example.android.stuttgart;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Fragment that displays Drink
 */
public class DrinkFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LinearLayout rootView = (LinearLayout) inflater.inflate(R.layout.fragment_layout, container, false);
        ListView lv = (ListView) rootView.findViewById(R.id.listView);

        // Instanciating an array list
        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Mata Hari", "Nette Studentenbar", R.drawable.beer));
        locations.add(new Location("Erster Stock", "Bar und Disco", R.drawable.beer));
        locations.add(new Location("Tequila Bar", "Billig betrinken", R.drawable.beer));

        // This is the array adapter, it takes the context of the activity as a
        // first parameter, the type of list view as a second parameter and your
        // array as a third parameter.
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        lv.setAdapter(locationAdapter);
        return rootView;
    }
}


