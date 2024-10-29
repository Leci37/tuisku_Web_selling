//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: BTCUSDT_30Min_2MS0_1e5a105c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BTCUSDT_30Min_2MS0_1e5a105c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BTCUSDT_30Min_1e5a105c(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( k <= 48.9515 )
		if( rsi1 <= 40.4247 )
			if( MFI_Low <= 18.1163 )
				if( rsi1 <= 27.1446 )
					if( MFI_High <= -56.5382 )
						if( Typical_Price <= 39143.3 )
							if( d_k <= -9.83444 )
								if( d <= 27.967 )
									ret := 0.534247
								if( d > 27.967 )
									ret := -0.434783
							if( d_k > -9.83444 )
								if( Negative_Money_Flow_Sum <= 3.87518e+08 )
									ret := -0.605187
								if( Negative_Money_Flow_Sum > 3.87518e+08 )
									ret := -0.308219
						if( Typical_Price > 39143.3 )
							if( Raw_Money_Flow <= 4.25133e+08 )
								if( rsi1 <= 20.4676 )
									ret := -0.849498 // sell
								if( rsi1 > 20.4676 )
									ret := -0.565134
							if( Raw_Money_Flow > 4.25133e+08 )
								ret := 0.866667 // buy
					if( MFI_High > -56.5382 )
						if( Raw_Money_Flow <= 9.28523e+06 )
							if( smoothK_k <= 12.405 )
								if( Negative_Money_Flow <= 1.35102e+06 )
									ret := 0.062500
								if( Negative_Money_Flow > 1.35102e+06 )
									ret := 0.444444
							if( smoothK_k > 12.405 )
								ret := -0.454545
						if( Raw_Money_Flow > 9.28523e+06 )
							if( Positive_Money_Flow_Sum <= 3.77165e+08 )
								if( Typical_Price <= 20973.5 )
									ret := -0.368056
								if( Typical_Price > 20973.5 )
									ret := -0.804274 // sell
							if( Positive_Money_Flow_Sum > 3.77165e+08 )
								if( Negative_Money_Flow_Sum <= 2.53395e+09 )
									ret := -0.620035
								if( Negative_Money_Flow_Sum > 2.53395e+09 )
									ret := -0.106383
				if( rsi1 > 27.1446 )
					if( Raw_Money_Flow <= 8.83615e+07 )
						if( MFI_Low <= 4.77961 )
							if( rsi1 <= 33.911 )
								if( Typical_Price <= 50531.2 )
									ret := 0.064220
								if( Typical_Price > 50531.2 )
									ret := -0.469388
							if( rsi1 > 33.911 )
								if( Negative_Money_Flow_Sum <= 2.77316e+08 )
									ret := -0.281818
								if( Negative_Money_Flow_Sum > 2.77316e+08 )
									ret := 0.454545
						if( MFI_Low > 4.77961 )
							if( rsi1 <= 31.9181 )
								if( smoothD_d <= 19.7119 )
									ret := -0.417486
								if( smoothD_d > 19.7119 )
									ret := -0.649165
							if( rsi1 > 31.9181 )
								if( Positive_Money_Flow_Sum <= 5.17172e+08 )
									ret := -0.146618
								if( Positive_Money_Flow_Sum > 5.17172e+08 )
									ret := -0.709677 // sell
					if( Raw_Money_Flow > 8.83615e+07 )
						if( MFI_High <= -59.436 )
							if( Negative_Money_Flow <= 1.42955e+08 )
								if( rsi1 <= 33.8098 )
									ret := 0.204301
								if( rsi1 > 33.8098 )
									ret := 0.800000 // buy
							if( Negative_Money_Flow > 1.42955e+08 )
								if( smoothD_d <= 13.2659 )
									ret := 0.600000
								if( smoothD_d > 13.2659 )
									ret := 0.913043 // buy
						if( MFI_High > -59.436 )
							if( rsi1 <= 32.4255 )
								if( Money_Flow_Ratio <= 0.464469 )
									ret := -0.123711
								if( Money_Flow_Ratio > 0.464469 )
									ret := -0.566038
							if( rsi1 > 32.4255 )
								if( k <= 25.1753 )
									ret := 0.077098
								if( k > 25.1753 )
									ret := 0.488889
			if( MFI_Low > 18.1163 )
				if( Positive_Money_Flow_Sum <= 9.94655e+07 )
					if( Positive_Money_Flow <= 1.50429e+07 )
						if( rsi1 <= 23.7927 )
							if( Typical_Price <= 30929.4 )
								if( k <= 6.65214 )
									ret := -0.621622
								if( k > 6.65214 )
									ret := -0.142857
							if( Typical_Price > 30929.4 )
								if( Negative_Money_Flow <= 9.39146e+06 )
									ret := -0.500000
								if( Negative_Money_Flow > 9.39146e+06 )
									ret := -1.000000 // sell
						if( rsi1 > 23.7927 )
							if( Typical_Price <= 30829.4 )
								if( Negative_Money_Flow <= 2.25748e+07 )
									ret := -0.158954
								if( Negative_Money_Flow > 2.25748e+07 )
									ret := 0.576923
							if( Typical_Price > 30829.4 )
								if( Typical_Price <= 58931.1 )
									ret := -0.534161
								if( Typical_Price > 58931.1 )
									ret := -0.170732
					if( Positive_Money_Flow > 1.50429e+07 )
						if( Positive_Money_Flow <= 1.56574e+07 )
							ret := -1.000000 // sell
						if( Positive_Money_Flow > 1.56574e+07 )
							if( MFI_Low <= 31.1112 )
								if( d_k <= 2.26267 )
									ret := -0.666667
								if( d_k > 2.26267 )
									ret := -0.074074
							if( MFI_Low > 31.1112 )
								ret := -0.947368 // sell
				if( Positive_Money_Flow_Sum > 9.94655e+07 )
					if( d_k <= 0.579414 )
						if( MFI <= 51.1833 )
							if( d <= 4.35852 )
								if( Positive_Money_Flow_Sum <= 4.63987e+08 )
									ret := -0.682927
								if( Positive_Money_Flow_Sum > 4.63987e+08 )
									ret := -0.356589
							if( d > 4.35852 )
								if( Raw_Money_Flow <= 3.04598e+07 )
									ret := -0.530541
								if( Raw_Money_Flow > 3.04598e+07 )
									ret := -0.292268
						if( MFI > 51.1833 )
							if( MFI_Low <= 42.6777 )
								if( smoothD_d <= 18.2994 )
									ret := -0.532520
								if( smoothD_d > 18.2994 )
									ret := -0.820513 // sell
							if( MFI_Low > 42.6777 )
								if( Raw_Money_Flow <= 2.22678e+07 )
									ret := -0.527559
								if( Raw_Money_Flow > 2.22678e+07 )
									ret := -0.837104 // sell
					if( d_k > 0.579414 )
						if( Typical_Price <= 19964.1 )
							if( Positive_Money_Flow_Sum <= 2.80605e+08 )
								if( MFI_High <= -27.7808 )
									ret := 0.115044
								if( MFI_High > -27.7808 )
									ret := -0.550000
							if( Positive_Money_Flow_Sum > 2.80605e+08 )
								if( Typical_Price <= 17222.4 )
									ret := -0.341176
								if( Typical_Price > 17222.4 )
									ret := -0.593284
						if( Typical_Price > 19964.1 )
							if( Positive_Money_Flow_Sum <= 1.5263e+08 )
								if( Negative_Money_Flow <= 4.19838e+07 )
									ret := -0.601071
								if( Negative_Money_Flow > 4.19838e+07 )
									ret := 0.533333
							if( Positive_Money_Flow_Sum > 1.5263e+08 )
								if( Typical_Price <= 57230.4 )
									ret := -0.793936 // sell
								if( Typical_Price > 57230.4 )
									ret := -0.665818
		if( rsi1 > 40.4247 )
			if( MFI_High <= -29.4744 )
				if( Raw_Money_Flow <= 3.33872e+07 )
					if( k <= 25.2811 )
						if( Positive_Money_Flow_Sum <= 7.01445e+07 )
							if( d_k <= -9.93569 )
								ret := -0.380952
							if( d_k > -9.93569 )
								if( Typical_Price <= 24276.6 )
									ret := 0.260355
								if( Typical_Price > 24276.6 )
									ret := -0.010309
						if( Positive_Money_Flow_Sum > 7.01445e+07 )
							if( Typical_Price <= 27813.5 )
								if( Typical_Price <= 17386.9 )
									ret := -0.128571
								if( Typical_Price > 17386.9 )
									ret := 0.147541
							if( Typical_Price > 27813.5 )
								if( MFI_High <= -42.7782 )
									ret := 0.073171
								if( MFI_High > -42.7782 )
									ret := -0.253756
					if( k > 25.2811 )
						if( Raw_Money_Flow <= 1.41406e+07 )
							if( rsi1 <= 52.116 )
								if( smoothK_k <= 38.1239 )
									ret := -0.009780
								if( smoothK_k > 38.1239 )
									ret := -0.229167
							if( rsi1 > 52.116 )
								if( Typical_Price <= 24542.4 )
									ret := 0.476190
								if( Typical_Price > 24542.4 )
									ret := 0.160000
						if( Raw_Money_Flow > 1.41406e+07 )
							if( rsi1 <= 52.6497 )
								if( MFI <= 39.9209 )
									ret := 0.289931
								if( MFI > 39.9209 )
									ret := -0.082402
							if( rsi1 > 52.6497 )
								if( Typical_Price <= 18012.1 )
									ret := -0.222222
								if( Typical_Price > 18012.1 )
									ret := 0.635802
				if( Raw_Money_Flow > 3.33872e+07 )
					if( k <= 13.2035 )
						if( d_k <= -0.862326 )
							if( MFI_Low <= 12.1119 )
								ret := -0.750000 // sell
							if( MFI_Low > 12.1119 )
								if( Negative_Money_Flow <= 1.25923e+08 )
									ret := 0.038835
								if( Negative_Money_Flow > 1.25923e+08 )
									ret := 0.818182 // buy
						if( d_k > -0.862326 )
							if( Negative_Money_Flow_Sum <= 6.93063e+08 )
								if( rsi1 <= 51.3636 )
									ret := -0.246835
								if( rsi1 > 51.3636 )
									ret := 0.451613
							if( Negative_Money_Flow_Sum > 6.93063e+08 )
								if( smoothD_d <= 10.8711 )
									ret := -0.687943
								if( smoothD_d > 10.8711 )
									ret := 0.051282
					if( k > 13.2035 )
						if( MFI <= 40.2858 )
							if( MFI <= 32.0798 )
								if( d_k <= -9.05857 )
									ret := 0.787709 // buy
								if( d_k > -9.05857 )
									ret := 0.474138
							if( MFI > 32.0798 )
								if( rsi1 <= 44.5562 )
									ret := 0.174632
								if( rsi1 > 44.5562 )
									ret := 0.546529
						if( MFI > 40.2858 )
							if( d_k <= 0.890322 )
								if( d_k <= -3.48755 )
									ret := 0.444269
								if( d_k > -3.48755 )
									ret := 0.203065
							if( d_k > 0.890322 )
								if( Positive_Money_Flow <= 3.93456e+07 )
									ret := -0.082919
								if( Positive_Money_Flow > 3.93456e+07 )
									ret := -0.450667
			if( MFI_High > -29.4744 )
				if( d_k <= 3.20201 )
					if( Negative_Money_Flow_Sum <= 3.65974e+08 )
						if( MFI_High <= -21.0085 )
							if( Positive_Money_Flow <= 4.42251e+07 )
								if( Negative_Money_Flow <= 1.75297e+07 )
									ret := -0.013766
								if( Negative_Money_Flow > 1.75297e+07 )
									ret := 0.206485
							if( Positive_Money_Flow > 4.42251e+07 )
								if( MFI <= 57.4294 )
									ret := -0.645570
								if( MFI > 57.4294 )
									ret := 0.120000
						if( MFI_High > -21.0085 )
							if( rsi1 <= 60.1758 )
								if( Typical_Price <= 21321.1 )
									ret := 0.134503
								if( Typical_Price > 21321.1 )
									ret := -0.366133
							if( rsi1 > 60.1758 )
								if( rsi1 <= 74.0817 )
									ret := 0.135870
								if( rsi1 > 74.0817 )
									ret := 0.626437
					if( Negative_Money_Flow_Sum > 3.65974e+08 )
						if( Positive_Money_Flow <= 4.14099e+07 )
							if( smoothD_d <= 8.14091 )
								if( Typical_Price <= 50248 )
									ret := 0.186441
								if( Typical_Price > 50248 )
									ret := -0.311321
							if( smoothD_d > 8.14091 )
								if( rsi1 <= 52.3112 )
									ret := 0.165385
								if( rsi1 > 52.3112 )
									ret := 0.540486
						if( Positive_Money_Flow > 4.14099e+07 )
							if( MFI_High <= -6.30486 )
								if( Negative_Money_Flow_Sum <= 6.70623e+08 )
									ret := -0.305800
								if( Negative_Money_Flow_Sum > 6.70623e+08 )
									ret := 0.182143
							if( MFI_High > -6.30486 )
								if( MFI <= 80.9342 )
									ret := 0.548077
								if( MFI > 80.9342 )
									ret := -0.666667
				if( d_k > 3.20201 )
					if( rsi1 <= 60.8566 )
						if( Positive_Money_Flow <= 1.99268e+07 )
							if( Positive_Money_Flow_Sum <= 3.75212e+08 )
								if( MFI <= 63.2791 )
									ret := -0.048797
								if( MFI > 63.2791 )
									ret := -0.308325
							if( Positive_Money_Flow_Sum > 3.75212e+08 )
								if( d_k <= 8.24459 )
									ret := -0.269646
								if( d_k > 8.24459 )
									ret := -0.561362
						if( Positive_Money_Flow > 1.99268e+07 )
							if( Positive_Money_Flow <= 1.03664e+08 )
								if( rsi1 <= 51.0554 )
									ret := -0.662437
								if( rsi1 > 51.0554 )
									ret := -0.439542
							if( Positive_Money_Flow > 1.03664e+08 )
								if( MFI_Low <= 45.9538 )
									ret := -0.632576
								if( MFI_Low > 45.9538 )
									ret := -0.918736 // sell
					if( rsi1 > 60.8566 )
						if( Positive_Money_Flow <= 5.58072e+07 )
							if( Positive_Money_Flow_Sum <= 6.34553e+08 )
								if( rsi1 <= 72.1734 )
									ret := 0.093897
								if( rsi1 > 72.1734 )
									ret := 0.459459
							if( Positive_Money_Flow_Sum > 6.34553e+08 )
								if( rsi1 <= 75.2325 )
									ret := 0.251923
								if( rsi1 > 75.2325 )
									ret := 0.805556 // buy
						if( Positive_Money_Flow > 5.58072e+07 )
							if( rsi1 <= 75.4554 )
								if( MFI_Low <= 52.971 )
									ret := -0.144681
								if( MFI_Low > 52.971 )
									ret := -0.605178
							if( rsi1 > 75.4554 )
								if( Negative_Money_Flow_Sum <= 2.8951e+08 )
									ret := 0.126984
								if( Negative_Money_Flow_Sum > 2.8951e+08 )
									ret := 0.767442 // buy
	if( k > 48.9515 )
		if( rsi1 <= 57.0324 )
			if( Money_Flow_Ratio <= 0.78487 )
				if( d <= 61.2366 )
					if( Raw_Money_Flow <= 1.75597e+07 )
						if( rsi1 <= 47.5625 )
							if( Positive_Money_Flow_Sum <= 2.04145e+08 )
								if( Positive_Money_Flow_Sum <= 1.63086e+08 )
									ret := -0.172535
								if( Positive_Money_Flow_Sum > 1.63086e+08 )
									ret := 0.526316
							if( Positive_Money_Flow_Sum > 2.04145e+08 )
								ret := -0.947368 // sell
						if( rsi1 > 47.5625 )
							if( d_k <= -9.8629 )
								if( Money_Flow_Ratio <= 0.667664 )
									ret := 0.200000
								if( Money_Flow_Ratio > 0.667664 )
									ret := -0.102564
							if( d_k > -9.8629 )
								if( Raw_Money_Flow <= 1.07566e+07 )
									ret := 0.230769
								if( Raw_Money_Flow > 1.07566e+07 )
									ret := 0.461538
					if( Raw_Money_Flow > 1.75597e+07 )
						if( Raw_Money_Flow <= 1.18502e+08 )
							if( d <= 44.9027 )
								if( Negative_Money_Flow <= 4.25291e+07 )
									ret := 0.358513
								if( Negative_Money_Flow > 4.25291e+07 )
									ret := 0.578341
							if( d > 44.9027 )
								if( Negative_Money_Flow <= 4.10553e+07 )
									ret := 0.214173
								if( Negative_Money_Flow > 4.10553e+07 )
									ret := 0.402985
						if( Raw_Money_Flow > 1.18502e+08 )
							if( smoothK_k <= 57.044 )
								if( smoothD_d <= 51.8531 )
									ret := 0.511166
								if( smoothD_d > 51.8531 )
									ret := -0.661017
							if( smoothK_k > 57.044 )
								if( Positive_Money_Flow_Sum <= 1.32406e+09 )
									ret := 0.808962 // buy
								if( Positive_Money_Flow_Sum > 1.32406e+09 )
									ret := 0.111111
				if( d > 61.2366 )
					if( smoothK_k <= 68.8672 )
						if( d_k <= 1.34902 )
							if( rsi1 <= 45.5173 )
								if( MFI_High <= -37.6725 )
									ret := -0.296000
								if( MFI_High > -37.6725 )
									ret := 0.916667 // buy
							if( rsi1 > 45.5173 )
								if( MFI_High <= -46.6212 )
									ret := 0.869565 // buy
								if( MFI_High > -46.6212 )
									ret := 0.311688
						if( d_k > 1.34902 )
							if( Raw_Money_Flow <= 1.10625e+08 )
								if( Raw_Money_Flow <= 2.30477e+07 )
									ret := -0.056604
								if( Raw_Money_Flow > 2.30477e+07 )
									ret := -0.270156
							if( Raw_Money_Flow > 1.10625e+08 )
								if( Negative_Money_Flow_Sum <= 9.86805e+08 )
									ret := -0.045455
								if( Negative_Money_Flow_Sum > 9.86805e+08 )
									ret := -0.743119 // sell
					if( smoothK_k > 68.8672 )
						if( d <= 78.1529 )
							if( d_k <= -8.50401 )
								if( Raw_Money_Flow <= 2.15838e+07 )
									ret := 0.167247
								if( Raw_Money_Flow > 2.15838e+07 )
									ret := 0.541571
							if( d_k > -8.50401 )
								if( Money_Flow_Ratio <= 0.370522 )
									ret := 0.406061
								if( Money_Flow_Ratio > 0.370522 )
									ret := 0.177469
						if( d > 78.1529 )
							if( k <= 86.5634 )
								if( Negative_Money_Flow_Sum <= 1.08098e+09 )
									ret := -0.044543
								if( Negative_Money_Flow_Sum > 1.08098e+09 )
									ret := -0.507752
							if( k > 86.5634 )
								if( Negative_Money_Flow <= 9.47872e+07 )
									ret := 0.135927
								if( Negative_Money_Flow > 9.47872e+07 )
									ret := 0.616858
			if( Money_Flow_Ratio > 0.78487 )
				if( smoothK_k <= 71.1599 )
					if( rsi1 <= 46.9551 )
						if( Positive_Money_Flow_Sum <= 2.09705e+08 )
							if( Negative_Money_Flow <= 4.10853e+07 )
								if( Positive_Money_Flow <= 1.03401e+07 )
									ret := -0.155738
								if( Positive_Money_Flow > 1.03401e+07 )
									ret := -0.423913
							if( Negative_Money_Flow > 4.10853e+07 )
								ret := 0.500000
						if( Positive_Money_Flow_Sum > 2.09705e+08 )
							if( k <= 63.5582 )
								if( Typical_Price <= 19544.5 )
									ret := -0.098901
								if( Typical_Price > 19544.5 )
									ret := -0.717241 // sell
							if( k > 63.5582 )
								if( d_k <= -2.02809 )
									ret := -0.136752
								if( d_k > -2.02809 )
									ret := -0.580311
					if( rsi1 > 46.9551 )
						if( d <= 59.8315 )
							if( MFI_High <= -29.4973 )
								if( Raw_Money_Flow <= 2.80521e+07 )
									ret := 0.193133
								if( Raw_Money_Flow > 2.80521e+07 )
									ret := 0.493506
							if( MFI_High > -29.4973 )
								if( MFI <= 63.4468 )
									ret := 0.083230
								if( MFI > 63.4468 )
									ret := -0.375000
						if( d > 59.8315 )
							if( Positive_Money_Flow_Sum <= 2.49084e+08 )
								if( Positive_Money_Flow <= 3.23136e+07 )
									ret := 0.025543
								if( Positive_Money_Flow > 3.23136e+07 )
									ret := -0.512195
							if( Positive_Money_Flow_Sum > 2.49084e+08 )
								if( MFI_High <= -20.125 )
									ret := -0.289168
								if( MFI_High > -20.125 )
									ret := -0.615566
				if( smoothK_k > 71.1599 )
					if( k <= 85.0939 )
						if( d_k <= -0.199176 )
							if( Raw_Money_Flow <= 7.19884e+07 )
								if( Typical_Price <= 56063.9 )
									ret := 0.269316
								if( Typical_Price > 56063.9 )
									ret := -0.068966
							if( Raw_Money_Flow > 7.19884e+07 )
								if( smoothD_d <= 64.0273 )
									ret := 0.645161
								if( smoothD_d > 64.0273 )
									ret := -0.255639
						if( d_k > -0.199176 )
							if( Raw_Money_Flow <= 3.8855e+07 )
								if( Negative_Money_Flow_Sum <= 3.87712e+08 )
									ret := 0.014523
								if( Negative_Money_Flow_Sum > 3.87712e+08 )
									ret := -0.447368
							if( Raw_Money_Flow > 3.8855e+07 )
								if( Positive_Money_Flow_Sum <= 2.94868e+08 )
									ret := -0.018519
								if( Positive_Money_Flow_Sum > 2.94868e+08 )
									ret := -0.481081
					if( k > 85.0939 )
						if( d <= 90.8557 )
							if( Typical_Price <= 41568.8 )
								if( Typical_Price <= 41056.3 )
									ret := 0.185958
								if( Typical_Price > 41056.3 )
									ret := -0.800000 // sell
							if( Typical_Price > 41568.8 )
								if( Negative_Money_Flow_Sum <= 7.83666e+08 )
									ret := 0.437247
								if( Negative_Money_Flow_Sum > 7.83666e+08 )
									ret := -0.400000
						if( d > 90.8557 )
							if( rsi1 <= 50.2741 )
								if( Negative_Money_Flow_Sum <= 3.59146e+08 )
									ret := 0.093750
								if( Negative_Money_Flow_Sum > 3.59146e+08 )
									ret := -0.539130
							if( rsi1 > 50.2741 )
								if( k <= 92.1218 )
									ret := -0.069652
								if( k > 92.1218 )
									ret := 0.208333
		if( rsi1 > 57.0324 )
			if( d_k <= 3.24614 )
				if( Raw_Money_Flow <= 1.23834e+07 )
					if( Raw_Money_Flow <= 6.18187e+06 )
						if( MFI <= 64.8708 )
							if( MFI_High <= -22.0735 )
								if( d_k <= 2.53279 )
									ret := 0.015000
								if( d_k > 2.53279 )
									ret := 0.400000
							if( MFI_High > -22.0735 )
								if( rsi1 <= 61.124 )
									ret := 0.529412
								if( rsi1 > 61.124 )
									ret := 0.000000
						if( MFI > 64.8708 )
							if( Raw_Money_Flow <= 5.31287e+06 )
								if( Positive_Money_Flow <= 3.60111e+06 )
									ret := 0.222222
								if( Positive_Money_Flow > 3.60111e+06 )
									ret := -0.045455
							if( Raw_Money_Flow > 5.31287e+06 )
								if( d_k <= -3.60199 )
									ret := -0.250000
								if( d_k > -3.60199 )
									ret := -0.705882 // sell
					if( Raw_Money_Flow > 6.18187e+06 )
						if( Typical_Price <= 16532.4 )
							if( Money_Flow_Ratio <= 4.68882 )
								if( Negative_Money_Flow_Sum <= 6.83509e+07 )
									ret := -0.055249
								if( Negative_Money_Flow_Sum > 6.83509e+07 )
									ret := -0.269231
							if( Money_Flow_Ratio > 4.68882 )
								ret := 0.642857
						if( Typical_Price > 16532.4 )
							if( Money_Flow_Ratio <= 4.39037 )
								if( MFI <= 31.981 )
									ret := 0.544118
								if( MFI > 31.981 )
									ret := 0.306738
							if( Money_Flow_Ratio > 4.39037 )
								ret := 1.000000 // buy
				if( Raw_Money_Flow > 1.23834e+07 )
					if( rsi1 <= 74.1087 )
						if( Negative_Money_Flow <= 1.91922e+07 )
							if( MFI_Low <= 46.2019 )
								if( smoothD_d <= 72.6016 )
									ret := 0.620766
								if( smoothD_d > 72.6016 )
									ret := 0.433009
							if( MFI_Low > 46.2019 )
								if( MFI <= 79.9476 )
									ret := 0.227273
								if( MFI > 79.9476 )
									ret := -0.296296
						if( Negative_Money_Flow > 1.91922e+07 )
							if( d <= 83.7723 )
								if( Money_Flow_Ratio <= 0.873421 )
									ret := 0.856895 // buy
								if( Money_Flow_Ratio > 0.873421 )
									ret := 0.653652
							if( d > 83.7723 )
								if( MFI <= 74.0735 )
									ret := 0.566688
								if( MFI > 74.0735 )
									ret := 0.051724
					if( rsi1 > 74.1087 )
						if( MFI <= 73.0347 )
							if( Positive_Money_Flow_Sum <= 1.0697e+08 )
								if( Typical_Price <= 29070 )
									ret := 0.772727 // buy
								if( Typical_Price > 29070 )
									ret := 0.276596
							if( Positive_Money_Flow_Sum > 1.0697e+08 )
								if( Positive_Money_Flow_Sum <= 9.81158e+08 )
									ret := 0.822959 // buy
								if( Positive_Money_Flow_Sum > 9.81158e+08 )
									ret := 0.679144
						if( MFI > 73.0347 )
							if( MFI <= 87.7436 )
								if( rsi1 <= 78.9322 )
									ret := 0.524072
								if( rsi1 > 78.9322 )
									ret := 0.728155 // buy
							if( MFI > 87.7436 )
								if( smoothK_k <= 88.6654 )
									ret := 0.038095
								if( smoothK_k > 88.6654 )
									ret := 0.619403
			if( d_k > 3.24614 )
				if( rsi1 <= 70.7527 )
					if( MFI_Low <= 46.8181 )
						if( Positive_Money_Flow <= 1.0166e+08 )
							if( rsi1 <= 61.0011 )
								if( MFI_Low <= 37.5147 )
									ret := 0.254777
								if( MFI_Low > 37.5147 )
									ret := -0.116854
							if( rsi1 > 61.0011 )
								if( MFI <= 49.3179 )
									ret := 0.606667
								if( MFI > 49.3179 )
									ret := 0.375220
						if( Positive_Money_Flow > 1.0166e+08 )
							if( smoothD_d <= 83.4197 )
								if( Typical_Price <= 51689.2 )
									ret := -0.776596 // sell
								if( Typical_Price > 51689.2 )
									ret := -0.296296
							if( smoothD_d > 83.4197 )
								if( MFI_Low <= 41.7412 )
									ret := -0.478261
								if( MFI_Low > 41.7412 )
									ret := 0.428571
					if( MFI_Low > 46.8181 )
						if( MFI <= 78.6027 )
							if( d <= 93.9483 )
								if( Negative_Money_Flow <= 156629 )
									ret := -0.279307
								if( Negative_Money_Flow > 156629 )
									ret := 0.044014
							if( d > 93.9483 )
								if( Raw_Money_Flow <= 5.93227e+07 )
									ret := 0.491228
								if( Raw_Money_Flow > 5.93227e+07 )
									ret := -0.166667
						if( MFI > 78.6027 )
							if( Positive_Money_Flow_Sum <= 2.40737e+08 )
								if( rsi1 <= 65.5592 )
									ret := -0.333333
								if( rsi1 > 65.5592 )
									ret := 0.428571
							if( Positive_Money_Flow_Sum > 2.40737e+08 )
								if( d_k <= 7.68127 )
									ret := -0.312500
								if( d_k > 7.68127 )
									ret := -0.685393
				if( rsi1 > 70.7527 )
					if( Positive_Money_Flow_Sum <= 6.25618e+08 )
						if( Money_Flow_Ratio <= 5.32208 )
							if( Raw_Money_Flow <= 1.0761e+07 )
								if( d_k <= 8.67471 )
									ret := 0.642857
								if( d_k > 8.67471 )
									ret := -0.391304
							if( Raw_Money_Flow > 1.0761e+07 )
								if( Typical_Price <= 20455.7 )
									ret := 0.182692
								if( Typical_Price > 20455.7 )
									ret := 0.748657 // buy
						if( Money_Flow_Ratio > 5.32208 )
							if( MFI <= 90.3984 )
								if( MFI_High <= 9.03594 )
									ret := 0.118182
								if( MFI_High > 9.03594 )
									ret := 0.692308
							if( MFI > 90.3984 )
								if( smoothD_d <= 81.0143 )
									ret := -0.714286 // sell
								if( smoothD_d > 81.0143 )
									ret := -0.400000
					if( Positive_Money_Flow_Sum > 6.25618e+08 )
						if( smoothD_d <= 90.7879 )
							if( Positive_Money_Flow <= 5.80545e+07 )
								if( Positive_Money_Flow_Sum <= 7.52896e+08 )
									ret := -0.050847
								if( Positive_Money_Flow_Sum > 7.52896e+08 )
									ret := 0.442408
							if( Positive_Money_Flow > 5.80545e+07 )
								if( rsi1 <= 82.7631 )
									ret := -0.171815
								if( rsi1 > 82.7631 )
									ret := 0.552381
						if( smoothD_d > 90.7879 )
							if( Negative_Money_Flow <= 4.69752e+07 )
								if( d <= 94.1804 )
									ret := 0.947368 // buy
								if( d > 94.1804 )
									ret := 0.628788
							if( Negative_Money_Flow > 4.69752e+07 )
								if( Money_Flow_Ratio <= 3.5876 )
									ret := -0.111111
								if( Money_Flow_Ratio > 3.5876 )
									ret := 0.214286
	
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
float op_operation = decision_tree_0_BTCUSDT_30Min_1e5a105c(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


