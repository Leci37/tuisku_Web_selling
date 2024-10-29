//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: AMZN_30Min_2MS0_d27cedcc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_30Min_2MS0_d27cedcc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_30Min_d27cedcc(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Positive_Money_Flow_Sum <= 2.22554e+08 )
		if( Positive_Money_Flow <= 4.68438e+07 )
			if( smoothD_d <= 83.5889 )
				if( rsi1 <= 22.1159 )
					if( Positive_Money_Flow <= 2.17102e+06 )
						if( MFI <= 0.980455 )
							if( Negative_Money_Flow <= 9.75729e+08 )
								if( MFI_High <= -79.2105 )
									ret := 0.270936
								if( MFI_High > -79.2105 )
									ret := 0.652632
							if( Negative_Money_Flow > 9.75729e+08 )
								if( smoothD_d <= 16.3216 )
									ret := -0.209677
								if( smoothD_d > 16.3216 )
									ret := 0.500000
						if( MFI > 0.980455 )
							if( smoothD_d <= 31.2577 )
								if( k <= 11.6932 )
									ret := 0.015152
								if( k > 11.6932 )
									ret := 0.383420
							if( smoothD_d > 31.2577 )
								if( Money_Flow_Ratio <= 0.153225 )
									ret := -0.052632
								if( Money_Flow_Ratio > 0.153225 )
									ret := -0.827586 // sell
					if( Positive_Money_Flow > 2.17102e+06 )
						if( MFI_High <= -32.4537 )
							if( smoothD_d <= 2.76126 )
								if( Positive_Money_Flow_Sum <= 3.05886e+07 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 3.05886e+07 )
									ret := 0.181818
							if( smoothD_d > 2.76126 )
								if( rsi1 <= 19.0513 )
									ret := -0.627451
								if( rsi1 > 19.0513 )
									ret := -0.062500
						if( MFI_High > -32.4537 )
							if( Typical_Price <= 141.087 )
								ret := -0.875000 // sell
							if( Typical_Price > 141.087 )
								ret := -1.000000 // sell
				if( rsi1 > 22.1159 )
					if( Raw_Money_Flow <= 3.36136e+08 )
						if( k <= 69.7533 )
							if( Positive_Money_Flow_Sum <= 1.64822e+07 )
								if( Typical_Price <= 109.486 )
									ret := -0.441718
								if( Typical_Price > 109.486 )
									ret := -0.111253
							if( Positive_Money_Flow_Sum > 1.64822e+07 )
								if( smoothD_d <= -0.654113 )
									ret := 0.435374
								if( smoothD_d > -0.654113 )
									ret := 0.000876
						if( k > 69.7533 )
							if( rsi1 <= 84.2863 )
								if( d_k <= 0.158684 )
									ret := -0.270223
								if( d_k > 0.158684 )
									ret := -0.058559
							if( rsi1 > 84.2863 )
								if( rsi1 <= 85.7975 )
									ret := 1.000000 // buy
								if( rsi1 > 85.7975 )
									ret := 0.521739
					if( Raw_Money_Flow > 3.36136e+08 )
						if( MFI_High <= -75.4761 )
							if( Negative_Money_Flow <= 7.24859e+08 )
								if( MFI <= 1.60299 )
									ret := -0.274336
								if( MFI > 1.60299 )
									ret := -0.453149
							if( Negative_Money_Flow > 7.24859e+08 )
								if( Negative_Money_Flow_Sum <= 1.08342e+09 )
									ret := 0.120370
								if( Negative_Money_Flow_Sum > 1.08342e+09 )
									ret := -0.236427
						if( MFI_High > -75.4761 )
							if( Raw_Money_Flow <= 7.3087e+08 )
								if( Negative_Money_Flow <= 7.20443e+08 )
									ret := 0.150289
								if( Negative_Money_Flow > 7.20443e+08 )
									ret := 1.000000 // buy
							if( Raw_Money_Flow > 7.3087e+08 )
								if( Negative_Money_Flow_Sum <= 1.53034e+09 )
									ret := -0.507752
								if( Negative_Money_Flow_Sum > 1.53034e+09 )
									ret := 0.043243
			if( smoothD_d > 83.5889 )
				if( Positive_Money_Flow_Sum <= 1.10736e+08 )
					if( MFI <= 67.404 )
						if( Negative_Money_Flow_Sum <= 3.28642e+07 )
							if( Money_Flow_Ratio <= 0.679131 )
								if( MFI <= 35.5008 )
									ret := 0.146341
								if( MFI > 35.5008 )
									ret := 0.807692 // buy
							if( Money_Flow_Ratio > 0.679131 )
								if( Positive_Money_Flow_Sum <= 4.85604e+07 )
									ret := -0.204082
								if( Positive_Money_Flow_Sum > 4.85604e+07 )
									ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 3.28642e+07 )
							if( Negative_Money_Flow_Sum <= 1.16352e+08 )
								if( Negative_Money_Flow <= 4.75594e+06 )
									ret := 0.085586
								if( Negative_Money_Flow > 4.75594e+06 )
									ret := 0.435696
							if( Negative_Money_Flow_Sum > 1.16352e+08 )
								if( MFI <= 20.7962 )
									ret := 0.113208
								if( MFI > 20.7962 )
									ret := -0.622222
					if( MFI > 67.404 )
						if( rsi1 <= 76.9012 )
							if( d_k <= -1.82348 )
								if( MFI_High <= -5.1824 )
									ret := 1.000000 // buy
								if( MFI_High > -5.1824 )
									ret := -0.035714
							if( d_k > -1.82348 )
								if( MFI_High <= -10.0829 )
									ret := 1.000000 // buy
								if( MFI_High > -10.0829 )
									ret := 0.712644 // buy
						if( rsi1 > 76.9012 )
							if( Typical_Price <= 188.333 )
								if( smoothD_d <= 86.9257 )
									ret := 1.000000 // buy
								if( smoothD_d > 86.9257 )
									ret := 0.076923
							if( Typical_Price > 188.333 )
								if( MFI <= 82.4149 )
									ret := -0.333333
								if( MFI > 82.4149 )
									ret := -0.818182 // sell
				if( Positive_Money_Flow_Sum > 1.10736e+08 )
					if( smoothD_d <= 85.372 )
						if( Positive_Money_Flow_Sum <= 1.21058e+08 )
							ret := -0.500000
						if( Positive_Money_Flow_Sum > 1.21058e+08 )
							if( Negative_Money_Flow <= 1.95245e+06 )
								ret := 0.047619
							if( Negative_Money_Flow > 1.95245e+06 )
								ret := 0.647059
					if( smoothD_d > 85.372 )
						if( Negative_Money_Flow_Sum <= 1.67585e+08 )
							if( d_k <= 5.12839 )
								if( Positive_Money_Flow_Sum <= 1.44151e+08 )
									ret := -0.492063
								if( Positive_Money_Flow_Sum > 1.44151e+08 )
									ret := -0.852459 // sell
							if( d_k > 5.12839 )
								ret := 0.545455
						if( Negative_Money_Flow_Sum > 1.67585e+08 )
							if( MFI <= 10.0957 )
								if( d <= 91.357 )
									ret := -0.909091 // sell
								if( d > 91.357 )
									ret := -0.272727
							if( MFI > 10.0957 )
								if( Typical_Price <= 471.097 )
									ret := 0.285714
								if( Typical_Price > 471.097 )
									ret := 0.681818
		if( Positive_Money_Flow > 4.68438e+07 )
			if( Positive_Money_Flow <= 6.69927e+07 )
				if( k <= 67.206 )
					if( Negative_Money_Flow_Sum <= 7.9878e+07 )
						if( smoothK_k <= 51.5138 )
							if( smoothD_d <= 7.62335 )
								if( MFI_High <= -2.96664 )
									ret := -1.000000 // sell
								if( MFI_High > -2.96664 )
									ret := 0.000000
							if( smoothD_d > 7.62335 )
								if( Raw_Money_Flow <= 5.88059e+07 )
									ret := -0.828571 // sell
								if( Raw_Money_Flow > 5.88059e+07 )
									ret := -1.000000 // sell
						if( smoothK_k > 51.5138 )
							if( MFI <= 66.7758 )
								ret := 0.333333
							if( MFI > 66.7758 )
								if( MFI_Low <= 55.1171 )
									ret := -1.000000 // sell
								if( MFI_Low > 55.1171 )
									ret := 0.000000
					if( Negative_Money_Flow_Sum > 7.9878e+07 )
						if( MFI_Low <= 33.9871 )
							if( smoothD_d <= 31.3807 )
								if( MFI <= 32.1522 )
									ret := 0.000000
								if( MFI > 32.1522 )
									ret := -0.466667
							if( smoothD_d > 31.3807 )
								ret := -0.866667 // sell
						if( MFI_Low > 33.9871 )
							if( Positive_Money_Flow <= 5.35088e+07 )
								ret := 0.894737 // buy
							if( Positive_Money_Flow > 5.35088e+07 )
								ret := 0.250000
				if( k > 67.206 )
					if( MFI <= 60.8205 )
						if( Typical_Price <= 445.372 )
							ret := 0.571429
						if( Typical_Price > 445.372 )
							if( Raw_Money_Flow <= 5.01749e+07 )
								ret := -0.071429
							if( Raw_Money_Flow > 5.01749e+07 )
								if( Typical_Price <= 2147.21 )
									ret := -1.000000 // sell
								if( Typical_Price > 2147.21 )
									ret := -0.777778 // sell
					if( MFI > 60.8205 )
						if( Money_Flow_Ratio <= 16.3572 )
							if( d_k <= -11.3575 )
								if( Negative_Money_Flow_Sum <= 2.28031e+07 )
									ret := -0.785714 // sell
								if( Negative_Money_Flow_Sum > 2.28031e+07 )
									ret := 0.500000
							if( d_k > -11.3575 )
								if( d <= 69.7643 )
									ret := -0.611111
								if( d > 69.7643 )
									ret := -0.910959 // sell
						if( Money_Flow_Ratio > 16.3572 )
							ret := 0.250000
			if( Positive_Money_Flow > 6.69927e+07 )
				if( MFI_High <= -20.7104 )
					if( Negative_Money_Flow_Sum <= 8.74902e+08 )
						if( d_k <= -6.71122 )
							ret := 0.875000 // buy
						if( d_k > -6.71122 )
							if( smoothK_k <= 4.0244 )
								if( Typical_Price <= 752.219 )
									ret := 1.000000 // buy
								if( Typical_Price > 752.219 )
									ret := 0.333333
							if( smoothK_k > 4.0244 )
								if( Money_Flow_Ratio <= 1.20392 )
									ret := -0.125000
								if( Money_Flow_Ratio > 1.20392 )
									ret := 0.727273 // buy
					if( Negative_Money_Flow_Sum > 8.74902e+08 )
						if( Negative_Money_Flow_Sum <= 1.14392e+09 )
							if( smoothK_k <= 26.9388 )
								if( Positive_Money_Flow <= 1.03713e+08 )
									ret := -0.911765 // sell
								if( Positive_Money_Flow > 1.03713e+08 )
									ret := -0.230769
							if( smoothK_k > 26.9388 )
								ret := 0.062500
						if( Negative_Money_Flow_Sum > 1.14392e+09 )
							if( Typical_Price <= 3191 )
								if( smoothK_k <= 14.8752 )
									ret := 0.096774
								if( smoothK_k > 14.8752 )
									ret := -0.588235
							if( Typical_Price > 3191 )
								ret := 0.666667
				if( MFI_High > -20.7104 )
					if( d <= 85.8056 )
						if( Positive_Money_Flow_Sum <= 1.53124e+08 )
							if( k <= 29.7507 )
								ret := 0.545455
							if( k > 29.7507 )
								if( MFI_High <= 9.07849 )
									ret := -0.560976
								if( MFI_High > 9.07849 )
									ret := 0.181818
						if( Positive_Money_Flow_Sum > 1.53124e+08 )
							if( Positive_Money_Flow_Sum <= 2.11162e+08 )
								if( k <= 86.6694 )
									ret := -0.934783 // sell
								if( k > 86.6694 )
									ret := -0.761905 // sell
							if( Positive_Money_Flow_Sum > 2.11162e+08 )
								ret := -0.230769
					if( d > 85.8056 )
						if( MFI <= 71.2876 )
							ret := -0.818182 // sell
						if( MFI > 71.2876 )
							ret := 0.736842 // buy
	if( Positive_Money_Flow_Sum > 2.22554e+08 )
		if( MFI_Low <= 6.32725 )
			if( Negative_Money_Flow <= 4.25401e+08 )
				if( Positive_Money_Flow <= 4.23057e+07 )
					if( Negative_Money_Flow_Sum <= 7.9228e+08 )
						if( Negative_Money_Flow <= 556871 )
							ret := 0.200000
						if( Negative_Money_Flow > 556871 )
							if( Positive_Money_Flow_Sum <= 2.38922e+08 )
								ret := -0.400000
							if( Positive_Money_Flow_Sum > 2.38922e+08 )
								if( Money_Flow_Ratio <= 0.335922 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 0.335922 )
									ret := -0.882353 // sell
					if( Negative_Money_Flow_Sum > 7.9228e+08 )
						if( Negative_Money_Flow <= 2.09682e+07 )
							if( d <= 12.1419 )
								if( MFI_High <= -74.7917 )
									ret := -0.358974
								if( MFI_High > -74.7917 )
									ret := 0.281068
							if( d > 12.1419 )
								if( Positive_Money_Flow_Sum <= 6.72945e+08 )
									ret := 0.110434
								if( Positive_Money_Flow_Sum > 6.72945e+08 )
									ret := -0.120427
						if( Negative_Money_Flow > 2.09682e+07 )
							if( MFI <= 9.84195 )
								if( k <= 13.4528 )
									ret := -0.330357
								if( k > 13.4528 )
									ret := -0.810345 // sell
							if( MFI > 9.84195 )
								if( Negative_Money_Flow_Sum <= 2.46761e+09 )
									ret := 0.100372
								if( Negative_Money_Flow_Sum > 2.46761e+09 )
									ret := -0.103839
				if( Positive_Money_Flow > 4.23057e+07 )
					if( Typical_Price <= 117.936 )
						if( Positive_Money_Flow <= 4.17653e+08 )
							if( MFI_Low <= -1.23672 )
								if( d_k <= -6.93343 )
									ret := -0.363636
								if( d_k > -6.93343 )
									ret := 0.211538
							if( MFI_Low > -1.23672 )
								if( smoothD_d <= 6.74173 )
									ret := 0.862069 // buy
								if( smoothD_d > 6.74173 )
									ret := 0.185185
						if( Positive_Money_Flow > 4.17653e+08 )
							if( Positive_Money_Flow <= 5.72674e+08 )
								if( d_k <= 0.015012 )
									ret := 0.066667
								if( d_k > 0.015012 )
									ret := -0.944444 // sell
							if( Positive_Money_Flow > 5.72674e+08 )
								ret := 0.384615
					if( Typical_Price > 117.936 )
						if( d_k <= -5.4461 )
							if( Raw_Money_Flow <= 1.02426e+09 )
								if( Positive_Money_Flow_Sum <= 1.24331e+09 )
									ret := -0.052198
								if( Positive_Money_Flow_Sum > 1.24331e+09 )
									ret := 0.368098
							if( Raw_Money_Flow > 1.02426e+09 )
								if( d_k <= -7.02957 )
									ret := -0.822222 // sell
								if( d_k > -7.02957 )
									ret := 0.625000
						if( d_k > -5.4461 )
							if( rsi1 <= 45.5638 )
								if( MFI_Low <= -8.66254 )
									ret := 0.186207
								if( MFI_Low > -8.66254 )
									ret := -0.287577
							if( rsi1 > 45.5638 )
								if( Negative_Money_Flow_Sum <= 2.5894e+09 )
									ret := 0.325893
								if( Negative_Money_Flow_Sum > 2.5894e+09 )
									ret := -0.354430
			if( Negative_Money_Flow > 4.25401e+08 )
				if( rsi1 <= 58.5296 )
					if( Positive_Money_Flow_Sum <= 4.28349e+08 )
						if( Positive_Money_Flow_Sum <= 3.63292e+08 )
							if( Negative_Money_Flow_Sum <= 3.52788e+09 )
								if( smoothD_d <= 46.8694 )
									ret := 0.442308
								if( smoothD_d > 46.8694 )
									ret := -0.300000
							if( Negative_Money_Flow_Sum > 3.52788e+09 )
								if( Negative_Money_Flow_Sum <= 6.51701e+09 )
									ret := -0.586957
								if( Negative_Money_Flow_Sum > 6.51701e+09 )
									ret := 0.000000
						if( Positive_Money_Flow_Sum > 3.63292e+08 )
							if( Negative_Money_Flow <= 5.44361e+08 )
								ret := -0.066667
							if( Negative_Money_Flow > 5.44361e+08 )
								if( d <= 23.1645 )
									ret := 0.550000
								if( d > 23.1645 )
									ret := 0.894737 // buy
					if( Positive_Money_Flow_Sum > 4.28349e+08 )
						if( smoothK_k <= -2.84329 )
							if( rsi1 <= 16.9431 )
								if( MFI_Low <= -11.7534 )
									ret := 0.913043 // buy
								if( MFI_Low > -11.7534 )
									ret := 0.200000
							if( rsi1 > 16.9431 )
								if( d <= 0.007108 )
									ret := -0.666667
								if( d > 0.007108 )
									ret := 0.034884
						if( smoothK_k > -2.84329 )
							if( Negative_Money_Flow <= 1.20059e+09 )
								if( smoothD_d <= 5.25926 )
									ret := -0.459135
								if( smoothD_d > 5.25926 )
									ret := -0.116505
							if( Negative_Money_Flow > 1.20059e+09 )
								if( MFI_High <= -72.4799 )
									ret := -0.032258
								if( MFI_High > -72.4799 )
									ret := -0.576324
				if( rsi1 > 58.5296 )
					if( k <= 77.6028 )
						if( Raw_Money_Flow <= 9.68269e+08 )
							ret := 0.300000
						if( Raw_Money_Flow > 9.68269e+08 )
							ret := 0.952381 // buy
					if( k > 77.6028 )
						ret := -0.500000
		if( MFI_Low > 6.32725 )
			if( d <= 18.5864 )
				if( Negative_Money_Flow_Sum <= 1.73177e+09 )
					if( Raw_Money_Flow <= 5.9268e+08 )
						if( MFI_Low <= 11.5101 )
							if( Negative_Money_Flow <= 1.43072e+08 )
								if( Positive_Money_Flow_Sum <= 4.32992e+08 )
									ret := 0.272727
								if( Positive_Money_Flow_Sum > 4.32992e+08 )
									ret := 0.640000
							if( Negative_Money_Flow > 1.43072e+08 )
								if( Negative_Money_Flow <= 1.68815e+08 )
									ret := -0.571429
								if( Negative_Money_Flow > 1.68815e+08 )
									ret := 0.000000
						if( MFI_Low > 11.5101 )
							if( Negative_Money_Flow <= 1.87507e+08 )
								if( Negative_Money_Flow <= 1.61243e+07 )
									ret := 0.135673
								if( Negative_Money_Flow > 1.61243e+07 )
									ret := -0.048338
							if( Negative_Money_Flow > 1.87507e+08 )
								if( MFI <= 67.8975 )
									ret := 0.422053
								if( MFI > 67.8975 )
									ret := -0.016129
					if( Raw_Money_Flow > 5.9268e+08 )
						if( rsi1 <= 44.3678 )
							if( Positive_Money_Flow_Sum <= 8.59647e+08 )
								ret := 0.437500
							if( Positive_Money_Flow_Sum > 8.59647e+08 )
								if( Negative_Money_Flow <= 1.16883e+09 )
									ret := -0.351562
								if( Negative_Money_Flow > 1.16883e+09 )
									ret := -0.933333 // sell
						if( rsi1 > 44.3678 )
							if( Positive_Money_Flow_Sum <= 9.39837e+08 )
								if( smoothD_d <= 12.8893 )
									ret := -0.037037
								if( smoothD_d > 12.8893 )
									ret := -0.727273 // sell
							if( Positive_Money_Flow_Sum > 9.39837e+08 )
								if( Money_Flow_Ratio <= 6.29889 )
									ret := 0.467532
								if( Money_Flow_Ratio > 6.29889 )
									ret := 0.123288
				if( Negative_Money_Flow_Sum > 1.73177e+09 )
					if( Typical_Price <= 91.63 )
						if( Positive_Money_Flow_Sum <= 1.40401e+09 )
							ret := -0.904762 // sell
						if( Positive_Money_Flow_Sum > 1.40401e+09 )
							if( MFI_Low <= 19.3638 )
								ret := 0.444444
							if( MFI_Low > 19.3638 )
								ret := -0.500000
					if( Typical_Price > 91.63 )
						if( Raw_Money_Flow <= 3.14729e+07 )
							if( MFI_Low <= 7.52625 )
								if( Raw_Money_Flow <= 1.20265e+06 )
									ret := -0.083333
								if( Raw_Money_Flow > 1.20265e+06 )
									ret := 0.702703 // buy
							if( MFI_Low > 7.52625 )
								if( Negative_Money_Flow <= 2.41869e+07 )
									ret := 0.159186
								if( Negative_Money_Flow > 2.41869e+07 )
									ret := 0.717949 // buy
						if( Raw_Money_Flow > 3.14729e+07 )
							if( Money_Flow_Ratio <= 0.758628 )
								if( MFI <= 30.1386 )
									ret := -0.157221
								if( MFI > 30.1386 )
									ret := 0.127833
							if( Money_Flow_Ratio > 0.758628 )
								if( Positive_Money_Flow <= 2.08408e+09 )
									ret := -0.079848
								if( Positive_Money_Flow > 2.08408e+09 )
									ret := -0.687500
			if( d > 18.5864 )
				if( Negative_Money_Flow_Sum <= 8.10885e+09 )
					if( smoothK_k <= 58.3424 )
						if( MFI <= 64.1854 )
							if( Positive_Money_Flow <= 4.72889e+08 )
								if( Negative_Money_Flow_Sum <= 7.49509e+09 )
									ret := 0.028499
								if( Negative_Money_Flow_Sum > 7.49509e+09 )
									ret := 0.511111
							if( Positive_Money_Flow > 4.72889e+08 )
								if( rsi1 <= 61.5081 )
									ret := -0.088854
								if( rsi1 > 61.5081 )
									ret := -0.358079
						if( MFI > 64.1854 )
							if( Negative_Money_Flow_Sum <= 1.21301e+09 )
								if( Positive_Money_Flow_Sum <= 1.28332e+09 )
									ret := -0.016081
								if( Positive_Money_Flow_Sum > 1.28332e+09 )
									ret := 0.123616
							if( Negative_Money_Flow_Sum > 1.21301e+09 )
								if( Typical_Price <= 3194.96 )
									ret := 0.265815
								if( Typical_Price > 3194.96 )
									ret := -0.056782
					if( smoothK_k > 58.3424 )
						if( MFI_Low <= 67.6753 )
							if( Negative_Money_Flow_Sum <= 4.45885e+09 )
								if( MFI_High <= -14.4607 )
									ret := 0.010391
								if( MFI_High > -14.4607 )
									ret := -0.036700
							if( Negative_Money_Flow_Sum > 4.45885e+09 )
								if( Typical_Price <= 3369.09 )
									ret := -0.198511
								if( Typical_Price > 3369.09 )
									ret := 0.393443
						if( MFI_Low > 67.6753 )
							if( smoothD_d <= 49.4611 )
								if( Negative_Money_Flow_Sum <= 2.1687e+07 )
									ret := 0.230769
								if( Negative_Money_Flow_Sum > 2.1687e+07 )
									ret := -0.351190
							if( smoothD_d > 49.4611 )
								if( rsi1 <= 78.1651 )
									ret := 0.011789
								if( rsi1 > 78.1651 )
									ret := 0.169901
				if( Negative_Money_Flow_Sum > 8.10885e+09 )
					if( rsi1 <= 45.7676 )
						if( Positive_Money_Flow_Sum <= 4.5945e+09 )
							if( Negative_Money_Flow_Sum <= 8.23836e+09 )
								ret := -0.956522 // sell
							if( Negative_Money_Flow_Sum > 8.23836e+09 )
								if( MFI_High <= -49.9528 )
									ret := -0.640000
								if( MFI_High > -49.9528 )
									ret := -0.166667
						if( Positive_Money_Flow_Sum > 4.5945e+09 )
							if( Negative_Money_Flow_Sum <= 1.43029e+10 )
								if( d_k <= 6.55104 )
									ret := -0.064516
								if( d_k > 6.55104 )
									ret := 0.705882 // buy
							if( Negative_Money_Flow_Sum > 1.43029e+10 )
								if( Positive_Money_Flow_Sum <= 8.50852e+09 )
									ret := -0.807692 // sell
								if( Positive_Money_Flow_Sum > 8.50852e+09 )
									ret := -0.384615
					if( rsi1 > 45.7676 )
						if( Typical_Price <= 3150.52 )
							if( d <= 63.0118 )
								if( rsi1 <= 53.3742 )
									ret := 0.000000
								if( rsi1 > 53.3742 )
									ret := -0.653846
							if( d > 63.0118 )
								if( Money_Flow_Ratio <= 0.877513 )
									ret := -0.916667 // sell
								if( Money_Flow_Ratio > 0.877513 )
									ret := -0.400000
						if( Typical_Price > 3150.52 )
							if( Negative_Money_Flow <= 1.89557e+06 )
								ret := -0.555556
							if( Negative_Money_Flow > 1.89557e+06 )
								if( Typical_Price <= 3204.04 )
									ret := -0.823529 // sell
								if( Typical_Price > 3204.04 )
									ret := -0.980769 // sell
	
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
float op_operation = decision_tree_0_AMZN_30Min_d27cedcc(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


