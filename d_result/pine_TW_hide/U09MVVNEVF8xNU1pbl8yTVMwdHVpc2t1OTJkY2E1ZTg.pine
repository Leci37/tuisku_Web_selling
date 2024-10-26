//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: SOLUSDT_15Min_2MS0_92dca5e8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_15Min_2MS0_92dca5e8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_15Min_92dca5e8(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( k <= 55.9073 )
		if( Positive_Money_Flow <= 3.05932e+06 )
			if( smoothK_k <= 16.8195 )
				if( rsi1 <= 49.6702 )
					if( Positive_Money_Flow_Sum <= 1.12508e+07 )
						if( Typical_Price <= 14.4585 )
							if( smoothK_k <= 11.7195 )
								if( smoothD_d <= 3.99646 )
									ret := -0.100775
								if( smoothD_d > 3.99646 )
									ret := 0.130178
							if( smoothK_k > 11.7195 )
								if( Positive_Money_Flow <= 490149 )
									ret := -0.224000
								if( Positive_Money_Flow > 490149 )
									ret := 0.666667
						if( Typical_Price > 14.4585 )
							if( Negative_Money_Flow_Sum <= 7.07487e+06 )
								if( d_k <= 0.985101 )
									ret := -0.419080
								if( d_k > 0.985101 )
									ret := -0.288770
							if( Negative_Money_Flow_Sum > 7.07487e+06 )
								if( d <= 11.1982 )
									ret := -0.260035
								if( d > 11.1982 )
									ret := -0.087505
					if( Positive_Money_Flow_Sum > 1.12508e+07 )
						if( rsi1 <= 33.629 )
							if( MFI_High <= -38.0505 )
								if( Negative_Money_Flow_Sum <= 2.57430e+07 )
									ret := -0.282609
								if( Negative_Money_Flow_Sum > 2.57430e+07 )
									ret := -0.606045
							if( MFI_High > -38.0505 )
								if( Raw_Money_Flow <= 4.38653e+06 )
									ret := -0.699295
								if( Raw_Money_Flow > 4.38653e+06 )
									ret := -0.837927 // sell
						if( rsi1 > 33.629 )
							if( Typical_Price <= 45.2088 )
								if( Money_Flow_Ratio <= 1.25895 )
									ret := -0.128916
								if( Money_Flow_Ratio > 1.25895 )
									ret := -0.436594
							if( Typical_Price > 45.2088 )
								if( Money_Flow_Ratio <= 0.704017 )
									ret := -0.163904
								if( Money_Flow_Ratio > 0.704017 )
									ret := -0.526064
				if( rsi1 > 49.6702 )
					if( smoothK_k <= 5.47357 )
						if( Negative_Money_Flow_Sum <= 1.29829e+07 )
							if( Positive_Money_Flow_Sum <= 2.08716e+06 )
								if( d_k <= 4.54511 )
									ret := -0.606061
								if( d_k > 4.54511 )
									ret := 0.066667
							if( Positive_Money_Flow_Sum > 2.08716e+06 )
								if( Negative_Money_Flow <= 1.42969e+06 )
									ret := -0.083893
								if( Negative_Money_Flow > 1.42969e+06 )
									ret := 0.373134
						if( Negative_Money_Flow_Sum > 1.29829e+07 )
							if( MFI <= 68.9454 )
								if( Typical_Price <= 131.091 )
									ret := -0.247104
								if( Typical_Price > 131.091 )
									ret := 0.098765
							if( MFI > 68.9454 )
								if( d_k <= 11.7194 )
									ret := -0.333333
								if( d_k > 11.7194 )
									ret := -0.717391 // sell
					if( smoothK_k > 5.47357 )
						if( Negative_Money_Flow <= 2.1652e+06 )
							if( Positive_Money_Flow <= 978758 )
								if( smoothD_d <= 8.28119 )
									ret := -0.111570
								if( smoothD_d > 8.28119 )
									ret := 0.087467
							if( Positive_Money_Flow > 978758 )
								if( Negative_Money_Flow_Sum <= 6.55501e+06 )
									ret := -0.429825
								if( Negative_Money_Flow_Sum > 6.55501e+06 )
									ret := -0.027548
						if( Negative_Money_Flow > 2.1652e+06 )
							if( MFI_Low <= 57.8903 )
								if( MFI_High <= -24.6594 )
									ret := 0.403509
								if( MFI_High > -24.6594 )
									ret := 0.161677
							if( MFI_Low > 57.8903 )
								if( rsi1 <= 63.3185 )
									ret := -0.530612
								if( rsi1 > 63.3185 )
									ret := 0.390244
			if( smoothK_k > 16.8195 )
				if( rsi1 <= 52.5033 )
					if( MFI_Low <= 30.281 )
						if( k <= 35.0576 )
							if( smoothD_d <= 12.1436 )
								if( Negative_Money_Flow <= 2.61877e+06 )
									ret := -0.227113
								if( Negative_Money_Flow > 2.61877e+06 )
									ret := -0.577465
							if( smoothD_d > 12.1436 )
								if( Positive_Money_Flow_Sum <= 1.00293e+07 )
									ret := -0.028169
								if( Positive_Money_Flow_Sum > 1.00293e+07 )
									ret := -0.236264
						if( k > 35.0576 )
							if( Negative_Money_Flow <= 2.90432e+06 )
								if( Money_Flow_Ratio <= 0.679901 )
									ret := 0.017065
								if( Money_Flow_Ratio > 0.679901 )
									ret := -0.156392
							if( Negative_Money_Flow > 2.90432e+06 )
								if( Typical_Price <= 138.676 )
									ret := 0.239822
								if( Typical_Price > 138.676 )
									ret := -0.079515
					if( MFI_Low > 30.281 )
						if( rsi1 <= 46.5705 )
							if( Positive_Money_Flow_Sum <= 1.91487e+07 )
								if( rsi1 <= 39.9961 )
									ret := -0.498986
								if( rsi1 > 39.9961 )
									ret := -0.353333
							if( Positive_Money_Flow_Sum > 1.91487e+07 )
								if( Typical_Price <= 168.161 )
									ret := -0.676960
								if( Typical_Price > 168.161 )
									ret := -0.238095
						if( rsi1 > 46.5705 )
							if( MFI_High <= -18.6257 )
								if( MFI_High <= -23.523 )
									ret := -0.063734
								if( MFI_High > -23.523 )
									ret := -0.225676
							if( MFI_High > -18.6257 )
								if( Raw_Money_Flow <= 767529 )
									ret := -0.200000
								if( Raw_Money_Flow > 767529 )
									ret := -0.553756
				if( rsi1 > 52.5033 )
					if( MFI_High <= -10.7563 )
						if( Negative_Money_Flow <= 1.8359e+06 )
							if( Negative_Money_Flow_Sum <= 2.56139e+07 )
								if( MFI <= 57.6446 )
									ret := 0.194682
								if( MFI > 57.6446 )
									ret := 0.073499
							if( Negative_Money_Flow_Sum > 2.56139e+07 )
								if( d <= 28.8084 )
									ret := 0.074074
								if( d > 28.8084 )
									ret := 0.681416
						if( Negative_Money_Flow > 1.8359e+06 )
							if( Negative_Money_Flow_Sum <= 2.08607e+07 )
								if( MFI_Low <= 34.6784 )
									ret := 0.489362
								if( MFI_Low > 34.6784 )
									ret := 0.119444
							if( Negative_Money_Flow_Sum > 2.08607e+07 )
								if( smoothD_d <= 16.9265 )
									ret := 0.042553
								if( smoothD_d > 16.9265 )
									ret := 0.545852
					if( MFI_High > -10.7563 )
						if( rsi1 <= 63.0142 )
							if( d_k <= 14.2644 )
								if( Negative_Money_Flow_Sum <= 4.60449e+07 )
									ret := -0.375948
								if( Negative_Money_Flow_Sum > 4.60449e+07 )
									ret := 0.472222
							if( d_k > 14.2644 )
								if( Money_Flow_Ratio <= 3.85005 )
									ret := 0.109312
								if( Money_Flow_Ratio > 3.85005 )
									ret := -0.314815
						if( rsi1 > 63.0142 )
							if( MFI <= 84.534 )
								if( rsi1 <= 75.6238 )
									ret := 0.155102
								if( rsi1 > 75.6238 )
									ret := 0.684615
							if( MFI > 84.534 )
								if( d_k <= 14.2849 )
									ret := -0.500000
								if( d_k > 14.2849 )
									ret := 0.375000
		if( Positive_Money_Flow > 3.05932e+06 )
			if( Positive_Money_Flow_Sum <= 2.06041e+07 )
				if( k <= 25.9176 )
					if( MFI <= 17.3067 )
						if( d <= 6.41768 )
							ret := -0.428571
						if( d > 6.41768 )
							if( d_k <= -3.96121 )
								if( d <= 15.6561 )
									ret := -1.000000 // sell
								if( d > 15.6561 )
									ret := -0.777778 // sell
							if( d_k > -3.96121 )
								ret := -1.000000 // sell
					if( MFI > 17.3067 )
						if( Typical_Price <= 63.2003 )
							if( d_k <= -6.37863 )
								if( Typical_Price <= 32.6217 )
									ret := -1.000000 // sell
								if( Typical_Price > 32.6217 )
									ret := -0.388889
							if( d_k > -6.37863 )
								if( Negative_Money_Flow_Sum <= 5.49843e+06 )
									ret := -0.875000 // sell
								if( Negative_Money_Flow_Sum > 5.49843e+06 )
									ret := 0.026906
						if( Typical_Price > 63.2003 )
							if( smoothD_d <= -0.297903 )
								ret := 0.000000
							if( smoothD_d > -0.297903 )
								if( Raw_Money_Flow <= 4.22771e+06 )
									ret := -0.753165 // sell
								if( Raw_Money_Flow > 4.22771e+06 )
									ret := -0.314286
				if( k > 25.9176 )
					if( Negative_Money_Flow_Sum <= 3.22921e+07 )
						if( smoothK_k <= 48.3946 )
							if( rsi1 <= 37.5085 )
								if( d_k <= -3.47276 )
									ret := -0.882353 // sell
								if( d_k > -3.47276 )
									ret := -0.238095
							if( rsi1 > 37.5085 )
								if( Money_Flow_Ratio <= 0.596549 )
									ret := 0.500000
								if( Money_Flow_Ratio > 0.596549 )
									ret := -0.074380
						if( smoothK_k > 48.3946 )
							if( smoothD_d <= 56.3904 )
								if( MFI_Low <= 45.816 )
									ret := -0.430380
								if( MFI_Low > 45.816 )
									ret := 0.120000
							if( smoothD_d > 56.3904 )
								if( d <= 68.3849 )
									ret := -1.000000 // sell
								if( d > 68.3849 )
									ret := -0.363636
					if( Negative_Money_Flow_Sum > 3.22921e+07 )
						if( Negative_Money_Flow_Sum <= 6.2543e+07 )
							if( rsi1 <= 32.2349 )
								if( MFI_Low <= 0.894385 )
									ret := 0.588235
								if( MFI_Low > 0.894385 )
									ret := -0.476190
							if( rsi1 > 32.2349 )
								if( Typical_Price <= 62.5993 )
									ret := 0.810811 // buy
								if( Typical_Price > 62.5993 )
									ret := 0.287500
						if( Negative_Money_Flow_Sum > 6.2543e+07 )
							if( Raw_Money_Flow <= 4.23736e+06 )
								ret := -0.909091 // sell
							if( Raw_Money_Flow > 4.23736e+06 )
								if( rsi1 <= 29.0933 )
									ret := -0.363636
								if( rsi1 > 29.0933 )
									ret := 0.000000
			if( Positive_Money_Flow_Sum > 2.06041e+07 )
				if( Positive_Money_Flow <= 4.57238e+06 )
					if( k <= 31.5359 )
						if( Money_Flow_Ratio <= 1.95005 )
							if( smoothD_d <= 21.7458 )
								if( k <= 13.1729 )
									ret := -0.658080
								if( k > 13.1729 )
									ret := -0.286667
							if( smoothD_d > 21.7458 )
								if( MFI <= 50.4499 )
									ret := -0.488889
								if( MFI > 50.4499 )
									ret := -0.761111 // sell
						if( Money_Flow_Ratio > 1.95005 )
							if( Negative_Money_Flow_Sum <= 4.23377e+07 )
								if( rsi1 <= 57.4712 )
									ret := -0.596429
								if( rsi1 > 57.4712 )
									ret := 0.072072
							if( Negative_Money_Flow_Sum > 4.23377e+07 )
								if( d <= 17.5511 )
									ret := 0.538462
								if( d > 17.5511 )
									ret := 0.928571 // buy
					if( k > 31.5359 )
						if( Negative_Money_Flow_Sum <= 1.26054e+07 )
							if( d_k <= 15.1977 )
								if( Money_Flow_Ratio <= 4.54471 )
									ret := -0.950820 // sell
								if( Money_Flow_Ratio > 4.54471 )
									ret := -0.500000
							if( d_k > 15.1977 )
								ret := 0.000000
						if( Negative_Money_Flow_Sum > 1.26054e+07 )
							if( rsi1 <= 49.7934 )
								if( Negative_Money_Flow_Sum <= 3.33429e+07 )
									ret := -0.701987 // sell
								if( Negative_Money_Flow_Sum > 3.33429e+07 )
									ret := -0.250000
							if( rsi1 > 49.7934 )
								if( d_k <= 6.32347 )
									ret := 0.497717
								if( d_k > 6.32347 )
									ret := 0.101562
				if( Positive_Money_Flow > 4.57238e+06 )
					if( rsi1 <= 54.8801 )
						if( MFI <= 41.265 )
							if( d <= 21.14 )
								if( rsi1 <= 41.2946 )
									ret := -0.701327 // sell
								if( rsi1 > 41.2946 )
									ret := 0.285714
							if( d > 21.14 )
								if( k <= 26.1938 )
									ret := -0.742857 // sell
								if( k > 26.1938 )
									ret := -0.288364
						if( MFI > 41.265 )
							if( d_k <= -3.77425 )
								if( Typical_Price <= 174.046 )
									ret := -0.606936
								if( Typical_Price > 174.046 )
									ret := 0.129032
							if( d_k > -3.77425 )
								if( d_k <= 31.1888 )
									ret := -0.770790 // sell
								if( d_k > 31.1888 )
									ret := 0.071429
					if( rsi1 > 54.8801 )
						if( MFI_Low <= 41.7036 )
							if( Raw_Money_Flow <= 4.81843e+06 )
								if( MFI_High <= -22.6314 )
									ret := -0.357143
								if( MFI_High > -22.6314 )
									ret := -1.000000 // sell
							if( Raw_Money_Flow > 4.81843e+06 )
								if( Negative_Money_Flow_Sum <= 3.46915e+07 )
									ret := -0.087912
								if( Negative_Money_Flow_Sum > 3.46915e+07 )
									ret := 0.468354
						if( MFI_Low > 41.7036 )
							if( d_k <= 22.2659 )
								if( Positive_Money_Flow <= 9.25385e+06 )
									ret := -0.274590
								if( Positive_Money_Flow > 9.25385e+06 )
									ret := -0.621921
							if( d_k > 22.2659 )
								if( Typical_Price <= 118.29 )
									ret := 0.714286 // buy
								if( Typical_Price > 118.29 )
									ret := 0.342857
	if( k > 55.9073 )
		if( Typical_Price <= 55.8383 )
			if( d <= 79.7255 )
				if( rsi1 <= 46.683 )
					if( Raw_Money_Flow <= 799075 )
						if( Negative_Money_Flow_Sum <= 2.74789e+07 )
							if( Money_Flow_Ratio <= 0.971262 )
								if( rsi1 <= 44.0743 )
									ret := -0.198953
								if( rsi1 > 44.0743 )
									ret := 0.108586
							if( Money_Flow_Ratio > 0.971262 )
								if( Negative_Money_Flow_Sum <= 4.98935e+06 )
									ret := -0.307692
								if( Negative_Money_Flow_Sum > 4.98935e+06 )
									ret := -0.636364
						if( Negative_Money_Flow_Sum > 2.74789e+07 )
							ret := 0.857143 // buy
					if( Raw_Money_Flow > 799075 )
						if( Positive_Money_Flow_Sum <= 6.13442e+06 )
							if( MFI_Low <= 0.144179 )
								if( smoothD_d <= 42.447 )
									ret := -0.470588
								if( smoothD_d > 42.447 )
									ret := 0.642424
							if( MFI_Low > 0.144179 )
								if( Raw_Money_Flow <= 890738 )
									ret := -0.094737
								if( Raw_Money_Flow > 890738 )
									ret := 0.282958
						if( Positive_Money_Flow_Sum > 6.13442e+06 )
							if( k <= 71.3643 )
								if( MFI_High <= -37.81 )
									ret := -0.068392
								if( MFI_High > -37.81 )
									ret := -0.360000
							if( k > 71.3643 )
								if( Positive_Money_Flow_Sum <= 9.13732e+06 )
									ret := -0.300000
								if( Positive_Money_Flow_Sum > 9.13732e+06 )
									ret := 0.168044
				if( rsi1 > 46.683 )
					if( Positive_Money_Flow_Sum <= 6.25821e+06 )
						if( MFI_High <= -42.3404 )
							if( d_k <= -21.8347 )
								if( Positive_Money_Flow <= 405025 )
									ret := 0.035088
								if( Positive_Money_Flow > 405025 )
									ret := 0.375000
							if( d_k > -21.8347 )
								if( rsi1 <= 60.7223 )
									ret := 0.508152
								if( rsi1 > 60.7223 )
									ret := 0.838509 // buy
						if( MFI_High > -42.3404 )
							if( d_k <= 0.222569 )
								if( rsi1 <= 64.4149 )
									ret := 0.115850
								if( rsi1 > 64.4149 )
									ret := 0.465269
							if( d_k > 0.222569 )
								if( smoothD_d <= 75.9012 )
									ret := 0.124285
								if( smoothD_d > 75.9012 )
									ret := -0.180723
					if( Positive_Money_Flow_Sum > 6.25821e+06 )
						if( MFI_High <= -30.965 )
							if( Negative_Money_Flow_Sum <= 2.69262e+07 )
								if( Negative_Money_Flow <= 1.23626e+06 )
									ret := 0.181818
								if( Negative_Money_Flow > 1.23626e+06 )
									ret := 0.483740
							if( Negative_Money_Flow_Sum > 2.69262e+07 )
								if( d_k <= -8.61113 )
									ret := 0.832298 // buy
								if( d_k > -8.61113 )
									ret := 0.230769
						if( MFI_High > -30.965 )
							if( Positive_Money_Flow_Sum <= 1.6493e+07 )
								if( rsi1 <= 65.959 )
									ret := -0.134914
								if( rsi1 > 65.959 )
									ret := 0.118174
							if( Positive_Money_Flow_Sum > 1.6493e+07 )
								if( Positive_Money_Flow <= 178928 )
									ret := 0.284277
								if( Positive_Money_Flow > 178928 )
									ret := -0.042763
			if( d > 79.7255 )
				if( Typical_Price <= 31.6581 )
					if( MFI_High <= 4.75863 )
						if( Typical_Price <= 14.8736 )
							if( MFI <= 26.5461 )
								if( MFI_Low <= 2.44855 )
									ret := 0.307692
								if( MFI_Low > 2.44855 )
									ret := -1.000000 // sell
							if( MFI > 26.5461 )
								if( Money_Flow_Ratio <= 1.01129 )
									ret := 0.235880
								if( Money_Flow_Ratio > 1.01129 )
									ret := -0.011765
						if( Typical_Price > 14.8736 )
							if( rsi1 <= 72.8387 )
								if( MFI_High <= -17.0913 )
									ret := 0.275175
								if( MFI_High > -17.0913 )
									ret := 0.088714
							if( rsi1 > 72.8387 )
								if( Money_Flow_Ratio <= 2.57629 )
									ret := 0.709163 // buy
								if( Money_Flow_Ratio > 2.57629 )
									ret := 0.387097
					if( MFI_High > 4.75863 )
						if( Positive_Money_Flow <= 8.57445e+06 )
							if( Negative_Money_Flow_Sum <= 538479 )
								if( smoothD_d <= 90.9315 )
									ret := 0.200000
								if( smoothD_d > 90.9315 )
									ret := -0.375000
							if( Negative_Money_Flow_Sum > 538479 )
								if( MFI <= 93.02 )
									ret := 0.429389
								if( MFI > 93.02 )
									ret := 0.863636 // buy
						if( Positive_Money_Flow > 8.57445e+06 )
							if( Positive_Money_Flow_Sum <= 3.98941e+07 )
								ret := -0.571429
							if( Positive_Money_Flow_Sum > 3.98941e+07 )
								if( smoothD_d <= 88.2776 )
									ret := -0.285714
								if( smoothD_d > 88.2776 )
									ret := 0.909091 // buy
				if( Typical_Price > 31.6581 )
					if( Positive_Money_Flow_Sum <= 2.00584e+07 )
						if( MFI_Low <= 54.1998 )
							if( d <= 96.2278 )
								if( Money_Flow_Ratio <= 0.523437 )
									ret := 0.257511
								if( Money_Flow_Ratio > 0.523437 )
									ret := 0.042159
							if( d > 96.2278 )
								if( MFI_Low <= 40.7576 )
									ret := 0.447005
								if( MFI_Low > 40.7576 )
									ret := 0.000000
						if( MFI_Low > 54.1998 )
							if( k <= 78.2072 )
								if( MFI_Low <= 61.701 )
									ret := 0.285714
								if( MFI_Low > 61.701 )
									ret := 0.833333 // buy
							if( k > 78.2072 )
								if( Positive_Money_Flow <= 1.29609e+06 )
									ret := 0.020231
								if( Positive_Money_Flow > 1.29609e+06 )
									ret := -0.505495
					if( Positive_Money_Flow_Sum > 2.00584e+07 )
						if( MFI_High <= -22.5802 )
							if( Positive_Money_Flow_Sum <= 6.25029e+07 )
								if( smoothK_k <= 87.265 )
									ret := 0.373333
								if( smoothK_k > 87.265 )
									ret := 0.720930 // buy
							if( Positive_Money_Flow_Sum > 6.25029e+07 )
								ret := -0.400000
						if( MFI_High > -22.5802 )
							if( Positive_Money_Flow <= 5.95712e+06 )
								if( Raw_Money_Flow <= 1.29045e+06 )
									ret := -0.415730
								if( Raw_Money_Flow > 1.29045e+06 )
									ret := 0.108362
							if( Positive_Money_Flow > 5.95712e+06 )
								if( Money_Flow_Ratio <= 2.94306 )
									ret := -0.038961
								if( Money_Flow_Ratio > 2.94306 )
									ret := 0.644231
		if( Typical_Price > 55.8383 )
			if( rsi1 <= 54.4538 )
				if( MFI <= 41.6741 )
					if( Negative_Money_Flow <= 5.14223e+06 )
						if( k <= 76.2607 )
							if( Positive_Money_Flow_Sum <= 1.16951e+07 )
								if( MFI_High <= -41.6889 )
									ret := 0.420063
								if( MFI_High > -41.6889 )
									ret := -0.741935 // sell
							if( Positive_Money_Flow_Sum > 1.16951e+07 )
								if( MFI_High <= -48.6668 )
									ret := -0.189243
								if( MFI_High > -48.6668 )
									ret := 0.055629
						if( k > 76.2607 )
							if( rsi1 <= 44.0562 )
								if( MFI_Low <= -4.45897 )
									ret := 0.468085
								if( MFI_Low > -4.45897 )
									ret := -0.157718
							if( rsi1 > 44.0562 )
								if( MFI <= 22.378 )
									ret := 0.709845 // buy
								if( MFI > 22.378 )
									ret := 0.360882
					if( Negative_Money_Flow > 5.14223e+06 )
						if( Positive_Money_Flow_Sum <= 4.11443e+07 )
							if( smoothD_d <= 57.3629 )
								if( Negative_Money_Flow_Sum <= 5.92662e+07 )
									ret := 0.678571
								if( Negative_Money_Flow_Sum > 5.92662e+07 )
									ret := 0.381395
							if( smoothD_d > 57.3629 )
								if( Raw_Money_Flow <= 9.63014e+06 )
									ret := 0.638889
								if( Raw_Money_Flow > 9.63014e+06 )
									ret := 0.863014 // buy
						if( Positive_Money_Flow_Sum > 4.11443e+07 )
							if( rsi1 <= 35.1103 )
								if( MFI_High <= -62.5695 )
									ret := 0.125000
								if( MFI_High > -62.5695 )
									ret := -0.666667
							if( rsi1 > 35.1103 )
								if( MFI_High <= -43.1846 )
									ret := 0.666667
								if( MFI_High > -43.1846 )
									ret := 0.315789
				if( MFI > 41.6741 )
					if( Money_Flow_Ratio <= 1.02838 )
						if( Positive_Money_Flow <= 6.28368e+06 )
							if( rsi1 <= 47.4258 )
								if( k <= 59.9103 )
									ret := -0.416667
								if( k > 59.9103 )
									ret := -0.102302
							if( rsi1 > 47.4258 )
								if( Typical_Price <= 92.6767 )
									ret := 0.014493
								if( Typical_Price > 92.6767 )
									ret := 0.349515
						if( Positive_Money_Flow > 6.28368e+06 )
							if( smoothD_d <= 55.8513 )
								if( Typical_Price <= 92.7674 )
									ret := 1.000000 // buy
								if( Typical_Price > 92.7674 )
									ret := 0.062500
							if( smoothD_d > 55.8513 )
								if( Positive_Money_Flow <= 3.38608e+07 )
									ret := -0.392453
								if( Positive_Money_Flow > 3.38608e+07 )
									ret := 0.454545
					if( Money_Flow_Ratio > 1.02838 )
						if( d <= 79.323 )
							if( Typical_Price <= 133.382 )
								if( MFI_High <= -15.012 )
									ret := -0.452703
								if( MFI_High > -15.012 )
									ret := -0.868852 // sell
							if( Typical_Price > 133.382 )
								if( MFI_High <= -27.1153 )
									ret := 0.133333
								if( MFI_High > -27.1153 )
									ret := -0.259259
						if( d > 79.323 )
							if( Raw_Money_Flow <= 7.06496e+06 )
								if( Negative_Money_Flow <= 4.4978e+06 )
									ret := -0.138340
								if( Negative_Money_Flow > 4.4978e+06 )
									ret := 0.781250 // buy
							if( Raw_Money_Flow > 7.06496e+06 )
								if( Negative_Money_Flow_Sum <= 4.99353e+07 )
									ret := -0.114286
								if( Negative_Money_Flow_Sum > 4.99353e+07 )
									ret := -0.659574
			if( rsi1 > 54.4538 )
				if( Money_Flow_Ratio <= 1.21091 )
					if( Typical_Price <= 129.036 )
						if( rsi1 <= 58.3455 )
							if( MFI <= 43.1788 )
								if( Raw_Money_Flow <= 1.86913e+06 )
									ret := 0.363636
								if( Raw_Money_Flow > 1.86913e+06 )
									ret := 0.841121 // buy
							if( MFI > 43.1788 )
								if( d_k <= 1.42008 )
									ret := 0.492366
								if( d_k > 1.42008 )
									ret := 0.186916
						if( rsi1 > 58.3455 )
							if( rsi1 <= 68.7517 )
								if( smoothD_d <= 93.5393 )
									ret := 0.819409 // buy
								if( smoothD_d > 93.5393 )
									ret := 0.635135
							if( rsi1 > 68.7517 )
								if( Raw_Money_Flow <= 1.7369e+06 )
									ret := 0.607143
								if( Raw_Money_Flow > 1.7369e+06 )
									ret := 0.903423 // buy
					if( Typical_Price > 129.036 )
						if( Negative_Money_Flow <= 2.41597e+06 )
							if( rsi1 <= 59.5597 )
								if( Positive_Money_Flow <= 2.82495e+07 )
									ret := 0.295977
								if( Positive_Money_Flow > 2.82495e+07 )
									ret := 0.967742 // buy
							if( rsi1 > 59.5597 )
								if( Raw_Money_Flow <= 1.85087e+06 )
									ret := 0.272321
								if( Raw_Money_Flow > 1.85087e+06 )
									ret := 0.642113
						if( Negative_Money_Flow > 2.41597e+06 )
							if( Typical_Price <= 194.348 )
								if( rsi1 <= 65.7509 )
									ret := 0.719298 // buy
								if( rsi1 > 65.7509 )
									ret := 0.871859 // buy
							if( Typical_Price > 194.348 )
								if( Raw_Money_Flow <= 1.48393e+07 )
									ret := 0.400000
								if( Raw_Money_Flow > 1.48393e+07 )
									ret := -0.615385
				if( Money_Flow_Ratio > 1.21091 )
					if( rsi1 <= 64.8555 )
						if( Money_Flow_Ratio <= 2.20248 )
							if( Positive_Money_Flow_Sum <= 2.87252e+08 )
								if( Negative_Money_Flow <= 2.7516e+06 )
									ret := 0.185926
								if( Negative_Money_Flow > 2.7516e+06 )
									ret := 0.379386
							if( Positive_Money_Flow_Sum > 2.87252e+08 )
								ret := -0.894737 // sell
						if( Money_Flow_Ratio > 2.20248 )
							if( MFI_High <= -1.94094 )
								if( d_k <= 10.1342 )
									ret := -0.184697
								if( d_k > 10.1342 )
									ret := 0.402299
							if( MFI_High > -1.94094 )
								if( Positive_Money_Flow <= 4.14135e+06 )
									ret := -0.187500
								if( Positive_Money_Flow > 4.14135e+06 )
									ret := -0.620253
					if( rsi1 > 64.8555 )
						if( smoothK_k <= 77.7822 )
							if( MFI <= 75.4951 )
								if( Positive_Money_Flow_Sum <= 1.88915e+07 )
									ret := 0.225806
								if( Positive_Money_Flow_Sum > 1.88915e+07 )
									ret := 0.618979
							if( MFI > 75.4951 )
								if( Raw_Money_Flow <= 1.77878e+07 )
									ret := 0.281150
								if( Raw_Money_Flow > 1.77878e+07 )
									ret := -0.172185
						if( smoothK_k > 77.7822 )
							if( rsi1 <= 75.3269 )
								if( Money_Flow_Ratio <= 2.79556 )
									ret := 0.637781
								if( Money_Flow_Ratio > 2.79556 )
									ret := 0.154639
							if( rsi1 > 75.3269 )
								if( MFI_Low <= 62.1165 )
									ret := 0.804496 // buy
								if( MFI_Low > 62.1165 )
									ret := 0.562814
	
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
float op_operation = decision_tree_0_SOLUSDT_15Min_92dca5e8(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


