/*
 * Copyright 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package rs.reviewer;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import rs.reviewer.fragments.LinearLayoutFragment;
import rs.reviewer.fragments.RelativeLayoutFragment;
import rs.reviewer.tools.FragmentTransition;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        * Da bi pronasli odredjenu komponentu na layout-u,
        * prvo moram da je jedinstveno identifikujemo koristeci android:id atribut.
        * Kada smo je jedinstveno identifikovali, ako zelimo da sa njom nesto
        * radimo u javi, moramo da je dobavimo unutar nase klase. Za te potrebe
        * koristimo metodu findViewById, koja ce nam vratiti tacnu komponentu
        * po jedinstvenom identifikatoru u tom layout-u.
        * Kada dobijemo referencu, dalje mozemo da radimo sa tom komponenom sta zelimo.
        * */
        TextView textView = findViewById(R.id.layoutTitle);

        /*
        * Ako zelimo da iskoristimo neki od resursa iz naseg projekta
        * to mozemo da uraidmo koristeci dot sintaksu. Android
        * Odrzava poseban file koji se zove R file, i on se generise
        * svaki put kada se projekat izmeni. On cuva reference do svakog
        * resursa unutar projekta.
        *
        * NPR: R.string.mainActivityTitle znaci da unutar naseg res foldera
        * postoji folder koji se zove strings i da unutar njega postoji resurs
        * string koji ima name mainActivityTitle. Na ovaj nacin,
        * ispravno smo se pozicionirali na resurs unutar projekta
        * */
        textView.setText(R.string.mainActivityTitle);

        // U ovim fragmentima mozemo da vidimo da koristeci bilo koji od ova dva layout-a, mozemo da napravimo isti izgled.
        FragmentTransition.to(RelativeLayoutFragment.newInstance(), this, false, R.id.upView);
        FragmentTransition.to(LinearLayoutFragment.newInstance(), this, false, R.id.downView);
    }
    
    @Override
    protected void onResume() {
    	// TODO Auto-generated method stub
    	super.onResume();
    }
    
    @Override
    protected void onPause() {
    	super.onPause();
    }
}
