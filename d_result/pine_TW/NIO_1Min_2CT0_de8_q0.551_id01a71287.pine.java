//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: NIO_1Min_2CT0_01a71287 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NIO_1Min_2CT0_01a71287", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NIO_1Min_01a71287(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ad <= 95.3384 )
		if( ad <= -17.3732 )
			if( ad_mf <= -36249.4 )
				if( ema1 <= 5.28249 )
					if( ema12 <= -0.012568 )
						if( ad_mf <= -582707 )
							if( ad <= -1.82826e+06 )
								ret := 0.846154 // buy
							if( ad > -1.82826e+06 )
								if( ad_mf <= -825404 )
									ret := -0.231884
								if( ad_mf > -825404 )
									ret := -0.893617 // sell
						if( ad_mf > -582707 )
							if( ad_mf <= -322373 )
								if( ad <= -398431 )
									ret := 0.093458
								if( ad > -398431 )
									ret := 0.689655
							if( ad_mf > -322373 )
								if( ad_mf <= -61906.2 )
									ret := -0.011299
								if( ad_mf > -61906.2 )
									ret := -0.318519
					if( ema12 > -0.012568 )
						if( tema <= 4.39464 )
							if( ema3 <= 4.39217 )
								if( ema3 <= 3.69053 )
									ret := 1.000000 // buy
								if( ema3 > 3.69053 )
									ret := 0.195971
							if( ema3 > 4.39217 )
								if( ema13 <= -0.004885 )
									ret := 0.681159
								if( ema13 > -0.004885 )
									ret := 0.000000
						if( tema > 4.39464 )
							if( ema3 <= 4.3969 )
								if( tema <= 4.3996 )
									ret := 0.166667
								if( tema > 4.3996 )
									ret := -0.466667
							if( ema3 > 4.3969 )
								if( tema <= 4.39992 )
									ret := -0.447368
								if( tema > 4.39992 )
									ret := 0.135334
				if( ema1 > 5.28249 )
					if( ad <= -225864 )
						if( ad_mf <= -542347 )
							if( ad <= -568705 )
								if( tema <= 6.22846 )
									ret := -0.163580
								if( tema > 6.22846 )
									ret := 0.181467
							if( ad > -568705 )
								if( ema13 <= -0.039156 )
									ret := 1.000000 // buy
								if( ema13 > -0.039156 )
									ret := 0.800000 // buy
						if( ad_mf > -542347 )
							if( ad_mf <= -419817 )
								if( ema13 <= -0.05666 )
									ret := 0.857143 // buy
								if( ema13 > -0.05666 )
									ret := -0.541502
							if( ad_mf > -419817 )
								if( mf <= -0.443046 )
									ret := -0.857143 // sell
								if( mf > -0.443046 )
									ret := -0.091945
					if( ad > -225864 )
						if( mf <= 0.168669 )
							if( ema12 <= -0.153797 )
								ret := -1.000000 // sell
							if( ema12 > -0.153797 )
								if( ema2 <= 5.2805 )
									ret := -0.700000 // sell
								if( ema2 > 5.2805 )
									ret := 0.044076
						if( mf > 0.168669 )
							if( ad <= -76185.5 )
								if( ema2 <= 6.29586 )
									ret := 0.553191
								if( ema2 > 6.29586 )
									ret := 0.110169
							if( ad > -76185.5 )
								if( ad <= -56738.4 )
									ret := -0.322981
								if( ad > -56738.4 )
									ret := 0.409836
			if( ad_mf > -36249.4 )
				if( ad <= -5902.6 )
					if( ema2 <= 5.02004 )
						if( ad <= -5987.88 )
							if( ad_mf <= -35610.9 )
								if( ema2 <= 4.75778 )
									ret := 0.641509
								if( ema2 > 4.75778 )
									ret := 0.208333
							if( ad_mf > -35610.9 )
								if( ema3 <= 4.3928 )
									ret := 0.300240
								if( ema3 > 4.3928 )
									ret := 0.227860
						if( ad > -5987.88 )
							if( ema12 <= -0.00122 )
								ret := 0.222222
							if( ema12 > -0.00122 )
								if( ad_mf <= -5920.02 )
									ret := -0.705882 // sell
								if( ad_mf > -5920.02 )
									ret := 0.500000
					if( ema2 > 5.02004 )
						if( ema12 <= 0.017891 )
							if( ad_mf <= -5990.37 )
								if( ad_mf <= -7999.17 )
									ret := 0.147292
								if( ad_mf > -7999.17 )
									ret := 0.313808
							if( ad_mf > -5990.37 )
								if( ad_mf <= -5961.8 )
									ret := -0.866667 // sell
								if( ad_mf > -5961.8 )
									ret := -0.217391
						if( ema12 > 0.017891 )
							if( mf <= -0.151241 )
								ret := 0.600000
							if( mf > -0.151241 )
								if( ad <= -29955.5 )
									ret := 0.900000 // buy
								if( ad > -29955.5 )
									ret := -0.403101
				if( ad > -5902.6 )
					if( tema <= 5.21765 )
						if( ema12 <= 0.000446 )
							if( ema13 <= -0.004295 )
								if( ema3 <= 5.23026 )
									ret := 0.374753
								if( ema3 > 5.23026 )
									ret := 0.833333 // buy
							if( ema13 > -0.004295 )
								if( mf <= 0.278362 )
									ret := 0.439340
								if( mf > 0.278362 )
									ret := 0.682203
						if( ema12 > 0.000446 )
							if( ad_mf <= -1381.63 )
								if( ema12 <= 0.002886 )
									ret := 0.290173
								if( ema12 > 0.002886 )
									ret := 0.106762
							if( ad_mf > -1381.63 )
								if( ema1 <= 4.96047 )
									ret := 0.295327
								if( ema1 > 4.96047 )
									ret := 0.679104
					if( tema > 5.21765 )
						if( ema13 <= 0.023821 )
							if( ema12 <= -0.003767 )
								if( ad_mf <= -219.561 )
									ret := 0.079526
								if( ad_mf > -219.561 )
									ret := 0.666667
							if( ema12 > -0.003767 )
								if( ema12 <= -0.000796 )
									ret := 0.360087
								if( ema12 > -0.000796 )
									ret := 0.164079
						if( ema13 > 0.023821 )
							if( mf <= 0.252175 )
								if( ad <= -1311.56 )
									ret := -0.289474
								if( ad > -1311.56 )
									ret := 0.647059
							if( mf > 0.252175 )
								if( ad_mf <= -2134.36 )
									ret := -0.076923
								if( ad_mf > -2134.36 )
									ret := -0.800000 // sell
		if( ad > -17.3732 )
			if( ema13 <= -0.000757 )
				if( ad_mf <= -0.161851 )
					if( ema1 <= 6.13074 )
						if( ema12 <= -0.000661 )
							if( ema1 <= 4.76337 )
								if( ema12 <= -0.014356 )
									ret := -1.000000 // sell
								if( ema12 > -0.014356 )
									ret := 0.350920
							if( ema1 > 4.76337 )
								if( mf <= 0.173211 )
									ret := 0.640625
								if( mf > 0.173211 )
									ret := 0.133708
						if( ema12 > -0.000661 )
							if( ema3 <= 4.65199 )
								if( ema1 <= 4.30647 )
									ret := 0.093750
								if( ema1 > 4.30647 )
									ret := -0.314516
							if( ema3 > 4.65199 )
								if( tema <= 4.84587 )
									ret := 0.611111
								if( tema > 4.84587 )
									ret := 0.188811
					if( ema1 > 6.13074 )
						if( tema <= 6.2299 )
							ret := -1.000000 // sell
						if( tema > 6.2299 )
							if( ema1 <= 7.41464 )
								if( ema3 <= 6.90252 )
									ret := -0.164557
								if( ema3 > 6.90252 )
									ret := 0.180000
							if( ema1 > 7.41464 )
								ret := -0.875000 // sell
				if( ad_mf > -0.161851 )
					if( mf <= -0.702897 )
						if( mf <= -0.854256 )
							if( mf <= -0.92469 )
								ret := -0.230769
							if( mf > -0.92469 )
								ret := -0.500000
						if( mf > -0.854256 )
							if( ema12 <= -0.001291 )
								if( ema3 <= 3.86589 )
									ret := 0.153846
								if( ema3 > 3.86589 )
									ret := 0.684848
							if( ema12 > -0.001291 )
								if( ad_mf <= 0.737162 )
									ret := -0.444444
								if( ad_mf > 0.737162 )
									ret := 0.120000
					if( mf > -0.702897 )
						if( ema12 <= -0.000807 )
							if( ema12 <= -0.001952 )
								if( ema13 <= -0.065351 )
									ret := -0.493671
								if( ema13 > -0.065351 )
									ret := 0.043586
							if( ema12 > -0.001952 )
								if( ema2 <= 4.04355 )
									ret := 0.302570
								if( ema2 > 4.04355 )
									ret := 0.095731
						if( ema12 > -0.000807 )
							if( ema3 <= 7.16404 )
								if( mf <= 0.040604 )
									ret := -0.104462
								if( mf > 0.040604 )
									ret := 0.115385
							if( ema3 > 7.16404 )
								ret := 1.000000 // buy
			if( ema13 > -0.000757 )
				if( ema3 <= 6.92084 )
					if( ema12 <= -0.000202 )
						if( tema <= 4.01506 )
							if( ema2 <= 3.78912 )
								if( mf <= 0.477599 )
									ret := 0.683824
								if( mf > 0.477599 )
									ret := -0.375000
							if( ema2 > 3.78912 )
								if( mf <= 0.270105 )
									ret := 0.275591
								if( mf > 0.270105 )
									ret := 0.712329 // buy
						if( tema > 4.01506 )
							if( mf <= 0.355966 )
								if( ema13 <= 0.003223 )
									ret := 0.025399
								if( ema13 > 0.003223 )
									ret := -0.370000
							if( mf > 0.355966 )
								if( ema3 <= 5.72748 )
									ret := 0.311526
								if( ema3 > 5.72748 )
									ret := -0.428571
					if( ema12 > -0.000202 )
						if( ad_mf <= 0.101151 )
							if( ema3 <= 5.5848 )
								if( ema2 <= 5.44916 )
									ret := -0.035359
								if( ema2 > 5.44916 )
									ret := -0.194898
							if( ema3 > 5.5848 )
								if( mf <= 0.869764 )
									ret := 0.112078
								if( mf > 0.869764 )
									ret := -0.571429
						if( ad_mf > 0.101151 )
							if( tema <= 3.70618 )
								if( tema <= 3.70068 )
									ret := 0.125000
								if( tema > 3.70068 )
									ret := 0.818182 // buy
							if( tema > 3.70618 )
								if( ad_mf <= 0.795927 )
									ret := -0.121066
								if( ad_mf > 0.795927 )
									ret := -0.402597
				if( ema3 > 6.92084 )
					if( ad_mf <= -0.066061 )
						if( tema <= 7.08121 )
							if( ema13 <= 0.017422 )
								if( mf <= 0.349978 )
									ret := -0.843137 // sell
								if( mf > 0.349978 )
									ret := -1.000000 // sell
							if( ema13 > 0.017422 )
								ret := -0.714286 // sell
						if( tema > 7.08121 )
							if( tema <= 7.40463 )
								if( ad_mf <= -0.178231 )
									ret := -0.384615
								if( ad_mf > -0.178231 )
									ret := 0.480000
							if( tema > 7.40463 )
								if( ad_mf <= -0.221673 )
									ret := 0.000000
								if( ad_mf > -0.221673 )
									ret := -0.906977 // sell
					if( ad_mf > -0.066061 )
						if( ema3 <= 7.01476 )
							if( mf <= -0.173106 )
								if( mf <= -0.368917 )
									ret := -0.375000
								if( mf > -0.368917 )
									ret := 0.117647
							if( mf > -0.173106 )
								if( ad_mf <= 0.01299 )
									ret := -0.368421
								if( ad_mf > 0.01299 )
									ret := -1.000000 // sell
						if( ema3 > 7.01476 )
							if( ema1 <= 7.07652 )
								ret := 0.884615 // buy
							if( ema1 > 7.07652 )
								if( ema12 <= 0.002191 )
									ret := -0.478261
								if( ema12 > 0.002191 )
									ret := 0.366667
	if( ad > 95.3384 )
		if( ema2 <= 5.16475 )
			if( ad <= 19507.1 )
				if( ema12 <= 0.0008 )
					if( ema12 <= -0.007083 )
						if( mf <= 0.021405 )
							if( ad_mf <= 16005.7 )
								if( tema <= 5.06484 )
									ret := 0.096447
								if( tema > 5.06484 )
									ret := -0.351351
							if( ad_mf > 16005.7 )
								if( ema12 <= -0.011907 )
									ret := -1.000000 // sell
								if( ema12 > -0.011907 )
									ret := -0.454545
						if( mf > 0.021405 )
							if( ad_mf <= 11676.9 )
								if( ema12 <= -0.008225 )
									ret := -0.626168
								if( ema12 > -0.008225 )
									ret := 0.111111
							if( ad_mf > 11676.9 )
								if( ema13 <= -0.017156 )
									ret := 0.500000
								if( ema13 > -0.017156 )
									ret := 0.727273 // buy
					if( ema12 > -0.007083 )
						if( tema <= 3.78806 )
							if( ema2 <= 3.6779 )
								ret := 0.625000
							if( ema2 > 3.6779 )
								if( ema2 <= 3.78963 )
									ret := -0.044118
								if( ema2 > 3.78963 )
									ret := 0.437500
						if( tema > 3.78806 )
							if( ema3 <= 5.00741 )
								if( tema <= 4.35554 )
									ret := -0.303075
								if( tema > 4.35554 )
									ret := -0.234055
							if( ema3 > 5.00741 )
								if( mf <= 0.146047 )
									ret := -0.334507
								if( mf > 0.146047 )
									ret := -0.679012
				if( ema12 > 0.0008 )
					if( ema3 <= 3.80098 )
						if( ad <= 2145.5 )
							if( ema12 <= 0.005835 )
								if( ema13 <= 0.001922 )
									ret := -0.538462
								if( ema13 > 0.001922 )
									ret := -0.105263
							if( ema12 > 0.005835 )
								ret := -0.722222 // sell
						if( ad > 2145.5 )
							if( ad_mf <= 10060.4 )
								if( ema12 <= 0.00177 )
									ret := 0.375000
								if( ema12 > 0.00177 )
									ret := 0.010753
							if( ad_mf > 10060.4 )
								if( tema <= 3.79968 )
									ret := -0.491803
								if( tema > 3.79968 )
									ret := 0.277778
					if( ema3 > 3.80098 )
						if( ema13 <= 0.04858 )
							if( tema <= 4.42696 )
								if( mf <= -0.089736 )
									ret := -0.568556
								if( mf > -0.089736 )
									ret := -0.382190
							if( tema > 4.42696 )
								if( ad <= 355.81 )
									ret := -0.052632
								if( ad > 355.81 )
									ret := -0.367258
						if( ema13 > 0.04858 )
							if( ema13 <= 0.058863 )
								if( ema13 <= 0.051494 )
									ret := 0.818182 // buy
								if( ema13 > 0.051494 )
									ret := 0.384615
							if( ema13 > 0.058863 )
								if( mf <= 0.237555 )
									ret := 0.200000
								if( mf > 0.237555 )
									ret := -0.647059
			if( ad > 19507.1 )
				if( ema13 <= -0.0139 )
					if( ad_mf <= 120146 )
						if( ad <= 117191 )
							if( ema12 <= -0.008271 )
								if( ad_mf <= 106889 )
									ret := -0.210191
								if( ad_mf > 106889 )
									ret := 0.625000
							if( ema12 > -0.008271 )
								if( ad <= 96694.8 )
									ret := 0.293413
								if( ad > 96694.8 )
									ret := -0.360000
						if( ad > 117191 )
							if( ema13 <= -0.025821 )
								ret := -0.952381 // sell
							if( ema13 > -0.025821 )
								ret := -0.444444
					if( ad_mf > 120146 )
						if( ad <= 285294 )
							if( ad <= 280087 )
								if( ema3 <= 4.14486 )
									ret := -0.323529
								if( ema3 > 4.14486 )
									ret := 0.181818
							if( ad > 280087 )
								ret := 1.000000 // buy
						if( ad > 285294 )
							if( ad_mf <= 495592 )
								if( ad <= 358658 )
									ret := -0.594595
								if( ad > 358658 )
									ret := -0.153846
							if( ad_mf > 495592 )
								if( mf <= 0.101842 )
									ret := 0.449438
								if( mf > 0.101842 )
									ret := -0.346154
				if( ema13 > -0.0139 )
					if( ema13 <= 0.019471 )
						if( ad <= 19607.2 )
							if( ad <= 19557.1 )
								ret := 0.000000
							if( ad > 19557.1 )
								ret := 0.800000 // buy
						if( ad > 19607.2 )
							if( ema12 <= -0.000292 )
								if( ema1 <= 4.46605 )
									ret := -0.085437
								if( ema1 > 4.46605 )
									ret := -0.245436
							if( ema12 > -0.000292 )
								if( ema1 <= 4.90109 )
									ret := -0.250144
								if( ema1 > 4.90109 )
									ret := -0.156250
					if( ema13 > 0.019471 )
						if( ad_mf <= 65889.8 )
							if( ad_mf <= 21818.3 )
								if( ema13 <= 0.051012 )
									ret := 0.796296 // buy
								if( ema13 > 0.051012 )
									ret := 0.090909
							if( ad_mf > 21818.3 )
								if( tema <= 4.59262 )
									ret := -0.064677
								if( tema > 4.59262 )
									ret := 0.322115
						if( ad_mf > 65889.8 )
							if( ema3 <= 4.07568 )
								if( ema12 <= 0.013479 )
									ret := 0.433962
								if( ema12 > 0.013479 )
									ret := -0.176471
							if( ema3 > 4.07568 )
								if( ema13 <= 0.083956 )
									ret := -0.188634
								if( ema13 > 0.083956 )
									ret := -0.833333 // sell
		if( ema2 > 5.16475 )
			if( ad_mf <= 726891 )
				if( ema13 <= 0.087158 )
					if( ema1 <= 5.74436 )
						if( ema13 <= 0.0386 )
							if( ad <= 70737.4 )
								if( ad <= 70301.5 )
									ret := -0.187139
								if( ad > 70301.5 )
									ret := -0.976190 // sell
							if( ad > 70737.4 )
								if( ad <= 287280 )
									ret := -0.064587
								if( ad > 287280 )
									ret := -0.278571
						if( ema13 > 0.0386 )
							if( ema3 <= 5.36836 )
								if( ema12 <= 0.021129 )
									ret := 0.851852 // buy
								if( ema12 > 0.021129 )
									ret := 0.284091
							if( ema3 > 5.36836 )
								if( ema12 <= 0.0233 )
									ret := -0.500000
								if( ema12 > 0.0233 )
									ret := 0.187500
					if( ema1 > 5.74436 )
						if( ema12 <= -0.008134 )
							if( ad <= 31835.9 )
								if( ema2 <= 6.77038 )
									ret := 0.331915
								if( ema2 > 6.77038 )
									ret := 0.081301
							if( ad > 31835.9 )
								if( mf <= -0.386565 )
									ret := -0.739130 // sell
								if( mf > -0.386565 )
									ret := -0.060897
						if( ema12 > -0.008134 )
							if( ema13 <= -0.019622 )
								if( ad <= 163999 )
									ret := 0.289474
								if( ad > 163999 )
									ret := 0.625000
							if( ema13 > -0.019622 )
								if( ema12 <= -0.00607 )
									ret := -0.305660
								if( ema12 > -0.00607 )
									ret := -0.093161
				if( ema13 > 0.087158 )
					if( ad <= 43489.5 )
						if( tema <= 6.18283 )
							ret := -0.666667
						if( tema > 6.18283 )
							ret := -1.000000 // sell
					if( ad > 43489.5 )
						if( ad <= 54299 )
							ret := 0.750000 // buy
						if( ad > 54299 )
							if( ad_mf <= 187645 )
								if( ad <= 174237 )
									ret := -0.500000
								if( ad > 174237 )
									ret := -1.000000 // sell
							if( ad_mf > 187645 )
								ret := -0.062500
			if( ad_mf > 726891 )
				if( ad_mf <= 1.60041e+06 )
					if( ad <= 1.22083e+06 )
						if( ad <= 1.15495e+06 )
							if( tema <= 6.47011 )
								if( ema13 <= -0.015386 )
									ret := 0.894737 // buy
								if( ema13 > -0.015386 )
									ret := 0.325581
							if( tema > 6.47011 )
								if( mf <= 0.368927 )
									ret := -0.028169
								if( mf > 0.368927 )
									ret := -1.000000 // sell
						if( ad > 1.15495e+06 )
							ret := -1.000000 // sell
					if( ad > 1.22083e+06 )
						if( tema <= 5.78775 )
							ret := 0.230769
						if( tema > 5.78775 )
							if( ad_mf <= 1.23998e+06 )
								ret := 0.900000 // buy
							if( ad_mf > 1.23998e+06 )
								ret := 1.000000 // buy
				if( ad_mf > 1.60041e+06 )
					if( ema12 <= 0.003733 )
						if( ema3 <= 5.72729 )
							ret := -0.375000
						if( ema3 > 5.72729 )
							ret := -1.000000 // sell
					if( ema12 > 0.003733 )
						ret := -0.400000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_NIO_1Min_01a71287(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)

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


