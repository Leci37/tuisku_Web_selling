//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: SHOP_1Min_2MS0_1c8cd294 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHOP_1Min_2MS0_1c8cd294", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHOP_1Min_1c8cd294(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 28.4121 )
		if( Raw_Money_Flow <= 65415.5 )
			if( Positive_Money_Flow_Sum <= 367757 )
				if( d_k <= -1.23089 )
					if( Positive_Money_Flow <= 5952.76 )
						if( Money_Flow_Ratio <= 3.75635 )
							if( Typical_Price <= 59.2805 )
								if( Positive_Money_Flow_Sum <= 87168.4 )
									ret := -0.090909
								if( Positive_Money_Flow_Sum > 87168.4 )
									ret := 0.350515
							if( Typical_Price > 59.2805 )
								if( d_k <= -16.3984 )
									ret := 0.357143
								if( d_k > -16.3984 )
									ret := -0.069444
						if( Money_Flow_Ratio > 3.75635 )
							if( MFI <= 85.8501 )
								if( Negative_Money_Flow_Sum <= 47811.9 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 47811.9 )
									ret := -0.250000
							if( MFI > 85.8501 )
								ret := 0.000000
					if( Positive_Money_Flow > 5952.76 )
						if( rsi1 <= 32.8441 )
							if( Negative_Money_Flow_Sum <= 198437 )
								ret := -0.800000 // sell
							if( Negative_Money_Flow_Sum > 198437 )
								if( MFI_High <= -57.409 )
									ret := 0.142857
								if( MFI_High > -57.409 )
									ret := 0.818182 // buy
						if( rsi1 > 32.8441 )
							if( d <= 35.248 )
								if( Negative_Money_Flow_Sum <= 2.90229e+07 )
									ret := -0.364807
								if( Negative_Money_Flow_Sum > 2.90229e+07 )
									ret := 0.625000
							if( d > 35.248 )
								if( Money_Flow_Ratio <= 3.10099 )
									ret := -0.099526
								if( Money_Flow_Ratio > 3.10099 )
									ret := -0.511364
				if( d_k > -1.23089 )
					if( Positive_Money_Flow <= 30611.1 )
						if( Positive_Money_Flow <= 505.826 )
							if( Positive_Money_Flow <= 256.736 )
								if( Typical_Price <= 53.7752 )
									ret := 0.800000 // buy
								if( Typical_Price > 53.7752 )
									ret := 0.178082
							if( Positive_Money_Flow > 256.736 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow > 505.826 )
							if( Positive_Money_Flow_Sum <= 365703 )
								if( d_k <= 11.4335 )
									ret := -0.075497
								if( d_k > 11.4335 )
									ret := 0.221429
							if( Positive_Money_Flow_Sum > 365703 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow > 30611.1 )
						if( rsi1 <= 58.9859 )
							if( d_k <= 3.68292 )
								if( MFI_Low <= 51.2051 )
									ret := 0.105691
								if( MFI_Low > 51.2051 )
									ret := 0.888889 // buy
							if( d_k > 3.68292 )
								if( Negative_Money_Flow_Sum <= 742447 )
									ret := 0.544304
								if( Negative_Money_Flow_Sum > 742447 )
									ret := -0.111111
						if( rsi1 > 58.9859 )
							if( Negative_Money_Flow_Sum <= 221910 )
								if( smoothK_k <= 46.7742 )
									ret := -0.833333 // sell
								if( smoothK_k > 46.7742 )
									ret := -0.021739
							if( Negative_Money_Flow_Sum > 221910 )
								if( Negative_Money_Flow_Sum <= 249095 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 249095 )
									ret := 0.163265
			if( Positive_Money_Flow_Sum > 367757 )
				if( MFI_High <= -34.6748 )
					if( Negative_Money_Flow_Sum <= 1.14226e+06 )
						if( d_k <= -9.63812 )
							if( Positive_Money_Flow <= 21422.5 )
								ret := 0.000000
							if( Positive_Money_Flow > 21422.5 )
								if( d_k <= -21.6863 )
									ret := 0.000000
								if( d_k > -21.6863 )
									ret := 0.961538 // buy
						if( d_k > -9.63812 )
							if( Positive_Money_Flow_Sum <= 402174 )
								if( Raw_Money_Flow <= 18672.8 )
									ret := 0.125000
								if( Raw_Money_Flow > 18672.8 )
									ret := -0.480000
							if( Positive_Money_Flow_Sum > 402174 )
								if( Positive_Money_Flow <= 29796.9 )
									ret := 0.117647
								if( Positive_Money_Flow > 29796.9 )
									ret := 0.636364
					if( Negative_Money_Flow_Sum > 1.14226e+06 )
						if( Typical_Price <= 55.8647 )
							if( Negative_Money_Flow_Sum <= 1.85596e+06 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.85596e+06 )
								ret := -0.250000
						if( Typical_Price > 55.8647 )
							if( Negative_Money_Flow_Sum <= 1.62745e+06 )
								if( smoothK_k <= 23.7779 )
									ret := 0.000000
								if( smoothK_k > 23.7779 )
									ret := -0.666667
							if( Negative_Money_Flow_Sum > 1.62745e+06 )
								if( k <= 31.7813 )
									ret := -0.258065
								if( k > 31.7813 )
									ret := 0.017544
				if( MFI_High > -34.6748 )
					if( MFI_Low <= 58.3993 )
						if( Negative_Money_Flow_Sum <= 909339 )
							if( Negative_Money_Flow_Sum <= 437699 )
								if( MFI <= 53.4856 )
									ret := 0.125000
								if( MFI > 53.4856 )
									ret := -0.324468
							if( Negative_Money_Flow_Sum > 437699 )
								if( MFI <= 48.154 )
									ret := -0.179104
								if( MFI > 48.154 )
									ret := -0.674312
						if( Negative_Money_Flow_Sum > 909339 )
							if( Positive_Money_Flow_Sum <= 4.09899e+07 )
								if( Money_Flow_Ratio <= 1.1173 )
									ret := -0.250000
								if( Money_Flow_Ratio > 1.1173 )
									ret := 0.141304
							if( Positive_Money_Flow_Sum > 4.09899e+07 )
								if( rsi1 <= 49.1949 )
									ret := -0.133333
								if( rsi1 > 49.1949 )
									ret := -0.605263
					if( MFI_Low > 58.3993 )
						if( Typical_Price <= 56.8723 )
							if( Positive_Money_Flow <= 2893.78 )
								ret := 0.333333
							if( Positive_Money_Flow > 2893.78 )
								if( Positive_Money_Flow_Sum <= 3.51255e+07 )
									ret := -0.968750 // sell
								if( Positive_Money_Flow_Sum > 3.51255e+07 )
									ret := -0.142857
						if( Typical_Price > 56.8723 )
							if( d_k <= 1.11936 )
								if( Positive_Money_Flow_Sum <= 3.92062e+07 )
									ret := -0.097473
								if( Positive_Money_Flow_Sum > 3.92062e+07 )
									ret := -0.620690
							if( d_k > 1.11936 )
								if( MFI <= 91.8063 )
									ret := 0.269565
								if( MFI > 91.8063 )
									ret := -0.138462
		if( Raw_Money_Flow > 65415.5 )
			if( Negative_Money_Flow_Sum <= 3.63777e+07 )
				if( smoothD_d <= 84.7775 )
					if( Typical_Price <= 62.5867 )
						if( Positive_Money_Flow_Sum <= 1.45253e+07 )
							if( Positive_Money_Flow_Sum <= 5.73676e+06 )
								if( Positive_Money_Flow_Sum <= 330530 )
									ret := 0.194805
								if( Positive_Money_Flow_Sum > 330530 )
									ret := -0.058373
							if( Positive_Money_Flow_Sum > 5.73676e+06 )
								if( Raw_Money_Flow <= 1.12406e+06 )
									ret := 0.014003
								if( Raw_Money_Flow > 1.12406e+06 )
									ret := 0.145251
						if( Positive_Money_Flow_Sum > 1.45253e+07 )
							if( Positive_Money_Flow_Sum <= 1.57036e+07 )
								if( MFI_High <= 0.946469 )
									ret := -0.467456
								if( MFI_High > 0.946469 )
									ret := 0.600000
							if( Positive_Money_Flow_Sum > 1.57036e+07 )
								if( MFI_High <= -2.82327 )
									ret := -0.005040
								if( MFI_High > -2.82327 )
									ret := -0.274775
					if( Typical_Price > 62.5867 )
						if( Positive_Money_Flow_Sum <= 8.91092e+06 )
							if( Positive_Money_Flow_Sum <= 190886 )
								if( MFI <= 13.4829 )
									ret := -0.666667
								if( MFI > 13.4829 )
									ret := 0.527778
							if( Positive_Money_Flow_Sum > 190886 )
								if( Raw_Money_Flow <= 636548 )
									ret := -0.011220
								if( Raw_Money_Flow > 636548 )
									ret := 0.048617
						if( Positive_Money_Flow_Sum > 8.91092e+06 )
							if( Positive_Money_Flow_Sum <= 1.19542e+07 )
								if( d <= 78.6784 )
									ret := 0.224280
								if( d > 78.6784 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 1.19542e+07 )
								if( Typical_Price <= 69.3173 )
									ret := 0.122254
								if( Typical_Price > 69.3173 )
									ret := -0.025872
				if( smoothD_d > 84.7775 )
					if( Positive_Money_Flow <= 5.78264e+06 )
						if( Negative_Money_Flow_Sum <= 3.18256e+07 )
							if( MFI <= 98.6338 )
								if( Positive_Money_Flow_Sum <= 4.81882e+07 )
									ret := -0.033503
								if( Positive_Money_Flow_Sum > 4.81882e+07 )
									ret := -0.558140
							if( MFI > 98.6338 )
								if( k <= 98.765 )
									ret := 1.000000 // buy
								if( k > 98.765 )
									ret := 0.000000
						if( Negative_Money_Flow_Sum > 3.18256e+07 )
							if( d_k <= 2.696 )
								if( smoothK_k <= 94.3987 )
									ret := 1.000000 // buy
								if( smoothK_k > 94.3987 )
									ret := 0.750000 // buy
							if( d_k > 2.696 )
								ret := 0.250000
					if( Positive_Money_Flow > 5.78264e+06 )
						if( Typical_Price <= 56.611 )
							if( Positive_Money_Flow_Sum <= 4.46317e+07 )
								ret := 0.500000
							if( Positive_Money_Flow_Sum > 4.46317e+07 )
								ret := 1.000000 // buy
						if( Typical_Price > 56.611 )
							if( rsi1 <= 63.7407 )
								if( Raw_Money_Flow <= 1.05342e+07 )
									ret := 0.692308
								if( Raw_Money_Flow > 1.05342e+07 )
									ret := -0.428571
							if( rsi1 > 63.7407 )
								if( d_k <= -4.91881 )
									ret := 0.076923
								if( d_k > -4.91881 )
									ret := -0.721311 // sell
			if( Negative_Money_Flow_Sum > 3.63777e+07 )
				if( Typical_Price <= 61.7983 )
					if( Raw_Money_Flow <= 1.18425e+07 )
						if( Typical_Price <= 61.6194 )
							if( MFI_High <= -40.4444 )
								if( Typical_Price <= 60.693 )
									ret := 0.197531
								if( Typical_Price > 60.693 )
									ret := -0.516129
							if( MFI_High > -40.4444 )
								if( MFI <= 40.6405 )
									ret := -1.000000 // sell
								if( MFI > 40.6405 )
									ret := -0.246575
						if( Typical_Price > 61.6194 )
							if( Typical_Price <= 61.67 )
								ret := 1.000000 // buy
							if( Typical_Price > 61.67 )
								if( k <= 57.1444 )
									ret := 0.105263
								if( k > 57.1444 )
									ret := 1.000000 // buy
					if( Raw_Money_Flow > 1.18425e+07 )
						if( MFI <= 60.1941 )
							if( rsi1 <= 43.9722 )
								if( Money_Flow_Ratio <= 0.662769 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 0.662769 )
									ret := 0.400000
							if( rsi1 > 43.9722 )
								ret := -0.600000
						if( MFI > 60.1941 )
							ret := 1.000000 // buy
				if( Typical_Price > 61.7983 )
					if( Raw_Money_Flow <= 2.00969e+06 )
						if( Negative_Money_Flow_Sum <= 5.9821e+07 )
							if( Positive_Money_Flow_Sum <= 8.29537e+07 )
								if( Positive_Money_Flow_Sum <= 2.54714e+07 )
									ret := 0.180556
								if( Positive_Money_Flow_Sum > 2.54714e+07 )
									ret := -0.476190
							if( Positive_Money_Flow_Sum > 8.29537e+07 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 5.9821e+07 )
							if( Positive_Money_Flow_Sum <= 2.28628e+07 )
								if( Positive_Money_Flow <= 814467 )
									ret := -0.476190
								if( Positive_Money_Flow > 814467 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 2.28628e+07 )
								if( MFI_High <= -43.2458 )
									ret := 0.000000
								if( MFI_High > -43.2458 )
									ret := -0.400000
					if( Raw_Money_Flow > 2.00969e+06 )
						if( Negative_Money_Flow_Sum <= 5.17824e+07 )
							if( Positive_Money_Flow_Sum <= 1.17527e+07 )
								if( smoothK_k <= 24.3119 )
									ret := -0.357143
								if( smoothK_k > 24.3119 )
									ret := 0.625000
							if( Positive_Money_Flow_Sum > 1.17527e+07 )
								if( Typical_Price <= 64.5322 )
									ret := -0.339286
								if( Typical_Price > 64.5322 )
									ret := -0.786207 // sell
						if( Negative_Money_Flow_Sum > 5.17824e+07 )
							if( Negative_Money_Flow_Sum <= 5.31026e+07 )
								if( MFI_High <= -36.8041 )
									ret := 1.000000 // buy
								if( MFI_High > -36.8041 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 5.31026e+07 )
								if( MFI_High <= -16.5895 )
									ret := -0.194245
								if( MFI_High > -16.5895 )
									ret := -1.000000 // sell
	if( Negative_Money_Flow > 28.4121 )
		if( Positive_Money_Flow_Sum <= 474674 )
			if( Positive_Money_Flow_Sum <= 121314 )
				if( d_k <= 17.2703 )
					if( Typical_Price <= 58.8967 )
						if( Positive_Money_Flow <= 1924.39 )
							if( Negative_Money_Flow_Sum <= 615417 )
								if( rsi1 <= 36.6634 )
									ret := 0.617647
								if( rsi1 > 36.6634 )
									ret := 0.247934
							if( Negative_Money_Flow_Sum > 615417 )
								if( Positive_Money_Flow_Sum <= 86015.9 )
									ret := -0.611111
								if( Positive_Money_Flow_Sum > 86015.9 )
									ret := 0.166667
						if( Positive_Money_Flow > 1924.39 )
							if( d <= 54.9766 )
								ret := 0.000000
							if( d > 54.9766 )
								ret := -1.000000 // sell
					if( Typical_Price > 58.8967 )
						if( Positive_Money_Flow_Sum <= 68417.2 )
							if( Negative_Money_Flow <= 68220.6 )
								if( smoothK_k <= 71.4146 )
									ret := 0.457516
								if( smoothK_k > 71.4146 )
									ret := -0.210526
							if( Negative_Money_Flow > 68220.6 )
								if( Raw_Money_Flow <= 217849 )
									ret := -0.357143
								if( Raw_Money_Flow > 217849 )
									ret := 0.461538
						if( Positive_Money_Flow_Sum > 68417.2 )
							if( Negative_Money_Flow_Sum <= 89129 )
								if( Positive_Money_Flow_Sum <= 98272.5 )
									ret := 0.500000
								if( Positive_Money_Flow_Sum > 98272.5 )
									ret := -0.642857
							if( Negative_Money_Flow_Sum > 89129 )
								if( d_k <= 9.5102 )
									ret := 0.691571
								if( d_k > 9.5102 )
									ret := 0.324324
				if( d_k > 17.2703 )
					if( rsi1 <= 18.3693 )
						ret := 0.857143 // buy
					if( rsi1 > 18.3693 )
						if( Negative_Money_Flow <= 218353 )
							if( Negative_Money_Flow <= 20814 )
								if( Typical_Price <= 61.4096 )
									ret := 0.181818
								if( Typical_Price > 61.4096 )
									ret := -0.500000
							if( Negative_Money_Flow > 20814 )
								if( Typical_Price <= 63.3103 )
									ret := -0.360000
								if( Typical_Price > 63.3103 )
									ret := -0.900000 // sell
						if( Negative_Money_Flow > 218353 )
							ret := 0.500000
			if( Positive_Money_Flow_Sum > 121314 )
				if( MFI_High <= -59.9629 )
					if( Raw_Money_Flow <= 9.19908e+06 )
						if( k <= 95.8558 )
							if( Negative_Money_Flow <= 66829.7 )
								if( Positive_Money_Flow_Sum <= 159898 )
									ret := 0.247191
								if( Positive_Money_Flow_Sum > 159898 )
									ret := 0.643154
							if( Negative_Money_Flow > 66829.7 )
								if( Typical_Price <= 65.4678 )
									ret := 0.384956
								if( Typical_Price > 65.4678 )
									ret := 0.085227
						if( k > 95.8558 )
							if( Typical_Price <= 61.9636 )
								ret := 0.500000
							if( Typical_Price > 61.9636 )
								if( Negative_Money_Flow <= 10776.4 )
									ret := -0.750000 // sell
								if( Negative_Money_Flow > 10776.4 )
									ret := -1.000000 // sell
					if( Raw_Money_Flow > 9.19908e+06 )
						if( smoothD_d <= 18.3053 )
							ret := 1.000000 // buy
						if( smoothD_d > 18.3053 )
							if( k <= 65.1284 )
								if( rsi1 <= 26.1895 )
									ret := -0.250000
								if( rsi1 > 26.1895 )
									ret := -0.954545 // sell
							if( k > 65.1284 )
								ret := 0.250000
				if( MFI_High > -59.9629 )
					if( d_k <= -4.34138 )
						if( MFI_High <= -27.0463 )
							if( Raw_Money_Flow <= 95077.6 )
								if( rsi1 <= 38.4791 )
									ret := 0.481481
								if( rsi1 > 38.4791 )
									ret := 0.053846
							if( Raw_Money_Flow > 95077.6 )
								if( Positive_Money_Flow_Sum <= 310890 )
									ret := -0.105263
								if( Positive_Money_Flow_Sum > 310890 )
									ret := -0.615385
						if( MFI_High > -27.0463 )
							if( MFI_Low <= 42.027 )
								if( Negative_Money_Flow_Sum <= 112005 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 112005 )
									ret := -0.492308
							if( MFI_Low > 42.027 )
								if( Negative_Money_Flow_Sum <= 83759.1 )
									ret := -0.517241
								if( Negative_Money_Flow_Sum > 83759.1 )
									ret := 0.171717
					if( d_k > -4.34138 )
						if( d_k <= 2.17193 )
							if( rsi1 <= 67.6185 )
								if( Negative_Money_Flow_Sum <= 915860 )
									ret := 0.222694
								if( Negative_Money_Flow_Sum > 915860 )
									ret := -0.354839
							if( rsi1 > 67.6185 )
								if( Typical_Price <= 59.5327 )
									ret := 0.050000
								if( Typical_Price > 59.5327 )
									ret := -0.440000
						if( d_k > 2.17193 )
							if( Negative_Money_Flow_Sum <= 236817 )
								if( Typical_Price <= 78.8454 )
									ret := 0.440625
								if( Typical_Price > 78.8454 )
									ret := 0.043478
							if( Negative_Money_Flow_Sum > 236817 )
								if( Negative_Money_Flow_Sum <= 261249 )
									ret := -0.070000
								if( Negative_Money_Flow_Sum > 261249 )
									ret := 0.260062
		if( Positive_Money_Flow_Sum > 474674 )
			if( smoothD_d <= 85.0144 )
				if( Positive_Money_Flow_Sum <= 5.12950e+07 )
					if( Negative_Money_Flow_Sum <= 3.00661e+07 )
						if( Money_Flow_Ratio <= 0.732258 )
							if( smoothK_k <= 87.2186 )
								if( MFI <= 25.7501 )
									ret := 0.065972
								if( MFI > 25.7501 )
									ret := 0.007156
							if( smoothK_k > 87.2186 )
								if( Positive_Money_Flow_Sum <= 5.77851e+06 )
									ret := 0.147368
								if( Positive_Money_Flow_Sum > 5.77851e+06 )
									ret := 0.533333
						if( Money_Flow_Ratio > 0.732258 )
							if( rsi1 <= 51.7196 )
								if( Negative_Money_Flow <= 55317.5 )
									ret := 0.312736
								if( Negative_Money_Flow > 55317.5 )
									ret := 0.115326
							if( rsi1 > 51.7196 )
								if( Positive_Money_Flow_Sum <= 4.28691e+07 )
									ret := 0.070501
								if( Positive_Money_Flow_Sum > 4.28691e+07 )
									ret := -0.602410
					if( Negative_Money_Flow_Sum > 3.00661e+07 )
						if( Negative_Money_Flow_Sum <= 4.12769e+07 )
							if( d_k <= 22.9731 )
								if( Positive_Money_Flow_Sum <= 8.61798e+06 )
									ret := 0.164062
								if( Positive_Money_Flow_Sum > 8.61798e+06 )
									ret := 0.425957
							if( d_k > 22.9731 )
								if( Positive_Money_Flow_Sum <= 1.19512e+07 )
									ret := -0.875000 // sell
								if( Positive_Money_Flow_Sum > 1.19512e+07 )
									ret := 0.090909
						if( Negative_Money_Flow_Sum > 4.12769e+07 )
							if( Money_Flow_Ratio <= 0.824051 )
								if( Money_Flow_Ratio <= 0.398536 )
									ret := -0.047893
								if( Money_Flow_Ratio > 0.398536 )
									ret := 0.293447
							if( Money_Flow_Ratio > 0.824051 )
								if( d_k <= 10.1027 )
									ret := -0.756757 // sell
								if( d_k > 10.1027 )
									ret := 0.400000
				if( Positive_Money_Flow_Sum > 5.12950e+07 )
					if( d <= 12.9013 )
						if( Negative_Money_Flow <= 137528 )
							if( d <= 11.2911 )
								if( MFI <= 71.4181 )
									ret := 0.500000
								if( MFI > 71.4181 )
									ret := 0.000000
							if( d > 11.2911 )
								ret := -0.400000
						if( Negative_Money_Flow > 137528 )
							if( Typical_Price <= 66.7593 )
								if( smoothK_k <= 2.27065 )
									ret := -0.750000 // sell
								if( smoothK_k > 2.27065 )
									ret := -1.000000 // sell
							if( Typical_Price > 66.7593 )
								ret := 0.250000
					if( d > 12.9013 )
						if( Money_Flow_Ratio <= 0.911218 )
							if( d_k <= 9.88339 )
								if( rsi1 <= 49.6277 )
									ret := 0.031250
								if( rsi1 > 49.6277 )
									ret := -0.857143 // sell
							if( d_k > 9.88339 )
								if( d_k <= 13.6302 )
									ret := 0.850000 // buy
								if( d_k > 13.6302 )
									ret := 0.000000
						if( Money_Flow_Ratio > 0.911218 )
							if( rsi1 <= 63.973 )
								if( Money_Flow_Ratio <= 119.074 )
									ret := 0.634752
								if( Money_Flow_Ratio > 119.074 )
									ret := -0.285714
							if( rsi1 > 63.973 )
								if( Negative_Money_Flow_Sum <= 5.44033e+07 )
									ret := 0.340909
								if( Negative_Money_Flow_Sum > 5.44033e+07 )
									ret := -0.833333 // sell
			if( smoothD_d > 85.0144 )
				if( Positive_Money_Flow_Sum <= 4.63802e+07 )
					if( MFI <= 27.4991 )
						if( Raw_Money_Flow <= 1.53723e+07 )
							if( Negative_Money_Flow <= 1.33509e+06 )
								if( rsi1 <= 46.9039 )
									ret := -0.025641
								if( rsi1 > 46.9039 )
									ret := -0.606061
							if( Negative_Money_Flow > 1.33509e+06 )
								if( Money_Flow_Ratio <= 0.259362 )
									ret := -0.944444 // sell
								if( Money_Flow_Ratio > 0.259362 )
									ret := -0.473684
						if( Raw_Money_Flow > 1.53723e+07 )
							ret := 0.500000
					if( MFI > 27.4991 )
						if( Money_Flow_Ratio <= 2.45564 )
							if( d_k <= -2.04804 )
								if( Negative_Money_Flow_Sum <= 6.80083e+06 )
									ret := -0.025381
								if( Negative_Money_Flow_Sum > 6.80083e+06 )
									ret := 0.288235
							if( d_k > -2.04804 )
								if( d_k <= 7.56482 )
									ret := -0.083675
								if( d_k > 7.56482 )
									ret := 0.093333
						if( Money_Flow_Ratio > 2.45564 )
							if( Positive_Money_Flow_Sum <= 2.78673e+07 )
								if( Positive_Money_Flow_Sum <= 1.31888e+07 )
									ret := 0.121604
								if( Positive_Money_Flow_Sum > 1.31888e+07 )
									ret := -0.144404
							if( Positive_Money_Flow_Sum > 2.78673e+07 )
								if( k <= 82.154 )
									ret := -0.307692
								if( k > 82.154 )
									ret := 0.450549
				if( Positive_Money_Flow_Sum > 4.63802e+07 )
					if( Negative_Money_Flow_Sum <= 7.22384e+06 )
						if( Typical_Price <= 67.0434 )
							ret := 0.000000
						if( Typical_Price > 67.0434 )
							ret := 0.500000
					if( Negative_Money_Flow_Sum > 7.22384e+06 )
						if( Money_Flow_Ratio <= 1.4582 )
							if( Raw_Money_Flow <= 1.75156e+07 )
								if( Positive_Money_Flow_Sum <= 5.46969e+07 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 5.46969e+07 )
									ret := -0.250000
							if( Raw_Money_Flow > 1.75156e+07 )
								ret := 0.500000
						if( Money_Flow_Ratio > 1.4582 )
							if( MFI_High <= -10.7334 )
								if( k <= 95.3884 )
									ret := -1.000000 // sell
								if( k > 95.3884 )
									ret := -0.500000
							if( MFI_High > -10.7334 )
								if( MFI_Low <= 49.9333 )
									ret := 0.666667
								if( MFI_Low > 49.9333 )
									ret := -0.687500
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_SHOP_1Min_1c8cd294(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


