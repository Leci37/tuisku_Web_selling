//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: ETHUSDT_30Min_2CM0_35cb90d4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_30Min_2CM0_35cb90d4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_30Min_35cb90d4(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Negative_Money_Flow <= 3.8347e+07 )
		if( Typical_Price <= 1628.88 )
			if( Money_Flow_Ratio <= 3.2487 )
				if( Negative_Money_Flow_Sum <= 1.30745e+08 )
					if( ad <= -5481.36 )
						if( MFI <= 68.6279 )
							if( MFI_High <= -15.3873 )
								if( mf <= 0.00412 )
									ret := 0.021138
								if( mf > 0.00412 )
									ret := 0.194478
							if( MFI_High > -15.3873 )
								if( mf <= 0.035171 )
									ret := -0.372727
								if( mf > 0.035171 )
									ret := -0.028369
						if( MFI > 68.6279 )
							if( Raw_Money_Flow <= 2.03662e+07 )
								if( Raw_Money_Flow <= 1.40984e+07 )
									ret := 0.186747
								if( Raw_Money_Flow > 1.40984e+07 )
									ret := 0.633588
							if( Raw_Money_Flow > 2.03662e+07 )
								if( MFI <= 70.4447 )
									ret := 0.463415
								if( MFI > 70.4447 )
									ret := -0.190909
					if( ad > -5481.36 )
						if( Negative_Money_Flow_Sum <= 2.25531e+07 )
							if( Negative_Money_Flow <= 42412.7 )
								if( ad <= 1500.54 )
									ret := 0.157706
								if( ad > 1500.54 )
									ret := -0.201342
							if( Negative_Money_Flow > 42412.7 )
								if( Positive_Money_Flow_Sum <= 2.85937e+07 )
									ret := 0.374172
								if( Positive_Money_Flow_Sum > 2.85937e+07 )
									ret := -0.054264
						if( Negative_Money_Flow_Sum > 2.25531e+07 )
							if( Positive_Money_Flow_Sum <= 2.88484e+08 )
								if( Positive_Money_Flow <= 2.04168e+07 )
									ret := -0.050985
								if( Positive_Money_Flow > 2.04168e+07 )
									ret := 0.196018
							if( Positive_Money_Flow_Sum > 2.88484e+08 )
								if( mf <= 0.085695 )
									ret := -0.869565 // sell
								if( mf > 0.085695 )
									ret := 0.088235
				if( Negative_Money_Flow_Sum > 1.30745e+08 )
					if( ad_mf <= -53598.6 )
						ret := 0.923077 // buy
					if( ad_mf > -53598.6 )
						if( Negative_Money_Flow_Sum <= 8.72845e+08 )
							if( MFI_High <= -35.8556 )
								if( Raw_Money_Flow <= 3.97004e+07 )
									ret := 0.135576
								if( Raw_Money_Flow > 3.97004e+07 )
									ret := -0.151709
							if( MFI_High > -35.8556 )
								if( Negative_Money_Flow_Sum <= 2.41909e+08 )
									ret := 0.100200
								if( Negative_Money_Flow_Sum > 2.41909e+08 )
									ret := -0.155693
						if( Negative_Money_Flow_Sum > 8.72845e+08 )
							if( ad <= 22.1899 )
								if( Money_Flow_Ratio <= 0.286711 )
									ret := -0.833333 // sell
								if( Money_Flow_Ratio > 0.286711 )
									ret := 0.210526
							if( ad > 22.1899 )
								if( Raw_Money_Flow <= 1.21216e+08 )
									ret := 0.921053 // buy
								if( Raw_Money_Flow > 1.21216e+08 )
									ret := 0.181818
			if( Money_Flow_Ratio > 3.2487 )
				if( Negative_Money_Flow_Sum <= 2.17431e+08 )
					if( MFI_High <= -0.594477 )
						if( MFI <= 78.2652 )
							if( MFI_High <= -3.31905 )
								if( Positive_Money_Flow <= 1.34464e+07 )
									ret := 0.758621 // buy
								if( Positive_Money_Flow > 1.34464e+07 )
									ret := 0.250000
							if( MFI_High > -3.31905 )
								if( Positive_Money_Flow_Sum <= 2.53606e+08 )
									ret := 0.319372
								if( Positive_Money_Flow_Sum > 2.53606e+08 )
									ret := -0.212389
						if( MFI > 78.2652 )
							if( ad_mf <= 19473.9 )
								if( Raw_Money_Flow <= 5.3558e+07 )
									ret := 0.526316
								if( Raw_Money_Flow > 5.3558e+07 )
									ret := -0.250000
							if( ad_mf > 19473.9 )
								if( Positive_Money_Flow <= 5.04244e+07 )
									ret := -0.380952
								if( Positive_Money_Flow > 5.04244e+07 )
									ret := 0.500000
					if( MFI_High > -0.594477 )
						if( Raw_Money_Flow <= 4.10558e+07 )
							if( Positive_Money_Flow <= 2.95887e+07 )
								if( MFI_High <= 3.71039 )
									ret := -0.040189
								if( MFI_High > 3.71039 )
									ret := 0.226471
							if( Positive_Money_Flow > 2.95887e+07 )
								if( Money_Flow_Ratio <= 4.78594 )
									ret := 0.074074
								if( Money_Flow_Ratio > 4.78594 )
									ret := -0.550000
						if( Raw_Money_Flow > 4.10558e+07 )
							if( Negative_Money_Flow_Sum <= 9.57284e+07 )
								if( Negative_Money_Flow_Sum <= 5.23403e+07 )
									ret := 0.442623
								if( Negative_Money_Flow_Sum > 5.23403e+07 )
									ret := -0.205128
							if( Negative_Money_Flow_Sum > 9.57284e+07 )
								if( MFI_Low <= 64.4052 )
									ret := 0.390805
								if( MFI_Low > 64.4052 )
									ret := 0.870968 // buy
				if( Negative_Money_Flow_Sum > 2.17431e+08 )
					if( ad <= 14148.5 )
						ret := -0.200000
					if( ad > 14148.5 )
						ret := -0.950000 // sell
		if( Typical_Price > 1628.88 )
			if( ad_mf <= -3245.7 )
				if( Negative_Money_Flow_Sum <= 4.96541e+08 )
					if( Raw_Money_Flow <= 4.51675e+07 )
						if( Negative_Money_Flow <= 1.4926e+07 )
							if( MFI_Low <= 27.0966 )
								if( Positive_Money_Flow_Sum <= 1.95834e+08 )
									ret := 0.041164
								if( Positive_Money_Flow_Sum > 1.95834e+08 )
									ret := 0.390863
							if( MFI_Low > 27.0966 )
								if( MFI_Low <= 34.7631 )
									ret := -0.152310
								if( MFI_Low > 34.7631 )
									ret := -0.001370
						if( Negative_Money_Flow > 1.4926e+07 )
							if( MFI_Low <= 56.6961 )
								if( Money_Flow_Ratio <= 0.527019 )
									ret := 0.158026
								if( Money_Flow_Ratio > 0.527019 )
									ret := 0.045100
							if( MFI_Low > 56.6961 )
								if( Negative_Money_Flow_Sum <= 6.14315e+07 )
									ret := 0.567797
								if( Negative_Money_Flow_Sum > 6.14315e+07 )
									ret := 0.243816
					if( Raw_Money_Flow > 4.51675e+07 )
						if( Positive_Money_Flow <= 6.30145e+07 )
							if( Negative_Money_Flow_Sum <= 1.50569e+08 )
								if( MFI <= 88.6949 )
									ret := -0.051546
								if( MFI > 88.6949 )
									ret := -0.648649
							if( Negative_Money_Flow_Sum > 1.50569e+08 )
								if( Money_Flow_Ratio <= 0.987077 )
									ret := -0.633333
								if( Money_Flow_Ratio > 0.987077 )
									ret := -0.211268
						if( Positive_Money_Flow > 6.30145e+07 )
							if( MFI <= 55.889 )
								if( Negative_Money_Flow_Sum <= 3.80347e+08 )
									ret := -0.095238
								if( Negative_Money_Flow_Sum > 3.80347e+08 )
									ret := 0.657895
							if( MFI > 55.889 )
								if( ad_mf <= -28789.3 )
									ret := -0.517857
								if( ad_mf > -28789.3 )
									ret := -0.022727
				if( Negative_Money_Flow_Sum > 4.96541e+08 )
					if( Money_Flow_Ratio <= 0.743726 )
						if( MFI <= 39.7667 )
							if( Raw_Money_Flow <= 3.64272e+07 )
								if( MFI_High <= -41.4862 )
									ret := -0.474265
								if( MFI_High > -41.4862 )
									ret := 0.888889 // buy
							if( Raw_Money_Flow > 3.64272e+07 )
								if( ad_mf <= -6228.82 )
									ret := 0.070755
								if( ad_mf > -6228.82 )
									ret := -0.436620
						if( MFI > 39.7667 )
							if( mf <= -0.072384 )
								ret := -0.272727
							if( mf > -0.072384 )
								if( Typical_Price <= 3122.11 )
									ret := -0.913043 // sell
								if( Typical_Price > 3122.11 )
									ret := -0.625000
					if( Money_Flow_Ratio > 0.743726 )
						if( mf <= -0.073282 )
							if( MFI <= 53.3977 )
								ret := -0.222222
							if( MFI > 53.3977 )
								ret := -1.000000 // sell
						if( mf > -0.073282 )
							if( ad_mf <= -13458.4 )
								if( Negative_Money_Flow_Sum <= 1.15419e+09 )
									ret := 0.730769 // buy
								if( Negative_Money_Flow_Sum > 1.15419e+09 )
									ret := 0.250000
							if( ad_mf > -13458.4 )
								if( MFI_Low <= 27.1512 )
									ret := 0.542857
								if( MFI_Low > 27.1512 )
									ret := -0.058824
			if( ad_mf > -3245.7 )
				if( MFI_High <= -33.9631 )
					if( MFI_Low <= -10.2254 )
						if( ad <= -1782.36 )
							ret := -0.133333
						if( ad > -1782.36 )
							if( MFI_High <= -72.0748 )
								if( mf <= -0.122924 )
									ret := -0.962963 // sell
								if( mf > -0.122924 )
									ret := -0.750000 // sell
							if( MFI_High > -72.0748 )
								if( ad_mf <= 2030.12 )
									ret := -0.230769
								if( ad_mf > 2030.12 )
									ret := -0.600000
					if( MFI_Low > -10.2254 )
						if( Typical_Price <= 2344.73 )
							if( Money_Flow_Ratio <= 0.59741 )
								if( Money_Flow_Ratio <= 0.164787 )
									ret := -0.401786
								if( Money_Flow_Ratio > 0.164787 )
									ret := 0.010683
							if( Money_Flow_Ratio > 0.59741 )
								if( Typical_Price <= 2332.87 )
									ret := -0.101279
								if( Typical_Price > 2332.87 )
									ret := 0.400000
						if( Typical_Price > 2344.73 )
							if( Raw_Money_Flow <= 2.53682e+07 )
								if( MFI <= 25.6921 )
									ret := -0.268872
								if( MFI > 25.6921 )
									ret := -0.098236
							if( Raw_Money_Flow > 2.53682e+07 )
								if( MFI_Low <= -6.91483 )
									ret := 0.591837
								if( MFI_Low > -6.91483 )
									ret := -0.050786
				if( MFI_High > -33.9631 )
					if( mf <= 0.370308 )
						if( Negative_Money_Flow <= 1.71763e+07 )
							if( Positive_Money_Flow_Sum <= 8.49953e+08 )
								if( MFI_Low <= 28.0308 )
									ret := 0.098908
								if( MFI_Low > 28.0308 )
									ret := -0.008830
							if( Positive_Money_Flow_Sum > 8.49953e+08 )
								if( MFI <= 54.8525 )
									ret := 0.107692
								if( MFI > 54.8525 )
									ret := -0.321070
						if( Negative_Money_Flow > 1.71763e+07 )
							if( Negative_Money_Flow <= 3.75649e+07 )
								if( Negative_Money_Flow_Sum <= 1.56054e+08 )
									ret := -0.156695
								if( Negative_Money_Flow_Sum > 1.56054e+08 )
									ret := -0.020979
							if( Negative_Money_Flow > 3.75649e+07 )
								if( MFI_Low <= 48.2796 )
									ret := -0.428571
								if( MFI_Low > 48.2796 )
									ret := -1.000000 // sell
					if( mf > 0.370308 )
						if( Typical_Price <= 1767.38 )
							ret := -0.750000 // sell
						if( Typical_Price > 1767.38 )
							if( Raw_Money_Flow <= 8.39731e+07 )
								if( Money_Flow_Ratio <= 8.97996 )
									ret := 0.090909
								if( Money_Flow_Ratio > 8.97996 )
									ret := 0.692308
							if( Raw_Money_Flow > 8.39731e+07 )
								if( Money_Flow_Ratio <= 5.03263 )
									ret := 0.384615
								if( Money_Flow_Ratio > 5.03263 )
									ret := 0.895522 // buy
	if( Negative_Money_Flow > 3.8347e+07 )
		if( Negative_Money_Flow_Sum <= 2.76625e+08 )
			if( Typical_Price <= 1541.63 )
				if( Raw_Money_Flow <= 7.60211e+07 )
					if( Positive_Money_Flow_Sum <= 4.14398e+08 )
						if( ad <= -9379.8 )
							if( Typical_Price <= 1489.91 )
								if( Negative_Money_Flow <= 4.1271e+07 )
									ret := 0.295775
								if( Negative_Money_Flow > 4.1271e+07 )
									ret := 0.558974
							if( Typical_Price > 1489.91 )
								if( Positive_Money_Flow_Sum <= 3.02396e+08 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 3.02396e+08 )
									ret := 0.555556
						if( ad > -9379.8 )
							if( mf <= -0.104178 )
								if( Money_Flow_Ratio <= 0.362124 )
									ret := 0.727273 // buy
								if( Money_Flow_Ratio > 0.362124 )
									ret := -0.620690
							if( mf > -0.104178 )
								if( Typical_Price <= 1342.67 )
									ret := 0.604651
								if( Typical_Price > 1342.67 )
									ret := -0.063830
					if( Positive_Money_Flow_Sum > 4.14398e+08 )
						if( Negative_Money_Flow_Sum <= 1.71492e+08 )
							if( Negative_Money_Flow <= 5.32179e+07 )
								if( MFI_High <= 0.949945 )
									ret := 1.000000 // buy
								if( MFI_High > 0.949945 )
									ret := 0.333333
							if( Negative_Money_Flow > 5.32179e+07 )
								ret := -0.384615
						if( Negative_Money_Flow_Sum > 1.71492e+08 )
							if( Negative_Money_Flow <= 6.43408e+07 )
								if( MFI_Low <= 55.3008 )
									ret := -0.738095 // sell
								if( MFI_Low > 55.3008 )
									ret := 0.263158
							if( Negative_Money_Flow > 6.43408e+07 )
								ret := 0.687500
				if( Raw_Money_Flow > 7.60211e+07 )
					if( MFI_High <= -37.7037 )
						ret := -0.095238
					if( MFI_High > -37.7037 )
						if( Positive_Money_Flow_Sum <= 2.00489e+08 )
							ret := -0.846154 // sell
						if( Positive_Money_Flow_Sum > 2.00489e+08 )
							ret := 0.000000
			if( Typical_Price > 1541.63 )
				if( ad <= -7849.73 )
					if( Negative_Money_Flow <= 4.49448e+07 )
						if( ad_mf <= -17607 )
							if( ad_mf <= -18291.6 )
								if( MFI_Low <= 22.3569 )
									ret := 0.181818
								if( MFI_Low > 22.3569 )
									ret := 0.913793 // buy
							if( ad_mf > -18291.6 )
								ret := 0.500000
						if( ad_mf > -17607 )
							if( mf <= 0.199352 )
								if( Negative_Money_Flow_Sum <= 1.56874e+08 )
									ret := 0.366013
								if( Negative_Money_Flow_Sum > 1.56874e+08 )
									ret := 0.030303
							if( mf > 0.199352 )
								if( ad_mf <= -11431.6 )
									ret := 0.555556
								if( ad_mf > -11431.6 )
									ret := 0.923077 // buy
					if( Negative_Money_Flow > 4.49448e+07 )
						if( mf <= -0.073418 )
							if( Raw_Money_Flow <= 5.91207e+07 )
								if( MFI <= 60.2676 )
									ret := -0.468750
								if( MFI > 60.2676 )
									ret := 0.400000
							if( Raw_Money_Flow > 5.91207e+07 )
								if( Negative_Money_Flow_Sum <= 1.46019e+08 )
									ret := 0.866667 // buy
								if( Negative_Money_Flow_Sum > 1.46019e+08 )
									ret := -0.195876
						if( mf > -0.073418 )
							if( MFI_Low <= 34.7278 )
								if( Positive_Money_Flow_Sum <= 1.5475e+08 )
									ret := 0.006757
								if( Positive_Money_Flow_Sum > 1.5475e+08 )
									ret := 0.471503
							if( MFI_Low > 34.7278 )
								if( Negative_Money_Flow_Sum <= 2.33458e+08 )
									ret := 0.061662
								if( Negative_Money_Flow_Sum > 2.33458e+08 )
									ret := -0.415094
				if( ad > -7849.73 )
					if( Raw_Money_Flow <= 4.50899e+07 )
						if( MFI <= 60.0175 )
							if( Money_Flow_Ratio <= 0.318212 )
								if( MFI_High <= -58.225 )
									ret := -0.205882
								if( MFI_High > -58.225 )
									ret := -0.944444 // sell
							if( Money_Flow_Ratio > 0.318212 )
								if( MFI_High <= -47.4629 )
									ret := 0.590909
								if( MFI_High > -47.4629 )
									ret := 0.070621
						if( MFI > 60.0175 )
							if( ad <= -194.245 )
								if( Positive_Money_Flow_Sum <= 2.86122e+08 )
									ret := 0.315789
								if( Positive_Money_Flow_Sum > 2.86122e+08 )
									ret := -0.538462
							if( ad > -194.245 )
								if( Raw_Money_Flow <= 4.04152e+07 )
									ret := -0.315789
								if( Raw_Money_Flow > 4.04152e+07 )
									ret := 0.115385
					if( Raw_Money_Flow > 4.50899e+07 )
						if( Negative_Money_Flow_Sum <= 2.32624e+08 )
							if( Money_Flow_Ratio <= 1.8756 )
								if( Money_Flow_Ratio <= 1.73632 )
									ret := -0.067935
								if( Money_Flow_Ratio > 1.73632 )
									ret := 0.870968 // buy
							if( Money_Flow_Ratio > 1.8756 )
								if( Money_Flow_Ratio <= 7.31414 )
									ret := -0.309783
								if( Money_Flow_Ratio > 7.31414 )
									ret := 0.307692
						if( Negative_Money_Flow_Sum > 2.32624e+08 )
							if( MFI_Low <= 52.0487 )
								if( Negative_Money_Flow <= 7.10552e+07 )
									ret := -0.516129
								if( Negative_Money_Flow > 7.10552e+07 )
									ret := -0.102941
							if( MFI_Low > 52.0487 )
								if( MFI <= 75.1023 )
									ret := 1.000000 // buy
								if( MFI > 75.1023 )
									ret := -0.100000
		if( Negative_Money_Flow_Sum > 2.76625e+08 )
			if( ad_mf <= -2900.24 )
				if( Negative_Money_Flow_Sum <= 3.3229e+08 )
					if( Positive_Money_Flow_Sum <= 1.35563e+08 )
						if( MFI_High <= -50.5442 )
							if( Typical_Price <= 2850.68 )
								if( Negative_Money_Flow_Sum <= 3.06483e+08 )
									ret := 0.369863
								if( Negative_Money_Flow_Sum > 3.06483e+08 )
									ret := 0.710145 // buy
							if( Typical_Price > 2850.68 )
								if( Typical_Price <= 3227.75 )
									ret := -0.476190
								if( Typical_Price > 3227.75 )
									ret := 0.428571
						if( MFI_High > -50.5442 )
							if( ad_mf <= -10518.7 )
								ret := -0.125000
							if( ad_mf > -10518.7 )
								if( Negative_Money_Flow <= 4.61723e+07 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 4.61723e+07 )
									ret := -0.818182 // sell
					if( Positive_Money_Flow_Sum > 1.35563e+08 )
						if( Negative_Money_Flow <= 6.81948e+07 )
							if( MFI_High <= -35.1508 )
								if( Money_Flow_Ratio <= 0.589987 )
									ret := 0.676056
								if( Money_Flow_Ratio > 0.589987 )
									ret := 0.912281 // buy
							if( MFI_High > -35.1508 )
								if( Money_Flow_Ratio <= 0.863746 )
									ret := -0.447368
								if( Money_Flow_Ratio > 0.863746 )
									ret := 0.629091
						if( Negative_Money_Flow > 6.81948e+07 )
							if( Money_Flow_Ratio <= 0.611918 )
								if( Money_Flow_Ratio <= 0.487118 )
									ret := 0.800000 // buy
								if( Money_Flow_Ratio > 0.487118 )
									ret := -0.787879 // sell
							if( Money_Flow_Ratio > 0.611918 )
								if( mf <= 0.137743 )
									ret := 0.269565
								if( mf > 0.137743 )
									ret := -0.303030
				if( Negative_Money_Flow_Sum > 3.3229e+08 )
					if( ad_mf <= -99172.6 )
						ret := 1.000000 // buy
					if( ad_mf > -99172.6 )
						if( Negative_Money_Flow_Sum <= 4.4944e+08 )
							if( Raw_Money_Flow <= 8.33165e+07 )
								if( Typical_Price <= 2937.69 )
									ret := 0.055777
								if( Typical_Price > 2937.69 )
									ret := 0.346479
							if( Raw_Money_Flow > 8.33165e+07 )
								if( MFI <= 67.6171 )
									ret := 0.405325
								if( MFI > 67.6171 )
									ret := -0.444444
						if( Negative_Money_Flow_Sum > 4.4944e+08 )
							if( Money_Flow_Ratio <= 0.197429 )
								if( MFI_Low <= -15.079 )
									ret := -0.705882 // sell
								if( MFI_Low > -15.079 )
									ret := 0.448179
							if( Money_Flow_Ratio > 0.197429 )
								if( Positive_Money_Flow_Sum <= 1.22618e+08 )
									ret := -0.506329
								if( Positive_Money_Flow_Sum > 1.22618e+08 )
									ret := 0.030474
			if( ad_mf > -2900.24 )
				if( ad_mf <= 44858.1 )
					if( Negative_Money_Flow_Sum <= 3.02333e+08 )
						if( MFI_High <= -65.2562 )
							ret := -1.000000 // sell
						if( MFI_High > -65.2562 )
							if( Negative_Money_Flow <= 5.9287e+07 )
								if( ad_mf <= -507.67 )
									ret := -0.500000
								if( ad_mf > -507.67 )
									ret := 0.222222
							if( Negative_Money_Flow > 5.9287e+07 )
								if( Negative_Money_Flow_Sum <= 2.971e+08 )
									ret := -0.712121 // sell
								if( Negative_Money_Flow_Sum > 2.971e+08 )
									ret := -0.083333
					if( Negative_Money_Flow_Sum > 3.02333e+08 )
						if( mf <= 0.020739 )
							if( MFI_High <= -47.2147 )
								if( Raw_Money_Flow <= 4.75063e+07 )
									ret := -0.222222
								if( Raw_Money_Flow > 4.75063e+07 )
									ret := 0.061069
							if( MFI_High > -47.2147 )
								if( Money_Flow_Ratio <= 0.539559 )
									ret := -0.684211
								if( Money_Flow_Ratio > 0.539559 )
									ret := -0.161863
						if( mf > 0.020739 )
							if( MFI_Low <= 18.0005 )
								if( ad <= 3916.42 )
									ret := 0.642857
								if( ad > 3916.42 )
									ret := 0.298387
							if( MFI_Low > 18.0005 )
								if( Negative_Money_Flow <= 1.36589e+08 )
									ret := 0.097331
								if( Negative_Money_Flow > 1.36589e+08 )
									ret := -0.530612
				if( ad_mf > 44858.1 )
					if( Negative_Money_Flow <= 2.21269e+08 )
						if( mf <= -0.095389 )
							if( Money_Flow_Ratio <= 0.246159 )
								if( MFI <= 14.3168 )
									ret := 0.875000 // buy
								if( MFI > 14.3168 )
									ret := 0.545455
							if( Money_Flow_Ratio > 0.246159 )
								ret := -1.000000 // sell
						if( mf > -0.095389 )
							if( ad <= 53153.2 )
								if( Raw_Money_Flow <= 1.05859e+08 )
									ret := -0.142857
								if( Raw_Money_Flow > 1.05859e+08 )
									ret := 0.933333 // buy
							if( ad > 53153.2 )
								if( Typical_Price <= 1202.68 )
									ret := 0.785714 // buy
								if( Typical_Price > 1202.68 )
									ret := 0.969697 // buy
					if( Negative_Money_Flow > 2.21269e+08 )
						if( Positive_Money_Flow_Sum <= 9.8203e+08 )
							if( mf <= 0.02484 )
								if( mf <= -0.046989 )
									ret := -0.833333 // sell
								if( mf > -0.046989 )
									ret := -1.000000 // sell
							if( mf > 0.02484 )
								ret := 0.058824
						if( Positive_Money_Flow_Sum > 9.8203e+08 )
							ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

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
float op_operation = decision_tree_0_ETHUSDT_30Min_35cb90d4(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


