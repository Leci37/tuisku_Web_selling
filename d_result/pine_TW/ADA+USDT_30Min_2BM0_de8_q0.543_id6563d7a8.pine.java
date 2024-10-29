//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: ADAUSDT_30Min_2BM0_6563d7a8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_30Min_2BM0_6563d7a8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_30Min_6563d7a8(bullPower, bbp, bearPower, bbm, BBPower_Color, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 9.01955e+06 )
		if( Typical_Price <= 1.33317 )
			if( bullPower <= -0.001859 )
				if( bearPower <= -0.03102 )
					if( MFI_High <= -59.9293 )
						if( Positive_Money_Flow <= 8.4555e+06 )
							if( bbm <= 0.020056 )
								if( bbm <= 0.0175 )
									ret := 0.739130 // buy
								if( bbm > 0.0175 )
									ret := -0.333333
							if( bbm > 0.020056 )
								if( Negative_Money_Flow <= 4.13646e+06 )
									ret := 0.666667
								if( Negative_Money_Flow > 4.13646e+06 )
									ret := 0.954545 // buy
						if( Positive_Money_Flow > 8.4555e+06 )
							if( Negative_Money_Flow_Sum <= 1.14407e+08 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.14407e+08 )
								if( Negative_Money_Flow_Sum <= 1.54142e+08 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 1.54142e+08 )
									ret := 0.105263
					if( MFI_High > -59.9293 )
						if( Money_Flow_Ratio <= 0.515844 )
							if( Negative_Money_Flow <= 6.55468e+06 )
								if( bbp <= -0.03752 )
									ret := -0.573529
								if( bbp > -0.03752 )
									ret := 0.750000 // buy
							if( Negative_Money_Flow > 6.55468e+06 )
								if( Negative_Money_Flow_Sum <= 1.07766e+08 )
									ret := -0.227273
								if( Negative_Money_Flow_Sum > 1.07766e+08 )
									ret := 0.750000 // buy
						if( Money_Flow_Ratio > 0.515844 )
							if( bullPower <= -0.028475 )
								if( Positive_Money_Flow <= 4.35921e+07 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow > 4.35921e+07 )
									ret := 0.500000
							if( bullPower > -0.028475 )
								if( bullPower <= -0.009336 )
									ret := -0.209877
								if( bullPower > -0.009336 )
									ret := 0.380952
				if( bearPower > -0.03102 )
					if( Typical_Price <= 0.463001 )
						if( Negative_Money_Flow_Sum <= 2.87286e+07 )
							if( Negative_Money_Flow_Sum <= 2.67981e+07 )
								if( bearPower <= -0.019259 )
									ret := 0.846154 // buy
								if( bearPower > -0.019259 )
									ret := 0.175664
							if( Negative_Money_Flow_Sum > 2.67981e+07 )
								if( Negative_Money_Flow <= 3.9043e+06 )
									ret := -0.474576
								if( Negative_Money_Flow > 3.9043e+06 )
									ret := 0.687500
						if( Negative_Money_Flow_Sum > 2.87286e+07 )
							if( bullPower <= -0.003937 )
								if( Money_Flow_Ratio <= 0.319948 )
									ret := 0.385542
								if( Money_Flow_Ratio > 0.319948 )
									ret := 0.723684 // buy
							if( bullPower > -0.003937 )
								if( Negative_Money_Flow_Sum <= 7.30288e+07 )
									ret := 0.137056
								if( Negative_Money_Flow_Sum > 7.30288e+07 )
									ret := 0.793103 // buy
					if( Typical_Price > 0.463001 )
						if( Negative_Money_Flow_Sum <= 2.76948e+07 )
							if( Positive_Money_Flow_Sum <= 4.8655e+06 )
								if( bullPower <= -0.004134 )
									ret := 0.440559
								if( bullPower > -0.004134 )
									ret := 0.088106
							if( Positive_Money_Flow_Sum > 4.8655e+06 )
								if( MFI_High <= -42.4214 )
									ret := -0.178611
								if( MFI_High > -42.4214 )
									ret := 0.072445
						if( Negative_Money_Flow_Sum > 2.76948e+07 )
							if( Raw_Money_Flow <= 2.17491e+06 )
								if( Negative_Money_Flow_Sum <= 4.1039e+07 )
									ret := 0.086364
								if( Negative_Money_Flow_Sum > 4.1039e+07 )
									ret := -0.571429
							if( Raw_Money_Flow > 2.17491e+06 )
								if( Negative_Money_Flow_Sum <= 5.61936e+07 )
									ret := 0.237589
								if( Negative_Money_Flow_Sum > 5.61936e+07 )
									ret := 0.081858
			if( bullPower > -0.001859 )
				if( Positive_Money_Flow_Sum <= 1.83071e+06 )
					if( Raw_Money_Flow <= 625135 )
						if( Typical_Price <= 0.088813 )
							if( Money_Flow_Ratio <= 0.364315 )
								if( Money_Flow_Ratio <= 0.329382 )
									ret := -0.500000
								if( Money_Flow_Ratio > 0.329382 )
									ret := 0.750000 // buy
							if( Money_Flow_Ratio > 0.364315 )
								if( MFI <= 32.0748 )
									ret := -0.571429
								if( MFI > 32.0748 )
									ret := -0.916667 // sell
						if( Typical_Price > 0.088813 )
							if( Negative_Money_Flow_Sum <= 3.39506e+06 )
								if( MFI_High <= -40.531 )
									ret := -0.106015
								if( MFI_High > -40.531 )
									ret := 0.010539
							if( Negative_Money_Flow_Sum > 3.39506e+06 )
								if( bbm <= 0.000984 )
									ret := -0.090361
								if( bbm > 0.000984 )
									ret := 0.092141
					if( Raw_Money_Flow > 625135 )
						if( Typical_Price <= 0.397256 )
							if( bearPower <= -0.001984 )
								if( Typical_Price <= 0.141194 )
									ret := -0.513514
								if( Typical_Price > 0.141194 )
									ret := -0.130000
							if( bearPower > -0.001984 )
								if( MFI <= 21.6023 )
									ret := 0.545455
								if( MFI > 21.6023 )
									ret := -0.222222
						if( Typical_Price > 0.397256 )
							if( Negative_Money_Flow_Sum <= 5.6794e+06 )
								if( MFI_Low <= 5.66818 )
									ret := 0.000000
								if( MFI_Low > 5.66818 )
									ret := -0.600000
							if( Negative_Money_Flow_Sum > 5.6794e+06 )
								if( Negative_Money_Flow <= 2.07358e+06 )
									ret := -0.774194 // sell
								if( Negative_Money_Flow > 2.07358e+06 )
									ret := 0.000000
				if( Positive_Money_Flow_Sum > 1.83071e+06 )
					if( Typical_Price <= 0.350719 )
						if( MFI_Low <= 57.8324 )
							if( Raw_Money_Flow <= 1.9518e+06 )
								if( Positive_Money_Flow <= 932675 )
									ret := 0.097013
								if( Positive_Money_Flow > 932675 )
									ret := -0.003501
							if( Raw_Money_Flow > 1.9518e+06 )
								if( Raw_Money_Flow <= 2.50096e+06 )
									ret := 0.365971
								if( Raw_Money_Flow > 2.50096e+06 )
									ret := 0.157830
						if( MFI_Low > 57.8324 )
							if( Positive_Money_Flow_Sum <= 1.55394e+07 )
								if( Positive_Money_Flow_Sum <= 9.52504e+06 )
									ret := -0.021909
								if( Positive_Money_Flow_Sum > 9.52504e+06 )
									ret := -0.380282
							if( Positive_Money_Flow_Sum > 1.55394e+07 )
								if( MFI <= 78.8657 )
									ret := -0.529412
								if( MFI > 78.8657 )
									ret := 0.152318
					if( Typical_Price > 0.350719 )
						if( bbp <= 0.044852 )
							if( bullPower <= 0.001514 )
								if( bbp <= -0.004326 )
									ret := 0.038556
								if( bbp > -0.004326 )
									ret := -0.030031
							if( bullPower > 0.001514 )
								if( MFI_Low <= 71.0672 )
									ret := 0.042690
								if( MFI_Low > 71.0672 )
									ret := 0.340314
						if( bbp > 0.044852 )
							if( MFI_Low <= 62.6132 )
								if( Negative_Money_Flow_Sum <= 2.84422e+07 )
									ret := 0.313333
								if( Negative_Money_Flow_Sum > 2.84422e+07 )
									ret := -0.238764
							if( MFI_Low > 62.6132 )
								if( MFI_Low <= 69.8331 )
									ret := -0.650000
								if( MFI_Low > 69.8331 )
									ret := 0.210526
		if( Typical_Price > 1.33317 )
			if( Positive_Money_Flow <= 9.58861e+06 )
				if( Positive_Money_Flow_Sum <= 5.00421e+07 )
					if( bbm <= 0.024203 )
						if( MFI_Low <= 65.6235 )
							if( Negative_Money_Flow <= 7.37499e+06 )
								if( bearPower <= 0.011779 )
									ret := -0.040925
								if( bearPower > 0.011779 )
									ret := 0.400000
							if( Negative_Money_Flow > 7.37499e+06 )
								if( Negative_Money_Flow_Sum <= 1.06442e+08 )
									ret := 0.295775
								if( Negative_Money_Flow_Sum > 1.06442e+08 )
									ret := -0.500000
						if( MFI_Low > 65.6235 )
							if( MFI <= 86.1517 )
								ret := -1.000000 // sell
							if( MFI > 86.1517 )
								ret := -0.750000 // sell
					if( bbm > 0.024203 )
						if( Typical_Price <= 1.599 )
							if( bullPower <= -0.000556 )
								if( Negative_Money_Flow <= 6.07099e+06 )
									ret := 0.125000
								if( Negative_Money_Flow > 6.07099e+06 )
									ret := 0.833333 // buy
							if( bullPower > -0.000556 )
								if( MFI <= 49.8043 )
									ret := -0.541667
								if( MFI > 49.8043 )
									ret := 0.263158
						if( Typical_Price > 1.599 )
							if( bullPower <= -0.003447 )
								if( Raw_Money_Flow <= 8.87204e+06 )
									ret := -0.814815 // sell
								if( Raw_Money_Flow > 8.87204e+06 )
									ret := -0.250000
							if( bullPower > -0.003447 )
								if( Positive_Money_Flow <= 7.8465e+06 )
									ret := -0.484375
								if( Positive_Money_Flow > 7.8465e+06 )
									ret := 0.047619
				if( Positive_Money_Flow_Sum > 5.00421e+07 )
					if( MFI <= 33.0397 )
						if( Positive_Money_Flow_Sum <= 1.52876e+08 )
							if( MFI <= 21.2325 )
								ret := 0.600000
							if( MFI > 21.2325 )
								if( Negative_Money_Flow_Sum <= 1.08194e+08 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 1.08194e+08 )
									ret := -0.744898 // sell
						if( Positive_Money_Flow_Sum > 1.52876e+08 )
							ret := 1.000000 // buy
					if( MFI > 33.0397 )
						if( Negative_Money_Flow_Sum <= 6.28592e+07 )
							if( bbp <= 0.018411 )
								if( Positive_Money_Flow_Sum <= 8.75191e+07 )
									ret := -0.365152
								if( Positive_Money_Flow_Sum > 8.75191e+07 )
									ret := 0.059524
							if( bbp > 0.018411 )
								if( Raw_Money_Flow <= 6.67855e+06 )
									ret := 0.029412
								if( Raw_Money_Flow > 6.67855e+06 )
									ret := -0.168421
						if( Negative_Money_Flow_Sum > 6.28592e+07 )
							if( Typical_Price <= 1.71492 )
								if( bbp <= 0.052571 )
									ret := 0.140244
								if( bbp > 0.052571 )
									ret := 0.916667 // buy
							if( Typical_Price > 1.71492 )
								if( MFI_High <= -16.6936 )
									ret := -0.040268
								if( MFI_High > -16.6936 )
									ret := -0.620690
			if( Positive_Money_Flow > 9.58861e+06 )
				if( MFI_High <= -32.9241 )
					if( Negative_Money_Flow_Sum <= 6.13749e+08 )
						if( Positive_Money_Flow_Sum <= 2.08989e+08 )
							if( Positive_Money_Flow_Sum <= 1.80774e+08 )
								if( bullPower <= 0.011262 )
									ret := -0.043732
								if( bullPower > 0.011262 )
									ret := -0.311258
							if( Positive_Money_Flow_Sum > 1.80774e+08 )
								if( bbp <= -0.004901 )
									ret := 0.000000
								if( bbp > -0.004901 )
									ret := 0.818182 // buy
						if( Positive_Money_Flow_Sum > 2.08989e+08 )
							if( Typical_Price <= 1.4038 )
								if( bullPower <= 0.031063 )
									ret := 1.000000 // buy
								if( bullPower > 0.031063 )
									ret := -0.250000
							if( Typical_Price > 1.4038 )
								if( MFI_Low <= 21.173 )
									ret := -0.363636
								if( MFI_Low > 21.173 )
									ret := -0.859649 // sell
					if( Negative_Money_Flow_Sum > 6.13749e+08 )
						if( MFI_High <= -47.1682 )
							if( bbp <= -0.054333 )
								ret := 0.250000
							if( bbp > -0.054333 )
								ret := 1.000000 // buy
						if( MFI_High > -47.1682 )
							if( Raw_Money_Flow <= 5.93992e+07 )
								ret := -0.800000 // sell
							if( Raw_Money_Flow > 5.93992e+07 )
								ret := 0.500000
				if( MFI_High > -32.9241 )
					if( bearPower <= 0.000336 )
						if( Typical_Price <= 2.46358 )
							if( Raw_Money_Flow <= 1.36221e+07 )
								if( Raw_Money_Flow <= 1.11604e+07 )
									ret := 0.255102
								if( Raw_Money_Flow > 1.11604e+07 )
									ret := 0.694215
							if( Raw_Money_Flow > 1.36221e+07 )
								if( Negative_Money_Flow_Sum <= 4.37191e+08 )
									ret := 0.166667
								if( Negative_Money_Flow_Sum > 4.37191e+08 )
									ret := 0.906250 // buy
						if( Typical_Price > 2.46358 )
							if( MFI_Low <= 42.922 )
								if( MFI_High <= -24.4935 )
									ret := -0.037736
								if( MFI_High > -24.4935 )
									ret := -0.638889
							if( MFI_Low > 42.922 )
								if( BBPower_Color <= 0.5 )
									ret := -0.200000
								if( BBPower_Color > 0.5 )
									ret := 0.571429
					if( bearPower > 0.000336 )
						if( Positive_Money_Flow_Sum <= 6.25842e+08 )
							if( Raw_Money_Flow <= 7.25161e+07 )
								if( bbp <= 0.117882 )
									ret := -0.006902
								if( bbp > 0.117882 )
									ret := -0.333333
							if( Raw_Money_Flow > 7.25161e+07 )
								if( bearPower <= 0.036795 )
									ret := 0.838710 // buy
								if( bearPower > 0.036795 )
									ret := 0.094340
						if( Positive_Money_Flow_Sum > 6.25842e+08 )
							if( Positive_Money_Flow <= 4.08795e+07 )
								if( Negative_Money_Flow_Sum <= 1.9752e+08 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 1.9752e+08 )
									ret := 0.000000
							if( Positive_Money_Flow > 4.08795e+07 )
								if( MFI_High <= -5.37135 )
									ret := -0.800000 // sell
								if( MFI_High > -5.37135 )
									ret := -1.000000 // sell
	if( Negative_Money_Flow > 9.01955e+06 )
		if( bearPower <= -0.033014 )
			if( Positive_Money_Flow_Sum <= 3.54093e+08 )
				if( bullPower <= -0.050024 )
					if( MFI <= 19.8771 )
						if( Typical_Price <= 2.09896 )
							if( bullPower <= -0.060396 )
								if( Money_Flow_Ratio <= 0.097857 )
									ret := 0.500000
								if( Money_Flow_Ratio > 0.097857 )
									ret := 1.000000 // buy
							if( bullPower > -0.060396 )
								ret := 0.166667
						if( Typical_Price > 2.09896 )
							if( Positive_Money_Flow_Sum <= 1.11209e+08 )
								ret := 0.500000
							if( Positive_Money_Flow_Sum > 1.11209e+08 )
								ret := -0.666667
					if( MFI > 19.8771 )
						if( Typical_Price <= 2.55567 )
							if( bbm <= 0.041492 )
								ret := 0.714286 // buy
							if( bbm > 0.041492 )
								ret := 1.000000 // buy
						if( Typical_Price > 2.55567 )
							ret := 0.000000
				if( bullPower > -0.050024 )
					if( Negative_Money_Flow_Sum <= 3.1993e+08 )
						if( Negative_Money_Flow_Sum <= 2.46531e+08 )
							if( bbm <= 0.067046 )
								if( Positive_Money_Flow_Sum <= 2.82507e+08 )
									ret := 0.320807
								if( Positive_Money_Flow_Sum > 2.82507e+08 )
									ret := -0.571429
							if( bbm > 0.067046 )
								if( Typical_Price <= 1.98268 )
									ret := 0.294872
								if( Typical_Price > 1.98268 )
									ret := -0.491803
						if( Negative_Money_Flow_Sum > 2.46531e+08 )
							if( Positive_Money_Flow_Sum <= 2.60646e+08 )
								if( MFI_Low <= -4.31629 )
									ret := 0.083333
								if( MFI_Low > -4.31629 )
									ret := 0.672727
							if( Positive_Money_Flow_Sum > 2.60646e+08 )
								if( bearPower <= -0.048964 )
									ret := 0.200000
								if( bearPower > -0.048964 )
									ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 3.1993e+08 )
						if( Positive_Money_Flow_Sum <= 2.9701e+08 )
							if( bbm <= 0.05388 )
								if( Negative_Money_Flow <= 2.81147e+07 )
									ret := 0.038462
								if( Negative_Money_Flow > 2.81147e+07 )
									ret := -0.681818
							if( bbm > 0.05388 )
								if( MFI_Low <= 1.89525 )
									ret := -0.285714
								if( MFI_Low > 1.89525 )
									ret := 0.628571
						if( Positive_Money_Flow_Sum > 2.9701e+08 )
							if( Negative_Money_Flow_Sum <= 3.61693e+08 )
								ret := -0.750000 // sell
							if( Negative_Money_Flow_Sum > 3.61693e+08 )
								ret := -1.000000 // sell
			if( Positive_Money_Flow_Sum > 3.54093e+08 )
				if( Positive_Money_Flow_Sum <= 8.57751e+08 )
					if( Money_Flow_Ratio <= 0.929845 )
						if( bbp <= -0.096075 )
							ret := 1.000000 // buy
						if( bbp > -0.096075 )
							ret := -0.250000
					if( Money_Flow_Ratio > 0.929845 )
						if( Typical_Price <= 2.24747 )
							ret := 1.000000 // buy
						if( Typical_Price > 2.24747 )
							ret := 0.600000
				if( Positive_Money_Flow_Sum > 8.57751e+08 )
					ret := -1.000000 // sell
		if( bearPower > -0.033014 )
			if( Typical_Price <= 1.53964 )
				if( MFI <= 69.9323 )
					if( bullPower <= 0.020246 )
						if( Money_Flow_Ratio <= 1.64525 )
							if( Positive_Money_Flow_Sum <= 2.20104e+08 )
								if( Negative_Money_Flow_Sum <= 9.21879e+07 )
									ret := 0.142402
								if( Negative_Money_Flow_Sum > 9.21879e+07 )
									ret := 0.371476
							if( Positive_Money_Flow_Sum > 2.20104e+08 )
								if( Typical_Price <= 0.899178 )
									ret := 1.000000 // buy
								if( Typical_Price > 0.899178 )
									ret := -0.383333
						if( Money_Flow_Ratio > 1.64525 )
							if( Typical_Price <= 0.570737 )
								if( bbp <= 0.017078 )
									ret := 0.720000 // buy
								if( bbp > 0.017078 )
									ret := -0.857143 // sell
							if( Typical_Price > 0.570737 )
								if( Positive_Money_Flow_Sum <= 1.3822e+08 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 1.3822e+08 )
									ret := 0.043478
					if( bullPower > 0.020246 )
						if( Negative_Money_Flow_Sum <= 7.13615e+07 )
							if( MFI_Low <= 40.3018 )
								if( bbp <= 0.030857 )
									ret := 0.000000
								if( bbp > 0.030857 )
									ret := 0.857143 // buy
							if( MFI_Low > 40.3018 )
								if( Typical_Price <= 1.4385 )
									ret := 0.850000 // buy
								if( Typical_Price > 1.4385 )
									ret := 0.285714
						if( Negative_Money_Flow_Sum > 7.13615e+07 )
							if( Typical_Price <= 0.791812 )
								if( Negative_Money_Flow_Sum <= 1.39767e+08 )
									ret := -0.888889 // sell
								if( Negative_Money_Flow_Sum > 1.39767e+08 )
									ret := 0.666667
							if( Typical_Price > 0.791812 )
								if( MFI <= 60.1083 )
									ret := 0.137363
								if( MFI > 60.1083 )
									ret := 0.426036
				if( MFI > 69.9323 )
					if( bbp <= 0.034986 )
						if( bearPower <= -0.011449 )
							if( bbm <= 0.027102 )
								ret := 0.250000
							if( bbm > 0.027102 )
								if( BBPower_Color <= 0.5 )
									ret := 1.000000 // buy
								if( BBPower_Color > 0.5 )
									ret := 0.250000
						if( bearPower > -0.011449 )
							if( Negative_Money_Flow_Sum <= 5.18694e+07 )
								if( Negative_Money_Flow_Sum <= 2.98668e+07 )
									ret := -0.655172
								if( Negative_Money_Flow_Sum > 2.98668e+07 )
									ret := 0.439024
							if( Negative_Money_Flow_Sum > 5.18694e+07 )
								if( Raw_Money_Flow <= 1.65777e+07 )
									ret := -0.944444 // sell
								if( Raw_Money_Flow > 1.65777e+07 )
									ret := -0.058824
					if( bbp > 0.034986 )
						if( bbm <= 0.019667 )
							if( Negative_Money_Flow <= 1.06717e+07 )
								if( bullPower <= 0.02628 )
									ret := 1.000000 // buy
								if( bullPower > 0.02628 )
									ret := -0.181818
							if( Negative_Money_Flow > 1.06717e+07 )
								if( Positive_Money_Flow_Sum <= 2.02821e+08 )
									ret := 0.590909
								if( Positive_Money_Flow_Sum > 2.02821e+08 )
									ret := 1.000000 // buy
						if( bbm > 0.019667 )
							if( Money_Flow_Ratio <= 3.46354 )
								if( Negative_Money_Flow_Sum <= 6.40525e+07 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 6.40525e+07 )
									ret := -0.076923
							if( Money_Flow_Ratio > 3.46354 )
								if( Negative_Money_Flow <= 2.08493e+07 )
									ret := -0.846154 // sell
								if( Negative_Money_Flow > 2.08493e+07 )
									ret := 0.000000
			if( Typical_Price > 1.53964 )
				if( MFI_Low <= 39.3411 )
					if( Positive_Money_Flow_Sum <= 6.96205e+07 )
						if( Positive_Money_Flow_Sum <= 4.80014e+07 )
							if( Negative_Money_Flow_Sum <= 5.8748e+07 )
								if( Raw_Money_Flow <= 1.17078e+07 )
									ret := -0.756757 // sell
								if( Raw_Money_Flow > 1.17078e+07 )
									ret := 0.200000
							if( Negative_Money_Flow_Sum > 5.8748e+07 )
								if( Typical_Price <= 1.8005 )
									ret := -0.121951
								if( Typical_Price > 1.8005 )
									ret := 0.282051
						if( Positive_Money_Flow_Sum > 4.80014e+07 )
							if( Negative_Money_Flow_Sum <= 8.283e+07 )
								if( bbm <= 0.02724 )
									ret := -0.266667
								if( bbm > 0.02724 )
									ret := 0.470588
							if( Negative_Money_Flow_Sum > 8.283e+07 )
								if( MFI <= 32.3528 )
									ret := -0.153846
								if( MFI > 32.3528 )
									ret := 0.777778 // buy
					if( Positive_Money_Flow_Sum > 6.96205e+07 )
						if( Positive_Money_Flow_Sum <= 4.11913e+08 )
							if( Positive_Money_Flow_Sum <= 2.16337e+08 )
								if( Positive_Money_Flow_Sum <= 1.85657e+08 )
									ret := -0.117470
								if( Positive_Money_Flow_Sum > 1.85657e+08 )
									ret := -0.603448
							if( Positive_Money_Flow_Sum > 2.16337e+08 )
								if( Money_Flow_Ratio <= 0.817361 )
									ret := -0.692308
								if( Money_Flow_Ratio > 0.817361 )
									ret := 0.353535
						if( Positive_Money_Flow_Sum > 4.11913e+08 )
							if( Positive_Money_Flow_Sum <= 6.51537e+08 )
								if( MFI <= 55.1298 )
									ret := -1.000000 // sell
								if( MFI > 55.1298 )
									ret := -0.777778 // sell
							if( Positive_Money_Flow_Sum > 6.51537e+08 )
								ret := 1.000000 // buy
				if( MFI_Low > 39.3411 )
					if( Positive_Money_Flow_Sum <= 9.30462e+08 )
						if( bbp <= 0.016878 )
							if( bbm <= 0.01869 )
								if( bbp <= 0.008395 )
									ret := 0.785714 // buy
								if( bbp > 0.008395 )
									ret := 1.000000 // buy
							if( bbm > 0.01869 )
								if( Positive_Money_Flow_Sum <= 1.21425e+08 )
									ret := -0.150000
								if( Positive_Money_Flow_Sum > 1.21425e+08 )
									ret := 0.532609
						if( bbp > 0.016878 )
							if( Positive_Money_Flow_Sum <= 2.17093e+08 )
								if( Positive_Money_Flow_Sum <= 1.76569e+08 )
									ret := 0.185567
								if( Positive_Money_Flow_Sum > 1.76569e+08 )
									ret := -0.647059
							if( Positive_Money_Flow_Sum > 2.17093e+08 )
								if( bbp <= 0.031509 )
									ret := -0.114286
								if( bbp > 0.031509 )
									ret := 0.362903
					if( Positive_Money_Flow_Sum > 9.30462e+08 )
						if( bbp <= 0.107689 )
							ret := 0.000000
						if( bbp > 0.107689 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_ADAUSDT_30Min_6563d7a8(bullPower, bbp, bearPower, bbm, BBPower_Color, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


