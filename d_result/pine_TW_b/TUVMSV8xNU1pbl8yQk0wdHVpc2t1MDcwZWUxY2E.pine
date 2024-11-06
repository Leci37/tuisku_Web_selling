//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: MELI_15Min_2BM0_070ee1ca Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_15Min_2BM0_070ee1ca", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_15Min_070ee1ca(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bearPower <= -1.47052 )
		if( MFI <= 3.67646 )
			if( Typical_Price <= 916.694 )
				if( bearPower <= -5.75941 )
					if( MFI <= 2.29917 )
						if( bbp <= -40.5072 )
							ret := 0.941176 // buy
						if( bbp > -40.5072 )
							if( Typical_Price <= 532.375 )
								ret := -0.272727
							if( Typical_Price > 532.375 )
								if( bearPower <= -10.227 )
									ret := 0.500000
								if( bearPower > -10.227 )
									ret := 0.909091 // buy
					if( MFI > 2.29917 )
						ret := 1.000000 // buy
				if( bearPower > -5.75941 )
					ret := 0.100000
			if( Typical_Price > 916.694 )
				if( Negative_Money_Flow_Sum <= 2.69043e+08 )
					if( MFI_High <= -78.6682 )
						ret := 0.923077 // buy
					if( MFI_High > -78.6682 )
						if( Positive_Money_Flow_Sum <= 5.31406e+06 )
							ret := 0.466667
						if( Positive_Money_Flow_Sum > 5.31406e+06 )
							ret := 0.857143 // buy
				if( Negative_Money_Flow_Sum > 2.69043e+08 )
					if( Typical_Price <= 1203.58 )
						if( Negative_Money_Flow_Sum <= 5.11774e+08 )
							if( Money_Flow_Ratio <= 0.026664 )
								ret := -0.133333
							if( Money_Flow_Ratio > 0.026664 )
								ret := -0.583333
						if( Negative_Money_Flow_Sum > 5.11774e+08 )
							ret := 0.466667
					if( Typical_Price > 1203.58 )
						if( bbm <= 8.95859 )
							ret := 0.125000
						if( bbm > 8.95859 )
							if( Typical_Price <= 1456.22 )
								ret := 0.941176 // buy
							if( Typical_Price > 1456.22 )
								ret := 0.357143
		if( MFI > 3.67646 )
			if( MFI_High <= -17.4061 )
				if( Raw_Money_Flow <= 1.7562e+08 )
					if( Negative_Money_Flow_Sum <= 7.27793e+08 )
						if( bbm <= 2.59046 )
							if( Money_Flow_Ratio <= 0.087527 )
								if( bearPower <= -7.2705 )
									ret := 0.339286
								if( bearPower > -7.2705 )
									ret := 0.636364
							if( Money_Flow_Ratio > 0.087527 )
								if( Positive_Money_Flow <= 2.02618e+07 )
									ret := 0.010417
								if( Positive_Money_Flow > 2.02618e+07 )
									ret := -0.271889
						if( bbm > 2.59046 )
							if( Negative_Money_Flow <= 9.26871e+07 )
								if( Positive_Money_Flow_Sum <= 2.95984e+08 )
									ret := -0.062194
								if( Positive_Money_Flow_Sum > 2.95984e+08 )
									ret := -0.285948
							if( Negative_Money_Flow > 9.26871e+07 )
								if( Negative_Money_Flow_Sum <= 3.20389e+08 )
									ret := -0.504000
								if( Negative_Money_Flow_Sum > 3.20389e+08 )
									ret := -0.211957
					if( Negative_Money_Flow_Sum > 7.27793e+08 )
						if( bearPower <= -18.541 )
							if( Raw_Money_Flow <= 4.13254e+07 )
								ret := 0.705882 // buy
							if( Raw_Money_Flow > 4.13254e+07 )
								ret := 1.000000 // buy
						if( bearPower > -18.541 )
							if( MFI_Low <= -6.98246 )
								if( Negative_Money_Flow_Sum <= 8.64097e+08 )
									ret := -0.100000
								if( Negative_Money_Flow_Sum > 8.64097e+08 )
									ret := 0.750000 // buy
							if( MFI_Low > -6.98246 )
								ret := 0.916667 // buy
				if( Raw_Money_Flow > 1.7562e+08 )
					if( Typical_Price <= 1553.31 )
						if( MFI_Low <= 9.50818 )
							if( MFI <= 8.48367 )
								ret := 1.000000 // buy
							if( MFI > 8.48367 )
								ret := 0.818182 // buy
						if( MFI_Low > 9.50818 )
							ret := 0.454545
					if( Typical_Price > 1553.31 )
						ret := 0.000000
			if( MFI_High > -17.4061 )
				if( bearPower <= -3.30812 )
					if( bearPower <= -21.8637 )
						if( bbm <= 37.39 )
							if( MFI_High <= -15.8379 )
								ret := -0.454545
							if( MFI_High > -15.8379 )
								if( Raw_Money_Flow <= 204367 )
									ret := -0.846154 // sell
								if( Raw_Money_Flow > 204367 )
									ret := 0.497872
						if( bbm > 37.39 )
							if( MFI_Low <= 48.5312 )
								ret := -0.736842 // sell
							if( MFI_Low > 48.5312 )
								if( Typical_Price <= 1273.2 )
									ret := 1.000000 // buy
								if( Typical_Price > 1273.2 )
									ret := 0.125000
					if( bearPower > -21.8637 )
						if( Negative_Money_Flow <= 1.27723e+07 )
							if( Money_Flow_Ratio <= 10.7312 )
								if( Negative_Money_Flow_Sum <= 1.4044e+07 )
									ret := -0.705882 // sell
								if( Negative_Money_Flow_Sum > 1.4044e+07 )
									ret := 0.164225
							if( Money_Flow_Ratio > 10.7312 )
								if( Negative_Money_Flow_Sum <= 5.77671e+06 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow_Sum > 5.77671e+06 )
									ret := -0.589744
						if( Negative_Money_Flow > 1.27723e+07 )
							if( BBPower_Color <= 0.5 )
								if( Positive_Money_Flow_Sum <= 1.62548e+08 )
									ret := 0.129353
								if( Positive_Money_Flow_Sum > 1.62548e+08 )
									ret := -0.155340
							if( BBPower_Color > 0.5 )
								if( Raw_Money_Flow <= 2.41848e+07 )
									ret := 0.090909
								if( Raw_Money_Flow > 2.41848e+07 )
									ret := 0.562500
				if( bearPower > -3.30812 )
					if( bearPower <= -3.25696 )
						if( MFI_Low <= 51.1948 )
							if( BBPower_Color <= 0.5 )
								ret := -0.909091 // sell
							if( BBPower_Color > 0.5 )
								ret := -0.266667
						if( MFI_Low > 51.1948 )
							ret := -0.235294
					if( bearPower > -3.25696 )
						if( Negative_Money_Flow <= 717237 )
							if( Positive_Money_Flow_Sum <= 1.32051e+08 )
								if( Typical_Price <= 298.366 )
									ret := 0.365079
								if( Typical_Price > 298.366 )
									ret := -0.134048
							if( Positive_Money_Flow_Sum > 1.32051e+08 )
								if( Money_Flow_Ratio <= 2.64825 )
									ret := 0.249057
								if( Money_Flow_Ratio > 2.64825 )
									ret := 0.024306
						if( Negative_Money_Flow > 717237 )
							if( Positive_Money_Flow_Sum <= 5.18716e+07 )
								if( Typical_Price <= 340.561 )
									ret := -0.343750
								if( Typical_Price > 340.561 )
									ret := -0.800000 // sell
							if( Positive_Money_Flow_Sum > 5.18716e+07 )
								if( bbm <= 1.04372 )
									ret := -0.724138 // sell
								if( bbm > 1.04372 )
									ret := -0.065421
	if( bearPower > -1.47052 )
		if( bearPower <= 4.39887 )
			if( MFI_High <= -2.32738 )
				if( Typical_Price <= 1550.6 )
					if( MFI_High <= -58.3249 )
						if( MFI_High <= -74.5154 )
							if( bullPower <= 1.59057 )
								ret := 0.923077 // buy
							if( bullPower > 1.59057 )
								ret := 0.666667
						if( MFI_High > -74.5154 )
							if( Raw_Money_Flow <= 7.27079e+07 )
								if( Negative_Money_Flow_Sum <= 1.39224e+08 )
									ret := 0.079570
								if( Negative_Money_Flow_Sum > 1.39224e+08 )
									ret := 0.349442
							if( Raw_Money_Flow > 7.27079e+07 )
								ret := 0.947368 // buy
					if( MFI_High > -58.3249 )
						if( Negative_Money_Flow_Sum <= 7.37512e+07 )
							if( Positive_Money_Flow <= 8.74054e+06 )
								if( Positive_Money_Flow <= 7.57891e+06 )
									ret := 0.031192
								if( Positive_Money_Flow > 7.57891e+06 )
									ret := 0.205090
							if( Positive_Money_Flow > 8.74054e+06 )
								if( bearPower <= 1.61356 )
									ret := -0.138889
								if( bearPower > 1.61356 )
									ret := 0.100105
						if( Negative_Money_Flow_Sum > 7.37512e+07 )
							if( Raw_Money_Flow <= 8.55332e+07 )
								if( Negative_Money_Flow <= 2.39259e+06 )
									ret := 0.131560
								if( Negative_Money_Flow > 2.39259e+06 )
									ret := 0.012777
							if( Raw_Money_Flow > 8.55332e+07 )
								if( MFI_Low <= 13.1345 )
									ret := -0.428571
								if( MFI_Low > 13.1345 )
									ret := 0.526627
				if( Typical_Price > 1550.6 )
					if( Raw_Money_Flow <= 3.8674e+06 )
						if( Positive_Money_Flow_Sum <= 1.36748e+08 )
							if( MFI_Low <= 33.1571 )
								if( Positive_Money_Flow_Sum <= 7.66813e+07 )
									ret := 0.060000
								if( Positive_Money_Flow_Sum > 7.66813e+07 )
									ret := -0.514851
							if( MFI_Low > 33.1571 )
								if( Money_Flow_Ratio <= 1.75171 )
									ret := 0.000000
								if( Money_Flow_Ratio > 1.75171 )
									ret := 0.294118
						if( Positive_Money_Flow_Sum > 1.36748e+08 )
							if( bullPower <= 2.3769 )
								if( MFI <= 49.8843 )
									ret := 0.100000
								if( MFI > 49.8843 )
									ret := -0.608696
							if( bullPower > 2.3769 )
								if( Typical_Price <= 1660.05 )
									ret := -0.916667 // sell
								if( Typical_Price > 1660.05 )
									ret := -0.592593
					if( Raw_Money_Flow > 3.8674e+06 )
						if( Negative_Money_Flow_Sum <= 1.19543e+08 )
							if( bbm <= 0.114328 )
								if( Raw_Money_Flow <= 4.15481e+07 )
									ret := 0.736842 // buy
								if( Raw_Money_Flow > 4.15481e+07 )
									ret := 0.166667
							if( bbm > 0.114328 )
								if( Positive_Money_Flow_Sum <= 1.50096e+08 )
									ret := 0.044510
								if( Positive_Money_Flow_Sum > 1.50096e+08 )
									ret := -0.154762
						if( Negative_Money_Flow_Sum > 1.19543e+08 )
							if( MFI_High <= -20.5422 )
								if( Negative_Money_Flow_Sum <= 2.44916e+08 )
									ret := -0.159686
								if( Negative_Money_Flow_Sum > 2.44916e+08 )
									ret := 0.026786
							if( MFI_High > -20.5422 )
								if( Positive_Money_Flow <= 2.1845e+06 )
									ret := -0.102564
								if( Positive_Money_Flow > 2.1845e+06 )
									ret := -0.517241
			if( MFI_High > -2.32738 )
				if( Raw_Money_Flow <= 2.42815e+06 )
					if( bbp <= 1.04393 )
						if( bbm <= 1.63665 )
							if( MFI_Low <= 59.687 )
								if( MFI <= 78.3547 )
									ret := -0.111111
								if( MFI > 78.3547 )
									ret := -0.666667
							if( MFI_Low > 59.687 )
								if( Money_Flow_Ratio <= 7.63648 )
									ret := 0.084507
								if( Money_Flow_Ratio > 7.63648 )
									ret := -0.434783
						if( bbm > 1.63665 )
							ret := 0.727273 // buy
					if( bbp > 1.04393 )
						if( Positive_Money_Flow <= 170685 )
							if( MFI_High <= 2.56852 )
								if( Money_Flow_Ratio <= 4.03119 )
									ret := 0.092308
								if( Money_Flow_Ratio > 4.03119 )
									ret := 0.671642
							if( MFI_High > 2.56852 )
								if( Positive_Money_Flow_Sum <= 1.3859e+08 )
									ret := -0.256410
								if( Positive_Money_Flow_Sum > 1.3859e+08 )
									ret := 0.382812
						if( Positive_Money_Flow > 170685 )
							if( Positive_Money_Flow <= 958097 )
								if( Positive_Money_Flow_Sum <= 1.64461e+08 )
									ret := 0.807018 // buy
								if( Positive_Money_Flow_Sum > 1.64461e+08 )
									ret := 0.250000
							if( Positive_Money_Flow > 958097 )
								if( MFI_Low <= 60.9873 )
									ret := 0.436364
								if( MFI_Low > 60.9873 )
									ret := 0.226190
				if( Raw_Money_Flow > 2.42815e+06 )
					if( Negative_Money_Flow_Sum <= 4.65862e+07 )
						if( bbm <= 0.937839 )
							if( Negative_Money_Flow_Sum <= 3.77468e+07 )
								if( MFI_High <= 9.31185 )
									ret := 0.477612
								if( MFI_High > 9.31185 )
									ret := 0.145833
							if( Negative_Money_Flow_Sum > 3.77468e+07 )
								if( Positive_Money_Flow_Sum <= 1.75205e+08 )
									ret := 0.200000
								if( Positive_Money_Flow_Sum > 1.75205e+08 )
									ret := -0.600000
						if( bbm > 0.937839 )
							if( Positive_Money_Flow_Sum <= 2.20591e+08 )
								if( Typical_Price <= 488.332 )
									ret := 0.041262
								if( Typical_Price > 488.332 )
									ret := 0.207528
							if( Positive_Money_Flow_Sum > 2.20591e+08 )
								if( Positive_Money_Flow_Sum <= 2.55949e+08 )
									ret := -0.616071
								if( Positive_Money_Flow_Sum > 2.55949e+08 )
									ret := 0.250000
					if( Negative_Money_Flow_Sum > 4.65862e+07 )
						if( bbp <= 28.5415 )
							if( Positive_Money_Flow <= 2.16877e+08 )
								if( MFI_High <= 4.21848 )
									ret := -0.085066
								if( MFI_High > 4.21848 )
									ret := -0.533981
							if( Positive_Money_Flow > 2.16877e+08 )
								ret := 0.894737 // buy
						if( bbp > 28.5415 )
							if( Money_Flow_Ratio <= 5.43273 )
								ret := -0.222222
							if( Money_Flow_Ratio > 5.43273 )
								ret := 0.750000 // buy
		if( bearPower > 4.39887 )
			if( Positive_Money_Flow_Sum <= 1.92516e+08 )
				if( MFI_High <= -59.8284 )
					if( bullPower <= 10.2319 )
						if( bbp <= 18.2312 )
							if( Positive_Money_Flow_Sum <= 5.59825e+07 )
								if( bullPower <= 8.52305 )
									ret := -0.362069
								if( bullPower > 8.52305 )
									ret := 0.800000 // buy
							if( Positive_Money_Flow_Sum > 5.59825e+07 )
								if( Typical_Price <= 998.386 )
									ret := 1.000000 // buy
								if( Typical_Price > 998.386 )
									ret := 0.363636
						if( bbp > 18.2312 )
							ret := -0.900000 // sell
					if( bullPower > 10.2319 )
						if( Raw_Money_Flow <= 420210 )
							if( bullPower <= 12.1116 )
								ret := -0.714286 // sell
							if( bullPower > 12.1116 )
								if( MFI_High <= -69.0034 )
									ret := -0.833333 // sell
								if( MFI_High > -69.0034 )
									ret := -1.000000 // sell
						if( Raw_Money_Flow > 420210 )
							if( Negative_Money_Flow_Sum <= 2.42447e+08 )
								ret := 0.615385
							if( Negative_Money_Flow_Sum > 2.42447e+08 )
								if( Positive_Money_Flow_Sum <= 5.70407e+07 )
									ret := -0.761905 // sell
								if( Positive_Money_Flow_Sum > 5.70407e+07 )
									ret := -0.281250
				if( MFI_High > -59.8284 )
					if( Positive_Money_Flow_Sum <= 5.85054e+07 )
						if( Raw_Money_Flow <= 223306 )
							if( Positive_Money_Flow_Sum <= 4.02568e+07 )
								if( MFI <= 46.6424 )
									ret := -0.488372
								if( MFI > 46.6424 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 4.02568e+07 )
								if( Raw_Money_Flow <= 135555 )
									ret := 0.500000
								if( Raw_Money_Flow > 135555 )
									ret := 0.800000 // buy
						if( Raw_Money_Flow > 223306 )
							if( Typical_Price <= 1509.11 )
								if( Positive_Money_Flow_Sum <= 1.53764e+07 )
									ret := 0.782609 // buy
								if( Positive_Money_Flow_Sum > 1.53764e+07 )
									ret := 0.343558
							if( Typical_Price > 1509.11 )
								if( Raw_Money_Flow <= 2.11941e+06 )
									ret := 0.500000
								if( Raw_Money_Flow > 2.11941e+06 )
									ret := -0.085714
					if( Positive_Money_Flow_Sum > 5.85054e+07 )
						if( Positive_Money_Flow <= 6.33732e+06 )
							if( MFI_Low <= 11.4154 )
								if( Negative_Money_Flow_Sum <= 3.15616e+08 )
									ret := 0.160494
								if( Negative_Money_Flow_Sum > 3.15616e+08 )
									ret := 0.769231 // buy
							if( MFI_Low > 11.4154 )
								if( MFI_High <= -22.4138 )
									ret := -0.176711
								if( MFI_High > -22.4138 )
									ret := 0.011895
						if( Positive_Money_Flow > 6.33732e+06 )
							if( Money_Flow_Ratio <= 4.28115 )
								if( MFI_High <= -32.0398 )
									ret := 0.000000
								if( MFI_High > -32.0398 )
									ret := 0.163582
							if( Money_Flow_Ratio > 4.28115 )
								if( Money_Flow_Ratio <= 22.8152 )
									ret := -0.153285
								if( Money_Flow_Ratio > 22.8152 )
									ret := 0.880000 // buy
			if( Positive_Money_Flow_Sum > 1.92516e+08 )
				if( bearPower <= 15.4016 )
					if( bbm <= 2.60871 )
						if( Money_Flow_Ratio <= 3.33311 )
							if( bearPower <= 5.77844 )
								if( MFI_High <= -24.6386 )
									ret := 0.375000
								if( MFI_High > -24.6386 )
									ret := -0.394495
							if( bearPower > 5.77844 )
								if( bbm <= 2.06309 )
									ret := 0.202797
								if( bbm > 2.06309 )
									ret := -0.636364
						if( Money_Flow_Ratio > 3.33311 )
							if( Raw_Money_Flow <= 1.11642e+08 )
								if( Money_Flow_Ratio <= 29.3225 )
									ret := -0.531646
								if( Money_Flow_Ratio > 29.3225 )
									ret := 0.687500
							if( Raw_Money_Flow > 1.11642e+08 )
								if( Negative_Money_Flow_Sum <= 3.36662e+07 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 3.36662e+07 )
									ret := -0.241379
					if( bbm > 2.60871 )
						if( bbm <= 21.4614 )
							if( Money_Flow_Ratio <= 95.3547 )
								if( bullPower <= 16.0407 )
									ret := -0.030928
								if( bullPower > 16.0407 )
									ret := -0.144357
							if( Money_Flow_Ratio > 95.3547 )
								ret := 0.882353 // buy
						if( bbm > 21.4614 )
							if( Positive_Money_Flow_Sum <= 3.89676e+08 )
								if( Negative_Money_Flow_Sum <= 3.54207e+08 )
									ret := -0.212121
								if( Negative_Money_Flow_Sum > 3.54207e+08 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 3.89676e+08 )
								if( Positive_Money_Flow_Sum <= 4.99031e+08 )
									ret := 0.434783
								if( Positive_Money_Flow_Sum > 4.99031e+08 )
									ret := 0.956522 // buy
				if( bearPower > 15.4016 )
					if( bullPower <= 44.9107 )
						if( Negative_Money_Flow_Sum <= 1.99995e+08 )
							if( MFI_Low <= 59.3118 )
								if( Raw_Money_Flow <= 6.07385e+07 )
									ret := -0.321429
								if( Raw_Money_Flow > 6.07385e+07 )
									ret := 0.500000
							if( MFI_Low > 59.3118 )
								if( Positive_Money_Flow <= 6.65402e+07 )
									ret := 0.214411
								if( Positive_Money_Flow > 6.65402e+07 )
									ret := -0.603774
						if( Negative_Money_Flow_Sum > 1.99995e+08 )
							if( Negative_Money_Flow_Sum <= 2.84682e+08 )
								if( MFI_High <= -21.3028 )
									ret := 0.538462
								if( MFI_High > -21.3028 )
									ret := 0.868852 // buy
							if( Negative_Money_Flow_Sum > 2.84682e+08 )
								if( Negative_Money_Flow_Sum <= 3.41692e+08 )
									ret := -0.666667
								if( Negative_Money_Flow_Sum > 3.41692e+08 )
									ret := 0.521739
					if( bullPower > 44.9107 )
						if( bbp <= 152.014 )
							if( Negative_Money_Flow_Sum <= 1.95072e+08 )
								if( Typical_Price <= 1448.51 )
									ret := -0.730769 // sell
								if( Typical_Price > 1448.51 )
									ret := -0.195122
							if( Negative_Money_Flow_Sum > 1.95072e+08 )
								if( Raw_Money_Flow <= 8.59125e+07 )
									ret := -0.264706
								if( Raw_Money_Flow > 8.59125e+07 )
									ret := 0.428571
						if( bbp > 152.014 )
							ret := 0.769231 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_MELI_15Min_070ee1ca(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


