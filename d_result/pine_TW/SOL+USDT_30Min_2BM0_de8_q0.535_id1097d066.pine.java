//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: SOLUSDT_30Min_2BM0_1097d066 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_30Min_2BM0_1097d066", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_30Min_1097d066(bbm, bearPower, bbp, bullPower, BBPower_Color, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -6.08205 )
		if( Typical_Price <= 182.486 )
			if( Positive_Money_Flow_Sum <= 2.37824e+08 )
				if( MFI <= 42.3283 )
					if( Typical_Price <= 134.71 )
						if( Raw_Money_Flow <= 9.73283e+06 )
							if( Negative_Money_Flow <= 3.00297e+06 )
								if( Money_Flow_Ratio <= 0.340481 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 0.340481 )
									ret := 0.250000
							if( Negative_Money_Flow > 3.00297e+06 )
								if( Positive_Money_Flow_Sum <= 1.59877e+07 )
									ret := -0.764706 // sell
								if( Positive_Money_Flow_Sum > 1.59877e+07 )
									ret := 0.083333
						if( Raw_Money_Flow > 9.73283e+06 )
							if( Negative_Money_Flow_Sum <= 4.19613e+08 )
								if( MFI <= 30.0539 )
									ret := 0.704380 // buy
								if( MFI > 30.0539 )
									ret := 0.322917
							if( Negative_Money_Flow_Sum > 4.19613e+08 )
								if( Negative_Money_Flow_Sum <= 6.14028e+08 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 6.14028e+08 )
									ret := 0.833333 // buy
					if( Typical_Price > 134.71 )
						if( Positive_Money_Flow <= 6.06998e+07 )
							if( bullPower <= -2.15561 )
								if( Positive_Money_Flow_Sum <= 1.45017e+07 )
									ret := -0.300000
								if( Positive_Money_Flow_Sum > 1.45017e+07 )
									ret := 0.381232
							if( bullPower > -2.15561 )
								if( Positive_Money_Flow_Sum <= 2.00914e+08 )
									ret := -0.062500
								if( Positive_Money_Flow_Sum > 2.00914e+08 )
									ret := 0.833333 // buy
						if( Positive_Money_Flow > 6.06998e+07 )
							if( Money_Flow_Ratio <= 0.52843 )
								ret := -0.750000 // sell
							if( Money_Flow_Ratio > 0.52843 )
								ret := -1.000000 // sell
				if( MFI > 42.3283 )
					if( Negative_Money_Flow <= 1.38024e+07 )
						if( Positive_Money_Flow <= 2.09586e+07 )
							if( Positive_Money_Flow_Sum <= 9.18868e+07 )
								ret := -0.250000
							if( Positive_Money_Flow_Sum > 9.18868e+07 )
								if( MFI <= 46.2246 )
									ret := -1.000000 // sell
								if( MFI > 46.2246 )
									ret := -0.857143 // sell
						if( Positive_Money_Flow > 2.09586e+07 )
							ret := 0.166667
					if( Negative_Money_Flow > 1.38024e+07 )
						if( Negative_Money_Flow_Sum <= 1.19583e+08 )
							ret := -0.833333 // sell
						if( Negative_Money_Flow_Sum > 1.19583e+08 )
							if( MFI <= 47.3143 )
								if( Positive_Money_Flow_Sum <= 1.07846e+08 )
									ret := 0.250000
								if( Positive_Money_Flow_Sum > 1.07846e+08 )
									ret := 1.000000 // buy
							if( MFI > 47.3143 )
								ret := 0.000000
			if( Positive_Money_Flow_Sum > 2.37824e+08 )
				if( bullPower <= 1.80865 )
					if( bbm <= 4.15197 )
						if( bearPower <= -6.80405 )
							ret := 0.857143 // buy
						if( bearPower > -6.80405 )
							if( Negative_Money_Flow <= 4.37952e+07 )
								if( Negative_Money_Flow_Sum <= 4.16235e+08 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 4.16235e+08 )
									ret := 0.714286 // buy
							if( Negative_Money_Flow > 4.37952e+07 )
								ret := -0.500000
					if( bbm > 4.15197 )
						if( Positive_Money_Flow <= 7.2472e+07 )
							if( bearPower <= -8.48397 )
								if( Negative_Money_Flow_Sum <= 4.53259e+08 )
									ret := 0.200000
								if( Negative_Money_Flow_Sum > 4.53259e+08 )
									ret := 0.875000 // buy
							if( bearPower > -8.48397 )
								if( Negative_Money_Flow_Sum <= 3.68162e+08 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow_Sum > 3.68162e+08 )
									ret := 1.000000 // buy
						if( Positive_Money_Flow > 7.2472e+07 )
							if( MFI_Low <= 22.528 )
								if( bearPower <= -11.1218 )
									ret := 1.000000 // buy
								if( bearPower > -11.1218 )
									ret := 0.500000
							if( MFI_Low > 22.528 )
								ret := -0.750000 // sell
				if( bullPower > 1.80865 )
					ret := -1.000000 // sell
		if( Typical_Price > 182.486 )
			if( bearPower <= -13.8937 )
				if( bbp <= -23.2148 )
					ret := -0.250000
				if( bbp > -23.2148 )
					if( Money_Flow_Ratio <= 0.277107 )
						ret := 1.000000 // buy
					if( Money_Flow_Ratio > 0.277107 )
						ret := 0.750000 // buy
			if( bearPower > -13.8937 )
				if( Positive_Money_Flow <= 5.11368e+07 )
					if( Positive_Money_Flow_Sum <= 8.68002e+07 )
						if( Typical_Price <= 190.169 )
							if( Money_Flow_Ratio <= 0.29147 )
								if( bearPower <= -5.43816 )
									ret := 0.789474 // buy
								if( bearPower > -5.43816 )
									ret := 0.000000
							if( Money_Flow_Ratio > 0.29147 )
								if( Raw_Money_Flow <= 1.5785e+07 )
									ret := -0.777778 // sell
								if( Raw_Money_Flow > 1.5785e+07 )
									ret := -0.090909
						if( Typical_Price > 190.169 )
							if( Negative_Money_Flow_Sum <= 1.68828e+08 )
								if( Negative_Money_Flow <= 3.42515e+07 )
									ret := -0.223301
								if( Negative_Money_Flow > 3.42515e+07 )
									ret := 0.500000
							if( Negative_Money_Flow_Sum > 1.68828e+08 )
								if( Money_Flow_Ratio <= 0.150225 )
									ret := -0.933333 // sell
								if( Money_Flow_Ratio > 0.150225 )
									ret := -0.588235
					if( Positive_Money_Flow_Sum > 8.68002e+07 )
						if( Negative_Money_Flow_Sum <= 5.15758e+08 )
							if( bbp <= -10.4701 )
								if( Positive_Money_Flow <= 2.87862e+06 )
									ret := 0.600000
								if( Positive_Money_Flow > 2.87862e+06 )
									ret := 1.000000 // buy
							if( bbp > -10.4701 )
								if( bbm <= 6.06995 )
									ret := 0.096774
								if( bbm > 6.06995 )
									ret := 0.900000 // buy
						if( Negative_Money_Flow_Sum > 5.15758e+08 )
							if( Typical_Price <= 195.282 )
								if( Raw_Money_Flow <= 5.01261e+07 )
									ret := -0.250000
								if( Raw_Money_Flow > 5.01261e+07 )
									ret := -0.916667 // sell
							if( Typical_Price > 195.282 )
								ret := 0.500000
				if( Positive_Money_Flow > 5.11368e+07 )
					if( bbp <= -14.1218 )
						ret := -0.400000
					if( bbp > -14.1218 )
						ret := -1.000000 // sell
	if( bbp > -6.08205 )
		if( Negative_Money_Flow_Sum <= 569401 )
			if( Typical_Price <= 2.52631 )
				if( Typical_Price <= 1.37152 )
					if( bbp <= -0.02904 )
						if( Negative_Money_Flow_Sum <= 190940 )
							ret := -0.400000
						if( Negative_Money_Flow_Sum > 190940 )
							if( Positive_Money_Flow <= 17646 )
								if( bbm <= 0.03725 )
									ret := 0.974359 // buy
								if( bbm > 0.03725 )
									ret := 0.500000
							if( Positive_Money_Flow > 17646 )
								ret := 0.500000
					if( bbp > -0.02904 )
						if( bullPower <= 0.006425 )
							if( Positive_Money_Flow_Sum <= 273874 )
								if( bbm <= 0.01495 )
									ret := -0.062500
								if( bbm > 0.01495 )
									ret := 0.571429
							if( Positive_Money_Flow_Sum > 273874 )
								if( Positive_Money_Flow <= 11479.7 )
									ret := -0.900000 // sell
								if( Positive_Money_Flow > 11479.7 )
									ret := 0.000000
						if( bullPower > 0.006425 )
							if( MFI <= 67.0499 )
								if( Positive_Money_Flow_Sum <= 207929 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 207929 )
									ret := 0.509434
							if( MFI > 67.0499 )
								if( Raw_Money_Flow <= 61104.9 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 61104.9 )
									ret := -0.200000
				if( Typical_Price > 1.37152 )
					if( bullPower <= 0.0222 )
						if( MFI_High <= -61.3813 )
							if( bullPower <= -0.02835 )
								if( Money_Flow_Ratio <= 0.12076 )
									ret := 0.714286 // buy
								if( Money_Flow_Ratio > 0.12076 )
									ret := -0.142857
							if( bullPower > -0.02835 )
								if( Typical_Price <= 1.87577 )
									ret := 0.780000 // buy
								if( Typical_Price > 1.87577 )
									ret := -0.058824
						if( MFI_High > -61.3813 )
							if( BBPower_Color <= 0.5 )
								if( Raw_Money_Flow <= 16027.9 )
									ret := -0.342857
								if( Raw_Money_Flow > 16027.9 )
									ret := -0.122982
							if( BBPower_Color > 0.5 )
								if( Money_Flow_Ratio <= 1.56597 )
									ret := 0.114458
								if( Money_Flow_Ratio > 1.56597 )
									ret := -0.127551
					if( bullPower > 0.0222 )
						if( Negative_Money_Flow <= 578.116 )
							if( Typical_Price <= 2.48195 )
								if( Positive_Money_Flow_Sum <= 707495 )
									ret := 0.091584
								if( Positive_Money_Flow_Sum > 707495 )
									ret := -0.185606
							if( Typical_Price > 2.48195 )
								if( bullPower <= 0.028088 )
									ret := 0.500000
								if( bullPower > 0.028088 )
									ret := 0.916667 // buy
						if( Negative_Money_Flow > 578.116 )
							if( bbm <= 0.025051 )
								if( Raw_Money_Flow <= 55338.2 )
									ret := 0.198198
								if( Raw_Money_Flow > 55338.2 )
									ret := -0.542857
							if( bbm > 0.025051 )
								if( Negative_Money_Flow_Sum <= 247135 )
									ret := 0.742424 // buy
								if( Negative_Money_Flow_Sum > 247135 )
									ret := 0.280952
			if( Typical_Price > 2.52631 )
				if( Money_Flow_Ratio <= 1.12025 )
					if( Negative_Money_Flow <= 96751.3 )
						if( bearPower <= -0.012325 )
							if( bbp <= -0.007962 )
								if( Raw_Money_Flow <= 12582.5 )
									ret := -0.200000
								if( Raw_Money_Flow > 12582.5 )
									ret := -0.810606 // sell
							if( bbp > -0.007962 )
								if( Positive_Money_Flow_Sum <= 354606 )
									ret := 0.200000
								if( Positive_Money_Flow_Sum > 354606 )
									ret := -0.444444
						if( bearPower > -0.012325 )
							if( bearPower <= -0.006634 )
								if( bullPower <= 0.003977 )
									ret := 0.714286 // buy
								if( bullPower > 0.003977 )
									ret := -0.071429
							if( bearPower > -0.006634 )
								if( BBPower_Color <= 0.5 )
									ret := -1.000000 // sell
								if( BBPower_Color > 0.5 )
									ret := -0.411765
					if( Negative_Money_Flow > 96751.3 )
						if( Negative_Money_Flow <= 151601 )
							if( Negative_Money_Flow_Sum <= 445945 )
								if( MFI_Low <= 20.3306 )
									ret := 0.750000 // buy
								if( MFI_Low > 20.3306 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 445945 )
								ret := 0.250000
						if( Negative_Money_Flow > 151601 )
							ret := -0.833333 // sell
				if( Money_Flow_Ratio > 1.12025 )
					if( MFI_Low <= 36.3327 )
						if( Negative_Money_Flow_Sum <= 517755 )
							if( Positive_Money_Flow_Sum <= 372682 )
								if( Positive_Money_Flow <= 8895.54 )
									ret := -0.125000
								if( Positive_Money_Flow > 8895.54 )
									ret := 0.375000
							if( Positive_Money_Flow_Sum > 372682 )
								if( Positive_Money_Flow_Sum <= 467012 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 467012 )
									ret := -0.142857
						if( Negative_Money_Flow_Sum > 517755 )
							if( Negative_Money_Flow_Sum <= 563064 )
								if( Positive_Money_Flow_Sum <= 640350 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 640350 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 563064 )
								ret := 0.500000
					if( MFI_Low > 36.3327 )
						if( Raw_Money_Flow <= 418353 )
							if( bbp <= 0.156727 )
								if( Negative_Money_Flow_Sum <= 331156 )
									ret := -0.046693
								if( Negative_Money_Flow_Sum > 331156 )
									ret := -0.400000
							if( bbp > 0.156727 )
								if( Negative_Money_Flow_Sum <= 293616 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 293616 )
									ret := -0.547619
						if( Raw_Money_Flow > 418353 )
							if( bbp <= 0.20188 )
								if( MFI <= 90.4191 )
									ret := 0.947368 // buy
								if( MFI > 90.4191 )
									ret := 0.500000
							if( bbp > 0.20188 )
								if( Positive_Money_Flow_Sum <= 5.61114e+06 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 5.61114e+06 )
									ret := 0.285714
		if( Negative_Money_Flow_Sum > 569401 )
			if( Positive_Money_Flow_Sum <= 1.18248e+06 )
				if( bbm <= 0.02101 )
					if( Positive_Money_Flow_Sum <= 340365 )
						if( bullPower <= -0.004626 )
							if( Raw_Money_Flow <= 43273.7 )
								if( Negative_Money_Flow_Sum <= 1.19048e+06 )
									ret := -0.257732
								if( Negative_Money_Flow_Sum > 1.19048e+06 )
									ret := 0.800000 // buy
							if( Raw_Money_Flow > 43273.7 )
								if( Positive_Money_Flow <= 48352.7 )
									ret := -0.649123
								if( Positive_Money_Flow > 48352.7 )
									ret := -0.076923
						if( bullPower > -0.004626 )
							if( Typical_Price <= 2.0007 )
								if( Raw_Money_Flow <= 37142.6 )
									ret := 0.157895
								if( Raw_Money_Flow > 37142.6 )
									ret := 1.000000 // buy
							if( Typical_Price > 2.0007 )
								if( Negative_Money_Flow_Sum <= 698675 )
									ret := -0.500000
								if( Negative_Money_Flow_Sum > 698675 )
									ret := 0.142857
					if( Positive_Money_Flow_Sum > 340365 )
						if( Positive_Money_Flow <= 34595.3 )
							if( Negative_Money_Flow_Sum <= 665749 )
								if( MFI_Low <= 42.4058 )
									ret := -0.159091
								if( MFI_Low > 42.4058 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 665749 )
								if( bbm <= 0.019942 )
									ret := 0.520000
								if( bbm > 0.019942 )
									ret := -0.235294
						if( Positive_Money_Flow > 34595.3 )
							if( Positive_Money_Flow_Sum <= 482211 )
								if( Typical_Price <= 2.0101 )
									ret := -0.133333
								if( Typical_Price > 2.0101 )
									ret := 0.714286 // buy
							if( Positive_Money_Flow_Sum > 482211 )
								if( Positive_Money_Flow <= 36331 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow > 36331 )
									ret := -0.282609
				if( bbm > 0.02101 )
					if( Positive_Money_Flow <= 10295.7 )
						if( Typical_Price <= 2.09748 )
							if( MFI_High <= -37.2894 )
								if( Positive_Money_Flow_Sum <= 800882 )
									ret := 0.438235
								if( Positive_Money_Flow_Sum > 800882 )
									ret := 0.880000 // buy
							if( MFI_High > -37.2894 )
								if( MFI_Low <= 26.802 )
									ret := -0.458333
								if( MFI_Low > 26.802 )
									ret := 0.325843
						if( Typical_Price > 2.09748 )
							if( Negative_Money_Flow <= 88777.6 )
								if( Money_Flow_Ratio <= 0.92824 )
									ret := -0.360825
								if( Money_Flow_Ratio > 0.92824 )
									ret := 0.500000
							if( Negative_Money_Flow > 88777.6 )
								if( Negative_Money_Flow_Sum <= 2.02582e+06 )
									ret := 0.058442
								if( Negative_Money_Flow_Sum > 2.02582e+06 )
									ret := 0.316667
					if( Positive_Money_Flow > 10295.7 )
						if( bullPower <= 0.029285 )
							if( Negative_Money_Flow <= 25021.3 )
								if( bbp <= -0.107339 )
									ret := 0.080645
								if( bbp > -0.107339 )
									ret := 0.388610
							if( Negative_Money_Flow > 25021.3 )
								if( bearPower <= -0.010293 )
									ret := 0.720430 // buy
								if( bearPower > -0.010293 )
									ret := -0.200000
						if( bullPower > 0.029285 )
							if( Typical_Price <= 2.9413 )
								if( Typical_Price <= 1.61362 )
									ret := -0.500000
								if( Typical_Price > 1.61362 )
									ret := 0.341564
							if( Typical_Price > 2.9413 )
								if( Money_Flow_Ratio <= 0.891418 )
									ret := 0.200000
								if( Money_Flow_Ratio > 0.891418 )
									ret := -0.528302
			if( Positive_Money_Flow_Sum > 1.18248e+06 )
				if( Typical_Price <= 142.352 )
					if( Negative_Money_Flow_Sum <= 2.8479e+08 )
						if( Positive_Money_Flow_Sum <= 1.8653e+08 )
							if( Positive_Money_Flow_Sum <= 1.50189e+08 )
								if( Positive_Money_Flow_Sum <= 1.20677e+08 )
									ret := 0.047477
								if( Positive_Money_Flow_Sum > 1.20677e+08 )
									ret := 0.192010
							if( Positive_Money_Flow_Sum > 1.50189e+08 )
								if( bbm <= 1.4193 )
									ret := 0.002283
								if( bbm > 1.4193 )
									ret := -0.262104
						if( Positive_Money_Flow_Sum > 1.8653e+08 )
							if( Negative_Money_Flow_Sum <= 2.21096e+08 )
								if( Positive_Money_Flow_Sum <= 4.71354e+08 )
									ret := 0.220798
								if( Positive_Money_Flow_Sum > 4.71354e+08 )
									ret := -0.612903
							if( Negative_Money_Flow_Sum > 2.21096e+08 )
								if( bbp <= -0.865213 )
									ret := 0.363636
								if( bbp > -0.865213 )
									ret := -0.454545
					if( Negative_Money_Flow_Sum > 2.8479e+08 )
						if( Positive_Money_Flow_Sum <= 4.04846e+08 )
							if( bearPower <= -5.14925 )
								if( bullPower <= 0.258381 )
									ret := -1.000000 // sell
								if( bullPower > 0.258381 )
									ret := -0.500000
							if( bearPower > -5.14925 )
								if( bbm <= 2.87444 )
									ret := 0.750000 // buy
								if( bbm > 2.87444 )
									ret := 0.242105
						if( Positive_Money_Flow_Sum > 4.04846e+08 )
							if( bullPower <= 0.329891 )
								if( MFI_Low <= 24.7719 )
									ret := -1.000000 // sell
								if( MFI_Low > 24.7719 )
									ret := 1.000000 // buy
							if( bullPower > 0.329891 )
								if( bbp <= 3.70974 )
									ret := -0.916667 // sell
								if( bbp > 3.70974 )
									ret := 0.076923
				if( Typical_Price > 142.352 )
					if( Money_Flow_Ratio <= 0.228024 )
						if( bbp <= -3.46891 )
							if( Raw_Money_Flow <= 8.35699e+06 )
								if( bbm <= 1.15534 )
									ret := 0.142857
								if( bbm > 1.15534 )
									ret := -0.724138 // sell
							if( Raw_Money_Flow > 8.35699e+06 )
								if( Money_Flow_Ratio <= 0.187562 )
									ret := -0.025641
								if( Money_Flow_Ratio > 0.187562 )
									ret := -0.550000
						if( bbp > -3.46891 )
							if( bearPower <= -2.17329 )
								if( bullPower <= -0.753862 )
									ret := 0.000000
								if( bullPower > -0.753862 )
									ret := 0.800000 // buy
							if( bearPower > -2.17329 )
								if( bbp <= -1.18815 )
									ret := -0.063830
								if( bbp > -1.18815 )
									ret := -0.555556
					if( Money_Flow_Ratio > 0.228024 )
						if( Negative_Money_Flow_Sum <= 7.26768e+08 )
							if( Negative_Money_Flow_Sum <= 1.27843e+08 )
								if( bbp <= 1.24159 )
									ret := -0.039166
								if( bbp > 1.24159 )
									ret := 0.041419
							if( Negative_Money_Flow_Sum > 1.27843e+08 )
								if( Negative_Money_Flow_Sum <= 3.01699e+08 )
									ret := 0.117144
								if( Negative_Money_Flow_Sum > 3.01699e+08 )
									ret := -0.122581
						if( Negative_Money_Flow_Sum > 7.26768e+08 )
							if( Negative_Money_Flow_Sum <= 1.02107e+09 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.02107e+09 )
								ret := -0.750000 // sell
	
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
float op_operation = decision_tree_0_SOLUSDT_30Min_1097d066(bbm, bearPower, bbp, bullPower, BBPower_Color, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)

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


