//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: RIVN_1Min_2MS0_aef1a57f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RIVN_1Min_2MS0_aef1a57f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RIVN_1Min_aef1a57f(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Negative_Money_Flow <= 355.721 )
		if( Negative_Money_Flow_Sum <= 865182 )
			if( smoothK_k <= 26.9035 )
				if( rsi1 <= 46.3026 )
					if( d <= 27.6761 )
						if( Negative_Money_Flow_Sum <= 97527.6 )
							if( rsi1 <= 33.2515 )
								if( smoothD_d <= 9.64316 )
									ret := -0.562500
								if( smoothD_d > 9.64316 )
									ret := 0.120000
							if( rsi1 > 33.2515 )
								if( smoothK_k <= 3.0319 )
									ret := 0.209150
								if( smoothK_k > 3.0319 )
									ret := -0.107143
						if( Negative_Money_Flow_Sum > 97527.6 )
							if( MFI <= 27.5135 )
								if( MFI_Low <= 0.870252 )
									ret := 0.061080
								if( MFI_Low > 0.870252 )
									ret := -0.201863
							if( MFI > 27.5135 )
								if( Raw_Money_Flow <= 692725 )
									ret := 0.133715
								if( Raw_Money_Flow > 692725 )
									ret := 0.793103 // buy
					if( d > 27.6761 )
						if( d <= 47.5724 )
							if( d_k <= 11.6846 )
								if( Negative_Money_Flow_Sum <= 286614 )
									ret := 0.453333
								if( Negative_Money_Flow_Sum > 286614 )
									ret := -0.066667
							if( d_k > 11.6846 )
								if( Raw_Money_Flow <= 1947.34 )
									ret := -0.370370
								if( Raw_Money_Flow > 1947.34 )
									ret := 0.199187
						if( d > 47.5724 )
							if( Typical_Price <= 13.3231 )
								if( Money_Flow_Ratio <= 0.537945 )
									ret := -0.722222 // sell
								if( Money_Flow_Ratio > 0.537945 )
									ret := -0.166667
							if( Typical_Price > 13.3231 )
								ret := 0.555556
				if( rsi1 > 46.3026 )
					if( MFI_High <= -56.7814 )
						if( Typical_Price <= 8.86091 )
							ret := 0.000000
						if( Typical_Price > 8.86091 )
							if( Negative_Money_Flow_Sum <= 120575 )
								if( d_k <= -3.42212 )
									ret := -0.500000
								if( d_k > -3.42212 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 120575 )
								if( rsi1 <= 49.9926 )
									ret := -0.789474 // sell
								if( rsi1 > 49.9926 )
									ret := -0.505747
					if( MFI_High > -56.7814 )
						if( Negative_Money_Flow <= 10.6171 )
							if( d_k <= -8.73364 )
								if( MFI_High <= -13.4242 )
									ret := 0.180645
								if( MFI_High > -13.4242 )
									ret := -0.104478
							if( d_k > -8.73364 )
								if( Negative_Money_Flow_Sum <= 22422.7 )
									ret := -0.364583
								if( Negative_Money_Flow_Sum > 22422.7 )
									ret := -0.098817
						if( Negative_Money_Flow > 10.6171 )
							if( Negative_Money_Flow <= 222.216 )
								ret := 0.882353 // buy
							if( Negative_Money_Flow > 222.216 )
								ret := -0.111111
			if( smoothK_k > 26.9035 )
				if( rsi1 <= 46.4208 )
					if( smoothD_d <= 28.6831 )
						if( Positive_Money_Flow <= 36323 )
							if( MFI_Low <= -10.2327 )
								ret := -0.850000 // sell
							if( MFI_Low > -10.2327 )
								if( Positive_Money_Flow <= 1039.23 )
									ret := 0.076923
								if( Positive_Money_Flow > 1039.23 )
									ret := -0.218009
						if( Positive_Money_Flow > 36323 )
							if( rsi1 <= 41.0297 )
								if( d_k <= -12.3176 )
									ret := 0.000000
								if( d_k > -12.3176 )
									ret := -0.636364
							if( rsi1 > 41.0297 )
								if( Typical_Price <= 10.2567 )
									ret := 0.950000 // buy
								if( Typical_Price > 10.2567 )
									ret := 0.181818
					if( smoothD_d > 28.6831 )
						if( Raw_Money_Flow <= 34186.4 )
							if( Negative_Money_Flow_Sum <= 529107 )
								if( Typical_Price <= 11.8774 )
									ret := 0.021384
								if( Typical_Price > 11.8774 )
									ret := 0.226551
							if( Negative_Money_Flow_Sum > 529107 )
								if( Positive_Money_Flow_Sum <= 112063 )
									ret := 0.050000
								if( Positive_Money_Flow_Sum > 112063 )
									ret := -0.520000
						if( Raw_Money_Flow > 34186.4 )
							if( d <= 71.7722 )
								if( d <= 39.6871 )
									ret := 0.610390
								if( d > 39.6871 )
									ret := 0.310219
							if( d > 71.7722 )
								if( MFI_High <= -1.1527 )
									ret := -0.147059
								if( MFI_High > -1.1527 )
									ret := 0.600000
				if( rsi1 > 46.4208 )
					if( Positive_Money_Flow_Sum <= 1.61131e+07 )
						if( rsi1 <= 51.6849 )
							if( Money_Flow_Ratio <= 0.597883 )
								if( k <= 65.0751 )
									ret := -0.308715
								if( k > 65.0751 )
									ret := -0.021807
							if( Money_Flow_Ratio > 0.597883 )
								if( d <= 68.4449 )
									ret := -0.043414
								if( d > 68.4449 )
									ret := 0.106762
						if( rsi1 > 51.6849 )
							if( MFI_High <= -54.9937 )
								if( MFI_High <= -65.3148 )
									ret := -0.110390
								if( MFI_High > -65.3148 )
									ret := -0.422989
							if( MFI_High > -54.9937 )
								if( MFI_High <= -15.745 )
									ret := -0.122417
								if( MFI_High > -15.745 )
									ret := -0.214071
					if( Positive_Money_Flow_Sum > 1.61131e+07 )
						if( smoothD_d <= 95.5801 )
							if( Negative_Money_Flow_Sum <= 173072 )
								ret := -0.266667
							if( Negative_Money_Flow_Sum > 173072 )
								if( smoothK_k <= 65.5677 )
									ret := 0.384615
								if( smoothK_k > 65.5677 )
									ret := 0.865672 // buy
						if( smoothD_d > 95.5801 )
							ret := -0.250000
		if( Negative_Money_Flow_Sum > 865182 )
			if( Negative_Money_Flow_Sum <= 3.93553e+07 )
				if( rsi1 <= 93.4612 )
					if( MFI <= 43.1317 )
						if( smoothK_k <= 22.4357 )
							if( Typical_Price <= 10.1752 )
								if( d_k <= -8.26654 )
									ret := -0.555556
								if( d_k > -8.26654 )
									ret := 0.098925
							if( Typical_Price > 10.1752 )
								if( k <= 0.011223 )
									ret := 0.096774
								if( k > 0.011223 )
									ret := -0.164210
						if( smoothK_k > 22.4357 )
							if( Negative_Money_Flow_Sum <= 3.85637e+07 )
								if( Positive_Money_Flow_Sum <= 2.09084e+07 )
									ret := -0.017844
								if( Positive_Money_Flow_Sum > 2.09084e+07 )
									ret := 0.741379 // buy
							if( Negative_Money_Flow_Sum > 3.85637e+07 )
								if( smoothD_d <= 47.2543 )
									ret := -1.000000 // sell
								if( smoothD_d > 47.2543 )
									ret := -0.727273 // sell
					if( MFI > 43.1317 )
						if( Raw_Money_Flow <= 1.33895e+06 )
							if( MFI_High <= -9.27801 )
								if( MFI_High <= -15.2219 )
									ret := 0.025909
								if( MFI_High > -15.2219 )
									ret := -0.122896
							if( MFI_High > -9.27801 )
								if( Money_Flow_Ratio <= 2.83974 )
									ret := 0.282129
								if( Money_Flow_Ratio > 2.83974 )
									ret := 0.033843
						if( Raw_Money_Flow > 1.33895e+06 )
							if( rsi1 <= 44.3484 )
								if( Raw_Money_Flow <= 2.1714e+06 )
									ret := 0.056291
								if( Raw_Money_Flow > 2.1714e+06 )
									ret := 0.573585
							if( rsi1 > 44.3484 )
								if( Negative_Money_Flow_Sum <= 9.11077e+06 )
									ret := -0.173027
								if( Negative_Money_Flow_Sum > 9.11077e+06 )
									ret := -0.044145
				if( rsi1 > 93.4612 )
					if( Typical_Price <= 14.5729 )
						if( MFI <= 92.3446 )
							if( Negative_Money_Flow_Sum <= 3.20422e+06 )
								ret := 0.153846
							if( Negative_Money_Flow_Sum > 3.20422e+06 )
								ret := 1.000000 // buy
						if( MFI > 92.3446 )
							ret := 1.000000 // buy
					if( Typical_Price > 14.5729 )
						ret := 0.238095
			if( Negative_Money_Flow_Sum > 3.93553e+07 )
				if( MFI_Low <= 3.00887 )
					if( smoothD_d <= 77.3429 )
						if( Positive_Money_Flow <= 7.74207e+06 )
							if( d_k <= -19.7249 )
								ret := -0.947368 // sell
							if( d_k > -19.7249 )
								if( Positive_Money_Flow_Sum <= 1.14125e+07 )
									ret := 0.188679
								if( Positive_Money_Flow_Sum > 1.14125e+07 )
									ret := -0.551020
						if( Positive_Money_Flow > 7.74207e+06 )
							ret := 0.636364
					if( smoothD_d > 77.3429 )
						ret := 0.750000 // buy
				if( MFI_Low > 3.00887 )
					if( rsi1 <= 46.9833 )
						if( smoothD_d <= 21.0245 )
							if( Money_Flow_Ratio <= 0.385788 )
								if( MFI_Low <= 4.62235 )
									ret := 0.642857
								if( MFI_Low > 4.62235 )
									ret := 0.979167 // buy
							if( Money_Flow_Ratio > 0.385788 )
								if( d_k <= -8.31739 )
									ret := -0.200000
								if( d_k > -8.31739 )
									ret := 0.347222
						if( smoothD_d > 21.0245 )
							if( Negative_Money_Flow_Sum <= 4.49695e+07 )
								if( Money_Flow_Ratio <= 0.591732 )
									ret := 0.944444 // buy
								if( Money_Flow_Ratio > 0.591732 )
									ret := 0.100000
							if( Negative_Money_Flow_Sum > 4.49695e+07 )
								if( Negative_Money_Flow_Sum <= 5.78456e+07 )
									ret := -0.630769
								if( Negative_Money_Flow_Sum > 5.78456e+07 )
									ret := 0.050847
					if( rsi1 > 46.9833 )
						if( Positive_Money_Flow_Sum <= 9.07473e+07 )
							if( Typical_Price <= 15.3677 )
								if( k <= 34.5408 )
									ret := 0.666667
								if( k > 34.5408 )
									ret := 0.923077 // buy
							if( Typical_Price > 15.3677 )
								if( MFI_High <= -29.9484 )
									ret := -0.111111
								if( MFI_High > -29.9484 )
									ret := 0.674157
						if( Positive_Money_Flow_Sum > 9.07473e+07 )
							if( Positive_Money_Flow <= 2.80341e+07 )
								ret := -0.764706 // sell
							if( Positive_Money_Flow > 2.80341e+07 )
								ret := 0.111111
	if( Negative_Money_Flow > 355.721 )
		if( Positive_Money_Flow_Sum <= 171062 )
			if( smoothK_k <= 78.3274 )
				if( Money_Flow_Ratio <= 1.1772 )
					if( Raw_Money_Flow <= 4.54899e+06 )
						if( Positive_Money_Flow_Sum <= 23746.7 )
							if( d <= 6.27994 )
								if( Money_Flow_Ratio <= 0.016368 )
									ret := 0.727273 // buy
								if( Money_Flow_Ratio > 0.016368 )
									ret := 0.235294
							if( d > 6.27994 )
								if( Negative_Money_Flow_Sum <= 320615 )
									ret := 0.070070
								if( Negative_Money_Flow_Sum > 320615 )
									ret := -0.400000
						if( Positive_Money_Flow_Sum > 23746.7 )
							if( Negative_Money_Flow_Sum <= 4.267e+06 )
								if( Typical_Price <= 10.3426 )
									ret := 0.325515
								if( Typical_Price > 10.3426 )
									ret := 0.158522
							if( Negative_Money_Flow_Sum > 4.267e+06 )
								if( Money_Flow_Ratio <= 0.007233 )
									ret := 0.357143
								if( Money_Flow_Ratio > 0.007233 )
									ret := -0.558140
					if( Raw_Money_Flow > 4.54899e+06 )
						if( Typical_Price <= 11.897 )
							if( Money_Flow_Ratio <= 0.016018 )
								ret := -0.833333 // sell
							if( Money_Flow_Ratio > 0.016018 )
								ret := -0.714286 // sell
						if( Typical_Price > 11.897 )
							ret := -1.000000 // sell
				if( Money_Flow_Ratio > 1.1772 )
					if( Negative_Money_Flow <= 5249.72 )
						if( rsi1 <= 52.3565 )
							if( smoothK_k <= 61.7439 )
								if( smoothD_d <= 12.2666 )
									ret := 0.324324
								if( smoothD_d > 12.2666 )
									ret := 0.681382
							if( smoothK_k > 61.7439 )
								if( Typical_Price <= 10.1854 )
									ret := 0.666667
								if( Typical_Price > 10.1854 )
									ret := 0.138462
						if( rsi1 > 52.3565 )
							if( d_k <= -0.820433 )
								if( Typical_Price <= 9.88772 )
									ret := -0.545455
								if( Typical_Price > 9.88772 )
									ret := 0.009259
							if( d_k > -0.820433 )
								if( Typical_Price <= 13.1243 )
									ret := 0.430168
								if( Typical_Price > 13.1243 )
									ret := 0.016667
					if( Negative_Money_Flow > 5249.72 )
						if( MFI_Low <= 36.6484 )
							if( d_k <= -7.14782 )
								ret := -0.190476
							if( d_k > -7.14782 )
								if( Typical_Price <= 11.5918 )
									ret := 0.396825
								if( Typical_Price > 11.5918 )
									ret := 0.800000 // buy
						if( MFI_Low > 36.6484 )
							if( Positive_Money_Flow_Sum <= 94180.8 )
								if( MFI_High <= -22.3047 )
									ret := -0.103448
								if( MFI_High > -22.3047 )
									ret := 0.442231
							if( Positive_Money_Flow_Sum > 94180.8 )
								if( Raw_Money_Flow <= 49750.6 )
									ret := 0.123389
								if( Raw_Money_Flow > 49750.6 )
									ret := -0.818182 // sell
			if( smoothK_k > 78.3274 )
				if( Negative_Money_Flow <= 11849.9 )
					if( k <= 84.3021 )
						if( Positive_Money_Flow <= 220.389 )
							if( Negative_Money_Flow_Sum <= 68825.4 )
								if( rsi1 <= 65.0143 )
									ret := 0.238806
								if( rsi1 > 65.0143 )
									ret := -0.285714
							if( Negative_Money_Flow_Sum > 68825.4 )
								if( d <= 74.4457 )
									ret := 0.100000
								if( d > 74.4457 )
									ret := 0.603774
						if( Positive_Money_Flow > 220.389 )
							ret := -0.473684
					if( k > 84.3021 )
						if( Positive_Money_Flow <= 1725.28 )
							if( Negative_Money_Flow_Sum <= 133377 )
								if( rsi1 <= 79.4737 )
									ret := 0.047745
								if( rsi1 > 79.4737 )
									ret := -0.857143 // sell
							if( Negative_Money_Flow_Sum > 133377 )
								if( MFI <= 29.7512 )
									ret := -0.164179
								if( MFI > 29.7512 )
									ret := -0.375000
						if( Positive_Money_Flow > 1725.28 )
							if( MFI_Low <= 31.8499 )
								if( d <= 86.9038 )
									ret := 0.272727
								if( d > 86.9038 )
									ret := 1.000000 // buy
							if( MFI_Low > 31.8499 )
								ret := -0.230769
				if( Negative_Money_Flow > 11849.9 )
					if( Negative_Money_Flow <= 392793 )
						if( Typical_Price <= 10.9705 )
							if( Money_Flow_Ratio <= 0.208639 )
								if( MFI_High <= -65.6883 )
									ret := -0.444444
								if( MFI_High > -65.6883 )
									ret := -0.956522 // sell
							if( Money_Flow_Ratio > 0.208639 )
								if( MFI <= 50.8265 )
									ret := 0.048193
								if( MFI > 50.8265 )
									ret := -0.325000
						if( Typical_Price > 10.9705 )
							if( MFI_Low <= 46.1213 )
								if( MFI_High <= -26.245 )
									ret := -0.068702
								if( MFI_High > -26.245 )
									ret := 0.390244
							if( MFI_Low > 46.1213 )
								if( d <= 84.3059 )
									ret := -0.928571 // sell
								if( d > 84.3059 )
									ret := -0.153846
					if( Negative_Money_Flow > 392793 )
						ret := 0.642857
		if( Positive_Money_Flow_Sum > 171062 )
			if( Negative_Money_Flow_Sum <= 3.23761e+07 )
				if( rsi1 <= 54.0026 )
					if( Raw_Money_Flow <= 57626.3 )
						if( MFI_High <= 9.64887 )
							if( k <= 89.4491 )
								if( Negative_Money_Flow <= 1037.67 )
									ret := -0.333333
								if( Negative_Money_Flow > 1037.67 )
									ret := 0.153981
							if( k > 89.4491 )
								if( smoothD_d <= 83.8734 )
									ret := -0.500000
								if( smoothD_d > 83.8734 )
									ret := -0.093023
						if( MFI_High > 9.64887 )
							if( d_k <= -3.59009 )
								if( Negative_Money_Flow_Sum <= 62927.2 )
									ret := 0.926829 // buy
								if( Negative_Money_Flow_Sum > 62927.2 )
									ret := 0.615385
							if( d_k > -3.59009 )
								if( MFI_Low <= 70.4172 )
									ret := 0.684211
								if( MFI_Low > 70.4172 )
									ret := 0.335821
					if( Raw_Money_Flow > 57626.3 )
						if( d_k <= 3.3464 )
							if( MFI <= 31.0938 )
								if( Positive_Money_Flow_Sum <= 1.06568e+07 )
									ret := -0.054190
								if( Positive_Money_Flow_Sum > 1.06568e+07 )
									ret := 0.532609
							if( MFI > 31.0938 )
								if( Positive_Money_Flow_Sum <= 2.55937e+07 )
									ret := 0.036699
								if( Positive_Money_Flow_Sum > 2.55937e+07 )
									ret := 0.543689
						if( d_k > 3.3464 )
							if( Raw_Money_Flow <= 145373 )
								if( Negative_Money_Flow <= 110735 )
									ret := 0.121511
								if( Negative_Money_Flow > 110735 )
									ret := 0.383562
							if( Raw_Money_Flow > 145373 )
								if( smoothK_k <= 56.9249 )
									ret := 0.090823
								if( smoothK_k > 56.9249 )
									ret := -0.016779
				if( rsi1 > 54.0026 )
					if( Positive_Money_Flow_Sum <= 2.3651e+06 )
						if( rsi1 <= 57.1513 )
							if( Negative_Money_Flow_Sum <= 165372 )
								if( MFI <= 57.2558 )
									ret := -0.533333
								if( MFI > 57.2558 )
									ret := 0.236434
							if( Negative_Money_Flow_Sum > 165372 )
								if( Negative_Money_Flow <= 17138.2 )
									ret := -0.345455
								if( Negative_Money_Flow > 17138.2 )
									ret := -0.019920
						if( rsi1 > 57.1513 )
							if( Positive_Money_Flow_Sum <= 734526 )
								if( MFI_Low <= 61.5113 )
									ret := -0.049815
								if( MFI_Low > 61.5113 )
									ret := -0.288660
							if( Positive_Money_Flow_Sum > 734526 )
								if( Raw_Money_Flow <= 107418 )
									ret := -0.403756
								if( Raw_Money_Flow > 107418 )
									ret := -0.167033
					if( Positive_Money_Flow_Sum > 2.3651e+06 )
						if( d <= 13.1474 )
							if( Positive_Money_Flow <= 6521.85 )
								if( Negative_Money_Flow_Sum <= 3.89539e+06 )
									ret := -0.191011
								if( Negative_Money_Flow_Sum > 3.89539e+06 )
									ret := 0.373391
							if( Positive_Money_Flow > 6521.85 )
								ret := 1.000000 // buy
						if( d > 13.1474 )
							if( rsi1 <= 86.0602 )
								if( Money_Flow_Ratio <= 1.55899 )
									ret := -0.079545
								if( Money_Flow_Ratio > 1.55899 )
									ret := 0.016299
							if( rsi1 > 86.0602 )
								if( Raw_Money_Flow <= 732100 )
									ret := -0.706897 // sell
								if( Raw_Money_Flow > 732100 )
									ret := -0.185185
			if( Negative_Money_Flow_Sum > 3.23761e+07 )
				if( Negative_Money_Flow_Sum <= 3.67393e+07 )
					if( Raw_Money_Flow <= 3.94694e+06 )
						if( Positive_Money_Flow <= 1.2329e+06 )
							if( rsi1 <= 48.4455 )
								if( MFI_High <= -43.6449 )
									ret := -0.441860
								if( MFI_High > -43.6449 )
									ret := 0.354839
							if( rsi1 > 48.4455 )
								if( Positive_Money_Flow_Sum <= 4.41145e+07 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 4.41145e+07 )
									ret := -0.500000
						if( Positive_Money_Flow > 1.2329e+06 )
							ret := 0.384615
					if( Raw_Money_Flow > 3.94694e+06 )
						if( d <= 27.1586 )
							if( d <= 9.53318 )
								if( Negative_Money_Flow <= 5.55195e+06 )
									ret := -0.555556
								if( Negative_Money_Flow > 5.55195e+06 )
									ret := 0.157895
							if( d > 9.53318 )
								if( smoothK_k <= 3.70904 )
									ret := -0.428571
								if( smoothK_k > 3.70904 )
									ret := -1.000000 // sell
						if( d > 27.1586 )
							if( d_k <= 15.4539 )
								if( MFI_Low <= 16.8301 )
									ret := 1.000000 // buy
								if( MFI_Low > 16.8301 )
									ret := 0.531250
							if( d_k > 15.4539 )
								if( d_k <= 22.9588 )
									ret := -0.550000
								if( d_k > 22.9588 )
									ret := 1.000000 // buy
				if( Negative_Money_Flow_Sum > 3.67393e+07 )
					if( MFI <= 68.9869 )
						if( MFI_High <= -35.7059 )
							if( rsi1 <= 10.4565 )
								if( d <= 5.86334 )
									ret := 0.250000
								if( d > 5.86334 )
									ret := 1.000000 // buy
							if( rsi1 > 10.4565 )
								if( rsi1 <= 32.9475 )
									ret := 0.004057
								if( rsi1 > 32.9475 )
									ret := -0.250000
						if( MFI_High > -35.7059 )
							if( Money_Flow_Ratio <= 1.02894 )
								if( k <= 5.26509 )
									ret := -0.444444
								if( k > 5.26509 )
									ret := 0.787879 // buy
							if( Money_Flow_Ratio > 1.02894 )
								if( Raw_Money_Flow <= 5.09942e+06 )
									ret := -0.481481
								if( Raw_Money_Flow > 5.09942e+06 )
									ret := 0.359223
					if( MFI > 68.9869 )
						ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_RIVN_1Min_aef1a57f(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


