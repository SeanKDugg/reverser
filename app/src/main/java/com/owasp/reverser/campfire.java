package com.owasp.reverser;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;
/**
 * This file is part of the Security Shepherd Project.
 *
 * <p>The Security Shepherd project is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.<br>
 *
 * <p>The Security Shepherd project is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE. See the GNU General Public License for more details.<br>
 *
 * <p>You should have received a copy of the GNU General Public License along with the Security
 * Shepherd project. If not, see <http://www.gnu.org/licenses/>.
 *
 * @author Sean Duggan
 */
public class campfire extends AppCompatActivity {

    /*----------FIRE-----------FIRE------------FIRE----------------FIRE-----------------------*/
    AnimationDrawable fireAnimation;
    /*----------FIRE-----------FIRE------------FIRE----------------FIRE-----------------------*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campfire);

        /*----------FIRE-----------FIRE------------FIRE----------------FIRE-----------------------*/
        ImageView imageView = findViewById(R.id.campfire);
        imageView.setBackgroundResource(R.drawable.animation);
        fireAnimation = (AnimationDrawable) imageView.getBackground();
        /*----------FIRE-----------FIRE------------FIRE----------------FIRE-----------------------*/
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus){
        super.onWindowFocusChanged(hasFocus);
        /*----------FIRE-----------FIRE------------FIRE----------------FIRE-----------------------*/
        fireAnimation.start();
        /*----------FIRE-----------FIRE------------FIRE----------------FIRE-----------------------*/
    }

}