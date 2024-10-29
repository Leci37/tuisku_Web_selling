//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: BABA_5Min_2MS0_0dffc92d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BABA_5Min_2MS0_0dffc92d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BABA_5Min_0dffc92d(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( k <= 59.5662 )
		if( Negative_Money_Flow_Sum <= 3.0536e+08 )
			if( MFI_Low <= 48.744 )
				if( rsi1 <= 33.8402 )
					if( smoothK_k <= 9.02272 )
						if( Negative_Money_Flow <= 442945 )
							if( d_k <= -4.52369 )
								if( d <= 4.54207 )
									ret := -0.045455
								if( d > 4.54207 )
									ret := -0.516129
							if( d_k > -4.52369 )
								if( Negative_Money_Flow_Sum <= 2.67996e+08 )
									ret := 0.057637
								if( Negative_Money_Flow_Sum > 2.67996e+08 )
									ret := -0.952381 // sell
						if( Negative_Money_Flow > 442945 )
							if( Positive_Money_Flow_Sum <= 1.49904e+08 )
								if( d <= 15.2954 )
									ret := -0.082688
								if( d > 15.2954 )
									ret := 0.128834
							if( Positive_Money_Flow_Sum > 1.49904e+08 )
								if( smoothK_k <= 2.66663 )
									ret := 0.869565 // buy
								if( smoothK_k > 2.66663 )
									ret := 0.384615
					if( smoothK_k > 9.02272 )
						if( smoothK_k <= 39.7293 )
							if( d_k <= 20.0145 )
								if( d <= 37.4376 )
									ret := 0.116142
								if( d > 37.4376 )
									ret := 0.253793
							if( d_k > 20.0145 )
								if( Money_Flow_Ratio <= 1.93215 )
									ret := -0.108179
								if( Money_Flow_Ratio > 1.93215 )
									ret := 1.000000 // buy
						if( smoothK_k > 39.7293 )
							if( Negative_Money_Flow_Sum <= 1.17997e+08 )
								if( rsi1 <= 32.131 )
									ret := 0.411467
								if( rsi1 > 32.131 )
									ret := 0.084967
							if( Negative_Money_Flow_Sum > 1.17997e+08 )
								if( rsi1 <= 20.7219 )
									ret := -1.000000 // sell
								if( rsi1 > 20.7219 )
									ret := 0.084821
				if( rsi1 > 33.8402 )
					if( Positive_Money_Flow_Sum <= 198234 )
						if( smoothK_k <= 4.6752 )
							if( smoothD_d <= 7.95478 )
								ret := -0.750000 // sell
							if( smoothD_d > 7.95478 )
								ret := -1.000000 // sell
						if( smoothK_k > 4.6752 )
							if( MFI_Low <= 14.7205 )
								if( Positive_Money_Flow <= 1018.22 )
									ret := -0.144068
								if( Positive_Money_Flow > 1018.22 )
									ret := -0.700000 // sell
							if( MFI_Low > 14.7205 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 198234 )
						if( d_k <= 22.8871 )
							if( rsi1 <= 35.8693 )
								if( Negative_Money_Flow <= 341978 )
									ret := 0.024748
								if( Negative_Money_Flow > 341978 )
									ret := -0.217989
							if( rsi1 > 35.8693 )
								if( Raw_Money_Flow <= 1.11359e+08 )
									ret := 0.025107
								if( Raw_Money_Flow > 1.11359e+08 )
									ret := -0.744681 // sell
						if( d_k > 22.8871 )
							if( smoothD_d <= 48.7981 )
								if( Typical_Price <= 85.8445 )
									ret := 0.395639
								if( Typical_Price > 85.8445 )
									ret := -0.037736
							if( smoothD_d > 48.7981 )
								if( Money_Flow_Ratio <= 0.663683 )
									ret := 0.301471
								if( Money_Flow_Ratio > 0.663683 )
									ret := -0.024242
			if( MFI_Low > 48.744 )
				if( Raw_Money_Flow <= 3.90922e+07 )
					if( Positive_Money_Flow_Sum <= 4.62359e+08 )
						if( smoothK_k <= 33.7842 )
							if( Positive_Money_Flow <= 1.02559e+07 )
								if( Money_Flow_Ratio <= 2.20737 )
									ret := -0.812500 // sell
								if( Money_Flow_Ratio > 2.20737 )
									ret := -0.052983
							if( Positive_Money_Flow > 1.02559e+07 )
								if( k <= 22.5055 )
									ret := 0.601266
								if( k > 22.5055 )
									ret := 0.114650
						if( smoothK_k > 33.7842 )
							if( Negative_Money_Flow <= 61512 )
								if( rsi1 <= 70.3747 )
									ret := -0.236721
								if( rsi1 > 70.3747 )
									ret := 0.015707
							if( Negative_Money_Flow > 61512 )
								if( d <= 69.072 )
									ret := -0.034682
								if( d > 69.072 )
									ret := 0.301075
					if( Positive_Money_Flow_Sum > 4.62359e+08 )
						if( Typical_Price <= 81.1829 )
							ret := -0.176471
						if( Typical_Price > 81.1829 )
							if( smoothK_k <= 35.0478 )
								ret := -0.538462
							if( smoothK_k > 35.0478 )
								if( MFI_Low <= 54.0204 )
									ret := -0.818182 // sell
								if( MFI_Low > 54.0204 )
									ret := -1.000000 // sell
				if( Raw_Money_Flow > 3.90922e+07 )
					if( Typical_Price <= 77.8454 )
						if( MFI_High <= 5.49316 )
							ret := 0.250000
						if( MFI_High > 5.49316 )
							if( Positive_Money_Flow <= 6.18548e+07 )
								ret := -0.133333
							if( Positive_Money_Flow > 6.18548e+07 )
								if( k <= 38.5454 )
									ret := -0.222222
								if( k > 38.5454 )
									ret := -1.000000 // sell
					if( Typical_Price > 77.8454 )
						if( MFI_Low <= 66.4177 )
							if( Money_Flow_Ratio <= 4.02821 )
								if( Positive_Money_Flow_Sum <= 3.46765e+08 )
									ret := 0.516667
								if( Positive_Money_Flow_Sum > 3.46765e+08 )
									ret := -0.263158
							if( Money_Flow_Ratio > 4.02821 )
								if( Positive_Money_Flow <= 5.0694e+07 )
									ret := 0.333333
								if( Positive_Money_Flow > 5.0694e+07 )
									ret := -0.727273 // sell
						if( MFI_Low > 66.4177 )
							if( k <= 22.361 )
								ret := -0.111111
							if( k > 22.361 )
								if( d <= 51.8311 )
									ret := 0.857143 // buy
								if( d > 51.8311 )
									ret := 0.222222
		if( Negative_Money_Flow_Sum > 3.0536e+08 )
			if( Negative_Money_Flow_Sum <= 4.37489e+08 )
				if( Raw_Money_Flow <= 5.32575e+07 )
					if( Positive_Money_Flow <= 2.54246e+07 )
						if( Positive_Money_Flow_Sum <= 1.78039e+08 )
							if( Positive_Money_Flow_Sum <= 1.21597e+08 )
								if( d <= 24.0104 )
									ret := 0.227488
								if( d > 24.0104 )
									ret := 0.720930 // buy
							if( Positive_Money_Flow_Sum > 1.21597e+08 )
								if( MFI_High <= -53.8901 )
									ret := 0.666667
								if( MFI_High > -53.8901 )
									ret := -0.324561
						if( Positive_Money_Flow_Sum > 1.78039e+08 )
							if( k <= 2.06945 )
								if( MFI_High <= -32.0981 )
									ret := 0.000000
								if( MFI_High > -32.0981 )
									ret := -0.833333 // sell
							if( k > 2.06945 )
								if( MFI_High <= -31.5268 )
									ret := 0.770950 // buy
								if( MFI_High > -31.5268 )
									ret := 0.179104
					if( Positive_Money_Flow > 2.54246e+07 )
						if( MFI_Low <= 20.822 )
							if( Negative_Money_Flow_Sum <= 3.20463e+08 )
								if( MFI_Low <= 15.6858 )
									ret := 0.666667
								if( MFI_Low > 15.6858 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 3.20463e+08 )
								if( MFI_Low <= 7.94075 )
									ret := 0.619048
								if( MFI_Low > 7.94075 )
									ret := 0.954545 // buy
						if( MFI_Low > 20.822 )
							if( Money_Flow_Ratio <= 0.73364 )
								ret := -0.833333 // sell
							if( Money_Flow_Ratio > 0.73364 )
								if( Raw_Money_Flow <= 3.00696e+07 )
									ret := -0.571429
								if( Raw_Money_Flow > 3.00696e+07 )
									ret := 0.548387
				if( Raw_Money_Flow > 5.32575e+07 )
					if( rsi1 <= 33.0101 )
						if( Negative_Money_Flow_Sum <= 3.77272e+08 )
							if( d <= 4.53912 )
								ret := 0.105263
							if( d > 4.53912 )
								if( d_k <= 8.1596 )
									ret := 1.000000 // buy
								if( d_k > 8.1596 )
									ret := 0.600000
						if( Negative_Money_Flow_Sum > 3.77272e+08 )
							ret := -0.300000
					if( rsi1 > 33.0101 )
						if( Typical_Price <= 105.997 )
							if( smoothK_k <= 24.3071 )
								if( d_k <= 5.87979 )
									ret := -0.838710 // sell
								if( d_k > 5.87979 )
									ret := -0.461538
							if( smoothK_k > 24.3071 )
								if( Positive_Money_Flow <= 5.93313e+07 )
									ret := 0.068966
								if( Positive_Money_Flow > 5.93313e+07 )
									ret := -0.769231 // sell
						if( Typical_Price > 105.997 )
							if( d <= 49.4326 )
								ret := 0.222222
							if( d > 49.4326 )
								ret := 0.750000 // buy
			if( Negative_Money_Flow_Sum > 4.37489e+08 )
				if( Typical_Price <= 79.4822 )
					if( Positive_Money_Flow <= 6.83417e+07 )
						if( Negative_Money_Flow <= 3.85164e+07 )
							if( k <= 27.3676 )
								if( d_k <= 4.26487 )
									ret := 0.235294
								if( d_k > 4.26487 )
									ret := 1.000000 // buy
							if( k > 27.3676 )
								if( MFI <= 39.0754 )
									ret := 0.357143
								if( MFI > 39.0754 )
									ret := -0.923077 // sell
						if( Negative_Money_Flow > 3.85164e+07 )
							if( smoothD_d <= 8.57708 )
								ret := 0.636364
							if( smoothD_d > 8.57708 )
								if( Negative_Money_Flow <= 6.31562e+07 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 6.31562e+07 )
									ret := 0.928571 // buy
					if( Positive_Money_Flow > 6.83417e+07 )
						ret := -0.818182 // sell
				if( Typical_Price > 79.4822 )
					if( smoothK_k <= 23.5284 )
						if( MFI <= 23.6097 )
							if( Typical_Price <= 95.7537 )
								if( Raw_Money_Flow <= 5.66901e+07 )
									ret := -0.774510 // sell
								if( Raw_Money_Flow > 5.66901e+07 )
									ret := 0.200000
							if( Typical_Price > 95.7537 )
								if( Negative_Money_Flow <= 5.96578e+07 )
									ret := -0.375000
								if( Negative_Money_Flow > 5.96578e+07 )
									ret := 0.933333 // buy
						if( MFI > 23.6097 )
							if( Positive_Money_Flow_Sum <= 5.15642e+08 )
								if( Negative_Money_Flow <= 6.21671e+07 )
									ret := 0.344595
								if( Negative_Money_Flow > 6.21671e+07 )
									ret := -0.415094
							if( Positive_Money_Flow_Sum > 5.15642e+08 )
								if( d_k <= 7.30854 )
									ret := 0.897059 // buy
								if( d_k > 7.30854 )
									ret := 0.187500
					if( smoothK_k > 23.5284 )
						if( Money_Flow_Ratio <= 0.409426 )
							if( d_k <= -13.4015 )
								ret := -0.818182 // sell
							if( d_k > -13.4015 )
								if( MFI_Low <= 3.3784 )
									ret := 0.285714
								if( MFI_Low > 3.3784 )
									ret := 0.666667
						if( Money_Flow_Ratio > 0.409426 )
							if( Negative_Money_Flow <= 6.586e+07 )
								if( MFI_Low <= 14.0731 )
									ret := -0.851852 // sell
								if( MFI_Low > 14.0731 )
									ret := -0.357143
							if( Negative_Money_Flow > 6.586e+07 )
								if( d <= 43.8256 )
									ret := -0.735294 // sell
								if( d > 43.8256 )
									ret := -0.970588 // sell
	if( k > 59.5662 )
		if( d_k <= -3.56834 )
			if( Negative_Money_Flow_Sum <= 5.36708e+08 )
				if( MFI_High <= -64.6949 )
					if( Typical_Price <= 71.0666 )
						ret := -0.538462
					if( Typical_Price > 71.0666 )
						if( Raw_Money_Flow <= 464344 )
							if( Negative_Money_Flow_Sum <= 1.78386e+08 )
								if( Money_Flow_Ratio <= 0.129093 )
									ret := 0.197452
								if( Money_Flow_Ratio > 0.129093 )
									ret := 0.516667
							if( Negative_Money_Flow_Sum > 1.78386e+08 )
								ret := -0.416667
						if( Raw_Money_Flow > 464344 )
							if( Positive_Money_Flow_Sum <= 5.03647e+06 )
								if( MFI <= 4.59443 )
									ret := 0.055556
								if( MFI > 4.59443 )
									ret := -0.733333 // sell
							if( Positive_Money_Flow_Sum > 5.03647e+06 )
								if( d_k <= -8.51644 )
									ret := -0.125000
								if( d_k > -8.51644 )
									ret := 1.000000 // buy
				if( MFI_High > -64.6949 )
					if( Raw_Money_Flow <= 1.20329e+07 )
						if( Negative_Money_Flow_Sum <= 4.18901e+07 )
							if( Negative_Money_Flow_Sum <= 422464 )
								if( MFI <= 81.0448 )
									ret := 0.218688
								if( MFI > 81.0448 )
									ret := -0.019851
							if( Negative_Money_Flow_Sum > 422464 )
								if( Positive_Money_Flow_Sum <= 2.02247e+07 )
									ret := -0.130255
								if( Positive_Money_Flow_Sum > 2.02247e+07 )
									ret := -0.019808
						if( Negative_Money_Flow_Sum > 4.18901e+07 )
							if( rsi1 <= 50.0125 )
								if( Positive_Money_Flow <= 1.07894e+07 )
									ret := -0.018820
								if( Positive_Money_Flow > 1.07894e+07 )
									ret := -0.544118
							if( rsi1 > 50.0125 )
								if( MFI <= 47.4475 )
									ret := -0.080808
								if( MFI > 47.4475 )
									ret := 0.194922
					if( Raw_Money_Flow > 1.20329e+07 )
						if( Negative_Money_Flow_Sum <= 1.27542e+08 )
							if( Positive_Money_Flow_Sum <= 3.01076e+07 )
								if( Typical_Price <= 84.5683 )
									ret := -0.482759
								if( Typical_Price > 84.5683 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 3.01076e+07 )
								if( Typical_Price <= 72.2254 )
									ret := 0.248485
								if( Typical_Price > 72.2254 )
									ret := -0.232577
						if( Negative_Money_Flow_Sum > 1.27542e+08 )
							if( Money_Flow_Ratio <= 1.92272 )
								if( MFI <= 47.7983 )
									ret := -0.218750
								if( MFI > 47.7983 )
									ret := 0.008753
							if( Money_Flow_Ratio > 1.92272 )
								if( rsi1 <= 81.6478 )
									ret := 0.643357
								if( rsi1 > 81.6478 )
									ret := -0.700000 // sell
			if( Negative_Money_Flow_Sum > 5.36708e+08 )
				if( MFI_High <= -43.055 )
					ret := 0.272727
				if( MFI_High > -43.055 )
					if( Positive_Money_Flow_Sum <= 7.21601e+08 )
						if( MFI <= 38.2146 )
							ret := -0.846154 // sell
						if( MFI > 38.2146 )
							ret := -0.545455
					if( Positive_Money_Flow_Sum > 7.21601e+08 )
						if( Money_Flow_Ratio <= 1.26336 )
							ret := -1.000000 // sell
						if( Money_Flow_Ratio > 1.26336 )
							ret := -0.857143 // sell
		if( d_k > -3.56834 )
			if( Raw_Money_Flow <= 4.64499e+07 )
				if( Negative_Money_Flow <= 1.03117e+07 )
					if( Money_Flow_Ratio <= 0.526437 )
						if( Typical_Price <= 71.0252 )
							if( rsi1 <= 50.1718 )
								if( rsi1 <= 35 )
									ret := -0.272727
								if( rsi1 > 35 )
									ret := 0.000000
							if( rsi1 > 50.1718 )
								ret := -0.941176 // sell
						if( Typical_Price > 71.0252 )
							if( rsi1 <= 84.2954 )
								if( Positive_Money_Flow_Sum <= 237062 )
									ret := -0.325301
								if( Positive_Money_Flow_Sum > 237062 )
									ret := 0.142857
							if( rsi1 > 84.2954 )
								if( Raw_Money_Flow <= 465158 )
									ret := 0.484848
								if( Raw_Money_Flow > 465158 )
									ret := 0.888889 // buy
					if( Money_Flow_Ratio > 0.526437 )
						if( Raw_Money_Flow <= 747960 )
							if( Negative_Money_Flow_Sum <= 799695 )
								if( Positive_Money_Flow <= 26311.2 )
									ret := -0.052828
								if( Positive_Money_Flow > 26311.2 )
									ret := -0.217836
							if( Negative_Money_Flow_Sum > 799695 )
								if( Negative_Money_Flow_Sum <= 1.07512e+06 )
									ret := 0.096659
								if( Negative_Money_Flow_Sum > 1.07512e+06 )
									ret := -0.048515
						if( Raw_Money_Flow > 747960 )
							if( rsi1 <= 77.9478 )
								if( MFI <= 80.5406 )
									ret := 0.023194
								if( MFI > 80.5406 )
									ret := 0.213235
							if( rsi1 > 77.9478 )
								if( MFI_Low <= 68.3948 )
									ret := -0.046102
								if( MFI_Low > 68.3948 )
									ret := -0.303681
				if( Negative_Money_Flow > 1.03117e+07 )
					if( d_k <= -2.87824 )
						if( MFI_High <= -11.3844 )
							if( MFI_High <= -37.7994 )
								ret := 0.176471
							if( MFI_High > -37.7994 )
								if( MFI_High <= -33.7619 )
									ret := 1.000000 // buy
								if( MFI_High > -33.7619 )
									ret := 0.444444
						if( MFI_High > -11.3844 )
							ret := -0.200000
					if( d_k > -2.87824 )
						if( smoothD_d <= 94.949 )
							if( d <= 66.3694 )
								if( rsi1 <= 54.5909 )
									ret := -0.166667
								if( rsi1 > 54.5909 )
									ret := -0.739726 // sell
							if( d > 66.3694 )
								if( Raw_Money_Flow <= 2.28817e+07 )
									ret := -0.153429
								if( Raw_Money_Flow > 2.28817e+07 )
									ret := -0.004505
						if( smoothD_d > 94.949 )
							if( Negative_Money_Flow_Sum <= 2.66008e+08 )
								if( Negative_Money_Flow <= 1.70135e+07 )
									ret := 0.444444
								if( Negative_Money_Flow > 1.70135e+07 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 2.66008e+08 )
								ret := -1.000000 // sell
			if( Raw_Money_Flow > 4.64499e+07 )
				if( Negative_Money_Flow <= 1.17216e+08 )
					if( Positive_Money_Flow_Sum <= 5.89428e+08 )
						if( MFI_High <= -60.5843 )
							if( MFI_Low <= -12.0758 )
								if( rsi1 <= 42.0948 )
									ret := -0.500000
								if( rsi1 > 42.0948 )
									ret := 0.538462
							if( MFI_Low > -12.0758 )
								if( MFI <= 10.3268 )
									ret := -1.000000 // sell
								if( MFI > 10.3268 )
									ret := -0.833333 // sell
						if( MFI_High > -60.5843 )
							if( Positive_Money_Flow_Sum <= 3.41596e+08 )
								if( rsi1 <= 44.9639 )
									ret := 0.425532
								if( rsi1 > 44.9639 )
									ret := -0.342742
							if( Positive_Money_Flow_Sum > 3.41596e+08 )
								if( Negative_Money_Flow_Sum <= 7.82727e+07 )
									ret := -0.421053
								if( Negative_Money_Flow_Sum > 7.82727e+07 )
									ret := 0.293333
					if( Positive_Money_Flow_Sum > 5.89428e+08 )
						if( d_k <= 7.80514 )
							if( MFI <= 88.1482 )
								if( Positive_Money_Flow_Sum <= 7.22488e+08 )
									ret := -0.431373
								if( Positive_Money_Flow_Sum > 7.22488e+08 )
									ret := -0.877863 // sell
							if( MFI > 88.1482 )
								if( d_k <= 0.207321 )
									ret := 0.612903
								if( d_k > 0.207321 )
									ret := -0.461538
						if( d_k > 7.80514 )
							if( Positive_Money_Flow <= 7.62125e+07 )
								if( d <= 81.9359 )
									ret := 0.142857
								if( d > 81.9359 )
									ret := -0.600000
							if( Positive_Money_Flow > 7.62125e+07 )
								ret := 1.000000 // buy
				if( Negative_Money_Flow > 1.17216e+08 )
					if( rsi1 <= 44.138 )
						ret := 0.846154 // buy
					if( rsi1 > 44.138 )
						if( Negative_Money_Flow_Sum <= 2.18488e+08 )
							ret := 0.692308
						if( Negative_Money_Flow_Sum > 2.18488e+08 )
							ret := -0.363636
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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


//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_BABA_5Min_0dffc92d(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


