//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: SOLUSDT_30Min_2MS0_a29d14ca Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_30Min_2MS0_a29d14ca", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_30Min_a29d14ca(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( k <= 54.1673 )
		if( d_k <= -4.92392 )
			if( smoothK_k <= 20.5551 )
				if( rsi1 <= 28.336 )
					if( Positive_Money_Flow_Sum <= 289496 )
						if( MFI_Low <= -3.53803 )
							if( Negative_Money_Flow <= 31945.5 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow > 31945.5 )
								ret := 0.555556
						if( MFI_Low > -3.53803 )
							if( Positive_Money_Flow_Sum <= 110520 )
								ret := -0.833333 // sell
							if( Positive_Money_Flow_Sum > 110520 )
								ret := 0.277778
					if( Positive_Money_Flow_Sum > 289496 )
						if( Raw_Money_Flow <= 6.3833e+06 )
							if( MFI <= 23.5594 )
								if( smoothD_d <= 9.31653 )
									ret := -0.572327
								if( smoothD_d > 9.31653 )
									ret := 0.050000
							if( MFI > 23.5594 )
								if( Raw_Money_Flow <= 580688 )
									ret := -0.983871 // sell
								if( Raw_Money_Flow > 580688 )
									ret := -0.697479
						if( Raw_Money_Flow > 6.3833e+06 )
							if( Positive_Money_Flow_Sum <= 3.15397e+07 )
								if( smoothK_k <= 17.7694 )
									ret := -0.078125
								if( smoothK_k > 17.7694 )
									ret := 0.428571
							if( Positive_Money_Flow_Sum > 3.15397e+07 )
								if( Negative_Money_Flow_Sum <= 2.16759e+08 )
									ret := -0.629032
								if( Negative_Money_Flow_Sum > 2.16759e+08 )
									ret := -1.000000 // sell
				if( rsi1 > 28.336 )
					if( Typical_Price <= 95.7905 )
						if( Typical_Price <= 25.8239 )
							if( Money_Flow_Ratio <= 0.571302 )
								if( MFI_High <= -46.623 )
									ret := 0.051793
								if( MFI_High > -46.623 )
									ret := 0.533333
							if( Money_Flow_Ratio > 0.571302 )
								if( Typical_Price <= 5.16779 )
									ret := -0.314721
								if( Typical_Price > 5.16779 )
									ret := -0.040865
						if( Typical_Price > 25.8239 )
							if( d <= 10.8189 )
								if( Positive_Money_Flow <= 9.99324e+06 )
									ret := 0.053364
								if( Positive_Money_Flow > 9.99324e+06 )
									ret := -0.636364
							if( d > 10.8189 )
								if( rsi1 <= 47.5195 )
									ret := 0.257778
								if( rsi1 > 47.5195 )
									ret := 0.690909
					if( Typical_Price > 95.7905 )
						if( rsi1 <= 47.7914 )
							if( MFI <= 35.3988 )
								if( MFI_High <= -45.8197 )
									ret := -0.137931
								if( MFI_High > -45.8197 )
									ret := 0.478261
							if( MFI > 35.3988 )
								if( Negative_Money_Flow_Sum <= 4.52327e+07 )
									ret := -0.142857
								if( Negative_Money_Flow_Sum > 4.52327e+07 )
									ret := -0.540541
						if( rsi1 > 47.7914 )
							if( Typical_Price <= 219.562 )
								if( d <= 14.7122 )
									ret := -0.014851
								if( d > 14.7122 )
									ret := 0.516129
							if( Typical_Price > 219.562 )
								ret := 0.857143 // buy
			if( smoothK_k > 20.5551 )
				if( Typical_Price <= 4.20549 )
					if( Raw_Money_Flow <= 29991.9 )
						if( MFI_Low <= 21.4612 )
							if( MFI_High <= -47.7271 )
								if( Money_Flow_Ratio <= 0.32924 )
									ret := -0.677419
								if( Money_Flow_Ratio > 0.32924 )
									ret := 0.000000
							if( MFI_High > -47.7271 )
								if( Negative_Money_Flow <= 19376.7 )
									ret := -0.918367 // sell
								if( Negative_Money_Flow > 19376.7 )
									ret := -0.444444
						if( MFI_Low > 21.4612 )
							if( Raw_Money_Flow <= 22422.2 )
								if( Raw_Money_Flow <= 14327.5 )
									ret := -0.611111
								if( Raw_Money_Flow > 14327.5 )
									ret := 0.138889
							if( Raw_Money_Flow > 22422.2 )
								ret := -0.666667
					if( Raw_Money_Flow > 29991.9 )
						if( MFI <= 63.3201 )
							if( Typical_Price <= 2.94913 )
								if( Positive_Money_Flow_Sum <= 510846 )
									ret := -0.003086
								if( Positive_Money_Flow_Sum > 510846 )
									ret := 0.475177
							if( Typical_Price > 2.94913 )
								if( Typical_Price <= 3.13923 )
									ret := -0.693878
								if( Typical_Price > 3.13923 )
									ret := -0.024691
						if( MFI > 63.3201 )
							if( Positive_Money_Flow <= 282076 )
								if( Typical_Price <= 1.73456 )
									ret := 0.076923
								if( Typical_Price > 1.73456 )
									ret := -0.640625
							if( Positive_Money_Flow > 282076 )
								ret := 0.400000
				if( Typical_Price > 4.20549 )
					if( rsi1 <= 50.0161 )
						if( Positive_Money_Flow_Sum <= 5.37821e+07 )
							if( rsi1 <= 33.3934 )
								if( Money_Flow_Ratio <= 0.233844 )
									ret := 0.238710
								if( Money_Flow_Ratio > 0.233844 )
									ret := -0.328014
							if( rsi1 > 33.3934 )
								if( MFI_High <= -57.4942 )
									ret := 0.600000
								if( MFI_High > -57.4942 )
									ret := 0.253032
						if( Positive_Money_Flow_Sum > 5.37821e+07 )
							if( Negative_Money_Flow <= 6.42026e+06 )
								if( MFI <= 41.881 )
									ret := -0.335025
								if( MFI > 41.881 )
									ret := -0.632558
							if( Negative_Money_Flow > 6.42026e+06 )
								if( MFI_High <= -48.8043 )
									ret := 0.503817
								if( MFI_High > -48.8043 )
									ret := -0.211180
					if( rsi1 > 50.0161 )
						if( smoothD_d <= 21.5599 )
							if( Negative_Money_Flow_Sum <= 1.32865e+08 )
								if( Negative_Money_Flow_Sum <= 3.75313e+06 )
									ret := -0.166667
								if( Negative_Money_Flow_Sum > 3.75313e+06 )
									ret := 0.519084
							if( Negative_Money_Flow_Sum > 1.32865e+08 )
								if( Money_Flow_Ratio <= 2.09269 )
									ret := 0.152174
								if( Money_Flow_Ratio > 2.09269 )
									ret := -1.000000 // sell
						if( smoothD_d > 21.5599 )
							if( Negative_Money_Flow_Sum <= 1.50171e+07 )
								if( MFI_Low <= 42.1275 )
									ret := 0.574230
								if( MFI_Low > 42.1275 )
									ret := 0.387097
							if( Negative_Money_Flow_Sum > 1.50171e+07 )
								if( MFI <= 67.2637 )
									ret := 0.698873
								if( MFI > 67.2637 )
									ret := 0.373239
		if( d_k > -4.92392 )
			if( rsi1 <= 42.6208 )
				if( Positive_Money_Flow_Sum <= 3.01356e+06 )
					if( Negative_Money_Flow_Sum <= 4.48111e+06 )
						if( Money_Flow_Ratio <= 0.470302 )
							if( Negative_Money_Flow <= 111109 )
								if( MFI_High <= -61.0323 )
									ret := 0.326446
								if( MFI_High > -61.0323 )
									ret := -0.084472
							if( Negative_Money_Flow > 111109 )
								if( d_k <= 1.08822 )
									ret := 0.452991
								if( d_k > 1.08822 )
									ret := 0.251852
						if( Money_Flow_Ratio > 0.470302 )
							if( Positive_Money_Flow_Sum <= 1.38551e+06 )
								if( Negative_Money_Flow_Sum <= 722461 )
									ret := -0.231726
								if( Negative_Money_Flow_Sum > 722461 )
									ret := 0.217391
							if( Positive_Money_Flow_Sum > 1.38551e+06 )
								if( k <= 48.014 )
									ret := -0.314991
								if( k > 48.014 )
									ret := 0.700000 // buy
					if( Negative_Money_Flow_Sum > 4.48111e+06 )
						if( rsi1 <= 25.7695 )
							if( d_k <= -1.09433 )
								if( Typical_Price <= 8.3487 )
									ret := 0.538462
								if( Typical_Price > 8.3487 )
									ret := -0.350000
							if( d_k > -1.09433 )
								if( Typical_Price <= 3.60113 )
									ret := 0.629630
								if( Typical_Price > 3.60113 )
									ret := -0.681416
						if( rsi1 > 25.7695 )
							if( MFI_Low <= 7.31064 )
								if( Typical_Price <= 7.52521 )
									ret := 0.734375 // buy
								if( Typical_Price > 7.52521 )
									ret := -0.173913
							if( MFI_Low > 7.31064 )
								if( Negative_Money_Flow_Sum <= 4.68701e+06 )
									ret := -0.736842 // sell
								if( Negative_Money_Flow_Sum > 4.68701e+06 )
									ret := -0.118280
				if( Positive_Money_Flow_Sum > 3.01356e+06 )
					if( d_k <= 0.901227 )
						if( rsi1 <= 29.0509 )
							if( MFI_High <= -52.1223 )
								if( smoothD_d <= 2.2638 )
									ret := -0.728522 // sell
								if( smoothD_d > 2.2638 )
									ret := -0.501292
							if( MFI_High > -52.1223 )
								if( rsi1 <= 27.4607 )
									ret := -0.782634 // sell
								if( rsi1 > 27.4607 )
									ret := -0.608142
						if( rsi1 > 29.0509 )
							if( Positive_Money_Flow_Sum <= 1.49266e+08 )
								if( Positive_Money_Flow <= 1.41602e+06 )
									ret := -0.298706
								if( Positive_Money_Flow > 1.41602e+06 )
									ret := -0.510878
							if( Positive_Money_Flow_Sum > 1.49266e+08 )
								if( MFI_Low <= 25.8592 )
									ret := -0.313043
								if( MFI_Low > 25.8592 )
									ret := -0.799296 // sell
					if( d_k > 0.901227 )
						if( Positive_Money_Flow_Sum <= 7.57926e+06 )
							if( rsi1 <= 30.7079 )
								if( Money_Flow_Ratio <= 1.33858 )
									ret := -0.689434
								if( Money_Flow_Ratio > 1.33858 )
									ret := -0.210526
							if( rsi1 > 30.7079 )
								if( Negative_Money_Flow <= 3.44378e+06 )
									ret := -0.409915
								if( Negative_Money_Flow > 3.44378e+06 )
									ret := 0.800000 // buy
						if( Positive_Money_Flow_Sum > 7.57926e+06 )
							if( rsi1 <= 33.3972 )
								if( Negative_Money_Flow <= 6.46656e+07 )
									ret := -0.783240 // sell
								if( Negative_Money_Flow > 6.46656e+07 )
									ret := 0.045455
							if( rsi1 > 33.3972 )
								if( MFI_High <= -51.2351 )
									ret := 0.204082
								if( MFI_High > -51.2351 )
									ret := -0.654287
			if( rsi1 > 42.6208 )
				if( Positive_Money_Flow <= 1.72427e+06 )
					if( MFI <= 50.5543 )
						if( Raw_Money_Flow <= 1.45738e+06 )
							if( smoothD_d <= 2.2854 )
								if( Negative_Money_Flow_Sum <= 6.95333e+06 )
									ret := -0.582090
								if( Negative_Money_Flow_Sum > 6.95333e+06 )
									ret := -0.033333
							if( smoothD_d > 2.2854 )
								if( smoothK_k <= 5.44071 )
									ret := -0.354545
								if( smoothK_k > 5.44071 )
									ret := 0.050035
						if( Raw_Money_Flow > 1.45738e+06 )
							if( rsi1 <= 45.0952 )
								if( d_k <= 12.3989 )
									ret := 0.092697
								if( d_k > 12.3989 )
									ret := -0.534884
							if( rsi1 > 45.0952 )
								if( Negative_Money_Flow <= 2.61229e+07 )
									ret := 0.390046
								if( Negative_Money_Flow > 2.61229e+07 )
									ret := -0.102564
					if( MFI > 50.5543 )
						if( smoothK_k <= 12.2889 )
							if( smoothD_d <= 18.5472 )
								if( Typical_Price <= 1.83242 )
									ret := 0.384615
								if( Typical_Price > 1.83242 )
									ret := -0.209433
							if( smoothD_d > 18.5472 )
								if( Positive_Money_Flow_Sum <= 1.29911e+08 )
									ret := -0.473958
								if( Positive_Money_Flow_Sum > 1.29911e+08 )
									ret := 0.195402
						if( smoothK_k > 12.2889 )
							if( Typical_Price <= 1.47845 )
								if( Money_Flow_Ratio <= 1.82512 )
									ret := 0.387097
								if( Money_Flow_Ratio > 1.82512 )
									ret := 0.769231 // buy
							if( Typical_Price > 1.47845 )
								if( rsi1 <= 61.8663 )
									ret := -0.195747
								if( rsi1 > 61.8663 )
									ret := 0.288060
				if( Positive_Money_Flow > 1.72427e+06 )
					if( Money_Flow_Ratio <= 1.34554 )
						if( MFI <= 33.1985 )
							if( Negative_Money_Flow_Sum <= 7.93818e+07 )
								ret := 0.055556
							if( Negative_Money_Flow_Sum > 7.93818e+07 )
								if( Typical_Price <= 129.062 )
									ret := 0.857143 // buy
								if( Typical_Price > 129.062 )
									ret := 0.600000
						if( MFI > 33.1985 )
							if( d <= 52.0835 )
								if( d_k <= 0.045506 )
									ret := 0.078313
								if( d_k > 0.045506 )
									ret := -0.300971
							if( d > 52.0835 )
								if( Raw_Money_Flow <= 1.80302e+07 )
									ret := -0.540650
								if( Raw_Money_Flow > 1.80302e+07 )
									ret := 0.525000
					if( Money_Flow_Ratio > 1.34554 )
						if( d_k <= 3.44124 )
							if( MFI_Low <= 40.3996 )
								if( rsi1 <= 55.8465 )
									ret := -0.641026
								if( rsi1 > 55.8465 )
									ret := -0.083333
							if( MFI_Low > 40.3996 )
								if( rsi1 <= 59.2265 )
									ret := -0.280822
								if( rsi1 > 59.2265 )
									ret := 0.205263
						if( d_k > 3.44124 )
							if( d_k <= 11.396 )
								if( MFI_High <= -0.266703 )
									ret := -0.395311
								if( MFI_High > -0.266703 )
									ret := -0.605422
							if( d_k > 11.396 )
								if( Positive_Money_Flow_Sum <= 8.79059e+07 )
									ret := -0.699434
								if( Positive_Money_Flow_Sum > 8.79059e+07 )
									ret := -0.435381
	if( k > 54.1673 )
		if( d_k <= 2.85765 )
			if( Typical_Price <= 4.22331 )
				if( Negative_Money_Flow_Sum <= 640308 )
					if( Positive_Money_Flow <= 54363.7 )
						if( rsi1 <= 40.0063 )
							if( MFI <= 25.0312 )
								if( Negative_Money_Flow_Sum <= 510781 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 510781 )
									ret := -0.777778 // sell
							if( MFI > 25.0312 )
								if( Raw_Money_Flow <= 126451 )
									ret := -0.104167
								if( Raw_Money_Flow > 126451 )
									ret := -1.000000 // sell
						if( rsi1 > 40.0063 )
							if( Raw_Money_Flow <= 6760.06 )
								if( Positive_Money_Flow <= 2455.64 )
									ret := 0.416667
								if( Positive_Money_Flow > 2455.64 )
									ret := 0.933333 // buy
							if( Raw_Money_Flow > 6760.06 )
								if( d <= 98.5486 )
									ret := -0.016870
								if( d > 98.5486 )
									ret := 0.303371
					if( Positive_Money_Flow > 54363.7 )
						if( smoothD_d <= 92.0136 )
							if( Typical_Price <= 1.7444 )
								if( k <= 70.8476 )
									ret := 0.500000
								if( k > 70.8476 )
									ret := -0.250000
							if( Typical_Price > 1.7444 )
								if( MFI_High <= -16.5821 )
									ret := -0.270408
								if( MFI_High > -16.5821 )
									ret := -0.591549
						if( smoothD_d > 92.0136 )
							if( smoothK_k <= 95.973 )
								if( Raw_Money_Flow <= 120383 )
									ret := -0.241935
								if( Raw_Money_Flow > 120383 )
									ret := 0.949153 // buy
							if( smoothK_k > 95.973 )
								if( rsi1 <= 87.7138 )
									ret := -0.213115
								if( rsi1 > 87.7138 )
									ret := -0.909091 // sell
				if( Negative_Money_Flow_Sum > 640308 )
					if( Positive_Money_Flow_Sum <= 7.77784e+06 )
						if( smoothK_k <= 79.1249 )
							if( MFI_Low <= 21.6644 )
								if( Positive_Money_Flow_Sum <= 564187 )
									ret := 0.141026
								if( Positive_Money_Flow_Sum > 564187 )
									ret := 0.585492
							if( MFI_Low > 21.6644 )
								if( Positive_Money_Flow <= 232643 )
									ret := -0.128205
								if( Positive_Money_Flow > 232643 )
									ret := -0.739496 // sell
						if( smoothK_k > 79.1249 )
							if( rsi1 <= 77.3053 )
								if( k <= 85.7167 )
									ret := 0.500000
								if( k > 85.7167 )
									ret := 0.120270
							if( rsi1 > 77.3053 )
								if( k <= 98.7484 )
									ret := 0.942308 // buy
								if( k > 98.7484 )
									ret := 0.181818
					if( Positive_Money_Flow_Sum > 7.77784e+06 )
						if( Typical_Price <= 3.44127 )
							if( Negative_Money_Flow_Sum <= 7.17883e+06 )
								ret := 0.125000
							if( Negative_Money_Flow_Sum > 7.17883e+06 )
								ret := -0.800000 // sell
						if( Typical_Price > 3.44127 )
							if( smoothD_d <= 82.1721 )
								ret := -0.500000
							if( smoothD_d > 82.1721 )
								ret := -1.000000 // sell
			if( Typical_Price > 4.22331 )
				if( Negative_Money_Flow <= 1.19597e+06 )
					if( smoothK_k <= 81.0207 )
						if( Positive_Money_Flow_Sum <= 7.27323e+07 )
							if( d <= 47.6761 )
								if( Raw_Money_Flow <= 737525 )
									ret := 0.336449
								if( Raw_Money_Flow > 737525 )
									ret := 0.586634
							if( d > 47.6761 )
								if( rsi1 <= 51.5934 )
									ret := -0.048928
								if( rsi1 > 51.5934 )
									ret := 0.516025
						if( Positive_Money_Flow_Sum > 7.27323e+07 )
							if( Raw_Money_Flow <= 1.35386e+07 )
								if( Money_Flow_Ratio <= 1.09662 )
									ret := -0.161435
								if( Money_Flow_Ratio > 1.09662 )
									ret := 0.551559
							if( Raw_Money_Flow > 1.35386e+07 )
								if( Money_Flow_Ratio <= 3.15003 )
									ret := -0.037080
								if( Money_Flow_Ratio > 3.15003 )
									ret := 0.370629
					if( smoothK_k > 81.0207 )
						if( MFI_High <= -34.5415 )
							if( Positive_Money_Flow_Sum <= 7.84379e+06 )
								if( rsi1 <= 62.9883 )
									ret := 0.174185
								if( rsi1 > 62.9883 )
									ret := 0.610984
							if( Positive_Money_Flow_Sum > 7.84379e+06 )
								if( Positive_Money_Flow_Sum <= 2.50484e+08 )
									ret := 0.467086
								if( Positive_Money_Flow_Sum > 2.50484e+08 )
									ret := -0.068966
						if( MFI_High > -34.5415 )
							if( smoothK_k <= 90.4135 )
								if( rsi1 <= 58.464 )
									ret := 0.046053
								if( rsi1 > 58.464 )
									ret := 0.589681
							if( smoothK_k > 90.4135 )
								if( rsi1 <= 60.62 )
									ret := 0.266491
								if( rsi1 > 60.62 )
									ret := 0.676034
				if( Negative_Money_Flow > 1.19597e+06 )
					if( rsi1 <= 49.3122 )
						if( MFI <= 31.7858 )
							if( Raw_Money_Flow <= 1.43344e+07 )
								if( smoothD_d <= 80.2627 )
									ret := 0.433536
								if( smoothD_d > 80.2627 )
									ret := -0.077844
							if( Raw_Money_Flow > 1.43344e+07 )
								if( smoothD_d <= 33.7587 )
									ret := -0.296296
								if( smoothD_d > 33.7587 )
									ret := 0.679458
						if( MFI > 31.7858 )
							if( Negative_Money_Flow_Sum <= 7.22972e+07 )
								if( Negative_Money_Flow_Sum <= 4.70898e+07 )
									ret := 0.037221
								if( Negative_Money_Flow_Sum > 4.70898e+07 )
									ret := 0.389744
							if( Negative_Money_Flow_Sum > 7.22972e+07 )
								if( rsi1 <= 42.733 )
									ret := -0.377273
								if( rsi1 > 42.733 )
									ret := 0.098413
					if( rsi1 > 49.3122 )
						if( d <= 98.181 )
							if( d_k <= -0.269344 )
								if( Negative_Money_Flow_Sum <= 9.08571e+08 )
									ret := 0.705226 // buy
								if( Negative_Money_Flow_Sum > 9.08571e+08 )
									ret := -0.444444
							if( d_k > -0.269344 )
								if( Raw_Money_Flow <= 4.92426e+06 )
									ret := 0.365482
								if( Raw_Money_Flow > 4.92426e+06 )
									ret := 0.657926
						if( d > 98.181 )
							if( Raw_Money_Flow <= 1.2991e+07 )
								if( k <= 96.3461 )
									ret := -0.095238
								if( k > 96.3461 )
									ret := 0.434932
							if( Raw_Money_Flow > 1.2991e+07 )
								if( Money_Flow_Ratio <= 0.940188 )
									ret := 0.977273 // buy
								if( Money_Flow_Ratio > 0.940188 )
									ret := 0.523810
		if( d_k > 2.85765 )
			if( k <= 75.1516 )
				if( rsi1 <= 59.6282 )
					if( Positive_Money_Flow <= 1.93258e+06 )
						if( smoothK_k <= 63.5358 )
							if( rsi1 <= 41.4659 )
								if( MFI_High <= -37.8821 )
									ret := -0.354086
								if( MFI_High > -37.8821 )
									ret := -0.666667
							if( rsi1 > 41.4659 )
								if( MFI <= 58.1208 )
									ret := 0.000000
								if( MFI > 58.1208 )
									ret := -0.347490
						if( smoothK_k > 63.5358 )
							if( Negative_Money_Flow <= 4.65555e+06 )
								if( Negative_Money_Flow_Sum <= 646121 )
									ret := 0.252747
								if( Negative_Money_Flow_Sum > 646121 )
									ret := -0.203170
							if( Negative_Money_Flow > 4.65555e+06 )
								if( d <= 83.9811 )
									ret := 0.252964
								if( d > 83.9811 )
									ret := -0.258065
					if( Positive_Money_Flow > 1.93258e+06 )
						if( Negative_Money_Flow_Sum <= 4.39027e+07 )
							if( MFI_Low <= 47.6448 )
								if( Raw_Money_Flow <= 2.3979e+06 )
									ret := -0.313725
								if( Raw_Money_Flow > 2.3979e+06 )
									ret := -0.645238
							if( MFI_Low > 47.6448 )
								if( Positive_Money_Flow_Sum <= 2.18699e+07 )
									ret := -0.530612
								if( Positive_Money_Flow_Sum > 2.18699e+07 )
									ret := -0.816000 // sell
						if( Negative_Money_Flow_Sum > 4.39027e+07 )
							if( rsi1 <= 45.3507 )
								if( Positive_Money_Flow <= 1.17597e+07 )
									ret := -0.596330
								if( Positive_Money_Flow > 1.17597e+07 )
									ret := -0.787037 // sell
							if( rsi1 > 45.3507 )
								if( MFI_Low <= 30.3086 )
									ret := 0.259542
								if( MFI_Low > 30.3086 )
									ret := -0.442748
				if( rsi1 > 59.6282 )
					if( Negative_Money_Flow_Sum <= 3.35607e+07 )
						if( MFI <= 73.0199 )
							if( d <= 68.5224 )
								if( MFI_High <= -31.3149 )
									ret := -0.461538
								if( MFI_High > -31.3149 )
									ret := 0.532164
							if( d > 68.5224 )
								if( rsi1 <= 64.8915 )
									ret := 0.005935
								if( rsi1 > 64.8915 )
									ret := 0.416938
						if( MFI > 73.0199 )
							if( MFI_Low <= 70.4849 )
								if( MFI_Low <= 66.5268 )
									ret := -0.097716
								if( MFI_Low > 66.5268 )
									ret := -0.631206
							if( MFI_Low > 70.4849 )
								if( rsi1 <= 79.8695 )
									ret := -0.172840
								if( rsi1 > 79.8695 )
									ret := 0.789474 // buy
					if( Negative_Money_Flow_Sum > 3.35607e+07 )
						if( MFI <= 65.7358 )
							if( rsi1 <= 64.5738 )
								if( Negative_Money_Flow <= 4.91169e+06 )
									ret := 0.137931
								if( Negative_Money_Flow > 4.91169e+06 )
									ret := 0.479167
							if( rsi1 > 64.5738 )
								if( Typical_Price <= 156.16 )
									ret := 0.893130 // buy
								if( Typical_Price > 156.16 )
									ret := 0.560000
						if( MFI > 65.7358 )
							if( rsi1 <= 67.6359 )
								if( MFI_Low <= 54.8346 )
									ret := 0.083333
								if( MFI_Low > 54.8346 )
									ret := -0.460526
							if( rsi1 > 67.6359 )
								if( Raw_Money_Flow <= 7.74573e+07 )
									ret := 0.510714
								if( Raw_Money_Flow > 7.74573e+07 )
									ret := -0.640000
			if( k > 75.1516 )
				if( Raw_Money_Flow <= 4.23349e+06 )
					if( smoothK_k <= 87.9581 )
						if( rsi1 <= 68.657 )
							if( Negative_Money_Flow_Sum <= 2.00871e+07 )
								if( MFI <= 58.1441 )
									ret := 0.063591
								if( MFI > 58.1441 )
									ret := -0.086839
							if( Negative_Money_Flow_Sum > 2.00871e+07 )
								if( rsi1 <= 47.1604 )
									ret := -0.507042
								if( rsi1 > 47.1604 )
									ret := -0.110204
						if( rsi1 > 68.657 )
							if( Typical_Price <= 1.75031 )
								if( rsi1 <= 74.7554 )
									ret := -0.958333 // sell
								if( rsi1 > 74.7554 )
									ret := -0.142857
							if( Typical_Price > 1.75031 )
								if( MFI_High <= -5.15409 )
									ret := 0.492447
								if( MFI_High > -5.15409 )
									ret := 0.158730
					if( smoothK_k > 87.9581 )
						if( Negative_Money_Flow_Sum <= 610133 )
							if( d <= 96.7523 )
								if( rsi1 <= 69.6397 )
									ret := -0.666667
								if( rsi1 > 69.6397 )
									ret := 0.666667
							if( d > 96.7523 )
								if( smoothD_d <= 93.9672 )
									ret := -1.000000 // sell
								if( smoothD_d > 93.9672 )
									ret := -0.500000
						if( Negative_Money_Flow_Sum > 610133 )
							if( rsi1 <= 72.6947 )
								if( smoothD_d <= 91.9701 )
									ret := 0.631579
								if( smoothD_d > 91.9701 )
									ret := 0.150235
							if( rsi1 > 72.6947 )
								if( Positive_Money_Flow_Sum <= 4.33148e+07 )
									ret := 0.752475 // buy
								if( Positive_Money_Flow_Sum > 4.33148e+07 )
									ret := 0.181818
				if( Raw_Money_Flow > 4.23349e+06 )
					if( Money_Flow_Ratio <= 0.675295 )
						if( Negative_Money_Flow_Sum <= 1.99424e+08 )
							if( smoothK_k <= 72.9181 )
								ret := 0.750000 // buy
							if( smoothK_k > 72.9181 )
								if( Negative_Money_Flow <= 4.57842e+06 )
									ret := -0.176056
								if( Negative_Money_Flow > 4.57842e+06 )
									ret := 0.446602
						if( Negative_Money_Flow_Sum > 1.99424e+08 )
							if( Negative_Money_Flow <= 1.42499e+07 )
								if( rsi1 <= 55.7924 )
									ret := -0.716418 // sell
								if( rsi1 > 55.7924 )
									ret := 0.230769
							if( Negative_Money_Flow > 1.42499e+07 )
								ret := 0.428571
					if( Money_Flow_Ratio > 0.675295 )
						if( k <= 82.6071 )
							if( Typical_Price <= 47.1148 )
								if( Money_Flow_Ratio <= 7.40615 )
									ret := 0.000000
								if( Money_Flow_Ratio > 7.40615 )
									ret := -0.540541
							if( Typical_Price > 47.1148 )
								if( d <= 86.0294 )
									ret := 0.408333
								if( d > 86.0294 )
									ret := 0.156757
						if( k > 82.6071 )
							if( smoothD_d <= 93.2158 )
								if( rsi1 <= 61.3081 )
									ret := -0.015094
								if( rsi1 > 61.3081 )
									ret := 0.542823
							if( smoothD_d > 93.2158 )
								if( rsi1 <= 71.4039 )
									ret := 0.532847
								if( rsi1 > 71.4039 )
									ret := 0.848214 // buy
	
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
float op_operation = decision_tree_0_SOLUSDT_30Min_a29d14ca(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


