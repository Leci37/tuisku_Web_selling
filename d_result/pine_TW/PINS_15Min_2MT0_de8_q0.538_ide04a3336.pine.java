//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: PINS_15Min_2MT0_e04a3336 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PINS_15Min_2MT0_e04a3336", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PINS_15Min_e04a3336(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.00028 )
		if( Raw_Money_Flow <= 334097 )
			if( Negative_Money_Flow <= 3.40714 )
				if( Negative_Money_Flow_Sum <= 65887.9 )
					if( ema13 <= -0.049077 )
						if( MFI_Low <= 62.3085 )
							if( MFI <= 69.0504 )
								ret := 0.750000 // buy
							if( MFI > 69.0504 )
								ret := 1.000000 // buy
						if( MFI_Low > 62.3085 )
							if( ema12 <= -0.044335 )
								ret := 0.285714
							if( ema12 > -0.044335 )
								ret := 1.000000 // buy
					if( ema13 > -0.049077 )
						if( ema3 <= 23.5021 )
							if( tema <= 18.9876 )
								ret := -0.500000
							if( tema > 18.9876 )
								ret := 0.166667
						if( ema3 > 23.5021 )
							if( MFI_High <= 12.3101 )
								ret := 0.500000
							if( MFI_High > 12.3101 )
								ret := 1.000000 // buy
				if( Negative_Money_Flow_Sum > 65887.9 )
					if( Positive_Money_Flow_Sum <= 260376 )
						if( MFI_Low <= 10.3482 )
							if( ema3 <= 24.9246 )
								if( Positive_Money_Flow_Sum <= 254401 )
									ret := 0.288235
								if( Positive_Money_Flow_Sum > 254401 )
									ret := -1.000000 // sell
							if( ema3 > 24.9246 )
								if( ema12 <= -0.14348 )
									ret := -0.590909
								if( ema12 > -0.14348 )
									ret := -0.068421
						if( MFI_Low > 10.3482 )
							if( Positive_Money_Flow_Sum <= 169902 )
								if( MFI_Low <= 28.2733 )
									ret := -0.644068
								if( MFI_Low > 28.2733 )
									ret := -0.100000
							if( Positive_Money_Flow_Sum > 169902 )
								if( MFI_High <= -32.2401 )
									ret := 0.015267
								if( MFI_High > -32.2401 )
									ret := -0.349398
					if( Positive_Money_Flow_Sum > 260376 )
						if( ema2 <= 15.9284 )
							if( ema3 <= 13.8478 )
								if( MFI_High <= -30.6366 )
									ret := -0.526316
								if( MFI_High > -30.6366 )
									ret := 0.500000
							if( ema3 > 13.8478 )
								if( Positive_Money_Flow_Sum <= 3.10187e+07 )
									ret := -0.925926 // sell
								if( Positive_Money_Flow_Sum > 3.10187e+07 )
									ret := -0.250000
						if( ema2 > 15.9284 )
							if( Positive_Money_Flow_Sum <= 1.20878e+07 )
								if( Typical_Price <= 36.1887 )
									ret := 0.061654
								if( Typical_Price > 36.1887 )
									ret := 0.239032
							if( Positive_Money_Flow_Sum > 1.20878e+07 )
								if( MFI_High <= -43.4769 )
									ret := -0.105751
								if( MFI_High > -43.4769 )
									ret := 0.051140
			if( Negative_Money_Flow > 3.40714 )
				if( Negative_Money_Flow_Sum <= 5.35991e+07 )
					if( Positive_Money_Flow_Sum <= 2.35737e+06 )
						if( MFI <= 30.8246 )
							if( MFI_High <= -79.4865 )
								if( Negative_Money_Flow_Sum <= 4.5829e+07 )
									ret := 0.109890
								if( Negative_Money_Flow_Sum > 4.5829e+07 )
									ret := -0.555556
							if( MFI_High > -79.4865 )
								if( Typical_Price <= 32.0408 )
									ret := 0.467949
								if( Typical_Price > 32.0408 )
									ret := 0.243028
						if( MFI > 30.8246 )
							if( Money_Flow_Ratio <= 1.10408 )
								if( Negative_Money_Flow <= 263236 )
									ret := 0.052899
								if( Negative_Money_Flow > 263236 )
									ret := -0.571429
							if( Money_Flow_Ratio > 1.10408 )
								if( Typical_Price <= 17.396 )
									ret := -0.338235
								if( Typical_Price > 17.396 )
									ret := 0.307692
					if( Positive_Money_Flow_Sum > 2.35737e+06 )
						if( tema <= 21.7928 )
							if( Negative_Money_Flow_Sum <= 3.99441e+07 )
								if( MFI_High <= -46.636 )
									ret := 0.730159 // buy
								if( MFI_High > -46.636 )
									ret := 0.138504
							if( Negative_Money_Flow_Sum > 3.99441e+07 )
								if( MFI_Low <= 7.19224 )
									ret := -0.688889
								if( MFI_Low > 7.19224 )
									ret := 0.131148
						if( tema > 21.7928 )
							if( Positive_Money_Flow <= 18132.4 )
								if( Raw_Money_Flow <= 93166.5 )
									ret := 0.398777
								if( Raw_Money_Flow > 93166.5 )
									ret := 0.199336
							if( Positive_Money_Flow > 18132.4 )
								if( MFI_High <= -65.3981 )
									ret := -0.600000
								if( MFI_High > -65.3981 )
									ret := 0.697778
				if( Negative_Money_Flow_Sum > 5.35991e+07 )
					if( MFI <= 13.3649 )
						if( Negative_Money_Flow_Sum <= 7.16392e+08 )
							if( ema12 <= -0.028261 )
								if( Raw_Money_Flow <= 33575.5 )
									ret := 0.493056
								if( Raw_Money_Flow > 33575.5 )
									ret := 0.211765
							if( ema12 > -0.028261 )
								if( Negative_Money_Flow_Sum <= 8.37472e+07 )
									ret := 0.371795
								if( Negative_Money_Flow_Sum > 8.37472e+07 )
									ret := -0.316667
						if( Negative_Money_Flow_Sum > 7.16392e+08 )
							if( ema2 <= 70.6685 )
								ret := -1.000000 // sell
							if( ema2 > 70.6685 )
								ret := 0.000000
					if( MFI > 13.3649 )
						if( Negative_Money_Flow <= 13105.6 )
							if( ema13 <= -0.023339 )
								if( Positive_Money_Flow_Sum <= 3.08844e+07 )
									ret := 0.005952
								if( Positive_Money_Flow_Sum > 3.08844e+07 )
									ret := 0.295597
							if( ema13 > -0.023339 )
								if( Negative_Money_Flow <= 454.168 )
									ret := -0.333333
								if( Negative_Money_Flow > 454.168 )
									ret := 0.564103
						if( Negative_Money_Flow > 13105.6 )
							if( Positive_Money_Flow <= 14.6324 )
								if( Positive_Money_Flow_Sum <= 1.30531e+07 )
									ret := -0.608696
								if( Positive_Money_Flow_Sum > 1.30531e+07 )
									ret := 0.103380
							if( Positive_Money_Flow > 14.6324 )
								if( Positive_Money_Flow <= 33305.6 )
									ret := -0.274854
								if( Positive_Money_Flow > 33305.6 )
									ret := 0.200000
		if( Raw_Money_Flow > 334097 )
			if( ema12 <= -0.11215 )
				if( Typical_Price <= 26.0762 )
					if( Raw_Money_Flow <= 5.17341e+07 )
						if( MFI_Low <= 33.2297 )
							if( ema3 <= 14.1698 )
								if( Raw_Money_Flow <= 3.58877e+06 )
									ret := -0.428571
								if( Raw_Money_Flow > 3.58877e+06 )
									ret := 0.814815 // buy
							if( ema3 > 14.1698 )
								if( ema12 <= -0.232302 )
									ret := 0.312661
								if( ema12 > -0.232302 )
									ret := 0.164474
						if( MFI_Low > 33.2297 )
							if( ema1 <= 22.9861 )
								if( Negative_Money_Flow_Sum <= 5.05336e+07 )
									ret := -0.485714
								if( Negative_Money_Flow_Sum > 5.05336e+07 )
									ret := 0.187500
							if( ema1 > 22.9861 )
								if( MFI <= 56.1088 )
									ret := -0.500000
								if( MFI > 56.1088 )
									ret := 0.385965
					if( Raw_Money_Flow > 5.17341e+07 )
						if( ema1 <= 24.8362 )
							if( Typical_Price <= 22.4216 )
								if( ema12 <= -0.493971 )
									ret := -1.000000 // sell
								if( ema12 > -0.493971 )
									ret := -0.153846
							if( Typical_Price > 22.4216 )
								ret := -1.000000 // sell
						if( ema1 > 24.8362 )
							if( Raw_Money_Flow <= 6.82188e+07 )
								ret := 0.285714
							if( Raw_Money_Flow > 6.82188e+07 )
								if( Negative_Money_Flow <= 1.01588e+08 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow > 1.01588e+08 )
									ret := 1.000000 // buy
				if( Typical_Price > 26.0762 )
					if( MFI <= 27.35 )
						if( Positive_Money_Flow_Sum <= 1.16115e+08 )
							if( Negative_Money_Flow_Sum <= 5.37114e+08 )
								if( Negative_Money_Flow_Sum <= 4.30435e+06 )
									ret := 0.425926
								if( Negative_Money_Flow_Sum > 4.30435e+06 )
									ret := -0.028627
							if( Negative_Money_Flow_Sum > 5.37114e+08 )
								if( Raw_Money_Flow <= 2.82893e+07 )
									ret := 0.142857
								if( Raw_Money_Flow > 2.82893e+07 )
									ret := 0.802817 // buy
						if( Positive_Money_Flow_Sum > 1.16115e+08 )
							if( Positive_Money_Flow_Sum <= 1.30072e+08 )
								if( MFI_Low <= 2.56812 )
									ret := -0.235294
								if( MFI_Low > 2.56812 )
									ret := -0.785714 // sell
							if( Positive_Money_Flow_Sum > 1.30072e+08 )
								if( Negative_Money_Flow_Sum <= 1.47446e+09 )
									ret := 0.025641
								if( Negative_Money_Flow_Sum > 1.47446e+09 )
									ret := -0.909091 // sell
					if( MFI > 27.35 )
						if( Raw_Money_Flow <= 8.48194e+06 )
							if( Negative_Money_Flow <= 565.69 )
								if( Raw_Money_Flow <= 460693 )
									ret := 0.472222
								if( Raw_Money_Flow > 460693 )
									ret := -0.180921
							if( Negative_Money_Flow > 565.69 )
								if( ema12 <= -0.386367 )
									ret := 0.523810
								if( ema12 > -0.386367 )
									ret := 0.011527
						if( Raw_Money_Flow > 8.48194e+06 )
							if( Negative_Money_Flow_Sum <= 3.20098e+08 )
								if( Typical_Price <= 81.4396 )
									ret := 0.232252
								if( Typical_Price > 81.4396 )
									ret := -0.153153
							if( Negative_Money_Flow_Sum > 3.20098e+08 )
								if( Positive_Money_Flow_Sum <= 1.99429e+08 )
									ret := -0.466667
								if( Positive_Money_Flow_Sum > 1.99429e+08 )
									ret := 0.014085
			if( ema12 > -0.11215 )
				if( ema13 <= -0.188329 )
					if( Positive_Money_Flow <= 1.05717e+07 )
						if( Negative_Money_Flow <= 7.29626e+06 )
							if( ema13 <= -0.31931 )
								if( ema12 <= -0.093836 )
									ret := -0.421053
								if( ema12 > -0.093836 )
									ret := -1.000000 // sell
							if( ema13 > -0.31931 )
								if( Raw_Money_Flow <= 7.00826e+06 )
									ret := -0.160839
								if( Raw_Money_Flow > 7.00826e+06 )
									ret := -0.378049
						if( Negative_Money_Flow > 7.29626e+06 )
							if( MFI <= 39.8139 )
								if( MFI_High <= -57.9683 )
									ret := -0.166667
								if( MFI_High > -57.9683 )
									ret := 0.242105
							if( MFI > 39.8139 )
								if( ema2 <= 36.5395 )
									ret := -0.460317
								if( ema2 > 36.5395 )
									ret := 0.098039
					if( Positive_Money_Flow > 1.05717e+07 )
						if( Raw_Money_Flow <= 2.42019e+07 )
							if( Positive_Money_Flow_Sum <= 8.18551e+07 )
								if( ema12 <= -0.050591 )
									ret := 0.105263
								if( ema12 > -0.050591 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 8.18551e+07 )
								if( Raw_Money_Flow <= 1.44807e+07 )
									ret := 0.190476
								if( Raw_Money_Flow > 1.44807e+07 )
									ret := 0.636364
						if( Raw_Money_Flow > 2.42019e+07 )
							if( MFI_Low <= 74.743 )
								if( Negative_Money_Flow_Sum <= 1.60125e+08 )
									ret := -0.400000
								if( Negative_Money_Flow_Sum > 1.60125e+08 )
									ret := 0.192982
							if( MFI_Low > 74.743 )
								if( Typical_Price <= 37.7445 )
									ret := 0.250000
								if( Typical_Price > 37.7445 )
									ret := 1.000000 // buy
				if( ema13 > -0.188329 )
					if( MFI <= 95.806 )
						if( Negative_Money_Flow <= 1.63949e+07 )
							if( Positive_Money_Flow_Sum <= 5.49698e+06 )
								if( Raw_Money_Flow <= 483745 )
									ret := -0.118367
								if( Raw_Money_Flow > 483745 )
									ret := 0.199578
							if( Positive_Money_Flow_Sum > 5.49698e+06 )
								if( Negative_Money_Flow_Sum <= 2.42789e+07 )
									ret := -0.096598
								if( Negative_Money_Flow_Sum > 2.42789e+07 )
									ret := 0.030470
						if( Negative_Money_Flow > 1.63949e+07 )
							if( MFI_High <= -48.2984 )
								if( Negative_Money_Flow_Sum <= 1.97785e+07 )
									ret := 0.696970
								if( Negative_Money_Flow_Sum > 1.97785e+07 )
									ret := -0.026711
							if( MFI_High > -48.2984 )
								if( ema2 <= 20.1746 )
									ret := 0.644444
								if( ema2 > 20.1746 )
									ret := 0.216772
					if( MFI > 95.806 )
						if( ema3 <= 17.9923 )
							if( MFI_High <= 19.1829 )
								ret := -1.000000 // sell
							if( MFI_High > 19.1829 )
								ret := -0.250000
						if( ema3 > 17.9923 )
							if( Typical_Price <= 26.3622 )
								if( Negative_Money_Flow_Sum <= 246807 )
									ret := 0.918919 // buy
								if( Negative_Money_Flow_Sum > 246807 )
									ret := 0.362319
							if( Typical_Price > 26.3622 )
								if( ema13 <= -0.078635 )
									ret := 0.604167
								if( ema13 > -0.078635 )
									ret := -0.090909
	if( ema12 > -0.00028 )
		if( Positive_Money_Flow_Sum <= 1.14443e+06 )
			if( Positive_Money_Flow <= 13.6251 )
				if( Raw_Money_Flow <= 253569 )
					if( Typical_Price <= 42.1688 )
						if( ema1 <= 21.2176 )
							if( Positive_Money_Flow_Sum <= 402569 )
								if( Negative_Money_Flow_Sum <= 547187 )
									ret := -0.176471
								if( Negative_Money_Flow_Sum > 547187 )
									ret := 0.326087
							if( Positive_Money_Flow_Sum > 402569 )
								if( Typical_Price <= 18.8006 )
									ret := -0.804348 // sell
								if( Typical_Price > 18.8006 )
									ret := -0.153846
						if( ema1 > 21.2176 )
							if( ema12 <= 0.046136 )
								if( Negative_Money_Flow_Sum <= 122789 )
									ret := 0.418919
								if( Negative_Money_Flow_Sum > 122789 )
									ret := 0.066964
							if( ema12 > 0.046136 )
								if( ema1 <= 22.4773 )
									ret := 0.304348
								if( ema1 > 22.4773 )
									ret := -0.060897
					if( Typical_Price > 42.1688 )
						if( MFI_Low <= 35.4453 )
							if( MFI_Low <= 27.4167 )
								if( MFI <= 41.7476 )
									ret := -0.268293
								if( MFI > 41.7476 )
									ret := 0.520000
							if( MFI_Low > 27.4167 )
								if( ema13 <= 0.184342 )
									ret := -0.567568
								if( ema13 > 0.184342 )
									ret := -0.066667
						if( MFI_Low > 35.4453 )
							if( MFI <= 78.5835 )
								if( MFI_Low <= 56.1706 )
									ret := 0.016667
								if( MFI_Low > 56.1706 )
									ret := 0.714286 // buy
							if( MFI > 78.5835 )
								if( Positive_Money_Flow_Sum <= 1.08209e+06 )
									ret := -0.250000
								if( Positive_Money_Flow_Sum > 1.08209e+06 )
									ret := -1.000000 // sell
				if( Raw_Money_Flow > 253569 )
					if( Typical_Price <= 25.5059 )
						if( Positive_Money_Flow_Sum <= 470663 )
							if( MFI <= 27.8044 )
								if( Negative_Money_Flow <= 1.34279e+07 )
									ret := 0.528302
								if( Negative_Money_Flow > 1.34279e+07 )
									ret := -0.388889
							if( MFI > 27.8044 )
								if( ema12 <= 0.037914 )
									ret := -0.846154 // sell
								if( ema12 > 0.037914 )
									ret := -0.083333
						if( Positive_Money_Flow_Sum > 470663 )
							if( Raw_Money_Flow <= 1.54699e+07 )
								if( Raw_Money_Flow <= 384259 )
									ret := 0.725000 // buy
								if( Raw_Money_Flow > 384259 )
									ret := 0.150943
							if( Raw_Money_Flow > 1.54699e+07 )
								if( ema13 <= 0.134517 )
									ret := 0.954545 // buy
								if( ema13 > 0.134517 )
									ret := 0.500000
					if( Typical_Price > 25.5059 )
						if( ema1 <= 34.6204 )
							if( Raw_Money_Flow <= 329461 )
								if( ema3 <= 26.2537 )
									ret := -0.375000
								if( ema3 > 26.2537 )
									ret := 0.600000
							if( Raw_Money_Flow > 329461 )
								if( ema13 <= 0.087854 )
									ret := -0.015152
								if( ema13 > 0.087854 )
									ret := -0.571429
						if( ema1 > 34.6204 )
							if( ema13 <= 0.117151 )
								if( Positive_Money_Flow_Sum <= 859649 )
									ret := 0.166667
								if( Positive_Money_Flow_Sum > 859649 )
									ret := -0.666667
							if( ema13 > 0.117151 )
								if( MFI <= 38.3713 )
									ret := 0.486726
								if( MFI > 38.3713 )
									ret := 0.016667
			if( Positive_Money_Flow > 13.6251 )
				if( ema12 <= 0.068606 )
					if( Positive_Money_Flow <= 29329.7 )
						if( Money_Flow_Ratio <= 6.10259 )
							if( ema13 <= -0.007701 )
								if( Negative_Money_Flow_Sum <= 1.34161e+06 )
									ret := 0.468085
								if( Negative_Money_Flow_Sum > 1.34161e+06 )
									ret := -0.275000
							if( ema13 > -0.007701 )
								if( Positive_Money_Flow_Sum <= 646676 )
									ret := -0.271028
								if( Positive_Money_Flow_Sum > 646676 )
									ret := 0.048193
						if( Money_Flow_Ratio > 6.10259 )
							if( Negative_Money_Flow_Sum <= 122964 )
								if( ema13 <= -0.001805 )
									ret := -0.600000
								if( ema13 > -0.001805 )
									ret := -0.966667 // sell
							if( Negative_Money_Flow_Sum > 122964 )
								ret := 0.250000
					if( Positive_Money_Flow > 29329.7 )
						if( Money_Flow_Ratio <= 2.51587 )
							if( Positive_Money_Flow <= 384517 )
								if( Negative_Money_Flow_Sum <= 5.31908e+07 )
									ret := -0.072093
								if( Negative_Money_Flow_Sum > 5.31908e+07 )
									ret := 0.333333
							if( Positive_Money_Flow > 384517 )
								if( MFI_High <= -70.6344 )
									ret := 0.000000
								if( MFI_High > -70.6344 )
									ret := -0.627451
						if( Money_Flow_Ratio > 2.51587 )
							if( MFI_Low <= 55.5139 )
								if( Negative_Money_Flow_Sum <= 352764 )
									ret := 0.626866
								if( Negative_Money_Flow_Sum > 352764 )
									ret := -0.875000 // sell
							if( MFI_Low > 55.5139 )
								if( Positive_Money_Flow <= 217008 )
									ret := -0.165414
								if( Positive_Money_Flow > 217008 )
									ret := 0.545455
				if( ema12 > 0.068606 )
					if( Raw_Money_Flow <= 25261.7 )
						if( Money_Flow_Ratio <= 1.57322 )
							if( Positive_Money_Flow <= 9216.87 )
								if( ema3 <= 54.2304 )
									ret := -0.830000 // sell
								if( ema3 > 54.2304 )
									ret := -0.285714
							if( Positive_Money_Flow > 9216.87 )
								if( MFI_Low <= -6.76878 )
									ret := -0.052632
								if( MFI_Low > -6.76878 )
									ret := -0.460674
						if( Money_Flow_Ratio > 1.57322 )
							if( ema1 <= 20.5021 )
								if( Positive_Money_Flow_Sum <= 157792 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 157792 )
									ret := 0.250000
							if( ema1 > 20.5021 )
								if( Negative_Money_Flow_Sum <= 77082.9 )
									ret := -0.791667 // sell
								if( Negative_Money_Flow_Sum > 77082.9 )
									ret := -0.178571
					if( Raw_Money_Flow > 25261.7 )
						if( ema12 <= 0.127625 )
							if( ema1 <= 15.4653 )
								if( ema13 <= 0.191493 )
									ret := -0.750000 // sell
								if( ema13 > 0.191493 )
									ret := -1.000000 // sell
							if( ema1 > 15.4653 )
								if( Negative_Money_Flow_Sum <= 231533 )
									ret := 0.009756
								if( Negative_Money_Flow_Sum > 231533 )
									ret := -0.238095
						if( ema12 > 0.127625 )
							if( Negative_Money_Flow_Sum <= 391062 )
								if( Money_Flow_Ratio <= 21.3146 )
									ret := -0.593583
								if( Money_Flow_Ratio > 21.3146 )
									ret := 0.571429
							if( Negative_Money_Flow_Sum > 391062 )
								if( Money_Flow_Ratio <= 1.17353 )
									ret := -0.331210
								if( Money_Flow_Ratio > 1.17353 )
									ret := 0.111111
		if( Positive_Money_Flow_Sum > 1.14443e+06 )
			if( Negative_Money_Flow <= 128.366 )
				if( Raw_Money_Flow <= 1.04037e+06 )
					if( Positive_Money_Flow_Sum <= 1.7392e+06 )
						if( Positive_Money_Flow <= 86695.6 )
							if( tema <= 55.979 )
								if( Money_Flow_Ratio <= 3.82394 )
									ret := 0.393443
								if( Money_Flow_Ratio > 3.82394 )
									ret := 0.673913
							if( tema > 55.979 )
								if( ema12 <= 0.217052 )
									ret := 0.125000
								if( ema12 > 0.217052 )
									ret := -0.428571
						if( Positive_Money_Flow > 86695.6 )
							if( ema13 <= 0.022082 )
								if( ema3 <= 26.0074 )
									ret := 1.000000 // buy
								if( ema3 > 26.0074 )
									ret := 0.136364
							if( ema13 > 0.022082 )
								if( Positive_Money_Flow <= 199921 )
									ret := -0.382353
								if( Positive_Money_Flow > 199921 )
									ret := 0.030612
					if( Positive_Money_Flow_Sum > 1.7392e+06 )
						if( Typical_Price <= 40.4447 )
							if( MFI <= 85.2684 )
								if( Positive_Money_Flow_Sum <= 1.98108e+06 )
									ret := -0.633333
								if( Positive_Money_Flow_Sum > 1.98108e+06 )
									ret := -0.110513
							if( MFI > 85.2684 )
								if( Negative_Money_Flow_Sum <= 81903.5 )
									ret := 0.183908
								if( Negative_Money_Flow_Sum > 81903.5 )
									ret := -0.316957
						if( Typical_Price > 40.4447 )
							if( Negative_Money_Flow_Sum <= 436817 )
								if( Raw_Money_Flow <= 63598.8 )
									ret := -0.060000
								if( Raw_Money_Flow > 63598.8 )
									ret := 0.515625
							if( Negative_Money_Flow_Sum > 436817 )
								if( ema12 <= 0.075497 )
									ret := 0.036072
								if( ema12 > 0.075497 )
									ret := -0.116379
				if( Raw_Money_Flow > 1.04037e+06 )
					if( Typical_Price <= 26.1771 )
						if( MFI <= 97.8742 )
							if( ema13 <= -0.054393 )
								if( MFI_High <= -43.5332 )
									ret := 0.375000
								if( MFI_High > -43.5332 )
									ret := -0.591549
							if( ema13 > -0.054393 )
								if( ema12 <= 0.490271 )
									ret := 0.069601
								if( ema12 > 0.490271 )
									ret := -0.740741 // sell
						if( MFI > 97.8742 )
							if( ema2 <= 16.9222 )
								if( Positive_Money_Flow <= 8.44997e+06 )
									ret := -0.916667 // sell
								if( Positive_Money_Flow > 8.44997e+06 )
									ret := -0.285714
							if( ema2 > 16.9222 )
								if( ema13 <= 0.279821 )
									ret := 0.449275
								if( ema13 > 0.279821 )
									ret := -0.067901
					if( Typical_Price > 26.1771 )
						if( MFI <= 90.1046 )
							if( Positive_Money_Flow_Sum <= 8.68541e+08 )
								if( Raw_Money_Flow <= 1.45104e+08 )
									ret := 0.006222
								if( Raw_Money_Flow > 1.45104e+08 )
									ret := 0.514286
							if( Positive_Money_Flow_Sum > 8.68541e+08 )
								if( Positive_Money_Flow <= 1.82222e+08 )
									ret := -0.833333 // sell
								if( Positive_Money_Flow > 1.82222e+08 )
									ret := 0.200000
						if( MFI > 90.1046 )
							if( Positive_Money_Flow <= 9.68505e+07 )
								if( Positive_Money_Flow_Sum <= 2.15282e+07 )
									ret := -0.416149
								if( Positive_Money_Flow_Sum > 2.15282e+07 )
									ret := -0.049689
							if( Positive_Money_Flow > 9.68505e+07 )
								if( ema12 <= 0.082057 )
									ret := 0.416667
								if( ema12 > 0.082057 )
									ret := -0.804598 // sell
			if( Negative_Money_Flow > 128.366 )
				if( Negative_Money_Flow <= 183774 )
					if( Negative_Money_Flow <= 2341.3 )
						if( Negative_Money_Flow_Sum <= 6.37042e+07 )
							if( ema12 <= 0.057799 )
								if( ema3 <= 18.5538 )
									ret := 0.071429
								if( ema3 > 18.5538 )
									ret := 0.744186 // buy
							if( ema12 > 0.057799 )
								if( ema13 <= 0.170935 )
									ret := -0.265306
								if( ema13 > 0.170935 )
									ret := 0.557377
						if( Negative_Money_Flow_Sum > 6.37042e+07 )
							if( Negative_Money_Flow_Sum <= 1.06324e+08 )
								if( ema13 <= 0.065852 )
									ret := -0.058824
								if( ema13 > 0.065852 )
									ret := -0.866667 // sell
							if( Negative_Money_Flow_Sum > 1.06324e+08 )
								if( Positive_Money_Flow <= 10292 )
									ret := -0.625000
								if( Positive_Money_Flow > 10292 )
									ret := 0.875000 // buy
					if( Negative_Money_Flow > 2341.3 )
						if( Positive_Money_Flow_Sum <= 8.13694e+08 )
							if( Negative_Money_Flow_Sum <= 126744 )
								if( MFI_Low <= 79.7713 )
									ret := 0.666667
								if( MFI_Low > 79.7713 )
									ret := 0.212121
							if( Negative_Money_Flow_Sum > 126744 )
								if( Negative_Money_Flow <= 125401 )
									ret := 0.106763
								if( Negative_Money_Flow > 125401 )
									ret := 0.290429
						if( Positive_Money_Flow_Sum > 8.13694e+08 )
							ret := -1.000000 // sell
				if( Negative_Money_Flow > 183774 )
					if( Negative_Money_Flow_Sum <= 1.30597e+07 )
						if( Positive_Money_Flow_Sum <= 7.71003e+07 )
							if( MFI_Low <= 57.602 )
								if( Positive_Money_Flow <= 25289.5 )
									ret := -0.098765
								if( Positive_Money_Flow > 25289.5 )
									ret := -0.812500 // sell
							if( MFI_Low > 57.602 )
								if( MFI_Low <= 61.1061 )
									ret := 0.324561
								if( MFI_Low > 61.1061 )
									ret := 0.000000
						if( Positive_Money_Flow_Sum > 7.71003e+07 )
							if( Negative_Money_Flow <= 8.28399e+06 )
								if( MFI <= 99.243 )
									ret := -0.733333 // sell
								if( MFI > 99.243 )
									ret := -0.214286
							if( Negative_Money_Flow > 8.28399e+06 )
								if( MFI_Low <= 68.5435 )
									ret := -0.800000 // sell
								if( MFI_Low > 68.5435 )
									ret := 0.416667
					if( Negative_Money_Flow_Sum > 1.30597e+07 )
						if( Negative_Money_Flow_Sum <= 1.90979e+08 )
							if( Raw_Money_Flow <= 8.84607e+07 )
								if( tema <= 17.2266 )
									ret := 0.427632
								if( tema > 17.2266 )
									ret := 0.050361
							if( Raw_Money_Flow > 8.84607e+07 )
								if( Negative_Money_Flow_Sum <= 1.69993e+08 )
									ret := -0.750000 // sell
								if( Negative_Money_Flow_Sum > 1.69993e+08 )
									ret := 0.000000
						if( Negative_Money_Flow_Sum > 1.90979e+08 )
							if( ema3 <= 60.8174 )
								if( Negative_Money_Flow_Sum <= 1.17965e+09 )
									ret := 0.304795
								if( Negative_Money_Flow_Sum > 1.17965e+09 )
									ret := 0.972973 // buy
							if( ema3 > 60.8174 )
								if( Negative_Money_Flow_Sum <= 7.53042e+08 )
									ret := 0.173745
								if( Negative_Money_Flow_Sum > 7.53042e+08 )
									ret := -0.566667
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_PINS_15Min_e04a3336(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)

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


