//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: RUN_15Min_2MS0_12778c6d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RUN_15Min_2MS0_12778c6d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RUN_15Min_12778c6d(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Negative_Money_Flow <= 25.5768 )
		if( Positive_Money_Flow <= 256645 )
			if( Typical_Price <= 5.30787 )
				if( Raw_Money_Flow <= 2116 )
					if( d <= 75.9516 )
						if( Negative_Money_Flow_Sum <= 1.93324e+06 )
							ret := -0.562500
						if( Negative_Money_Flow_Sum > 1.93324e+06 )
							ret := -1.000000 // sell
					if( d > 75.9516 )
						ret := 0.444444
				if( Raw_Money_Flow > 2116 )
					if( Negative_Money_Flow_Sum <= 2.05437e+06 )
						if( rsi1 <= 90.4867 )
							if( smoothK_k <= 26.7023 )
								if( Negative_Money_Flow_Sum <= 924001 )
									ret := 0.144928
								if( Negative_Money_Flow_Sum > 924001 )
									ret := -0.205882
							if( smoothK_k > 26.7023 )
								if( MFI <= 54.4648 )
									ret := 0.325843
								if( MFI > 54.4648 )
									ret := 0.043689
						if( rsi1 > 90.4867 )
							ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 2.05437e+06 )
						if( Money_Flow_Ratio <= 0.443526 )
							if( Positive_Money_Flow_Sum <= 642950 )
								ret := 0.875000 // buy
							if( Positive_Money_Flow_Sum > 642950 )
								if( d_k <= -9.15552 )
									ret := -0.100000
								if( d_k > -9.15552 )
									ret := 0.583333
						if( Money_Flow_Ratio > 0.443526 )
							if( Negative_Money_Flow_Sum <= 2.1535e+06 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 2.1535e+06 )
								if( Typical_Price <= 5.1325 )
									ret := -0.375000
								if( Typical_Price > 5.1325 )
									ret := -0.050000
			if( Typical_Price > 5.30787 )
				if( smoothK_k <= 21.6456 )
					if( Money_Flow_Ratio <= 0.043637 )
						if( rsi1 <= 52.5141 )
							if( k <= 5.06764 )
								if( MFI_High <= -78.6662 )
									ret := -0.250000
								if( MFI_High > -78.6662 )
									ret := 0.350000
							if( k > 5.06764 )
								if( MFI_High <= -78.8241 )
									ret := -0.417582
								if( MFI_High > -78.8241 )
									ret := -0.714286 // sell
						if( rsi1 > 52.5141 )
							if( Raw_Money_Flow <= 13263.3 )
								ret := -0.166667
							if( Raw_Money_Flow > 13263.3 )
								ret := 0.666667
					if( Money_Flow_Ratio > 0.043637 )
						if( k <= 1.48365 )
							if( Negative_Money_Flow_Sum <= 9.34293e+07 )
								if( Positive_Money_Flow <= 118346 )
									ret := 0.206226
								if( Positive_Money_Flow > 118346 )
									ret := -0.166667
							if( Negative_Money_Flow_Sum > 9.34293e+07 )
								if( Positive_Money_Flow_Sum <= 3.98582e+07 )
									ret := 0.904762 // buy
								if( Positive_Money_Flow_Sum > 3.98582e+07 )
									ret := 0.625000
						if( k > 1.48365 )
							if( MFI_High <= 2.39522 )
								if( Typical_Price <= 10.0075 )
									ret := -0.128440
								if( Typical_Price > 10.0075 )
									ret := 0.000395
							if( MFI_High > 2.39522 )
								if( MFI_High <= 7.69775 )
									ret := 0.615385
								if( MFI_High > 7.69775 )
									ret := -0.020619
				if( smoothK_k > 21.6456 )
					if( Positive_Money_Flow_Sum <= 551646 )
						if( Negative_Money_Flow_Sum <= 146386 )
							if( MFI <= 61.3969 )
								if( Typical_Price <= 19.6184 )
									ret := 0.364312
								if( Typical_Price > 19.6184 )
									ret := -0.388235
							if( MFI > 61.3969 )
								if( k <= 39.1785 )
									ret := 0.161290
								if( k > 39.1785 )
									ret := -0.270310
						if( Negative_Money_Flow_Sum > 146386 )
							if( rsi1 <= 52.4151 )
								if( d <= 91.9078 )
									ret := -0.164491
								if( d > 91.9078 )
									ret := 0.525000
							if( rsi1 > 52.4151 )
								if( rsi1 <= 66.9434 )
									ret := -0.388682
								if( rsi1 > 66.9434 )
									ret := -0.154525
					if( Positive_Money_Flow_Sum > 551646 )
						if( MFI_High <= -43.1838 )
							if( Money_Flow_Ratio <= 0.525833 )
								if( Positive_Money_Flow <= 30696.7 )
									ret := -0.225322
								if( Positive_Money_Flow > 30696.7 )
									ret := -0.054015
							if( Money_Flow_Ratio > 0.525833 )
								if( smoothK_k <= 82.9209 )
									ret := -0.439815
								if( smoothK_k > 82.9209 )
									ret := 0.000000
						if( MFI_High > -43.1838 )
							if( MFI <= 41.1025 )
								if( k <= 26.8935 )
									ret := -0.444444
								if( k > 26.8935 )
									ret := 0.116000
							if( MFI > 41.1025 )
								if( rsi1 <= 38.0726 )
									ret := 0.109375
								if( rsi1 > 38.0726 )
									ret := -0.075606
		if( Positive_Money_Flow > 256645 )
			if( Raw_Money_Flow <= 8.0921e+06 )
				if( MFI_High <= 0.739923 )
					if( smoothD_d <= 2.12038 )
						if( Negative_Money_Flow_Sum <= 6.38625e+07 )
							if( rsi1 <= 54.0248 )
								if( d <= 0.236917 )
									ret := 0.642857
								if( d > 0.236917 )
									ret := 0.109010
							if( rsi1 > 54.0248 )
								if( rsi1 <= 58.2619 )
									ret := -0.676471
								if( rsi1 > 58.2619 )
									ret := -0.030303
						if( Negative_Money_Flow_Sum > 6.38625e+07 )
							if( Positive_Money_Flow <= 4.92685e+06 )
								if( smoothK_k <= -1.11536 )
									ret := 0.173913
								if( smoothK_k > -1.11536 )
									ret := 0.685714
							if( Positive_Money_Flow > 4.92685e+06 )
								if( Positive_Money_Flow <= 5.25389e+06 )
									ret := -0.545455
								if( Positive_Money_Flow > 5.25389e+06 )
									ret := 0.262136
					if( smoothD_d > 2.12038 )
						if( rsi1 <= 50.0273 )
							if( Negative_Money_Flow_Sum <= 8.62657e+07 )
								if( Typical_Price <= 47.4547 )
									ret := 0.068280
								if( Typical_Price > 47.4547 )
									ret := -0.146580
							if( Negative_Money_Flow_Sum > 8.62657e+07 )
								if( Positive_Money_Flow_Sum <= 3.48592e+07 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 3.48592e+07 )
									ret := -0.052805
						if( rsi1 > 50.0273 )
							if( d_k <= -17.8237 )
								if( Positive_Money_Flow_Sum <= 1.40501e+06 )
									ret := 0.301887
								if( Positive_Money_Flow_Sum > 1.40501e+06 )
									ret := -0.217544
							if( d_k > -17.8237 )
								if( Negative_Money_Flow_Sum <= 2.33165e+06 )
									ret := 0.075269
								if( Negative_Money_Flow_Sum > 2.33165e+06 )
									ret := -0.022773
				if( MFI_High > 0.739923 )
					if( smoothK_k <= 93.0208 )
						if( Typical_Price <= 12.8337 )
							if( Positive_Money_Flow_Sum <= 1.53546e+07 )
								if( Positive_Money_Flow <= 1.42163e+06 )
									ret := 0.238443
								if( Positive_Money_Flow > 1.42163e+06 )
									ret := 0.652695
							if( Positive_Money_Flow_Sum > 1.53546e+07 )
								if( Negative_Money_Flow_Sum <= 7.21248e+06 )
									ret := -0.379310
								if( Negative_Money_Flow_Sum > 7.21248e+06 )
									ret := 0.650000
						if( Typical_Price > 12.8337 )
							if( Money_Flow_Ratio <= 8.14196 )
								if( Typical_Price <= 16.93 )
									ret := -0.141593
								if( Typical_Price > 16.93 )
									ret := 0.070909
							if( Money_Flow_Ratio > 8.14196 )
								if( Positive_Money_Flow <= 2.85259e+06 )
									ret := 0.105121
								if( Positive_Money_Flow > 2.85259e+06 )
									ret := 0.428571
					if( smoothK_k > 93.0208 )
						if( MFI_High <= 13.8701 )
							if( Positive_Money_Flow_Sum <= 7.01788e+07 )
								if( Negative_Money_Flow_Sum <= 9.08595e+06 )
									ret := 0.046512
								if( Negative_Money_Flow_Sum > 9.08595e+06 )
									ret := 0.530303
							if( Positive_Money_Flow_Sum > 7.01788e+07 )
								if( Positive_Money_Flow <= 5.60643e+06 )
									ret := 0.296296
								if( Positive_Money_Flow > 5.60643e+06 )
									ret := -0.690476
						if( MFI_High > 13.8701 )
							if( Positive_Money_Flow_Sum <= 2.18266e+06 )
								ret := 0.846154 // buy
							if( Positive_Money_Flow_Sum > 2.18266e+06 )
								if( Negative_Money_Flow_Sum <= 1.61175e+06 )
									ret := -0.406542
								if( Negative_Money_Flow_Sum > 1.61175e+06 )
									ret := 0.269231
			if( Raw_Money_Flow > 8.0921e+06 )
				if( Money_Flow_Ratio <= 0.211381 )
					if( Positive_Money_Flow_Sum <= 1.16822e+07 )
						if( d <= 2.60852 )
							ret := -1.000000 // sell
						if( d > 2.60852 )
							if( k <= 8.37909 )
								ret := 0.384615
							if( k > 8.37909 )
								ret := -0.588235
					if( Positive_Money_Flow_Sum > 1.16822e+07 )
						if( d_k <= -1.91896 )
							if( smoothK_k <= 6.01913 )
								ret := -0.133333
							if( smoothK_k > 6.01913 )
								if( MFI_Low <= -5.3939 )
									ret := 0.500000
								if( MFI_Low > -5.3939 )
									ret := 1.000000 // buy
						if( d_k > -1.91896 )
							if( k <= 4.0867 )
								ret := 0.750000 // buy
							if( k > 4.0867 )
								if( d <= 20.5193 )
									ret := 1.000000 // buy
								if( d > 20.5193 )
									ret := 0.857143 // buy
				if( Money_Flow_Ratio > 0.211381 )
					if( Positive_Money_Flow_Sum <= 1.0508e+07 )
						if( MFI_Low <= 20.9068 )
							if( smoothD_d <= 8.84083 )
								ret := -0.285714
							if( smoothD_d > 8.84083 )
								if( MFI_Low <= 14.1871 )
									ret := -0.982759 // sell
								if( MFI_Low > 14.1871 )
									ret := -0.750000 // sell
						if( MFI_Low > 20.9068 )
							if( MFI <= 48.7226 )
								if( smoothK_k <= 56.2155 )
									ret := 0.750000 // buy
								if( smoothK_k > 56.2155 )
									ret := 1.000000 // buy
							if( MFI > 48.7226 )
								if( MFI <= 97.6388 )
									ret := -0.746032 // sell
								if( MFI > 97.6388 )
									ret := 0.058824
					if( Positive_Money_Flow_Sum > 1.0508e+07 )
						if( Money_Flow_Ratio <= 527.368 )
							if( smoothK_k <= 60.979 )
								if( Negative_Money_Flow_Sum <= 1.35232e+07 )
									ret := 0.164179
								if( Negative_Money_Flow_Sum > 1.35232e+07 )
									ret := -0.080013
							if( smoothK_k > 60.979 )
								if( d_k <= -8.81427 )
									ret := -0.229130
								if( d_k > -8.81427 )
									ret := -0.099881
						if( Money_Flow_Ratio > 527.368 )
							if( smoothK_k <= 94.4492 )
								if( Negative_Money_Flow_Sum <= 80213.4 )
									ret := 0.400000
								if( Negative_Money_Flow_Sum > 80213.4 )
									ret := 0.877551 // buy
							if( smoothK_k > 94.4492 )
								if( MFI_Low <= 79.8772 )
									ret := 0.166667
								if( MFI_Low > 79.8772 )
									ret := -0.363636
	if( Negative_Money_Flow > 25.5768 )
		if( Typical_Price <= 19.5249 )
			if( Positive_Money_Flow_Sum <= 54441 )
				if( MFI_High <= -63.0594 )
					if( Positive_Money_Flow_Sum <= 52595.3 )
						if( Positive_Money_Flow_Sum <= 29991.2 )
							if( Negative_Money_Flow_Sum <= 1.81707e+07 )
								if( MFI <= 3.76865 )
									ret := -0.078947
								if( MFI > 3.76865 )
									ret := 0.603774
							if( Negative_Money_Flow_Sum > 1.81707e+07 )
								if( Typical_Price <= 17.575 )
									ret := 1.000000 // buy
								if( Typical_Price > 17.575 )
									ret := 0.111111
						if( Positive_Money_Flow_Sum > 29991.2 )
							if( Negative_Money_Flow <= 9086.77 )
								ret := -0.368421
							if( Negative_Money_Flow > 9086.77 )
								if( rsi1 <= 24.9052 )
									ret := -0.400000
								if( rsi1 > 24.9052 )
									ret := 0.232558
					if( Positive_Money_Flow_Sum > 52595.3 )
						if( Typical_Price <= 13.2345 )
							ret := 1.000000 // buy
						if( Typical_Price > 13.2345 )
							ret := 0.800000 // buy
				if( MFI_High > -63.0594 )
					if( Positive_Money_Flow_Sum <= 25257 )
						ret := 0.000000
					if( Positive_Money_Flow_Sum > 25257 )
						if( Positive_Money_Flow_Sum <= 46133.2 )
							if( Negative_Money_Flow_Sum <= 63088.8 )
								ret := 0.666667
							if( Negative_Money_Flow_Sum > 63088.8 )
								if( Raw_Money_Flow <= 6553.17 )
									ret := 0.692308
								if( Raw_Money_Flow > 6553.17 )
									ret := 0.976190 // buy
						if( Positive_Money_Flow_Sum > 46133.2 )
							if( Positive_Money_Flow_Sum <= 48645.5 )
								ret := 0.111111
							if( Positive_Money_Flow_Sum > 48645.5 )
								ret := 0.636364
			if( Positive_Money_Flow_Sum > 54441 )
				if( MFI_High <= -1.21435 )
					if( MFI_High <= -58.8256 )
						if( Negative_Money_Flow_Sum <= 2.00869e+07 )
							if( Positive_Money_Flow_Sum <= 2.00702e+06 )
								if( Negative_Money_Flow <= 32646.8 )
									ret := 0.163090
								if( Negative_Money_Flow > 32646.8 )
									ret := -0.079948
							if( Positive_Money_Flow_Sum > 2.00702e+06 )
								if( Positive_Money_Flow <= 36191.5 )
									ret := -0.481375
								if( Positive_Money_Flow > 36191.5 )
									ret := 0.642857
						if( Negative_Money_Flow_Sum > 2.00869e+07 )
							if( MFI <= 13.3016 )
								if( d <= 21.3902 )
									ret := 0.086042
								if( d > 21.3902 )
									ret := 0.380952
							if( MFI > 13.3016 )
								if( Negative_Money_Flow_Sum <= 3.07061e+07 )
									ret := -0.306878
								if( Negative_Money_Flow_Sum > 3.07061e+07 )
									ret := 0.017857
					if( MFI_High > -58.8256 )
						if( Positive_Money_Flow_Sum <= 1.08405e+06 )
							if( Negative_Money_Flow_Sum <= 1.09104e+06 )
								if( Negative_Money_Flow <= 32157.7 )
									ret := -0.013357
								if( Negative_Money_Flow > 32157.7 )
									ret := 0.158748
							if( Negative_Money_Flow_Sum > 1.09104e+06 )
								if( Negative_Money_Flow_Sum <= 2.82529e+06 )
									ret := 0.366337
								if( Negative_Money_Flow_Sum > 2.82529e+06 )
									ret := -0.328767
						if( Positive_Money_Flow_Sum > 1.08405e+06 )
							if( rsi1 <= 35.4279 )
								if( MFI_Low <= 3.54663 )
									ret := 0.332500
								if( MFI_Low > 3.54663 )
									ret := 0.106844
							if( rsi1 > 35.4279 )
								if( Negative_Money_Flow_Sum <= 5.94633e+06 )
									ret := -0.033440
								if( Negative_Money_Flow_Sum > 5.94633e+06 )
									ret := 0.061684
				if( MFI_High > -1.21435 )
					if( Positive_Money_Flow <= 104510 )
						if( MFI_High <= 15.9505 )
							if( Raw_Money_Flow <= 1857.64 )
								if( smoothK_k <= 85.1342 )
									ret := 0.800000 // buy
								if( smoothK_k > 85.1342 )
									ret := -0.300000
							if( Raw_Money_Flow > 1857.64 )
								if( Positive_Money_Flow_Sum <= 1.13742e+06 )
									ret := 0.495935
								if( Positive_Money_Flow_Sum > 1.13742e+06 )
									ret := 0.224269
						if( MFI_High > 15.9505 )
							if( smoothD_d <= 85.359 )
								if( MFI <= 99.2508 )
									ret := -0.246032
								if( MFI > 99.2508 )
									ret := 0.169231
							if( smoothD_d > 85.359 )
								if( Money_Flow_Ratio <= 404.841 )
									ret := 0.517241
								if( Money_Flow_Ratio > 404.841 )
									ret := -0.111111
					if( Positive_Money_Flow > 104510 )
						if( smoothD_d <= 53.8188 )
							if( Typical_Price <= 16.5561 )
								ret := 0.066667
							if( Typical_Price > 16.5561 )
								ret := 1.000000 // buy
						if( smoothD_d > 53.8188 )
							if( smoothD_d <= 77.6247 )
								if( MFI_Low <= 64.5907 )
									ret := 0.090909
								if( MFI_Low > 64.5907 )
									ret := -1.000000 // sell
							if( smoothD_d > 77.6247 )
								ret := -1.000000 // sell
		if( Typical_Price > 19.5249 )
			if( MFI_Low <= 71.3041 )
				if( Money_Flow_Ratio <= 7.27528 )
					if( rsi1 <= 52.1296 )
						if( Negative_Money_Flow <= 305224 )
							if( d_k <= -14.2901 )
								if( MFI_Low <= 31.2684 )
									ret := -0.154545
								if( MFI_Low > 31.2684 )
									ret := -0.459770
							if( d_k > -14.2901 )
								if( Negative_Money_Flow_Sum <= 3.15675e+06 )
									ret := 0.009275
								if( Negative_Money_Flow_Sum > 3.15675e+06 )
									ret := 0.172405
						if( Negative_Money_Flow > 305224 )
							if( d_k <= 15.0924 )
								if( Negative_Money_Flow <= 3.15098e+07 )
									ret := -0.067066
								if( Negative_Money_Flow > 3.15098e+07 )
									ret := 0.356467
							if( d_k > 15.0924 )
								if( Negative_Money_Flow <= 2.41779e+07 )
									ret := 0.075327
								if( Negative_Money_Flow > 2.41779e+07 )
									ret := 0.729167 // buy
					if( rsi1 > 52.1296 )
						if( Negative_Money_Flow_Sum <= 1.2586e+08 )
							if( Positive_Money_Flow <= 79.9761 )
								if( MFI <= 68.966 )
									ret := -0.094556
								if( MFI > 68.966 )
									ret := 0.033320
							if( Positive_Money_Flow > 79.9761 )
								if( Raw_Money_Flow <= 11266.7 )
									ret := -0.459119
								if( Raw_Money_Flow > 11266.7 )
									ret := -0.097826
						if( Negative_Money_Flow_Sum > 1.2586e+08 )
							if( MFI_Low <= -11.9637 )
								ret := -0.812500 // sell
							if( MFI_Low > -11.9637 )
								if( Money_Flow_Ratio <= 1.49292 )
									ret := 0.289256
								if( Money_Flow_Ratio > 1.49292 )
									ret := 0.812500 // buy
				if( Money_Flow_Ratio > 7.27528 )
					if( Raw_Money_Flow <= 252681 )
						if( Raw_Money_Flow <= 87634 )
							if( Negative_Money_Flow <= 8329.75 )
								if( Positive_Money_Flow_Sum <= 8.52178e+07 )
									ret := -0.549020
								if( Positive_Money_Flow_Sum > 8.52178e+07 )
									ret := -0.918919 // sell
							if( Negative_Money_Flow > 8329.75 )
								if( smoothD_d <= 36.4167 )
									ret := -0.611111
								if( smoothD_d > 36.4167 )
									ret := 0.179104
						if( Raw_Money_Flow > 87634 )
							if( Negative_Money_Flow <= 131799 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow > 131799 )
								ret := -0.764706 // sell
					if( Raw_Money_Flow > 252681 )
						if( Raw_Money_Flow <= 1.09434e+07 )
							if( d_k <= 8.73431 )
								if( Negative_Money_Flow_Sum <= 5.14415e+06 )
									ret := -0.176471
								if( Negative_Money_Flow_Sum > 5.14415e+06 )
									ret := 0.642857
							if( d_k > 8.73431 )
								ret := -0.421053
						if( Raw_Money_Flow > 1.09434e+07 )
							if( k <= 88.3756 )
								ret := -0.500000
							if( k > 88.3756 )
								ret := -1.000000 // sell
			if( MFI_Low > 71.3041 )
				if( Money_Flow_Ratio <= 197.074 )
					if( Positive_Money_Flow_Sum <= 6.23112e+07 )
						if( MFI <= 94.4842 )
							if( smoothK_k <= 36.6584 )
								ret := 0.785714 // buy
							if( smoothK_k > 36.6584 )
								if( Money_Flow_Ratio <= 11.4456 )
									ret := 0.142857
								if( Money_Flow_Ratio > 11.4456 )
									ret := -0.586207
						if( MFI > 94.4842 )
							if( Typical_Price <= 55.2995 )
								if( rsi1 <= 49.8905 )
									ret := 0.612403
								if( rsi1 > 49.8905 )
									ret := 0.243590
							if( Typical_Price > 55.2995 )
								if( d_k <= -0.418745 )
									ret := -0.687500
								if( d_k > -0.418745 )
									ret := 0.104167
					if( Positive_Money_Flow_Sum > 6.23112e+07 )
						if( d_k <= -2.24935 )
							if( MFI <= 94.8305 )
								ret := 0.700000 // buy
							if( MFI > 94.8305 )
								ret := 1.000000 // buy
						if( d_k > -2.24935 )
							if( Negative_Money_Flow_Sum <= 5.09064e+06 )
								if( Negative_Money_Flow_Sum <= 815587 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 815587 )
									ret := 0.872340 // buy
							if( Negative_Money_Flow_Sum > 5.09064e+06 )
								if( Typical_Price <= 28.5583 )
									ret := 0.636364
								if( Typical_Price > 28.5583 )
									ret := 0.000000
				if( Money_Flow_Ratio > 197.074 )
					if( Positive_Money_Flow_Sum <= 4.77971e+07 )
						if( Positive_Money_Flow_Sum <= 4.54873e+07 )
							if( d <= 74.6264 )
								if( smoothK_k <= 45.7606 )
									ret := -0.078947
								if( smoothK_k > 45.7606 )
									ret := -0.625000
							if( d > 74.6264 )
								if( d <= 88.6058 )
									ret := 0.600000
								if( d > 88.6058 )
									ret := -0.200000
						if( Positive_Money_Flow_Sum > 4.54873e+07 )
							if( k <= 50.2994 )
								ret := -0.727273 // sell
							if( k > 50.2994 )
								ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 4.77971e+07 )
						if( rsi1 <= 62.469 )
							if( d <= 31.3738 )
								ret := 0.117647
							if( d > 31.3738 )
								if( smoothD_d <= 44.072 )
									ret := 0.714286 // buy
								if( smoothD_d > 44.072 )
									ret := 0.918919 // buy
						if( rsi1 > 62.469 )
							if( Positive_Money_Flow_Sum <= 7.29667e+07 )
								if( Raw_Money_Flow <= 31381.3 )
									ret := 0.000000
								if( Raw_Money_Flow > 31381.3 )
									ret := -0.764706 // sell
							if( Positive_Money_Flow_Sum > 7.29667e+07 )
								ret := 0.562500
	
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
float op_operation = decision_tree_0_RUN_15Min_12778c6d(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


