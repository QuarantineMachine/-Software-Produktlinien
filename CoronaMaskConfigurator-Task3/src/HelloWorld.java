import properties.PropertyManager;

/* FeatureIDE - A Framework for Feature-Oriented Software Development
 * Copyright (C) 2005-2019  FeatureIDE team, University of Magdeburg, Germany
 *
 * This file is part of FeatureIDE.
 * 
 * FeatureIDE is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * FeatureIDE is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with FeatureIDE.  If not, see <http://www.gnu.org/licenses/>.
 *
 * See http://featureide.cs.ovgu.de/ for further information.
 */

/**
 * Hello World example for FeatureIDE projects using Antenna as preprocessor.
 * 
 * @author Thomas Thuem
 */
public class HelloWorld {

	public static void main(String[] args) {
		// #if Edition
		System.out.print("You have selected following Edition: ");
		
		// #if Private
//@		System.out.print("Private (For \"Otto normal user\".)");
		// #endif
		
		// #if Medical
		System.out.print("Medical (For professionals in health sector.)");
		// #endif
		System.out.println();
		System.out.println();
		// #endif
		
			
		// #if SpecialFeatures
		System.out.println("You have selected following SpecialFeatures: ");

		// #if Zipper
		System.out.println("Zipper (You can drink and eat while wearing this mask. It is creepy but it works.)");
		// #endif

		// #if MetalNoseClip
//@		System.out.println("MetalNoseClip (To prevent fogged glasses.)");
		// #endif
		System.out.println();
		// #endif


		// #if Material
		System.out.print("You have selected following Material: ");

		// #if ToiletPaper
//@		System.out.print("ToiletPaper (Very high-prized. For status show-off to other people.)");
		// #endif

		// #if Fleece
//@		System.out.print("Fleece (Nothing special about it.)");
		// #endif

		// #if Cotton
//@		System.out.print("Cotton (Can be washed at 60 degree celsius.)");
		// #endif

		// #if Silk
		System.out.print("Silk (High class material.)");
		// #endif
		System.out.println();
		System.out.println();
		// #endif


		
		
		// #if MaterialLayer
		System.out.print("You have selected following MaterialLayer: ");

		// #if One
//@		System.out.print("One (Your mask is just good for fashion usage.)");
		// #endif

		// #if Two
//@		System.out.print("Two (You are a normal person who wants to protect others from the corona virus.)");
		// #endif

		// #if Three
		System.out.print("Three (It is uncertain whether you can breath with this selection. Usage at your own risk!!!)");
		// #endif
		System.out.println();
		System.out.println();
		// #endif
	}

}
