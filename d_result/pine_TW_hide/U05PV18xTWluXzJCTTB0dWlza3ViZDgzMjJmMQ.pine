//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: SNOW_1Min_2BM0_bd8322f1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_1Min_2BM0_bd8322f1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_1Min_bd8322f1(bbm, bearPower, bbp, bullPower, BBPower_Color, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 11200.5 )
		if( bbm <= 0.007851 )
			if( bbp <= 0.143271 )
				if( bearPower <= 0.007771 )
					if( Negative_Money_Flow <= 306.815 )
						if( Raw_Money_Flow <= 127205 )
							if( bearPower <= -0.193349 )
								if( MFI_High <= 9.06632 )
									ret := 0.303030
								if( MFI_High > 9.06632 )
									ret := -0.833333 // sell
							if( bearPower > -0.193349 )
								if( MFI_Low <= -1.77297 )
									ret := -0.095808
								if( MFI_Low > -1.77297 )
									ret := 0.110934
						if( Raw_Money_Flow > 127205 )
							if( Typical_Price <= 160.952 )
								if( bearPower <= -0.061926 )
									ret := -0.237624
								if( bearPower > -0.061926 )
									ret := 0.097345
							if( Typical_Price > 160.952 )
								if( Positive_Money_Flow_Sum <= 2.43949e+07 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 2.43949e+07 )
									ret := -1.000000 // sell
					if( Negative_Money_Flow > 306.815 )
						if( Raw_Money_Flow <= 14566.7 )
							if( MFI_Low <= 40.2159 )
								if( Negative_Money_Flow <= 1499.42 )
									ret := 0.500000
								if( Negative_Money_Flow > 1499.42 )
									ret := -0.433333
							if( MFI_Low > 40.2159 )
								ret := 1.000000 // buy
						if( Raw_Money_Flow > 14566.7 )
							if( bbm <= 0.000309 )
								if( Typical_Price <= 132.321 )
									ret := 0.376812
								if( Typical_Price > 132.321 )
									ret := 0.753425 // buy
							if( bbm > 0.000309 )
								if( Negative_Money_Flow <= 8638.27 )
									ret := -0.750000 // sell
								if( Negative_Money_Flow > 8638.27 )
									ret := 0.500000
				if( bearPower > 0.007771 )
					if( Money_Flow_Ratio <= 1.1737 )
						if( Positive_Money_Flow_Sum <= 4.85407e+07 )
							if( Negative_Money_Flow <= 6995.42 )
								if( MFI_High <= -32.2053 )
									ret := -0.023109
								if( MFI_High > -32.2053 )
									ret := 0.245763
							if( Negative_Money_Flow > 6995.42 )
								if( Typical_Price <= 129.663 )
									ret := -0.882353 // sell
								if( Typical_Price > 129.663 )
									ret := 0.000000
						if( Positive_Money_Flow_Sum > 4.85407e+07 )
							ret := 1.000000 // buy
					if( Money_Flow_Ratio > 1.1737 )
						if( MFI_Low <= 52.8228 )
							if( Positive_Money_Flow_Sum <= 487129 )
								if( Positive_Money_Flow_Sum <= 383011 )
									ret := -0.325000
								if( Positive_Money_Flow_Sum > 383011 )
									ret := 0.280000
							if( Positive_Money_Flow_Sum > 487129 )
								if( Positive_Money_Flow <= 764.43 )
									ret := -0.081081
								if( Positive_Money_Flow > 764.43 )
									ret := -0.430464
						if( MFI_Low > 52.8228 )
							if( Money_Flow_Ratio <= 4.4951 )
								if( bbp <= 0.133655 )
									ret := 0.095745
								if( bbp > 0.133655 )
									ret := 0.692308
							if( Money_Flow_Ratio > 4.4951 )
								if( Negative_Money_Flow <= 651.914 )
									ret := -0.085271
								if( Negative_Money_Flow > 651.914 )
									ret := -0.857143 // sell
			if( bbp > 0.143271 )
				if( MFI <= 38.274 )
					if( Negative_Money_Flow_Sum <= 669428 )
						if( BBPower_Color <= 0.5 )
							if( Raw_Money_Flow <= 23185.2 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 23185.2 )
								if( bearPower <= 0.126672 )
									ret := -0.500000
								if( bearPower > 0.126672 )
									ret := 0.538462
						if( BBPower_Color > 0.5 )
							if( Raw_Money_Flow <= 80280 )
								if( Typical_Price <= 146.543 )
									ret := 0.046729
								if( Typical_Price > 146.543 )
									ret := -0.476190
							if( Raw_Money_Flow > 80280 )
								if( MFI_High <= -46.2934 )
									ret := 1.000000 // buy
								if( MFI_High > -46.2934 )
									ret := 0.142857
					if( Negative_Money_Flow_Sum > 669428 )
						if( Negative_Money_Flow_Sum <= 1.56844e+06 )
							if( MFI_Low <= 10.1555 )
								if( bullPower <= 0.224318 )
									ret := -0.330357
								if( bullPower > 0.224318 )
									ret := -0.788462 // sell
							if( MFI_Low > 10.1555 )
								if( Raw_Money_Flow <= 38824.6 )
									ret := -0.388889
								if( Raw_Money_Flow > 38824.6 )
									ret := 0.222222
						if( Negative_Money_Flow_Sum > 1.56844e+06 )
							if( Negative_Money_Flow_Sum <= 1.67813e+06 )
								if( bbp <= 1.14742 )
									ret := 0.935484 // buy
								if( bbp > 1.14742 )
									ret := -0.250000
							if( Negative_Money_Flow_Sum > 1.67813e+06 )
								if( Negative_Money_Flow_Sum <= 6.51648e+06 )
									ret := -0.410000
								if( Negative_Money_Flow_Sum > 6.51648e+06 )
									ret := 0.013889
				if( MFI > 38.274 )
					if( Typical_Price <= 156.7 )
						if( Positive_Money_Flow <= 37809.2 )
							if( bullPower <= 0.598667 )
								if( bbp <= 0.388046 )
									ret := -0.375887
								if( bbp > 0.388046 )
									ret := -0.632432
							if( bullPower > 0.598667 )
								if( Typical_Price <= 114.697 )
									ret := 0.500000
								if( Typical_Price > 114.697 )
									ret := -0.368421
						if( Positive_Money_Flow > 37809.2 )
							if( Positive_Money_Flow_Sum <= 527245 )
								if( bearPower <= 0.721143 )
									ret := -0.093750
								if( bearPower > 0.721143 )
									ret := 0.714286 // buy
							if( Positive_Money_Flow_Sum > 527245 )
								if( MFI_Low <= 55.209 )
									ret := -0.469880
								if( MFI_Low > 55.209 )
									ret := -0.172285
					if( Typical_Price > 156.7 )
						if( bbp <= 0.56736 )
							if( Positive_Money_Flow_Sum <= 311818 )
								if( MFI_High <= -34.3169 )
									ret := 1.000000 // buy
								if( MFI_High > -34.3169 )
									ret := 0.125000
							if( Positive_Money_Flow_Sum > 311818 )
								if( Raw_Money_Flow <= 55518.9 )
									ret := -0.254545
								if( Raw_Money_Flow > 55518.9 )
									ret := 0.071429
						if( bbp > 0.56736 )
							if( Positive_Money_Flow_Sum <= 545678 )
								if( MFI_Low <= 38.3799 )
									ret := -0.272727
								if( MFI_Low > 38.3799 )
									ret := 0.583333
							if( Positive_Money_Flow_Sum > 545678 )
								if( Positive_Money_Flow <= 99310.3 )
									ret := -0.590164
								if( Positive_Money_Flow > 99310.3 )
									ret := 0.000000
		if( bbm > 0.007851 )
			if( Positive_Money_Flow <= 4.91365e+06 )
				if( Typical_Price <= 134.841 )
					if( Positive_Money_Flow_Sum <= 230490 )
						if( bbm <= 0.011362 )
							if( MFI_High <= -47.4727 )
								ret := 0.200000
							if( MFI_High > -47.4727 )
								ret := -0.500000
						if( bbm > 0.011362 )
							if( Raw_Money_Flow <= 61355.3 )
								if( bullPower <= 0.056896 )
									ret := -0.684211
								if( bullPower > 0.056896 )
									ret := -1.000000 // sell
							if( Raw_Money_Flow > 61355.3 )
								if( bullPower <= 0.055573 )
									ret := 0.000000
								if( bullPower > 0.055573 )
									ret := -0.818182 // sell
					if( Positive_Money_Flow_Sum > 230490 )
						if( Money_Flow_Ratio <= 1.52818 )
							if( bbm <= 0.009593 )
								if( Raw_Money_Flow <= 50548.9 )
									ret := -0.200000
								if( Raw_Money_Flow > 50548.9 )
									ret := 0.900000 // buy
							if( bbm > 0.009593 )
								if( Negative_Money_Flow_Sum <= 8.0302e+06 )
									ret := -0.028367
								if( Negative_Money_Flow_Sum > 8.0302e+06 )
									ret := 0.054123
						if( Money_Flow_Ratio > 1.52818 )
							if( Negative_Money_Flow_Sum <= 1.18621e+07 )
								if( bearPower <= 0.389088 )
									ret := 0.082902
								if( bearPower > 0.389088 )
									ret := -0.151625
							if( Negative_Money_Flow_Sum > 1.18621e+07 )
								if( Negative_Money_Flow_Sum <= 1.71738e+07 )
									ret := 0.411594
								if( Negative_Money_Flow_Sum > 1.71738e+07 )
									ret := 0.064516
				if( Typical_Price > 134.841 )
					if( Negative_Money_Flow_Sum <= 1.84328e+07 )
						if( bearPower <= 0.23615 )
							if( Positive_Money_Flow <= 2.82474e+06 )
								if( Positive_Money_Flow_Sum <= 1.17508e+06 )
									ret := 0.178723
								if( Positive_Money_Flow_Sum > 1.17508e+06 )
									ret := -0.014017
							if( Positive_Money_Flow > 2.82474e+06 )
								if( bbm <= 1.05367 )
									ret := 0.211921
								if( bbm > 1.05367 )
									ret := -1.000000 // sell
						if( bearPower > 0.23615 )
							if( Raw_Money_Flow <= 151726 )
								if( bbp <= 0.592594 )
									ret := 0.428571
								if( bbp > 0.592594 )
									ret := -0.614458
							if( Raw_Money_Flow > 151726 )
								if( Positive_Money_Flow_Sum <= 1.53288e+06 )
									ret := 0.549020
								if( Positive_Money_Flow_Sum > 1.53288e+06 )
									ret := -0.142420
					if( Negative_Money_Flow_Sum > 1.84328e+07 )
						if( bearPower <= -1.18714 )
							if( Money_Flow_Ratio <= 0.225614 )
								ret := -0.200000
							if( Money_Flow_Ratio > 0.225614 )
								if( MFI <= 26.259 )
									ret := 1.000000 // buy
								if( MFI > 26.259 )
									ret := 0.571429
						if( bearPower > -1.18714 )
							if( Typical_Price <= 165.039 )
								if( Typical_Price <= 134.959 )
									ret := 0.470588
								if( Typical_Price > 134.959 )
									ret := -0.192783
							if( Typical_Price > 165.039 )
								ret := -1.000000 // sell
			if( Positive_Money_Flow > 4.91365e+06 )
				if( bbp <= 1.67967 )
					if( bbp <= 1.07853 )
						if( bbm <= 0.188197 )
							if( MFI <= 87.5575 )
								if( Typical_Price <= 139.486 )
									ret := 0.014388
								if( Typical_Price > 139.486 )
									ret := -0.278689
							if( MFI > 87.5575 )
								if( MFI <= 90.3584 )
									ret := -0.923077 // sell
								if( MFI > 90.3584 )
									ret := -0.352941
						if( bbm > 0.188197 )
							if( bearPower <= -0.466811 )
								if( bullPower <= 0.025132 )
									ret := 0.073864
								if( bullPower > 0.025132 )
									ret := -0.684211
							if( bearPower > -0.466811 )
								if( Negative_Money_Flow_Sum <= 2.37698e+08 )
									ret := 0.244232
								if( Negative_Money_Flow_Sum > 2.37698e+08 )
									ret := -1.000000 // sell
					if( bbp > 1.07853 )
						if( Positive_Money_Flow_Sum <= 9.67862e+07 )
							if( Typical_Price <= 118.055 )
								if( bbp <= 1.10276 )
									ret := 0.250000
								if( bbp > 1.10276 )
									ret := 0.980392 // buy
							if( Typical_Price > 118.055 )
								if( Positive_Money_Flow_Sum <= 7.84982e+07 )
									ret := 0.449664
								if( Positive_Money_Flow_Sum > 7.84982e+07 )
									ret := -0.307692
						if( Positive_Money_Flow_Sum > 9.67862e+07 )
							if( Positive_Money_Flow <= 1.05332e+07 )
								if( MFI_High <= -3.69562 )
									ret := -0.750000 // sell
								if( MFI_High > -3.69562 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow > 1.05332e+07 )
								if( MFI_High <= 10.3391 )
									ret := -0.250000
								if( MFI_High > 10.3391 )
									ret := 0.500000
				if( bbp > 1.67967 )
					if( Positive_Money_Flow <= 9.26544e+06 )
						if( Typical_Price <= 126.279 )
							if( bbp <= 1.81622 )
								ret := 0.285714
							if( bbp > 1.81622 )
								if( bbm <= 0.92 )
									ret := 1.000000 // buy
								if( bbm > 0.92 )
									ret := 0.666667
						if( Typical_Price > 126.279 )
							if( Positive_Money_Flow_Sum <= 3.18096e+07 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 3.18096e+07 )
								if( Money_Flow_Ratio <= 47.827 )
									ret := 0.500000
								if( Money_Flow_Ratio > 47.827 )
									ret := -0.833333 // sell
					if( Positive_Money_Flow > 9.26544e+06 )
						if( MFI_High <= 15.3969 )
							if( MFI_High <= -3.75233 )
								ret := -0.833333 // sell
							if( MFI_High > -3.75233 )
								ret := -1.000000 // sell
						if( MFI_High > 15.3969 )
							if( Positive_Money_Flow <= 1.37414e+07 )
								ret := -0.800000 // sell
							if( Positive_Money_Flow > 1.37414e+07 )
								ret := 0.750000 // buy
	if( Negative_Money_Flow > 11200.5 )
		if( Positive_Money_Flow_Sum <= 1.04563e+06 )
			if( BBPower_Color <= 0.5 )
				if( Negative_Money_Flow_Sum <= 9.30679e+06 )
					if( Raw_Money_Flow <= 82621.5 )
						if( bearPower <= -0.088864 )
							if( MFI_Low <= -3.60791 )
								if( bbm <= 0.00504 )
									ret := 0.365854
								if( bbm > 0.00504 )
									ret := -0.233333
							if( MFI_Low > -3.60791 )
								if( Positive_Money_Flow_Sum <= 123143 )
									ret := 0.910714 // buy
								if( Positive_Money_Flow_Sum > 123143 )
									ret := 0.432779
						if( bearPower > -0.088864 )
							if( MFI <= 42.9351 )
								if( Negative_Money_Flow <= 59021.5 )
									ret := 0.055310
								if( Negative_Money_Flow > 59021.5 )
									ret := 0.409091
							if( MFI > 42.9351 )
								if( Typical_Price <= 111.149 )
									ret := -0.163265
								if( Typical_Price > 111.149 )
									ret := 0.387687
					if( Raw_Money_Flow > 82621.5 )
						if( Negative_Money_Flow_Sum <= 3.78023e+06 )
							if( bullPower <= -0.696481 )
								if( bbm <= 0.517087 )
									ret := -0.354839
								if( bbm > 0.517087 )
									ret := 1.000000 // buy
							if( bullPower > -0.696481 )
								if( Raw_Money_Flow <= 1.56951e+06 )
									ret := 0.211425
								if( Raw_Money_Flow > 1.56951e+06 )
									ret := -0.652174
						if( Negative_Money_Flow_Sum > 3.78023e+06 )
							if( bbp <= -0.666045 )
								if( bearPower <= -0.500237 )
									ret := 0.917808 // buy
								if( bearPower > -0.500237 )
									ret := 0.250000
							if( bbp > -0.666045 )
								if( bbm <= 0.57599 )
									ret := 0.076271
								if( bbm > 0.57599 )
									ret := 0.947368 // buy
				if( Negative_Money_Flow_Sum > 9.30679e+06 )
					if( Negative_Money_Flow_Sum <= 1.63324e+07 )
						if( Negative_Money_Flow <= 1.07262e+06 )
							if( bbp <= -0.052106 )
								if( Typical_Price <= 139.206 )
									ret := -0.192308
								if( Typical_Price > 139.206 )
									ret := 0.900000 // buy
							if( bbp > -0.052106 )
								ret := -0.833333 // sell
						if( Negative_Money_Flow > 1.07262e+06 )
							if( Positive_Money_Flow_Sum <= 489517 )
								if( Raw_Money_Flow <= 1.27817e+06 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 1.27817e+06 )
									ret := 0.375000
							if( Positive_Money_Flow_Sum > 489517 )
								if( bullPower <= 0.456034 )
									ret := -0.779221 // sell
								if( bullPower > 0.456034 )
									ret := 0.250000
					if( Negative_Money_Flow_Sum > 1.63324e+07 )
						if( Positive_Money_Flow_Sum <= 879043 )
							if( MFI <= 3.3779 )
								if( Negative_Money_Flow_Sum <= 1.98652e+08 )
									ret := -0.345455
								if( Negative_Money_Flow_Sum > 1.98652e+08 )
									ret := 1.000000 // buy
							if( MFI > 3.3779 )
								if( bbm <= 0.177801 )
									ret := 0.000000
								if( bbm > 0.177801 )
									ret := 0.846154 // buy
						if( Positive_Money_Flow_Sum > 879043 )
							if( Typical_Price <= 135.064 )
								if( Positive_Money_Flow_Sum <= 926232 )
									ret := 0.700000 // buy
								if( Positive_Money_Flow_Sum > 926232 )
									ret := -0.181818
							if( Typical_Price > 135.064 )
								if( Positive_Money_Flow <= 1508.05 )
									ret := 0.777778 // buy
								if( Positive_Money_Flow > 1508.05 )
									ret := 1.000000 // buy
			if( BBPower_Color > 0.5 )
				if( bbm <= 0.021226 )
					if( Negative_Money_Flow <= 19940.2 )
						if( MFI_Low <= -9.82716 )
							if( Negative_Money_Flow_Sum <= 8.11411e+06 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 8.11411e+06 )
								ret := 0.500000
						if( MFI_Low > -9.82716 )
							if( Positive_Money_Flow_Sum <= 481788 )
								if( Negative_Money_Flow_Sum <= 291146 )
									ret := -0.386364
								if( Negative_Money_Flow_Sum > 291146 )
									ret := -0.054545
							if( Positive_Money_Flow_Sum > 481788 )
								if( Positive_Money_Flow <= 18615.7 )
									ret := -0.581081
								if( Positive_Money_Flow > 18615.7 )
									ret := 0.600000
					if( Negative_Money_Flow > 19940.2 )
						if( Typical_Price <= 127.04 )
							if( bbp <= 1.25365 )
								if( bullPower <= 0.198823 )
									ret := -0.130435
								if( bullPower > 0.198823 )
									ret := -0.591837
							if( bbp > 1.25365 )
								ret := 1.000000 // buy
						if( Typical_Price > 127.04 )
							if( MFI <= 74.6595 )
								if( MFI <= 29.3719 )
									ret := 0.215190
								if( MFI > 29.3719 )
									ret := -0.017857
							if( MFI > 74.6595 )
								if( Typical_Price <= 131.514 )
									ret := -0.200000
								if( Typical_Price > 131.514 )
									ret := 0.638889
				if( bbm > 0.021226 )
					if( MFI_Low <= 40.102 )
						if( Positive_Money_Flow_Sum <= 897720 )
							if( Positive_Money_Flow_Sum <= 562601 )
								if( Typical_Price <= 116.282 )
									ret := 0.090909
								if( Typical_Price > 116.282 )
									ret := 0.513274
							if( Positive_Money_Flow_Sum > 562601 )
								if( bearPower <= -0.017481 )
									ret := 0.333333
								if( bearPower > -0.017481 )
									ret := -0.200000
						if( Positive_Money_Flow_Sum > 897720 )
							if( MFI_Low <= 17.3434 )
								ret := 0.750000 // buy
							if( MFI_Low > 17.3434 )
								ret := 1.000000 // buy
					if( MFI_Low > 40.102 )
						if( Positive_Money_Flow_Sum <= 784724 )
							if( Negative_Money_Flow <= 89663 )
								if( bullPower <= 0.128634 )
									ret := -0.222222
								if( bullPower > 0.128634 )
									ret := -0.944444 // sell
							if( Negative_Money_Flow > 89663 )
								ret := 0.166667
						if( Positive_Money_Flow_Sum > 784724 )
							if( Negative_Money_Flow <= 106736 )
								if( bbp <= 0.210017 )
									ret := 0.875000 // buy
								if( bbp > 0.210017 )
									ret := 0.222222
							if( Negative_Money_Flow > 106736 )
								if( MFI_Low <= 44.825 )
									ret := -0.750000 // sell
								if( MFI_Low > 44.825 )
									ret := 0.000000
		if( Positive_Money_Flow_Sum > 1.04563e+06 )
			if( Negative_Money_Flow_Sum <= 1.11721e+07 )
				if( Raw_Money_Flow <= 564871 )
					if( bearPower <= 0.131357 )
						if( Raw_Money_Flow <= 101458 )
							if( bearPower <= -0.103439 )
								if( Typical_Price <= 157.856 )
									ret := 0.600567
								if( Typical_Price > 157.856 )
									ret := 0.135135
							if( bearPower > -0.103439 )
								if( Negative_Money_Flow_Sum <= 193877 )
									ret := -0.432432
								if( Negative_Money_Flow_Sum > 193877 )
									ret := 0.181118
						if( Raw_Money_Flow > 101458 )
							if( bbm <= 0.393577 )
								if( Positive_Money_Flow <= 15965.6 )
									ret := 0.055220
								if( Positive_Money_Flow > 15965.6 )
									ret := 0.269767
							if( bbm > 0.393577 )
								if( MFI_Low <= 62.2091 )
									ret := 0.739726 // buy
								if( MFI_Low > 62.2091 )
									ret := -0.083333
					if( bearPower > 0.131357 )
						if( Negative_Money_Flow <= 39233.8 )
							if( bbp <= 0.628945 )
								if( Positive_Money_Flow <= 46368.4 )
									ret := -0.440678
								if( Positive_Money_Flow > 46368.4 )
									ret := 0.400000
							if( bbp > 0.628945 )
								if( bbp <= 1.13897 )
									ret := -0.965517 // sell
								if( bbp > 1.13897 )
									ret := -0.357143
						if( Negative_Money_Flow > 39233.8 )
							if( MFI_High <= 4.12052 )
								if( Typical_Price <= 163.472 )
									ret := 0.033537
								if( Typical_Price > 163.472 )
									ret := -0.714286 // sell
							if( MFI_High > 4.12052 )
								if( bullPower <= 0.281628 )
									ret := 0.071429
								if( bullPower > 0.281628 )
									ret := -0.603175
				if( Raw_Money_Flow > 564871 )
					if( bullPower <= 0.394849 )
						if( bearPower <= -0.343636 )
							if( Raw_Money_Flow <= 2.25967e+06 )
								if( Positive_Money_Flow_Sum <= 4.44931e+06 )
									ret := 0.002551
								if( Positive_Money_Flow_Sum > 4.44931e+06 )
									ret := 0.253968
							if( Raw_Money_Flow > 2.25967e+06 )
								if( MFI <= 41.5648 )
									ret := 0.000000
								if( MFI > 41.5648 )
									ret := -0.509434
						if( bearPower > -0.343636 )
							if( MFI_Low <= 61.9282 )
								if( Positive_Money_Flow_Sum <= 2.93777e+07 )
									ret := -0.050228
								if( Positive_Money_Flow_Sum > 2.93777e+07 )
									ret := -0.419355
							if( MFI_Low > 61.9282 )
								if( Positive_Money_Flow_Sum <= 5.2887e+07 )
									ret := 0.217993
								if( Positive_Money_Flow_Sum > 5.2887e+07 )
									ret := -0.846154 // sell
					if( bullPower > 0.394849 )
						if( Negative_Money_Flow <= 4.46722e+06 )
							if( Positive_Money_Flow_Sum <= 4.331e+07 )
								if( bullPower <= 0.688515 )
									ret := 0.277311
								if( bullPower > 0.688515 )
									ret := -0.098765
							if( Positive_Money_Flow_Sum > 4.331e+07 )
								if( Money_Flow_Ratio <= 56.9994 )
									ret := -0.555556
								if( Money_Flow_Ratio > 56.9994 )
									ret := 1.000000 // buy
						if( Negative_Money_Flow > 4.46722e+06 )
							if( Positive_Money_Flow_Sum <= 4.3555e+07 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 4.3555e+07 )
								if( MFI_High <= 7.24969 )
									ret := -0.200000
								if( MFI_High > 7.24969 )
									ret := 0.800000 // buy
			if( Negative_Money_Flow_Sum > 1.11721e+07 )
				if( Typical_Price <= 132.894 )
					if( bbp <= -2.86005 )
						if( MFI_High <= -72.0747 )
							ret := 0.500000
						if( MFI_High > -72.0747 )
							if( bbp <= -3.59725 )
								ret := 1.000000 // buy
							if( bbp > -3.59725 )
								if( Positive_Money_Flow_Sum <= 1.45082e+07 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 1.45082e+07 )
									ret := 0.750000 // buy
					if( bbp > -2.86005 )
						if( Positive_Money_Flow_Sum <= 3.15751e+06 )
							if( MFI_High <= -70.9012 )
								if( bearPower <= -0.449814 )
									ret := -0.535211
								if( bearPower > -0.449814 )
									ret := -0.060606
							if( MFI_High > -70.9012 )
								if( Positive_Money_Flow_Sum <= 2.93708e+06 )
									ret := 0.166667
								if( Positive_Money_Flow_Sum > 2.93708e+06 )
									ret := -0.337838
						if( Positive_Money_Flow_Sum > 3.15751e+06 )
							if( MFI <= 59.9678 )
								if( Positive_Money_Flow_Sum <= 1.59928e+08 )
									ret := 0.154794
								if( Positive_Money_Flow_Sum > 1.59928e+08 )
									ret := -0.823529 // sell
							if( MFI > 59.9678 )
								if( BBPower_Color <= 0.5 )
									ret := 0.402222
								if( BBPower_Color > 0.5 )
									ret := 0.151456
				if( Typical_Price > 132.894 )
					if( bearPower <= 0.078369 )
						if( Negative_Money_Flow_Sum <= 2.37607e+07 )
							if( Raw_Money_Flow <= 3.43094e+06 )
								if( MFI <= 58.1096 )
									ret := 0.036357
								if( MFI > 58.1096 )
									ret := 0.287500
							if( Raw_Money_Flow > 3.43094e+06 )
								if( Raw_Money_Flow <= 5.80549e+06 )
									ret := -0.271386
								if( Raw_Money_Flow > 5.80549e+06 )
									ret := 0.146341
						if( Negative_Money_Flow_Sum > 2.37607e+07 )
							if( MFI_Low <= 54.0237 )
								if( Positive_Money_Flow_Sum <= 1.03217e+07 )
									ret := 0.056034
								if( Positive_Money_Flow_Sum > 1.03217e+07 )
									ret := 0.252700
							if( MFI_Low > 54.0237 )
								if( Raw_Money_Flow <= 352134 )
									ret := 0.333333
								if( Raw_Money_Flow > 352134 )
									ret := -0.722222 // sell
					if( bearPower > 0.078369 )
						if( Positive_Money_Flow_Sum <= 2.70202e+07 )
							if( bearPower <= 0.200088 )
								if( MFI_Low <= 37.6629 )
									ret := 0.053571
								if( MFI_Low > 37.6629 )
									ret := -0.500000
							if( bearPower > 0.200088 )
								if( Money_Flow_Ratio <= 0.763923 )
									ret := -0.375000
								if( Money_Flow_Ratio > 0.763923 )
									ret := 0.760000 // buy
						if( Positive_Money_Flow_Sum > 2.70202e+07 )
							if( bbp <= 0.843335 )
								if( Positive_Money_Flow <= 1.31256e+06 )
									ret := -0.233871
								if( Positive_Money_Flow > 1.31256e+06 )
									ret := 0.428571
							if( bbp > 0.843335 )
								if( Positive_Money_Flow_Sum <= 1.64411e+08 )
									ret := -0.787500 // sell
								if( Positive_Money_Flow_Sum > 1.64411e+08 )
									ret := 0.666667
	
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
float op_operation = decision_tree_0_SNOW_1Min_bd8322f1(bbm, bearPower, bbp, bullPower, BBPower_Color, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)

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


