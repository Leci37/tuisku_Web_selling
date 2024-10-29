//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: MSFT_5Min_2MS0_0845ab42 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_5Min_2MS0_0845ab42", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_5Min_0845ab42(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( MFI <= 36.0733 )
		if( rsi1 <= 41.0228 )
			if( Negative_Money_Flow_Sum <= 4.79628e+08 )
				if( Typical_Price <= 384.544 )
					if( Raw_Money_Flow <= 309227 )
						if( MFI_Low <= 13.1117 )
							if( MFI <= 30.4257 )
								if( MFI <= 18.4715 )
									ret := 0.165254
								if( MFI > 18.4715 )
									ret := -0.116105
							if( MFI > 30.4257 )
								if( Negative_Money_Flow_Sum <= 2.14471e+06 )
									ret := 0.684211
								if( Negative_Money_Flow_Sum > 2.14471e+06 )
									ret := 0.181818
						if( MFI_Low > 13.1117 )
							if( MFI <= 34.0558 )
								if( d <= 16.6265 )
									ret := 0.000000
								if( d > 16.6265 )
									ret := -0.739130 // sell
							if( MFI > 34.0558 )
								if( Raw_Money_Flow <= 55461.2 )
									ret := -0.750000 // sell
								if( Raw_Money_Flow > 55461.2 )
									ret := 0.027778
					if( Raw_Money_Flow > 309227 )
						if( Positive_Money_Flow_Sum <= 9.83932e+07 )
							if( Negative_Money_Flow <= 3.89528e+08 )
								if( Raw_Money_Flow <= 8.81817e+06 )
									ret := 0.211960
								if( Raw_Money_Flow > 8.81817e+06 )
									ret := 0.476190
							if( Negative_Money_Flow > 3.89528e+08 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 9.83932e+07 )
							if( Negative_Money_Flow <= 6.07808e+07 )
								if( rsi1 <= 27.8537 )
									ret := -0.252101
								if( rsi1 > 27.8537 )
									ret := 0.120104
							if( Negative_Money_Flow > 6.07808e+07 )
								if( Raw_Money_Flow <= 8.94012e+07 )
									ret := -0.310345
								if( Raw_Money_Flow > 8.94012e+07 )
									ret := -1.000000 // sell
				if( Typical_Price > 384.544 )
					if( Negative_Money_Flow_Sum <= 3.96183e+08 )
						if( Positive_Money_Flow_Sum <= 6.94342e+06 )
							if( smoothD_d <= 12.1537 )
								if( Negative_Money_Flow_Sum <= 1.45835e+07 )
									ret := 0.126316
								if( Negative_Money_Flow_Sum > 1.45835e+07 )
									ret := 0.445545
							if( smoothD_d > 12.1537 )
								if( rsi1 <= 24.2145 )
									ret := 0.717647 // buy
								if( rsi1 > 24.2145 )
									ret := 0.355872
						if( Positive_Money_Flow_Sum > 6.94342e+06 )
							if( Positive_Money_Flow_Sum <= 2.75675e+07 )
								if( Negative_Money_Flow_Sum <= 3.20265e+08 )
									ret := -0.018595
								if( Negative_Money_Flow_Sum > 3.20265e+08 )
									ret := 0.666667
							if( Positive_Money_Flow_Sum > 2.75675e+07 )
								if( Typical_Price <= 409.741 )
									ret := 0.561538
								if( Typical_Price > 409.741 )
									ret := 0.128940
					if( Negative_Money_Flow_Sum > 3.96183e+08 )
						if( Negative_Money_Flow <= 4.06443e+08 )
							if( rsi1 <= 20.8681 )
								if( MFI_High <= -64.2161 )
									ret := 0.583333
								if( MFI_High > -64.2161 )
									ret := -0.102041
							if( rsi1 > 20.8681 )
								if( Negative_Money_Flow <= 2.63086e+07 )
									ret := 0.325758
								if( Negative_Money_Flow > 2.63086e+07 )
									ret := 0.604743
						if( Negative_Money_Flow > 4.06443e+08 )
							if( Negative_Money_Flow_Sum <= 4.34398e+08 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 4.34398e+08 )
								if( MFI_High <= -74.3393 )
									ret := 1.000000 // buy
								if( MFI_High > -74.3393 )
									ret := -0.666667
			if( Negative_Money_Flow_Sum > 4.79628e+08 )
				if( Raw_Money_Flow <= 4.78452e+07 )
					if( Money_Flow_Ratio <= 0.344652 )
						if( Negative_Money_Flow_Sum <= 7.75058e+08 )
							if( Negative_Money_Flow_Sum <= 5.1604e+08 )
								if( d_k <= -4.25448 )
									ret := 0.714286 // buy
								if( d_k > -4.25448 )
									ret := -0.491525
							if( Negative_Money_Flow_Sum > 5.1604e+08 )
								if( Positive_Money_Flow_Sum <= 2.19438e+08 )
									ret := 0.504237
								if( Positive_Money_Flow_Sum > 2.19438e+08 )
									ret := -0.400000
						if( Negative_Money_Flow_Sum > 7.75058e+08 )
							if( Positive_Money_Flow <= 6.45629e+06 )
								if( rsi1 <= 34.9676 )
									ret := 0.064240
								if( rsi1 > 34.9676 )
									ret := -0.093458
							if( Positive_Money_Flow > 6.45629e+06 )
								if( smoothK_k <= 66.2449 )
									ret := -0.341463
								if( smoothK_k > 66.2449 )
									ret := 0.333333
					if( Money_Flow_Ratio > 0.344652 )
						if( Negative_Money_Flow <= 2.20697e+07 )
							if( k <= 21.5157 )
								if( Typical_Price <= 324.266 )
									ret := 0.294118
								if( Typical_Price > 324.266 )
									ret := -0.317073
							if( k > 21.5157 )
								if( Positive_Money_Flow <= 4.16809e+07 )
									ret := 0.426829
								if( Positive_Money_Flow > 4.16809e+07 )
									ret := -0.266667
						if( Negative_Money_Flow > 2.20697e+07 )
							if( Positive_Money_Flow_Sum <= 1.85546e+08 )
								if( MFI_Low <= 6.51627 )
									ret := 0.000000
								if( MFI_Low > 6.51627 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 1.85546e+08 )
								if( Negative_Money_Flow <= 4.12167e+07 )
									ret := -0.562500
								if( Negative_Money_Flow > 4.12167e+07 )
									ret := -0.192000
				if( Raw_Money_Flow > 4.78452e+07 )
					if( Negative_Money_Flow_Sum <= 1.22906e+09 )
						if( Typical_Price <= 415.024 )
							if( Negative_Money_Flow <= 1.61883e+08 )
								if( Negative_Money_Flow_Sum <= 1.1257e+09 )
									ret := 0.171579
								if( Negative_Money_Flow_Sum > 1.1257e+09 )
									ret := -0.223404
							if( Negative_Money_Flow > 1.61883e+08 )
								if( Typical_Price <= 329.596 )
									ret := 0.421053
								if( Typical_Price > 329.596 )
									ret := -0.296748
						if( Typical_Price > 415.024 )
							if( Negative_Money_Flow_Sum <= 5.4862e+08 )
								if( k <= 8.77856 )
									ret := -0.103448
								if( k > 8.77856 )
									ret := 0.468085
							if( Negative_Money_Flow_Sum > 5.4862e+08 )
								if( rsi1 <= 29.5877 )
									ret := -0.280840
								if( rsi1 > 29.5877 )
									ret := 0.022140
					if( Negative_Money_Flow_Sum > 1.22906e+09 )
						if( d <= 67.5045 )
							if( Typical_Price <= 327.825 )
								if( rsi1 <= 30.0458 )
									ret := 0.792683 // buy
								if( rsi1 > 30.0458 )
									ret := 0.365854
							if( Typical_Price > 327.825 )
								if( Positive_Money_Flow_Sum <= 1.64146e+09 )
									ret := 0.222822
								if( Positive_Money_Flow_Sum > 1.64146e+09 )
									ret := -0.894737 // sell
						if( d > 67.5045 )
							if( Raw_Money_Flow <= 9.91197e+07 )
								if( Typical_Price <= 351.065 )
									ret := -0.666667
								if( Typical_Price > 351.065 )
									ret := 0.380952
							if( Raw_Money_Flow > 9.91197e+07 )
								if( Typical_Price <= 361.769 )
									ret := -0.800000 // sell
								if( Typical_Price > 361.769 )
									ret := -0.100000
		if( rsi1 > 41.0228 )
			if( Negative_Money_Flow_Sum <= 6.85916e+08 )
				if( Raw_Money_Flow <= 1.45112e+08 )
					if( Negative_Money_Flow_Sum <= 4.64669e+08 )
						if( Negative_Money_Flow_Sum <= 2.75902e+08 )
							if( Negative_Money_Flow_Sum <= 1.28699e+06 )
								if( d_k <= 4.27693 )
									ret := -0.571429
								if( d_k > 4.27693 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.28699e+06 )
								if( Raw_Money_Flow <= 4.19384e+07 )
									ret := 0.070776
								if( Raw_Money_Flow > 4.19384e+07 )
									ret := 0.636364
						if( Negative_Money_Flow_Sum > 2.75902e+08 )
							if( Typical_Price <= 367.048 )
								if( MFI <= 27.2745 )
									ret := -0.055556
								if( MFI > 27.2745 )
									ret := -0.602941
							if( Typical_Price > 367.048 )
								if( Raw_Money_Flow <= 4.2752e+07 )
									ret := -0.186869
								if( Raw_Money_Flow > 4.2752e+07 )
									ret := 0.202614
					if( Negative_Money_Flow_Sum > 4.64669e+08 )
						if( Raw_Money_Flow <= 4.1598e+07 )
							if( Typical_Price <= 363.307 )
								if( smoothD_d <= 26.9968 )
									ret := 0.166667
								if( smoothD_d > 26.9968 )
									ret := 0.840580 // buy
							if( Typical_Price > 363.307 )
								if( MFI_High <= -44.3554 )
									ret := 0.281818
								if( MFI_High > -44.3554 )
									ret := -0.666667
						if( Raw_Money_Flow > 4.1598e+07 )
							if( Raw_Money_Flow <= 4.43682e+07 )
								if( k <= 54.4193 )
									ret := -0.750000 // sell
								if( k > 54.4193 )
									ret := 0.200000
							if( Raw_Money_Flow > 4.43682e+07 )
								if( MFI_Low <= 2.76899 )
									ret := -0.171429
								if( MFI_Low > 2.76899 )
									ret := 0.240310
				if( Raw_Money_Flow > 1.45112e+08 )
					if( rsi1 <= 65.6719 )
						if( Raw_Money_Flow <= 1.79319e+08 )
							if( d_k <= -12.9037 )
								ret := 0.200000
							if( d_k > -12.9037 )
								if( Positive_Money_Flow_Sum <= 2.18565e+08 )
									ret := 0.951220 // buy
								if( Positive_Money_Flow_Sum > 2.18565e+08 )
									ret := 0.250000
						if( Raw_Money_Flow > 1.79319e+08 )
							if( d_k <= 3.13497 )
								if( Positive_Money_Flow_Sum <= 6.08925e+06 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 6.08925e+06 )
									ret := -0.140625
							if( d_k > 3.13497 )
								if( Positive_Money_Flow <= 2.45619e+08 )
									ret := 0.555556
								if( Positive_Money_Flow > 2.45619e+08 )
									ret := -1.000000 // sell
					if( rsi1 > 65.6719 )
						ret := -0.714286 // sell
			if( Negative_Money_Flow_Sum > 6.85916e+08 )
				if( Positive_Money_Flow_Sum <= 9.8647e+08 )
					if( d_k <= -16.0939 )
						if( Positive_Money_Flow_Sum <= 8.3143e+08 )
							if( MFI_Low <= 14.0512 )
								if( rsi1 <= 42.8104 )
									ret := -0.384615
								if( rsi1 > 42.8104 )
									ret := 0.104651
							if( MFI_Low > 14.0512 )
								if( Negative_Money_Flow_Sum <= 9.34817e+08 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 9.34817e+08 )
									ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 8.3143e+08 )
							if( Positive_Money_Flow <= 5.14946e+06 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow > 5.14946e+06 )
								ret := 0.750000 // buy
					if( d_k > -16.0939 )
						if( Positive_Money_Flow <= 2.37349e+08 )
							if( Positive_Money_Flow <= 1.08407e+08 )
								if( Positive_Money_Flow <= 1.96127e+06 )
									ret := -0.032158
								if( Positive_Money_Flow > 1.96127e+06 )
									ret := -0.223433
							if( Positive_Money_Flow > 1.08407e+08 )
								if( Money_Flow_Ratio <= 0.267102 )
									ret := -0.571429
								if( Money_Flow_Ratio > 0.267102 )
									ret := 0.647059
						if( Positive_Money_Flow > 2.37349e+08 )
							if( d_k <= -8.39438 )
								ret := 0.250000
							if( d_k > -8.39438 )
								if( Positive_Money_Flow_Sum <= 7.11949e+08 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 7.11949e+08 )
									ret := -0.666667
				if( Positive_Money_Flow_Sum > 9.8647e+08 )
					if( Typical_Price <= 327.416 )
						if( Money_Flow_Ratio <= 0.342733 )
							ret := 0.000000
						if( Money_Flow_Ratio > 0.342733 )
							ret := 0.750000 // buy
					if( Typical_Price > 327.416 )
						if( d <= 10.4497 )
							if( k <= 4.77044 )
								ret := 0.000000
							if( k > 4.77044 )
								ret := 0.500000
						if( d > 10.4497 )
							if( d <= 63.6278 )
								if( Typical_Price <= 423.41 )
									ret := -0.849057 // sell
								if( Typical_Price > 423.41 )
									ret := -0.125000
							if( d > 63.6278 )
								if( Positive_Money_Flow <= 1.55571e+07 )
									ret := 0.000000
								if( Positive_Money_Flow > 1.55571e+07 )
									ret := -0.687500
	if( MFI > 36.0733 )
		if( Positive_Money_Flow <= 154905 )
			if( Negative_Money_Flow <= 1.79925e+08 )
				if( Negative_Money_Flow_Sum <= 1.20689e+09 )
					if( Positive_Money_Flow_Sum <= 1.2277e+06 )
						if( MFI_High <= -39.8679 )
							if( d_k <= -0.045959 )
								if( Money_Flow_Ratio <= 0.582381 )
									ret := 0.250000
								if( Money_Flow_Ratio > 0.582381 )
									ret := -0.473684
							if( d_k > -0.045959 )
								if( rsi1 <= 51.0582 )
									ret := 0.476190
								if( rsi1 > 51.0582 )
									ret := 0.000000
						if( MFI_High > -39.8679 )
							if( Raw_Money_Flow <= 98470.3 )
								if( Negative_Money_Flow_Sum <= 1.51214e+06 )
									ret := -0.040000
								if( Negative_Money_Flow_Sum > 1.51214e+06 )
									ret := 0.800000 // buy
							if( Raw_Money_Flow > 98470.3 )
								if( d_k <= 1.04013 )
									ret := 0.822222 // buy
								if( d_k > 1.04013 )
									ret := 0.428571
					if( Positive_Money_Flow_Sum > 1.2277e+06 )
						if( Positive_Money_Flow_Sum <= 6.98161e+08 )
							if( MFI_Low <= 46.3367 )
								if( rsi1 <= 57.7086 )
									ret := 0.066395
								if( rsi1 > 57.7086 )
									ret := -0.018928
							if( MFI_Low > 46.3367 )
								if( Positive_Money_Flow_Sum <= 5.27656e+08 )
									ret := 0.087162
								if( Positive_Money_Flow_Sum > 5.27656e+08 )
									ret := 0.266430
						if( Positive_Money_Flow_Sum > 6.98161e+08 )
							if( Positive_Money_Flow_Sum <= 8.051e+08 )
								if( Typical_Price <= 413.639 )
									ret := -0.211348
								if( Typical_Price > 413.639 )
									ret := 0.232258
							if( Positive_Money_Flow_Sum > 8.051e+08 )
								if( Negative_Money_Flow_Sum <= 9.81362e+08 )
									ret := 0.052343
								if( Negative_Money_Flow_Sum > 9.81362e+08 )
									ret := -0.192893
				if( Negative_Money_Flow_Sum > 1.20689e+09 )
					if( smoothK_k <= 82.5032 )
						if( Typical_Price <= 378.41 )
							if( d_k <= -12.7928 )
								ret := -0.714286 // sell
							if( d_k > -12.7928 )
								if( Positive_Money_Flow_Sum <= 1.62651e+09 )
									ret := 0.777778 // buy
								if( Positive_Money_Flow_Sum > 1.62651e+09 )
									ret := 0.303030
						if( Typical_Price > 378.41 )
							if( Positive_Money_Flow_Sum <= 9.43104e+08 )
								if( MFI_Low <= 16.8373 )
									ret := 0.400000
								if( MFI_Low > 16.8373 )
									ret := -0.692308
							if( Positive_Money_Flow_Sum > 9.43104e+08 )
								if( k <= 19.943 )
									ret := -0.121212
								if( k > 19.943 )
									ret := 0.464286
					if( smoothK_k > 82.5032 )
						if( Negative_Money_Flow_Sum <= 1.48913e+09 )
							if( rsi1 <= 38.1033 )
								ret := -1.000000 // sell
							if( rsi1 > 38.1033 )
								if( MFI <= 46.5302 )
									ret := 0.400000
								if( MFI > 46.5302 )
									ret := -0.700000 // sell
						if( Negative_Money_Flow_Sum > 1.48913e+09 )
							if( rsi1 <= 40.8648 )
								if( d <= 96.0913 )
									ret := 1.000000 // buy
								if( d > 96.0913 )
									ret := 0.250000
							if( rsi1 > 40.8648 )
								if( Raw_Money_Flow <= 9.8846e+07 )
									ret := 0.076923
								if( Raw_Money_Flow > 9.8846e+07 )
									ret := -0.500000
			if( Negative_Money_Flow > 1.79925e+08 )
				if( d_k <= 0.408946 )
					if( Negative_Money_Flow <= 2.64335e+08 )
						if( smoothD_d <= 38.8303 )
							if( Negative_Money_Flow_Sum <= 1.14612e+09 )
								if( Typical_Price <= 315.645 )
									ret := 0.500000
								if( Typical_Price > 315.645 )
									ret := -0.375000
							if( Negative_Money_Flow_Sum > 1.14612e+09 )
								if( Raw_Money_Flow <= 2.14546e+08 )
									ret := 0.250000
								if( Raw_Money_Flow > 2.14546e+08 )
									ret := 0.750000 // buy
						if( smoothD_d > 38.8303 )
							if( Negative_Money_Flow_Sum <= 2.94594e+08 )
								if( Money_Flow_Ratio <= 4.20931 )
									ret := 0.000000
								if( Money_Flow_Ratio > 4.20931 )
									ret := -0.500000
							if( Negative_Money_Flow_Sum > 2.94594e+08 )
								if( Money_Flow_Ratio <= 0.604352 )
									ret := -0.250000
								if( Money_Flow_Ratio > 0.604352 )
									ret := 0.683333
					if( Negative_Money_Flow > 2.64335e+08 )
						if( Typical_Price <= 363.708 )
							if( Positive_Money_Flow_Sum <= 5.45072e+08 )
								ret := 0.250000
							if( Positive_Money_Flow_Sum > 5.45072e+08 )
								if( rsi1 <= 56.4294 )
									ret := -1.000000 // sell
								if( rsi1 > 56.4294 )
									ret := -0.500000
						if( Typical_Price > 363.708 )
							if( k <= 47.5269 )
								if( Money_Flow_Ratio <= 0.840986 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 0.840986 )
									ret := 0.200000
							if( k > 47.5269 )
								if( Positive_Money_Flow_Sum <= 2.11906e+09 )
									ret := 0.210526
								if( Positive_Money_Flow_Sum > 2.11906e+09 )
									ret := -0.571429
				if( d_k > 0.408946 )
					if( Positive_Money_Flow_Sum <= 2.91768e+09 )
						if( Typical_Price <= 337.567 )
							if( Money_Flow_Ratio <= 2.05274 )
								if( rsi1 <= 31.1827 )
									ret := -1.000000 // sell
								if( rsi1 > 31.1827 )
									ret := 0.301587
							if( Money_Flow_Ratio > 2.05274 )
								if( k <= 86.1625 )
									ret := -1.000000 // sell
								if( k > 86.1625 )
									ret := 0.400000
						if( Typical_Price > 337.567 )
							if( Typical_Price <= 410.253 )
								if( Money_Flow_Ratio <= 0.575457 )
									ret := 0.800000 // buy
								if( Money_Flow_Ratio > 0.575457 )
									ret := -0.527273
							if( Typical_Price > 410.253 )
								if( Negative_Money_Flow_Sum <= 3.08168e+08 )
									ret := -0.800000 // sell
								if( Negative_Money_Flow_Sum > 3.08168e+08 )
									ret := 0.148936
					if( Positive_Money_Flow_Sum > 2.91768e+09 )
						if( d <= 96.7955 )
							if( Typical_Price <= 407.896 )
								if( Positive_Money_Flow_Sum <= 3.76739e+09 )
									ret := 0.818182 // buy
								if( Positive_Money_Flow_Sum > 3.76739e+09 )
									ret := 1.000000 // buy
							if( Typical_Price > 407.896 )
								ret := -0.200000
						if( d > 96.7955 )
							ret := -0.833333 // sell
		if( Positive_Money_Flow > 154905 )
			if( Typical_Price <= 424.245 )
				if( Negative_Money_Flow <= 8588 )
					if( Negative_Money_Flow_Sum <= 1.44203e+08 )
						if( rsi1 <= 49.8708 )
							if( MFI_Low <= 25.1781 )
								if( Raw_Money_Flow <= 6.27954e+06 )
									ret := 0.238532
								if( Raw_Money_Flow > 6.27954e+06 )
									ret := -0.386364
							if( MFI_Low > 25.1781 )
								if( Negative_Money_Flow_Sum <= 4.66994e+06 )
									ret := 0.132208
								if( Negative_Money_Flow_Sum > 4.66994e+06 )
									ret := -0.111359
						if( rsi1 > 49.8708 )
							if( Positive_Money_Flow <= 3.57061e+08 )
								if( Positive_Money_Flow_Sum <= 9.50321e+08 )
									ret := -0.041980
								if( Positive_Money_Flow_Sum > 9.50321e+08 )
									ret := -0.255102
							if( Positive_Money_Flow > 3.57061e+08 )
								if( smoothD_d <= 22.1509 )
									ret := -0.818182 // sell
								if( smoothD_d > 22.1509 )
									ret := 0.377049
					if( Negative_Money_Flow_Sum > 1.44203e+08 )
						if( Negative_Money_Flow_Sum <= 3.42044e+08 )
							if( smoothK_k <= 93.5906 )
								if( MFI <= 86.8763 )
									ret := 0.130041
								if( MFI > 86.8763 )
									ret := -0.113208
							if( smoothK_k > 93.5906 )
								if( Typical_Price <= 370.779 )
									ret := -0.165663
								if( Typical_Price > 370.779 )
									ret := 0.118993
						if( Negative_Money_Flow_Sum > 3.42044e+08 )
							if( Positive_Money_Flow_Sum <= 2.5098e+09 )
								if( Positive_Money_Flow_Sum <= 2.42302e+08 )
									ret := -0.387097
								if( Positive_Money_Flow_Sum > 2.42302e+08 )
									ret := -0.006785
							if( Positive_Money_Flow_Sum > 2.5098e+09 )
								if( d <= 29.3781 )
									ret := 0.080645
								if( d > 29.3781 )
									ret := -0.342742
				if( Negative_Money_Flow > 8588 )
					if( Negative_Money_Flow_Sum <= 1.1999e+07 )
						if( MFI_Low <= 62.4555 )
							if( Positive_Money_Flow <= 181840 )
								if( smoothK_k <= 39.2657 )
									ret := -1.000000 // sell
								if( smoothK_k > 39.2657 )
									ret := -0.043478
							if( Positive_Money_Flow > 181840 )
								if( Money_Flow_Ratio <= 1.81465 )
									ret := 0.534247
								if( Money_Flow_Ratio > 1.81465 )
									ret := 0.076923
						if( MFI_Low > 62.4555 )
							if( Positive_Money_Flow <= 238012 )
								if( Positive_Money_Flow_Sum <= 1.80789e+07 )
									ret := -0.714286 // sell
								if( Positive_Money_Flow_Sum > 1.80789e+07 )
									ret := 0.454545
							if( Positive_Money_Flow > 238012 )
								if( MFI <= 92.2144 )
									ret := 0.953488 // buy
								if( MFI > 92.2144 )
									ret := 0.574468
					if( Negative_Money_Flow_Sum > 1.1999e+07 )
						if( rsi1 <= 50.1801 )
							if( MFI_High <= 3.99184 )
								if( Typical_Price <= 348.2 )
									ret := 0.531250
								if( Typical_Price > 348.2 )
									ret := -0.175439
							if( MFI_High > 3.99184 )
								if( Typical_Price <= 410.221 )
									ret := -0.826087 // sell
								if( Typical_Price > 410.221 )
									ret := 0.600000
						if( rsi1 > 50.1801 )
							if( Typical_Price <= 329.769 )
								if( Positive_Money_Flow <= 9.66125e+07 )
									ret := -0.375000
								if( Positive_Money_Flow > 9.66125e+07 )
									ret := 1.000000 // buy
							if( Typical_Price > 329.769 )
								if( smoothD_d <= 94.5477 )
									ret := 0.213793
								if( smoothD_d > 94.5477 )
									ret := -0.500000
			if( Typical_Price > 424.245 )
				if( MFI_High <= -37.8598 )
					if( Negative_Money_Flow_Sum <= 8.27313e+08 )
						if( Positive_Money_Flow_Sum <= 2.35486e+08 )
							if( Raw_Money_Flow <= 3.2966e+06 )
								if( d_k <= -9.5809 )
									ret := 0.575000
								if( d_k > -9.5809 )
									ret := -0.018182
							if( Raw_Money_Flow > 3.2966e+06 )
								if( rsi1 <= 47.7859 )
									ret := 0.036364
								if( rsi1 > 47.7859 )
									ret := -0.540541
						if( Positive_Money_Flow_Sum > 2.35486e+08 )
							if( Money_Flow_Ratio <= 0.56932 )
								ret := -1.000000 // sell
							if( Money_Flow_Ratio > 0.56932 )
								if( Typical_Price <= 431.867 )
									ret := 0.140351
								if( Typical_Price > 431.867 )
									ret := 0.555556
					if( Negative_Money_Flow_Sum > 8.27313e+08 )
						if( smoothK_k <= 24.9957 )
							if( k <= 16.3759 )
								ret := -0.250000
							if( k > 16.3759 )
								ret := 0.750000 // buy
						if( smoothK_k > 24.9957 )
							if( rsi1 <= 53.3357 )
								if( Raw_Money_Flow <= 7.16245e+07 )
									ret := -0.500000
								if( Raw_Money_Flow > 7.16245e+07 )
									ret := -0.846154 // sell
							if( rsi1 > 53.3357 )
								if( Money_Flow_Ratio <= 0.582655 )
									ret := -0.250000
								if( Money_Flow_Ratio > 0.582655 )
									ret := 0.000000
				if( MFI_High > -37.8598 )
					if( rsi1 <= 62.8837 )
						if( k <= 95.9106 )
							if( Positive_Money_Flow_Sum <= 8.59686e+07 )
								if( Raw_Money_Flow <= 1.64347e+06 )
									ret := -0.057851
								if( Raw_Money_Flow > 1.64347e+06 )
									ret := -0.423077
							if( Positive_Money_Flow_Sum > 8.59686e+07 )
								if( MFI_High <= -26.5302 )
									ret := -0.120902
								if( MFI_High > -26.5302 )
									ret := 0.051604
						if( k > 95.9106 )
							if( rsi1 <= 40.6148 )
								ret := -0.750000 // sell
							if( rsi1 > 40.6148 )
								if( Negative_Money_Flow_Sum <= 2.66505e+08 )
									ret := 0.132075
								if( Negative_Money_Flow_Sum > 2.66505e+08 )
									ret := 0.422222
					if( rsi1 > 62.8837 )
						if( Negative_Money_Flow_Sum <= 3.51496e+08 )
							if( Positive_Money_Flow_Sum <= 2.84761e+08 )
								if( Raw_Money_Flow <= 1.62131e+06 )
									ret := -0.068862
								if( Raw_Money_Flow > 1.62131e+06 )
									ret := -0.505000
							if( Positive_Money_Flow_Sum > 2.84761e+08 )
								if( Positive_Money_Flow_Sum <= 7.66935e+08 )
									ret := 0.041176
								if( Positive_Money_Flow_Sum > 7.66935e+08 )
									ret := -0.237805
						if( Negative_Money_Flow_Sum > 3.51496e+08 )
							if( Positive_Money_Flow <= 7.26284e+07 )
								if( MFI_High <= -20.7366 )
									ret := 0.035714
								if( MFI_High > -20.7366 )
									ret := -0.439024
							if( Positive_Money_Flow > 7.26284e+07 )
								if( Positive_Money_Flow <= 2.28729e+08 )
									ret := -0.702381 // sell
								if( Positive_Money_Flow > 2.28729e+08 )
									ret := -0.058824
	
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
float op_operation = decision_tree_0_MSFT_5Min_0845ab42(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


