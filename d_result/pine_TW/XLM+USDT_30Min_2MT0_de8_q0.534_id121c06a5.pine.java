//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: XLMUSDT_30Min_2MT0_121c06a5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_30Min_2MT0_121c06a5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_30Min_121c06a5(Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum, ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Negative_Money_Flow <= 78256.2 )
		if( Negative_Money_Flow_Sum <= 3.68682e+07 )
			if( ema13 <= 0.00057 )
				if( ema2 <= 0.495338 )
					if( Positive_Money_Flow <= 458522 )
						if( Positive_Money_Flow_Sum <= 2.40264e+06 )
							if( Positive_Money_Flow_Sum <= 1.24382e+06 )
								if( ema3 <= 0.112841 )
									ret := 0.007128
								if( ema3 > 0.112841 )
									ret := -0.053815
							if( Positive_Money_Flow_Sum > 1.24382e+06 )
								if( ema13 <= -0.005382 )
									ret := 0.944444 // buy
								if( ema13 > -0.005382 )
									ret := -0.094655
						if( Positive_Money_Flow_Sum > 2.40264e+06 )
							if( Positive_Money_Flow_Sum <= 4.95642e+06 )
								if( MFI_Low <= 7.48515 )
									ret := -0.615385
								if( MFI_Low > 7.48515 )
									ret := 0.100094
							if( Positive_Money_Flow_Sum > 4.95642e+06 )
								if( Money_Flow_Ratio <= 1.09058 )
									ret := -0.381215
								if( Money_Flow_Ratio > 1.09058 )
									ret := 0.042169
					if( Positive_Money_Flow > 458522 )
						if( tema <= 0.108147 )
							if( Positive_Money_Flow_Sum <= 1.33191e+06 )
								if( ema1 <= 0.087893 )
									ret := 0.588235
								if( ema1 > 0.087893 )
									ret := -0.020408
							if( Positive_Money_Flow_Sum > 1.33191e+06 )
								if( MFI_High <= -10.5169 )
									ret := 0.704663 // buy
								if( MFI_High > -10.5169 )
									ret := 0.217391
						if( tema > 0.108147 )
							if( Negative_Money_Flow_Sum <= 9.43693e+06 )
								if( Money_Flow_Ratio <= 0.439382 )
									ret := 0.231884
								if( Money_Flow_Ratio > 0.439382 )
									ret := -0.063007
							if( Negative_Money_Flow_Sum > 9.43693e+06 )
								if( Money_Flow_Ratio <= 0.320171 )
									ret := -0.116337
								if( Money_Flow_Ratio > 0.320171 )
									ret := 0.129551
				if( ema2 > 0.495338 )
					if( ema2 <= 0.630928 )
						if( ema12 <= 0.001093 )
							if( Positive_Money_Flow <= 1.32154e+06 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow > 1.32154e+06 )
								if( Money_Flow_Ratio <= 1.34369 )
									ret := -0.482759
								if( Money_Flow_Ratio > 1.34369 )
									ret := 0.142857
						if( ema12 > 0.001093 )
							ret := 0.600000
					if( ema2 > 0.630928 )
						ret := 0.500000
			if( ema13 > 0.00057 )
				if( MFI_High <= -20.3114 )
					if( ema1 <= 0.572707 )
						if( ema12 <= 0.00145 )
							if( Raw_Money_Flow <= 71148.6 )
								if( ema12 <= 0.000309 )
									ret := 0.595745
								if( ema12 > 0.000309 )
									ret := 0.094937
							if( Raw_Money_Flow > 71148.6 )
								if( Negative_Money_Flow_Sum <= 3.27898e+07 )
									ret := -0.054696
								if( Negative_Money_Flow_Sum > 3.27898e+07 )
									ret := -0.941176 // sell
						if( ema12 > 0.00145 )
							if( ema12 <= 0.002992 )
								if( MFI_High <= -32.9928 )
									ret := -0.279412
								if( MFI_High > -32.9928 )
									ret := 0.444664
							if( ema12 > 0.002992 )
								if( tema <= 0.417754 )
									ret := 0.000000
								if( tema > 0.417754 )
									ret := -0.530303
					if( ema1 > 0.572707 )
						if( Money_Flow_Ratio <= 1.162 )
							ret := 0.166667
						if( Money_Flow_Ratio > 1.162 )
							ret := 1.000000 // buy
				if( MFI_High > -20.3114 )
					if( ema2 <= 0.107993 )
						if( MFI <= 74.6957 )
							if( ema3 <= 0.088354 )
								if( MFI_High <= -10.8197 )
									ret := -0.200000
								if( MFI_High > -10.8197 )
									ret := -0.561224
							if( ema3 > 0.088354 )
								if( Negative_Money_Flow_Sum <= 3.89489e+06 )
									ret := -0.080960
								if( Negative_Money_Flow_Sum > 3.89489e+06 )
									ret := 0.576923
						if( MFI > 74.6957 )
							if( MFI <= 93.2574 )
								if( MFI_Low <= 71.9232 )
									ret := 0.096712
								if( MFI_Low > 71.9232 )
									ret := -0.551020
							if( MFI > 93.2574 )
								if( ema12 <= 0.001466 )
									ret := 0.377049
								if( ema12 > 0.001466 )
									ret := 1.000000 // buy
					if( ema2 > 0.107993 )
						if( Negative_Money_Flow_Sum <= 2.73056e+07 )
							if( Raw_Money_Flow <= 3.51673e+06 )
								if( ema2 <= 0.211472 )
									ret := -0.170050
								if( ema2 > 0.211472 )
									ret := -0.030734
							if( Raw_Money_Flow > 3.51673e+06 )
								if( ema3 <= 0.537901 )
									ret := -0.347584
								if( ema3 > 0.537901 )
									ret := 0.086207
						if( Negative_Money_Flow_Sum > 2.73056e+07 )
							if( MFI_Low <= 59.9621 )
								if( ema1 <= 0.254161 )
									ret := -0.481481
								if( ema1 > 0.254161 )
									ret := 0.453125
							if( MFI_Low > 59.9621 )
								if( Raw_Money_Flow <= 2.17336e+07 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 2.17336e+07 )
									ret := -0.266667
		if( Negative_Money_Flow_Sum > 3.68682e+07 )
			if( MFI_Low <= 37.2911 )
				if( Raw_Money_Flow <= 5.59938e+06 )
					if( MFI <= 56.6748 )
						if( Negative_Money_Flow_Sum <= 5.04915e+07 )
							if( Positive_Money_Flow_Sum <= 1.3711e+07 )
								if( Money_Flow_Ratio <= 0.263015 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 0.263015 )
									ret := -0.888889 // sell
							if( Positive_Money_Flow_Sum > 1.3711e+07 )
								if( Positive_Money_Flow_Sum <= 2.2006e+07 )
									ret := -0.081633
								if( Positive_Money_Flow_Sum > 2.2006e+07 )
									ret := -0.463576
						if( Negative_Money_Flow_Sum > 5.04915e+07 )
							if( ema3 <= 0.351319 )
								if( MFI_High <= -41.8297 )
									ret := -0.151515
								if( MFI_High > -41.8297 )
									ret := 0.805556 // buy
							if( ema3 > 0.351319 )
								if( Typical_Price <= 0.650618 )
									ret := -0.222689
								if( Typical_Price > 0.650618 )
									ret := -0.920000 // sell
					if( MFI > 56.6748 )
						ret := 0.647059
				if( Raw_Money_Flow > 5.59938e+06 )
					if( Positive_Money_Flow_Sum <= 2.96485e+07 )
						if( Negative_Money_Flow_Sum <= 7.82525e+07 )
							if( Positive_Money_Flow <= 6.78065e+06 )
								if( ema1 <= 0.492671 )
									ret := 1.000000 // buy
								if( ema1 > 0.492671 )
									ret := 0.777778 // buy
							if( Positive_Money_Flow > 6.78065e+06 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 7.82525e+07 )
							ret := -0.666667
					if( Positive_Money_Flow_Sum > 2.96485e+07 )
						if( MFI_Low <= 32.7942 )
							if( MFI <= 46.9217 )
								if( ema2 <= 0.391325 )
									ret := 0.652778
								if( ema2 > 0.391325 )
									ret := -0.271429
							if( MFI > 46.9217 )
								if( MFI_Low <= 31.6042 )
									ret := -0.811765 // sell
								if( MFI_Low > 31.6042 )
									ret := 0.095238
						if( MFI_Low > 32.7942 )
							if( Positive_Money_Flow <= 8.17792e+06 )
								if( MFI_Low <= 33.9128 )
									ret := 0.400000
								if( MFI_Low > 33.9128 )
									ret := 0.944444 // buy
							if( Positive_Money_Flow > 8.17792e+06 )
								if( Negative_Money_Flow_Sum <= 4.92659e+07 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 4.92659e+07 )
									ret := 0.363636
			if( MFI_Low > 37.2911 )
				if( Negative_Money_Flow_Sum <= 4.86272e+07 )
					if( ema2 <= 0.254949 )
						ret := 0.578947
					if( ema2 > 0.254949 )
						if( Positive_Money_Flow <= 3.64821e+07 )
							if( MFI_High <= 0.09806 )
								if( ema13 <= 0.027755 )
									ret := -0.156250
								if( ema13 > 0.027755 )
									ret := -0.968750 // sell
							if( MFI_High > 0.09806 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow > 3.64821e+07 )
							if( ema2 <= 0.550657 )
								ret := -0.636364
							if( ema2 > 0.550657 )
								ret := -0.909091 // sell
				if( Negative_Money_Flow_Sum > 4.86272e+07 )
					if( ema1 <= 0.534987 )
						if( ema13 <= 0.021764 )
							if( Raw_Money_Flow <= 6.33524e+06 )
								ret := -0.875000 // sell
							if( Raw_Money_Flow > 6.33524e+06 )
								ret := -1.000000 // sell
						if( ema13 > 0.021764 )
							ret := -0.666667
					if( ema1 > 0.534987 )
						if( ema3 <= 0.542406 )
							ret := 0.800000 // buy
						if( ema3 > 0.542406 )
							if( MFI <= 63.4358 )
								if( ema2 <= 0.621815 )
									ret := -0.454545
								if( ema2 > 0.621815 )
									ret := 0.307692
							if( MFI > 63.4358 )
								if( Typical_Price <= 0.627902 )
									ret := -1.000000 // sell
								if( Typical_Price > 0.627902 )
									ret := -0.800000 // sell
	if( Negative_Money_Flow > 78256.2 )
		if( MFI_High <= -52.8359 )
			if( ema13 <= -0.002136 )
				if( tema <= 0.265442 )
					if( Negative_Money_Flow <= 2.23695e+06 )
						if( Negative_Money_Flow_Sum <= 1.16947e+07 )
							if( Negative_Money_Flow <= 1.67392e+06 )
								if( Negative_Money_Flow_Sum <= 1.11854e+07 )
									ret := 0.289414
								if( Negative_Money_Flow_Sum > 1.11854e+07 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow > 1.67392e+06 )
								if( tema <= 0.174691 )
									ret := -0.903226 // sell
								if( tema > 0.174691 )
									ret := -0.472222
						if( Negative_Money_Flow_Sum > 1.16947e+07 )
							if( Raw_Money_Flow <= 498719 )
								ret := -0.545455
							if( Raw_Money_Flow > 498719 )
								if( ema3 <= 0.173291 )
									ret := 0.358974
								if( ema3 > 0.173291 )
									ret := 0.682081
					if( Negative_Money_Flow > 2.23695e+06 )
						if( Positive_Money_Flow_Sum <= 6.73156e+06 )
							if( Typical_Price <= 0.146018 )
								if( ema1 <= 0.117703 )
									ret := 0.818182 // buy
								if( ema1 > 0.117703 )
									ret := 1.000000 // buy
							if( Typical_Price > 0.146018 )
								if( MFI_High <= -68.7122 )
									ret := 0.411765
								if( MFI_High > -68.7122 )
									ret := 0.843137 // buy
						if( Positive_Money_Flow_Sum > 6.73156e+06 )
							if( Positive_Money_Flow_Sum <= 7.44305e+06 )
								ret := -0.333333
							if( Positive_Money_Flow_Sum > 7.44305e+06 )
								if( Positive_Money_Flow_Sum <= 1.62853e+07 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 1.62853e+07 )
									ret := 0.444444
				if( tema > 0.265442 )
					if( Negative_Money_Flow_Sum <= 3.35357e+07 )
						if( Money_Flow_Ratio <= 0.278345 )
							if( ema2 <= 0.369549 )
								if( Raw_Money_Flow <= 3.75346e+06 )
									ret := -0.165746
								if( Raw_Money_Flow > 3.75346e+06 )
									ret := 0.406250
							if( ema2 > 0.369549 )
								if( Negative_Money_Flow_Sum <= 1.29108e+07 )
									ret := 0.133333
								if( Negative_Money_Flow_Sum > 1.29108e+07 )
									ret := -0.607407
						if( Money_Flow_Ratio > 0.278345 )
							if( ema1 <= 0.414052 )
								if( Positive_Money_Flow_Sum <= 9.6617e+06 )
									ret := 0.208134
								if( Positive_Money_Flow_Sum > 9.6617e+06 )
									ret := -0.833333 // sell
							if( ema1 > 0.414052 )
								if( MFI_High <= -54.1937 )
									ret := 0.823529 // buy
								if( MFI_High > -54.1937 )
									ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 3.35357e+07 )
						if( ema12 <= -0.017778 )
							if( Negative_Money_Flow <= 1.60011e+07 )
								if( MFI <= 14.7606 )
									ret := 0.714286 // buy
								if( MFI > 14.7606 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow > 1.60011e+07 )
								ret := 0.076923
						if( ema12 > -0.017778 )
							if( ema3 <= 0.443036 )
								if( ema13 <= -0.011739 )
									ret := 0.880435 // buy
								if( ema13 > -0.011739 )
									ret := 0.423077
							if( ema3 > 0.443036 )
								if( ema13 <= -0.024103 )
									ret := -0.565217
								if( ema13 > -0.024103 )
									ret := 0.175355
			if( ema13 > -0.002136 )
				if( MFI_High <= -53.1385 )
					if( Negative_Money_Flow_Sum <= 2.85423e+06 )
						if( Typical_Price <= 0.075853 )
							if( MFI_Low <= -6.8162 )
								if( ema3 <= 0.075913 )
									ret := -0.571429
								if( ema3 > 0.075913 )
									ret := -1.000000 // sell
							if( MFI_Low > -6.8162 )
								if( ema1 <= 0.071484 )
									ret := 0.466667
								if( ema1 > 0.071484 )
									ret := -0.059701
						if( Typical_Price > 0.075853 )
							if( MFI_High <= -59.6469 )
								if( Negative_Money_Flow <= 454231 )
									ret := 0.133484
								if( Negative_Money_Flow > 454231 )
									ret := 0.586826
							if( MFI_High > -59.6469 )
								if( Positive_Money_Flow_Sum <= 705920 )
									ret := -0.040724
								if( Positive_Money_Flow_Sum > 705920 )
									ret := 0.366559
					if( Negative_Money_Flow_Sum > 2.85423e+06 )
						if( Raw_Money_Flow <= 372699 )
							if( MFI <= 19.3397 )
								if( Money_Flow_Ratio <= 0.106768 )
									ret := -0.619048
								if( Money_Flow_Ratio > 0.106768 )
									ret := 0.122699
							if( MFI > 19.3397 )
								if( ema1 <= 0.244282 )
									ret := -0.593023
								if( ema1 > 0.244282 )
									ret := 0.454545
						if( Raw_Money_Flow > 372699 )
							if( Raw_Money_Flow <= 2.73103e+06 )
								if( ema12 <= -0.000731 )
									ret := 0.207407
								if( ema12 > -0.000731 )
									ret := -0.316770
							if( Raw_Money_Flow > 2.73103e+06 )
								ret := 0.826087 // buy
				if( MFI_High > -53.1385 )
					if( Typical_Price <= 0.1178 )
						if( ema13 <= -0.001017 )
							ret := 1.000000 // buy
						if( ema13 > -0.001017 )
							if( Negative_Money_Flow_Sum <= 1.56044e+06 )
								if( Positive_Money_Flow_Sum <= 441164 )
									ret := 0.736842 // buy
								if( Positive_Money_Flow_Sum > 441164 )
									ret := -0.230769
							if( Negative_Money_Flow_Sum > 1.56044e+06 )
								ret := 0.900000 // buy
					if( Typical_Price > 0.1178 )
						if( ema3 <= 0.301102 )
							if( MFI <= 27.0809 )
								if( MFI <= 26.9727 )
									ret := 0.583333
								if( MFI > 26.9727 )
									ret := 0.071429
							if( MFI > 27.0809 )
								ret := -0.615385
						if( ema3 > 0.301102 )
							ret := 0.764706 // buy
		if( MFI_High > -52.8359 )
			if( MFI <= 85.072 )
				if( ema3 <= 0.668415 )
					if( Raw_Money_Flow <= 791797 )
						if( Typical_Price <= 0.085049 )
							if( MFI_Low <= 9.97914 )
								if( Positive_Money_Flow_Sum <= 480288 )
									ret := 0.727273 // buy
								if( Positive_Money_Flow_Sum > 480288 )
									ret := 0.425926
							if( MFI_Low > 9.97914 )
								if( Money_Flow_Ratio <= 0.953222 )
									ret := 0.026549
								if( Money_Flow_Ratio > 0.953222 )
									ret := 0.247423
						if( Typical_Price > 0.085049 )
							if( Negative_Money_Flow_Sum <= 2.62284e+06 )
								if( ema12 <= 0.001108 )
									ret := -0.011954
								if( ema12 > 0.001108 )
									ret := -0.200276
							if( Negative_Money_Flow_Sum > 2.62284e+06 )
								if( MFI <= 37.5091 )
									ret := -0.105928
								if( MFI > 37.5091 )
									ret := 0.092322
					if( Raw_Money_Flow > 791797 )
						if( Positive_Money_Flow_Sum <= 1.74524e+08 )
							if( Money_Flow_Ratio <= 4.03273 )
								if( MFI_Low <= 38.4044 )
									ret := 0.046490
								if( MFI_Low > 38.4044 )
									ret := 0.177828
							if( Money_Flow_Ratio > 4.03273 )
								if( ema2 <= 0.256957 )
									ret := -0.974359 // sell
								if( ema2 > 0.256957 )
									ret := -0.347826
						if( Positive_Money_Flow_Sum > 1.74524e+08 )
							if( Negative_Money_Flow <= 2.32885e+07 )
								if( Typical_Price <= 0.531463 )
									ret := -0.833333 // sell
								if( Typical_Price > 0.531463 )
									ret := 0.000000
							if( Negative_Money_Flow > 2.32885e+07 )
								if( ema12 <= 0.018929 )
									ret := 1.000000 // buy
								if( ema12 > 0.018929 )
									ret := -0.200000
				if( ema3 > 0.668415 )
					if( MFI_Low <= 22.133 )
						if( tema <= 0.655384 )
							ret := -0.384615
						if( tema > 0.655384 )
							if( MFI_Low <= 10.2007 )
								ret := -0.615385
							if( MFI_Low > 10.2007 )
								if( Raw_Money_Flow <= 5.46043e+06 )
									ret := -0.750000 // sell
								if( Raw_Money_Flow > 5.46043e+06 )
									ret := -1.000000 // sell
					if( MFI_Low > 22.133 )
						if( ema13 <= -0.001906 )
							if( Raw_Money_Flow <= 6.37242e+06 )
								ret := 0.555556
							if( Raw_Money_Flow > 6.37242e+06 )
								ret := 1.000000 // buy
						if( ema13 > -0.001906 )
							if( Negative_Money_Flow_Sum <= 1.53317e+08 )
								if( tema <= 0.678633 )
									ret := 0.000000
								if( tema > 0.678633 )
									ret := -0.675325
							if( Negative_Money_Flow_Sum > 1.53317e+08 )
								ret := 0.500000
			if( MFI > 85.072 )
				if( ema12 <= 0.007561 )
					if( MFI <= 90.3521 )
						if( Raw_Money_Flow <= 524421 )
							if( ema12 <= 0.000794 )
								if( ema3 <= 0.089863 )
									ret := -0.333333
								if( ema3 > 0.089863 )
									ret := 0.357143
							if( ema12 > 0.000794 )
								if( Negative_Money_Flow_Sum <= 1.06532e+06 )
									ret := 0.677165
								if( Negative_Money_Flow_Sum > 1.06532e+06 )
									ret := 1.000000 // buy
						if( Raw_Money_Flow > 524421 )
							if( Negative_Money_Flow <= 570531 )
								ret := -0.481481
							if( Negative_Money_Flow > 570531 )
								if( Positive_Money_Flow_Sum <= 9.39979e+06 )
									ret := -0.111111
								if( Positive_Money_Flow_Sum > 9.39979e+06 )
									ret := 0.549020
					if( MFI > 90.3521 )
						if( Money_Flow_Ratio <= 11.5214 )
							if( ema3 <= 0.15752 )
								ret := -0.363636
							if( ema3 > 0.15752 )
								ret := -0.166667
						if( Money_Flow_Ratio > 11.5214 )
							ret := 0.444444
				if( ema12 > 0.007561 )
					ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_XLMUSDT_30Min_121c06a5(Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum, ema2, tema, ema12, ema3, ema1, ema13)

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


