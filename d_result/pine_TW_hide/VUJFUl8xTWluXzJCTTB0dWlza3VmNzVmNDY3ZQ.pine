//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: UBER_1Min_2BM0_f75f467e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_1Min_2BM0_f75f467e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_1Min_f75f467e(bbp, bullPower, BBPower_Color, bearPower, bbm, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bbp <= -0.148296 )
		if( Negative_Money_Flow_Sum <= 5.21289e+06 )
			if( bbp <= -0.240361 )
				if( Typical_Price <= 63.7616 )
					if( bearPower <= -0.675467 )
						if( Money_Flow_Ratio <= 0.337624 )
							ret := 0.833333 // buy
						if( Money_Flow_Ratio > 0.337624 )
							ret := 1.000000 // buy
					if( bearPower > -0.675467 )
						if( Negative_Money_Flow_Sum <= 896069 )
							if( bbm <= 0.016869 )
								if( bearPower <= -0.165401 )
									ret := 0.290323
								if( bearPower > -0.165401 )
									ret := -0.440000
							if( bbm > 0.016869 )
								if( bbp <= -0.391052 )
									ret := 0.921053 // buy
								if( bbp > -0.391052 )
									ret := 0.392857
						if( Negative_Money_Flow_Sum > 896069 )
							if( Typical_Price <= 61.1837 )
								if( bullPower <= -0.128361 )
									ret := -0.718750 // sell
								if( bullPower > -0.128361 )
									ret := 0.000000
							if( Typical_Price > 61.1837 )
								if( Positive_Money_Flow_Sum <= 853926 )
									ret := -0.441176
								if( Positive_Money_Flow_Sum > 853926 )
									ret := 0.411765
				if( Typical_Price > 63.7616 )
					if( Raw_Money_Flow <= 34120.2 )
						if( Negative_Money_Flow_Sum <= 215565 )
							if( bullPower <= -0.200455 )
								if( MFI_Low <= 27.1455 )
									ret := 1.000000 // buy
								if( MFI_Low > 27.1455 )
									ret := 0.454545
							if( bullPower > -0.200455 )
								if( bbm <= 0.000294 )
									ret := 0.403226
								if( bbm > 0.000294 )
									ret := -0.687500
						if( Negative_Money_Flow_Sum > 215565 )
							if( MFI_High <= -52.5566 )
								if( bullPower <= -0.307203 )
									ret := 0.653846
								if( bullPower > -0.307203 )
									ret := 0.880769 // buy
							if( MFI_High > -52.5566 )
								if( MFI_High <= -18.3098 )
									ret := 0.642857
								if( MFI_High > -18.3098 )
									ret := 0.922330 // buy
					if( Raw_Money_Flow > 34120.2 )
						if( MFI <= 73.323 )
							if( Negative_Money_Flow_Sum <= 195311 )
								if( MFI_High <= -29.8287 )
									ret := -0.250000
								if( MFI_High > -29.8287 )
									ret := -0.625000
							if( Negative_Money_Flow_Sum > 195311 )
								if( Typical_Price <= 72.1145 )
									ret := 0.530343
								if( Typical_Price > 72.1145 )
									ret := 0.257812
						if( MFI > 73.323 )
							if( Typical_Price <= 70.476 )
								if( MFI <= 85.0271 )
									ret := -0.266667
								if( MFI > 85.0271 )
									ret := -0.666667
							if( Typical_Price > 70.476 )
								ret := 0.750000 // buy
			if( bbp > -0.240361 )
				if( MFI <= 94.6617 )
					if( bbm <= 0.004822 )
						if( Positive_Money_Flow_Sum <= 537553 )
							if( bbp <= -0.230665 )
								if( Negative_Money_Flow <= 30610.4 )
									ret := 0.234375
								if( Negative_Money_Flow > 30610.4 )
									ret := -0.636364
							if( bbp > -0.230665 )
								if( Typical_Price <= 59.5205 )
									ret := -0.500000
								if( Typical_Price > 59.5205 )
									ret := 0.559524
						if( Positive_Money_Flow_Sum > 537553 )
							if( MFI <= 36.2505 )
								if( Money_Flow_Ratio <= 0.506204 )
									ret := 0.200000
								if( Money_Flow_Ratio > 0.506204 )
									ret := 1.000000 // buy
							if( MFI > 36.2505 )
								if( Negative_Money_Flow_Sum <= 164668 )
									ret := -0.952381 // sell
								if( Negative_Money_Flow_Sum > 164668 )
									ret := 0.125000
					if( bbm > 0.004822 )
						if( Positive_Money_Flow_Sum <= 94387.4 )
							if( MFI <= 14.1407 )
								ret := 0.333333
							if( MFI > 14.1407 )
								if( Negative_Money_Flow_Sum <= 477489 )
									ret := 0.200000
								if( Negative_Money_Flow_Sum > 477489 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 94387.4 )
							if( Negative_Money_Flow_Sum <= 998269 )
								if( Positive_Money_Flow <= 171036 )
									ret := 0.415049
								if( Positive_Money_Flow > 171036 )
									ret := -0.272727
							if( Negative_Money_Flow_Sum > 998269 )
								if( Raw_Money_Flow <= 122610 )
									ret := -0.305085
								if( Raw_Money_Flow > 122610 )
									ret := 0.245033
				if( MFI > 94.6617 )
					ret := -0.500000
		if( Negative_Money_Flow_Sum > 5.21289e+06 )
			if( MFI_Low <= 10.2524 )
				if( Negative_Money_Flow_Sum <= 9.53234e+07 )
					if( MFI_High <= -55.2956 )
						if( bullPower <= -0.729548 )
							ret := 1.000000 // buy
						if( bullPower > -0.729548 )
							if( Negative_Money_Flow <= 4.36829e+06 )
								if( Positive_Money_Flow <= 4.61331e+06 )
									ret := 0.048815
								if( Positive_Money_Flow > 4.61331e+06 )
									ret := -0.564103
							if( Negative_Money_Flow > 4.36829e+06 )
								if( Typical_Price <= 65.2986 )
									ret := 0.264151
								if( Typical_Price > 65.2986 )
									ret := -0.167793
					if( MFI_High > -55.2956 )
						if( bullPower <= -0.211357 )
							if( Positive_Money_Flow_Sum <= 7.70052e+06 )
								ret := -0.250000
							if( Positive_Money_Flow_Sum > 7.70052e+06 )
								if( MFI <= 25.2734 )
									ret := -0.181818
								if( MFI > 25.2734 )
									ret := 0.737705 // buy
						if( bullPower > -0.211357 )
							if( Negative_Money_Flow <= 470591 )
								if( bbm <= 0.160638 )
									ret := 0.001953
								if( bbm > 0.160638 )
									ret := -0.636364
							if( Negative_Money_Flow > 470591 )
								if( Negative_Money_Flow_Sum <= 3.94851e+07 )
									ret := 0.287145
								if( Negative_Money_Flow_Sum > 3.94851e+07 )
									ret := -0.175676
				if( Negative_Money_Flow_Sum > 9.53234e+07 )
					if( bbm <= 0.275312 )
						if( Positive_Money_Flow_Sum <= 2.1948e+07 )
							if( Typical_Price <= 67.8113 )
								if( Money_Flow_Ratio <= 0.092404 )
									ret := 0.478261
								if( Money_Flow_Ratio > 0.092404 )
									ret := 0.857143 // buy
							if( Typical_Price > 67.8113 )
								if( Typical_Price <= 77.5025 )
									ret := 0.922222 // buy
								if( Typical_Price > 77.5025 )
									ret := 0.666667
						if( Positive_Money_Flow_Sum > 2.1948e+07 )
							if( Money_Flow_Ratio <= 0.156376 )
								ret := -0.555556
							if( Money_Flow_Ratio > 0.156376 )
								if( bbp <= -0.180177 )
									ret := 0.710526 // buy
								if( bbp > -0.180177 )
									ret := 0.200000
					if( bbm > 0.275312 )
						if( Negative_Money_Flow <= 3.60101e+07 )
							if( Typical_Price <= 67.9795 )
								ret := -0.944444 // sell
							if( Typical_Price > 67.9795 )
								ret := 0.166667
						if( Negative_Money_Flow > 3.60101e+07 )
							ret := 1.000000 // buy
			if( MFI_Low > 10.2524 )
				if( Raw_Money_Flow <= 5.59268e+06 )
					if( Raw_Money_Flow <= 91223.9 )
						if( Positive_Money_Flow_Sum <= 1.78051e+08 )
							if( bearPower <= -0.154031 )
								ret := 1.000000 // buy
							if( bearPower > -0.154031 )
								if( MFI_High <= 2.76301 )
									ret := 0.437500
								if( MFI_High > 2.76301 )
									ret := 0.840000 // buy
						if( Positive_Money_Flow_Sum > 1.78051e+08 )
							ret := -0.368421
					if( Raw_Money_Flow > 91223.9 )
						if( Typical_Price <= 77.6423 )
							if( Positive_Money_Flow <= 2.25765e+06 )
								if( bbm <= 0.18021 )
									ret := -0.099546
								if( bbm > 0.18021 )
									ret := 0.184483
							if( Positive_Money_Flow > 2.25765e+06 )
								if( Typical_Price <= 69.7586 )
									ret := -0.495349
								if( Typical_Price > 69.7586 )
									ret := 0.076271
						if( Typical_Price > 77.6423 )
							if( bbm <= 0.120778 )
								if( MFI <= 44.8098 )
									ret := 0.745455 // buy
								if( MFI > 44.8098 )
									ret := 0.083333
							if( bbm > 0.120778 )
								if( bearPower <= -0.368544 )
									ret := -0.818182 // sell
								if( bearPower > -0.368544 )
									ret := 0.339623
				if( Raw_Money_Flow > 5.59268e+06 )
					if( Money_Flow_Ratio <= 0.447669 )
						if( Negative_Money_Flow <= 6.31331e+06 )
							ret := -0.777778 // sell
						if( Negative_Money_Flow > 6.31331e+06 )
							ret := -0.434783
					if( Money_Flow_Ratio > 0.447669 )
						if( Money_Flow_Ratio <= 1.25816 )
							if( bearPower <= -0.238323 )
								if( bullPower <= -0.176213 )
									ret := 0.065934
								if( bullPower > -0.176213 )
									ret := 0.441791
							if( bearPower > -0.238323 )
								if( bbm <= 0.203038 )
									ret := 0.059740
								if( bbm > 0.203038 )
									ret := -0.500000
						if( Money_Flow_Ratio > 1.25816 )
							if( Positive_Money_Flow <= 1.20783e+07 )
								if( Positive_Money_Flow_Sum <= 1.59527e+08 )
									ret := 0.418440
								if( Positive_Money_Flow_Sum > 1.59527e+08 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow > 1.20783e+07 )
								ret := -0.937500 // sell
	if( bbp > -0.148296 )
		if( Positive_Money_Flow_Sum <= 262485 )
			if( Negative_Money_Flow <= 57.8031 )
				if( bbp <= 0.089557 )
					if( MFI_High <= -52.3729 )
						if( bullPower <= -0.026711 )
							if( bbp <= -0.13466 )
								if( bullPower <= -0.071114 )
									ret := 0.545455
								if( bullPower > -0.071114 )
									ret := -1.000000 // sell
							if( bbp > -0.13466 )
								if( Raw_Money_Flow <= 17740.1 )
									ret := -0.298507
								if( Raw_Money_Flow > 17740.1 )
									ret := 0.556962
						if( bullPower > -0.026711 )
							if( bbp <= -0.04099 )
								if( bbm <= 0.001042 )
									ret := -0.190476
								if( bbm > 0.001042 )
									ret := -0.818182 // sell
							if( bbp > -0.04099 )
								if( Money_Flow_Ratio <= 0.289958 )
									ret := -0.124555
								if( Money_Flow_Ratio > 0.289958 )
									ret := -0.422018
					if( MFI_High > -52.3729 )
						if( Negative_Money_Flow_Sum <= 113256 )
							if( Negative_Money_Flow_Sum <= 102544 )
								if( Money_Flow_Ratio <= 0.986892 )
									ret := 0.454545
								if( Money_Flow_Ratio > 0.986892 )
									ret := -0.070175
							if( Negative_Money_Flow_Sum > 102544 )
								if( Positive_Money_Flow_Sum <= 159006 )
									ret := -0.076923
								if( Positive_Money_Flow_Sum > 159006 )
									ret := -0.764706 // sell
						if( Negative_Money_Flow_Sum > 113256 )
							if( bbp <= -0.009744 )
								if( Raw_Money_Flow <= 67179.2 )
									ret := 0.625532
								if( Raw_Money_Flow > 67179.2 )
									ret := 0.064516
							if( bbp > -0.009744 )
								if( Typical_Price <= 61.8145 )
									ret := -0.750000 // sell
								if( Typical_Price > 61.8145 )
									ret := 0.286031
				if( bbp > 0.089557 )
					if( Positive_Money_Flow <= 24527.6 )
						if( Money_Flow_Ratio <= 0.401285 )
							if( Typical_Price <= 64.741 )
								if( Positive_Money_Flow <= 16104.2 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow > 16104.2 )
									ret := -0.833333 // sell
							if( Typical_Price > 64.741 )
								if( Raw_Money_Flow <= 20543.9 )
									ret := -0.573529
								if( Raw_Money_Flow > 20543.9 )
									ret := -0.916667 // sell
						if( Money_Flow_Ratio > 0.401285 )
							if( bbp <= 0.143009 )
								if( Money_Flow_Ratio <= 1.47186 )
									ret := 0.083333
								if( Money_Flow_Ratio > 1.47186 )
									ret := -0.468750
							if( bbp > 0.143009 )
								if( Negative_Money_Flow_Sum <= 360059 )
									ret := -0.521236
								if( Negative_Money_Flow_Sum > 360059 )
									ret := 0.272727
					if( Positive_Money_Flow > 24527.6 )
						if( Money_Flow_Ratio <= 0.123173 )
							if( bearPower <= 0.063562 )
								ret := -0.666667
							if( bearPower > 0.063562 )
								if( Positive_Money_Flow <= 57327.1 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow > 57327.1 )
									ret := -0.842105 // sell
						if( Money_Flow_Ratio > 0.123173 )
							if( Positive_Money_Flow <= 41326 )
								if( bearPower <= 0.175022 )
									ret := 0.238994
								if( bearPower > 0.175022 )
									ret := -0.486486
							if( Positive_Money_Flow > 41326 )
								if( Positive_Money_Flow <= 44774.5 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow > 44774.5 )
									ret := -0.023585
			if( Negative_Money_Flow > 57.8031 )
				if( bbp <= 0.05082 )
					if( bearPower <= -0.129797 )
						if( bbp <= -0.052211 )
							ret := -0.833333 // sell
						if( bbp > -0.052211 )
							ret := 0.272727
					if( bearPower > -0.129797 )
						if( bbm <= 0.002379 )
							if( bbp <= -0.027722 )
								if( Positive_Money_Flow_Sum <= 62370.6 )
									ret := 0.071429
								if( Positive_Money_Flow_Sum > 62370.6 )
									ret := 0.525298
							if( bbp > -0.027722 )
								if( MFI_High <= -20.4728 )
									ret := 0.336986
								if( MFI_High > -20.4728 )
									ret := -0.068182
						if( bbm > 0.002379 )
							if( Typical_Price <= 67.294 )
								if( Negative_Money_Flow <= 68395.9 )
									ret := -0.415842
								if( Negative_Money_Flow > 68395.9 )
									ret := 0.040000
							if( Typical_Price > 67.294 )
								if( Raw_Money_Flow <= 71173.8 )
									ret := 0.066667
								if( Raw_Money_Flow > 71173.8 )
									ret := 0.458333
				if( bbp > 0.05082 )
					if( bbp <= 0.193998 )
						if( MFI_Low <= 52.5791 )
							if( Raw_Money_Flow <= 114326 )
								if( Positive_Money_Flow_Sum <= 150932 )
									ret := -0.451613
								if( Positive_Money_Flow_Sum > 150932 )
									ret := -0.131068
							if( Raw_Money_Flow > 114326 )
								if( Negative_Money_Flow_Sum <= 451859 )
									ret := 0.529412
								if( Negative_Money_Flow_Sum > 451859 )
									ret := 0.000000
						if( MFI_Low > 52.5791 )
							ret := 1.000000 // buy
					if( bbp > 0.193998 )
						if( Raw_Money_Flow <= 13335.3 )
							if( Negative_Money_Flow_Sum <= 195445 )
								ret := 0.000000
							if( Negative_Money_Flow_Sum > 195445 )
								ret := -0.900000 // sell
						if( Raw_Money_Flow > 13335.3 )
							if( bullPower <= 0.130832 )
								if( MFI <= 39.2168 )
									ret := 0.090909
								if( MFI > 39.2168 )
									ret := 0.411765
							if( bullPower > 0.130832 )
								if( Money_Flow_Ratio <= 0.324027 )
									ret := 0.000000
								if( Money_Flow_Ratio > 0.324027 )
									ret := 0.782609 // buy
		if( Positive_Money_Flow_Sum > 262485 )
			if( bearPower <= 0.056473 )
				if( bbm <= 0.004113 )
					if( bearPower <= -0.007789 )
						if( Raw_Money_Flow <= 44884.9 )
							if( Negative_Money_Flow <= 12.4407 )
								if( MFI <= 43.0905 )
									ret := -0.016260
								if( MFI > 43.0905 )
									ret := 0.234940
							if( Negative_Money_Flow > 12.4407 )
								if( bullPower <= -0.03743 )
									ret := 0.504237
								if( bullPower > -0.03743 )
									ret := 0.266827
						if( Raw_Money_Flow > 44884.9 )
							if( Money_Flow_Ratio <= 0.16752 )
								if( MFI_Low <= -11.6802 )
									ret := 0.617647
								if( MFI_Low > -11.6802 )
									ret := 0.897959 // buy
							if( Money_Flow_Ratio > 0.16752 )
								if( bbp <= -0.142224 )
									ret := 0.727273 // buy
								if( bbp > -0.142224 )
									ret := 0.009804
					if( bearPower > -0.007789 )
						if( MFI <= 65.2847 )
							if( MFI_High <= -16.4355 )
								if( MFI_High <= -61.7089 )
									ret := 0.085714
								if( MFI_High > -61.7089 )
									ret := -0.168157
							if( MFI_High > -16.4355 )
								if( MFI <= 63.9677 )
									ret := -0.828571 // sell
								if( MFI > 63.9677 )
									ret := -0.409091
						if( MFI > 65.2847 )
							if( bullPower <= 0.042286 )
								if( Negative_Money_Flow <= 6935.47 )
									ret := 0.027855
								if( Negative_Money_Flow > 6935.47 )
									ret := 0.333333
							if( bullPower > 0.042286 )
								if( MFI_High <= 8.97818 )
									ret := -0.036810
								if( MFI_High > 8.97818 )
									ret := -0.529412
				if( bbm > 0.004113 )
					if( MFI_Low <= 76.5658 )
						if( MFI_High <= -10.4564 )
							if( bearPower <= -0.12493 )
								if( Positive_Money_Flow_Sum <= 6.53162e+07 )
									ret := -0.195323
								if( Positive_Money_Flow_Sum > 6.53162e+07 )
									ret := 0.407692
							if( bearPower > -0.12493 )
								if( Negative_Money_Flow <= 3.63077e+06 )
									ret := -0.031564
								if( Negative_Money_Flow > 3.63077e+06 )
									ret := 0.062452
						if( MFI_High > -10.4564 )
							if( Positive_Money_Flow_Sum <= 1.90441e+07 )
								if( MFI_High <= 3.69975 )
									ret := -0.032140
								if( MFI_High > 3.69975 )
									ret := 0.114754
							if( Positive_Money_Flow_Sum > 1.90441e+07 )
								if( Typical_Price <= 82.2438 )
									ret := 0.104636
								if( Typical_Price > 82.2438 )
									ret := -0.506667
					if( MFI_Low > 76.5658 )
						if( bbp <= 0.325803 )
							if( Positive_Money_Flow <= 2.72156e+07 )
								if( Positive_Money_Flow_Sum <= 1.71182e+08 )
									ret := -0.721053 // sell
								if( Positive_Money_Flow_Sum > 1.71182e+08 )
									ret := 0.388889
							if( Positive_Money_Flow > 2.72156e+07 )
								ret := 0.900000 // buy
						if( bbp > 0.325803 )
							if( Money_Flow_Ratio <= 63.7404 )
								if( bbm <= 0.420896 )
									ret := 0.562500
								if( bbm > 0.420896 )
									ret := 1.000000 // buy
							if( Money_Flow_Ratio > 63.7404 )
								ret := 0.200000
			if( bearPower > 0.056473 )
				if( Raw_Money_Flow <= 49424.1 )
					if( Negative_Money_Flow <= 5355.94 )
						if( Typical_Price <= 75.1283 )
							if( MFI <= 86.4405 )
								if( Negative_Money_Flow_Sum <= 422203 )
									ret := -0.432900
								if( Negative_Money_Flow_Sum > 422203 )
									ret := -0.607143
							if( MFI > 86.4405 )
								if( MFI_Low <= 68.487 )
									ret := 0.456140
								if( MFI_Low > 68.487 )
									ret := -0.344828
						if( Typical_Price > 75.1283 )
							if( Money_Flow_Ratio <= 3.04578 )
								if( bbm <= 2.1e-05 )
									ret := -0.271429
								if( bbm > 2.1e-05 )
									ret := -0.846154 // sell
							if( Money_Flow_Ratio > 3.04578 )
								if( MFI_High <= -1.68198 )
									ret := 0.782609 // buy
								if( MFI_High > -1.68198 )
									ret := 0.093023
					if( Negative_Money_Flow > 5355.94 )
						if( MFI_Low <= 48.6172 )
							if( Negative_Money_Flow_Sum <= 355794 )
								if( bullPower <= 0.17801 )
									ret := -0.804598 // sell
								if( bullPower > 0.17801 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 355794 )
								if( Positive_Money_Flow_Sum <= 319083 )
									ret := 0.210526
								if( Positive_Money_Flow_Sum > 319083 )
									ret := -0.371257
						if( MFI_Low > 48.6172 )
							if( Money_Flow_Ratio <= 3.5439 )
								if( bbp <= 0.163237 )
									ret := 0.068966
								if( bbp > 0.163237 )
									ret := 0.662338
							if( Money_Flow_Ratio > 3.5439 )
								if( Raw_Money_Flow <= 24428.4 )
									ret := -0.431193
								if( Raw_Money_Flow > 24428.4 )
									ret := -0.060241
				if( Raw_Money_Flow > 49424.1 )
					if( MFI <= 43.8195 )
						if( Typical_Price <= 58.7617 )
							ret := 0.764706 // buy
						if( Typical_Price > 58.7617 )
							if( bullPower <= 0.194842 )
								if( MFI_Low <= -6.19079 )
									ret := -0.693182
								if( MFI_Low > -6.19079 )
									ret := -0.121053
							if( bullPower > 0.194842 )
								if( Positive_Money_Flow <= 3.05398e+06 )
									ret := -0.502924
								if( Positive_Money_Flow > 3.05398e+06 )
									ret := -0.807018 // sell
					if( MFI > 43.8195 )
						if( Negative_Money_Flow_Sum <= 1.14165e+08 )
							if( Positive_Money_Flow <= 1.69381e+07 )
								if( bbm <= 0.009214 )
									ret := -0.239067
								if( bbm > 0.009214 )
									ret := -0.025190
							if( Positive_Money_Flow > 1.69381e+07 )
								if( bullPower <= 0.16783 )
									ret := -0.032258
								if( bullPower > 0.16783 )
									ret := -0.600775
						if( Negative_Money_Flow_Sum > 1.14165e+08 )
							if( Raw_Money_Flow <= 1.24867e+07 )
								ret := -0.466667
							if( Raw_Money_Flow > 1.24867e+07 )
								if( bbp <= 0.985007 )
									ret := 0.783333 // buy
								if( bbp > 0.985007 )
									ret := 0.300000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")

// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_UBER_1Min_f75f467e(bbp, bullPower, BBPower_Color, bearPower, bbm, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


