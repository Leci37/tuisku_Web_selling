//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: ADAUSDT_15Min_2MT0_46c33d04 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_15Min_2MT0_46c33d04", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_15Min_46c33d04(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema12 <= -0.001137 )
		if( Positive_Money_Flow <= 1.20635e+06 )
			if( MFI_Low <= 11.2317 )
				if( ema2 <= 0.3284 )
					if( ema3 <= 0.329073 )
						if( Negative_Money_Flow <= 3.25472e+06 )
							if( Negative_Money_Flow <= 2.8223e+06 )
								if( MFI_High <= -66.9423 )
									ret := 0.000000
								if( MFI_High > -66.9423 )
									ret := 0.310223
							if( Negative_Money_Flow > 2.8223e+06 )
								ret := -0.466667
						if( Negative_Money_Flow > 3.25472e+06 )
							if( Money_Flow_Ratio <= 0.130994 )
								ret := 0.800000 // buy
							if( Money_Flow_Ratio > 0.130994 )
								ret := 1.000000 // buy
					if( ema3 > 0.329073 )
						if( Raw_Money_Flow <= 439838 )
							ret := 0.800000 // buy
						if( Raw_Money_Flow > 439838 )
							ret := 1.000000 // buy
				if( ema2 > 0.3284 )
					if( MFI <= 29.827 )
						if( tema <= 0.789234 )
							if( Positive_Money_Flow <= 5300.98 )
								if( MFI_Low <= 8.55899 )
									ret := 0.142596
								if( MFI_Low > 8.55899 )
									ret := -0.043738
							if( Positive_Money_Flow > 5300.98 )
								if( ema13 <= -0.002992 )
									ret := -0.019355
								if( ema13 > -0.002992 )
									ret := 0.168691
						if( tema > 0.789234 )
							if( Money_Flow_Ratio <= 0.0919 )
								ret := -1.000000 // sell
							if( Money_Flow_Ratio > 0.0919 )
								if( Money_Flow_Ratio <= 0.185894 )
									ret := 0.764706 // buy
								if( Money_Flow_Ratio > 0.185894 )
									ret := -0.414286
					if( MFI > 29.827 )
						if( Raw_Money_Flow <= 322472 )
							if( ema12 <= -0.001217 )
								if( ema3 <= 0.386309 )
									ret := 0.300000
								if( ema3 > 0.386309 )
									ret := -0.382353
							if( ema12 > -0.001217 )
								ret := -0.578947
						if( Raw_Money_Flow > 322472 )
							if( Negative_Money_Flow <= 455005 )
								if( Negative_Money_Flow_Sum <= 4.90532e+06 )
									ret := 0.708333 // buy
								if( Negative_Money_Flow_Sum > 4.90532e+06 )
									ret := 0.123239
							if( Negative_Money_Flow > 455005 )
								if( Positive_Money_Flow_Sum <= 2.5323e+06 )
									ret := 0.830357 // buy
								if( Positive_Money_Flow_Sum > 2.5323e+06 )
									ret := 0.398230
			if( MFI_Low > 11.2317 )
				if( ema13 <= -0.000329 )
					if( Positive_Money_Flow_Sum <= 1.63975e+07 )
						if( Positive_Money_Flow <= 877844 )
							if( Negative_Money_Flow <= 2.86603e+06 )
								if( Money_Flow_Ratio <= 0.543473 )
									ret := -0.078638
								if( Money_Flow_Ratio > 0.543473 )
									ret := 0.080206
							if( Negative_Money_Flow > 2.86603e+06 )
								if( tema <= 0.600084 )
									ret := 0.563380
								if( tema > 0.600084 )
									ret := 0.020833
						if( Positive_Money_Flow > 877844 )
							if( Typical_Price <= 0.519135 )
								if( Money_Flow_Ratio <= 0.606581 )
									ret := 0.331288
								if( Money_Flow_Ratio > 0.606581 )
									ret := -0.072165
							if( Typical_Price > 0.519135 )
								if( ema1 <= 0.744822 )
									ret := 0.612245
								if( ema1 > 0.744822 )
									ret := -0.090909
					if( Positive_Money_Flow_Sum > 1.63975e+07 )
						if( Positive_Money_Flow_Sum <= 2.145e+07 )
							if( MFI <= 51.0314 )
								if( Raw_Money_Flow <= 1.0189e+07 )
									ret := -0.549815
								if( Raw_Money_Flow > 1.0189e+07 )
									ret := 0.666667
							if( MFI > 51.0314 )
								if( ema13 <= -0.003132 )
									ret := 0.727273 // buy
								if( ema13 > -0.003132 )
									ret := -0.200000
						if( Positive_Money_Flow_Sum > 2.145e+07 )
							if( tema <= 0.441771 )
								ret := 1.000000 // buy
							if( tema > 0.441771 )
								if( Negative_Money_Flow_Sum <= 2.7725e+07 )
									ret := -0.355556
								if( Negative_Money_Flow_Sum > 2.7725e+07 )
									ret := 0.262069
				if( ema13 > -0.000329 )
					if( Raw_Money_Flow <= 2.9272e+06 )
						if( ema13 <= -4.3e-05 )
							ret := -0.600000
						if( ema13 > -4.3e-05 )
							if( ema12 <= -0.001258 )
								ret := -1.000000 // sell
							if( ema12 > -0.001258 )
								ret := -0.833333 // sell
					if( Raw_Money_Flow > 2.9272e+06 )
						ret := 0.000000
		if( Positive_Money_Flow > 1.20635e+06 )
			if( Positive_Money_Flow <= 3.44935e+06 )
				if( MFI_Low <= 21.0561 )
					if( MFI_High <= -42.6243 )
						if( Positive_Money_Flow <= 2.49041e+06 )
							if( MFI <= 18.1301 )
								if( Typical_Price <= 0.566432 )
									ret := 0.088889
								if( Typical_Price > 0.566432 )
									ret := 0.626866
							if( MFI > 18.1301 )
								if( MFI_Low <= 11.8473 )
									ret := -0.168345
								if( MFI_Low > 11.8473 )
									ret := 0.143293
						if( Positive_Money_Flow > 2.49041e+06 )
							if( ema12 <= -0.015587 )
								ret := 1.000000 // buy
							if( ema12 > -0.015587 )
								if( MFI_Low <= 6.11963 )
									ret := -0.689189
								if( MFI_Low > 6.11963 )
									ret := -0.280992
					if( MFI_High > -42.6243 )
						if( ema1 <= 0.616329 )
							if( ema12 <= -0.002419 )
								if( tema <= 0.590585 )
									ret := 0.651163
								if( tema > 0.590585 )
									ret := 1.000000 // buy
							if( ema12 > -0.002419 )
								if( ema3 <= 0.528138 )
									ret := -0.194444
								if( ema3 > 0.528138 )
									ret := 0.636364
						if( ema1 > 0.616329 )
							if( Positive_Money_Flow <= 1.55869e+06 )
								if( ema2 <= 0.718305 )
									ret := 0.650000
								if( ema2 > 0.718305 )
									ret := -0.285714
							if( Positive_Money_Flow > 1.55869e+06 )
								if( MFI <= 39.2737 )
									ret := -0.227273
								if( MFI > 39.2737 )
									ret := -0.842105 // sell
				if( MFI_Low > 21.0561 )
					if( ema3 <= 0.769597 )
						if( Typical_Price <= 0.660887 )
							if( MFI_High <= -26.3093 )
								if( Positive_Money_Flow <= 2.60622e+06 )
									ret := -0.562712
								if( Positive_Money_Flow > 2.60622e+06 )
									ret := -0.153846
							if( MFI_High > -26.3093 )
								if( ema12 <= -0.002759 )
									ret := 0.641026
								if( ema12 > -0.002759 )
									ret := -0.250000
						if( Typical_Price > 0.660887 )
							if( Positive_Money_Flow_Sum <= 1.05547e+07 )
								ret := 0.090909
							if( Positive_Money_Flow_Sum > 1.05547e+07 )
								if( MFI_Low <= 33.6381 )
									ret := -0.822785 // sell
								if( MFI_Low > 33.6381 )
									ret := -0.384615
					if( ema3 > 0.769597 )
						ret := 0.538462
			if( Positive_Money_Flow > 3.44935e+06 )
				if( tema <= 0.736221 )
					if( MFI_Low <= 30.2565 )
						if( ema12 <= -0.010799 )
							if( Positive_Money_Flow_Sum <= 2.54871e+07 )
								if( Money_Flow_Ratio <= 0.318604 )
									ret := -0.083333
								if( Money_Flow_Ratio > 0.318604 )
									ret := -0.862069 // sell
							if( Positive_Money_Flow_Sum > 2.54871e+07 )
								if( Money_Flow_Ratio <= 0.492968 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 0.492968 )
									ret := 0.375000
						if( ema12 > -0.010799 )
							if( Money_Flow_Ratio <= 0.422826 )
								if( MFI <= 21.8054 )
									ret := 0.333333
								if( MFI > 21.8054 )
									ret := 0.978723 // buy
							if( Money_Flow_Ratio > 0.422826 )
								if( ema13 <= -0.016906 )
									ret := -0.714286 // sell
								if( ema13 > -0.016906 )
									ret := 0.251534
					if( MFI_Low > 30.2565 )
						if( Negative_Money_Flow_Sum <= 2.51289e+07 )
							ret := 0.300000
						if( Negative_Money_Flow_Sum > 2.51289e+07 )
							if( Negative_Money_Flow_Sum <= 4.59303e+07 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 4.59303e+07 )
								ret := 0.909091 // buy
				if( tema > 0.736221 )
					if( ema12 <= -0.005124 )
						ret := -0.875000 // sell
					if( ema12 > -0.005124 )
						ret := -0.363636
	if( ema12 > -0.001137 )
		if( ema1 <= 0.61907 )
			if( tema <= 0.350699 )
				if( ema13 <= 0.001422 )
					if( Negative_Money_Flow_Sum <= 2.1731e+06 )
						if( Negative_Money_Flow <= 106796 )
							if( Negative_Money_Flow_Sum <= 1.34589e+06 )
								if( Raw_Money_Flow <= 301756 )
									ret := 0.003099
								if( Raw_Money_Flow > 301756 )
									ret := -0.189333
							if( Negative_Money_Flow_Sum > 1.34589e+06 )
								if( Positive_Money_Flow_Sum <= 852871 )
									ret := -0.266197
								if( Positive_Money_Flow_Sum > 852871 )
									ret := -0.096343
						if( Negative_Money_Flow > 106796 )
							if( Negative_Money_Flow_Sum <= 516987 )
								if( MFI <= 70.5584 )
									ret := 0.095238
								if( MFI > 70.5584 )
									ret := 0.467532
							if( Negative_Money_Flow_Sum > 516987 )
								if( Money_Flow_Ratio <= 2.04945 )
									ret := 0.037503
								if( Money_Flow_Ratio > 2.04945 )
									ret := -0.170316
					if( Negative_Money_Flow_Sum > 2.1731e+06 )
						if( Negative_Money_Flow_Sum <= 8.351e+06 )
							if( Raw_Money_Flow <= 679073 )
								if( MFI_Low <= 3.10682 )
									ret := 0.198939
								if( MFI_Low > 3.10682 )
									ret := 0.021648
							if( Raw_Money_Flow > 679073 )
								if( Negative_Money_Flow_Sum <= 2.20557e+06 )
									ret := -0.578947
								if( Negative_Money_Flow_Sum > 2.20557e+06 )
									ret := 0.270355
						if( Negative_Money_Flow_Sum > 8.351e+06 )
							if( MFI_High <= -24.4959 )
								if( Negative_Money_Flow <= 652080 )
									ret := -0.406780
								if( Negative_Money_Flow > 652080 )
									ret := -1.000000 // sell
							if( MFI_High > -24.4959 )
								ret := 0.769231 // buy
				if( ema13 > 0.001422 )
					if( Positive_Money_Flow_Sum <= 6.63199e+06 )
						if( Money_Flow_Ratio <= 2.53172 )
							if( Positive_Money_Flow <= 286315 )
								if( Positive_Money_Flow_Sum <= 6.18745e+06 )
									ret := 0.105973
								if( Positive_Money_Flow_Sum > 6.18745e+06 )
									ret := -0.743590 // sell
							if( Positive_Money_Flow > 286315 )
								if( Negative_Money_Flow_Sum <= 1.33149e+06 )
									ret := -0.212766
								if( Negative_Money_Flow_Sum > 1.33149e+06 )
									ret := 0.369620
						if( Money_Flow_Ratio > 2.53172 )
							if( MFI <= 72.6624 )
								if( Money_Flow_Ratio <= 2.5489 )
									ret := -0.666667
								if( Money_Flow_Ratio > 2.5489 )
									ret := -0.195122
							if( MFI > 72.6624 )
								if( Money_Flow_Ratio <= 2.70603 )
									ret := 0.529412
								if( Money_Flow_Ratio > 2.70603 )
									ret := -0.003652
					if( Positive_Money_Flow_Sum > 6.63199e+06 )
						if( MFI_High <= -19.0065 )
							if( MFI <= 53.5744 )
								if( Negative_Money_Flow_Sum <= 2.17923e+07 )
									ret := 0.850000 // buy
								if( Negative_Money_Flow_Sum > 2.17923e+07 )
									ret := 1.000000 // buy
							if( MFI > 53.5744 )
								if( Negative_Money_Flow_Sum <= 1.01162e+07 )
									ret := 0.746032 // buy
								if( Negative_Money_Flow_Sum > 1.01162e+07 )
									ret := -0.333333
						if( MFI_High > -19.0065 )
							if( MFI_High <= 13.3835 )
								if( ema12 <= 0.002907 )
									ret := 0.263754
								if( ema12 > 0.002907 )
									ret := -0.151408
							if( MFI_High > 13.3835 )
								if( Positive_Money_Flow <= 908239 )
									ret := 0.666667
								if( Positive_Money_Flow > 908239 )
									ret := 0.950000 // buy
			if( tema > 0.350699 )
				if( Negative_Money_Flow <= 282099 )
					if( Positive_Money_Flow <= 2.7155e+06 )
						if( ema13 <= 0.000722 )
							if( Raw_Money_Flow <= 1.53745e+06 )
								if( Negative_Money_Flow_Sum <= 2.82032e+06 )
									ret := -0.045478
								if( Negative_Money_Flow_Sum > 2.82032e+06 )
									ret := -0.107454
							if( Raw_Money_Flow > 1.53745e+06 )
								if( MFI <= 43.8009 )
									ret := 0.521368
								if( MFI > 43.8009 )
									ret := -0.067885
						if( ema13 > 0.000722 )
							if( ema1 <= 0.435825 )
								if( Typical_Price <= 0.4375 )
									ret := 0.022342
								if( Typical_Price > 0.4375 )
									ret := 0.413043
							if( ema1 > 0.435825 )
								if( MFI_Low <= 22.0138 )
									ret := 0.333333
								if( MFI_Low > 22.0138 )
									ret := -0.071734
					if( Positive_Money_Flow > 2.7155e+06 )
						if( Negative_Money_Flow_Sum <= 2.95397e+07 )
							if( MFI_Low <= 37.3425 )
								if( MFI_High <= -30.7901 )
									ret := 0.056075
								if( MFI_High > -30.7901 )
									ret := 0.659574
							if( MFI_Low > 37.3425 )
								if( ema13 <= 0.011228 )
									ret := -0.014478
								if( ema13 > 0.011228 )
									ret := 0.266187
						if( Negative_Money_Flow_Sum > 2.95397e+07 )
							if( Negative_Money_Flow_Sum <= 3.10689e+07 )
								ret := -0.583333
							if( Negative_Money_Flow_Sum > 3.10689e+07 )
								ret := -1.000000 // sell
				if( Negative_Money_Flow > 282099 )
					if( Money_Flow_Ratio <= 0.74683 )
						if( Negative_Money_Flow_Sum <= 9.92799e+06 )
							if( Negative_Money_Flow_Sum <= 8.76456e+06 )
								if( Positive_Money_Flow_Sum <= 2.24173e+06 )
									ret := -0.002795
								if( Positive_Money_Flow_Sum > 2.24173e+06 )
									ret := 0.167035
							if( Negative_Money_Flow_Sum > 8.76456e+06 )
								if( Money_Flow_Ratio <= 0.511351 )
									ret := -0.135593
								if( Money_Flow_Ratio > 0.511351 )
									ret := -0.552381
						if( Negative_Money_Flow_Sum > 9.92799e+06 )
							if( Negative_Money_Flow <= 1.53488e+06 )
								if( ema1 <= 0.604751 )
									ret := 0.436594
								if( ema1 > 0.604751 )
									ret := -0.285714
							if( Negative_Money_Flow > 1.53488e+06 )
								if( Typical_Price <= 0.488994 )
									ret := -0.485294
								if( Typical_Price > 0.488994 )
									ret := 0.147059
					if( Money_Flow_Ratio > 0.74683 )
						if( Negative_Money_Flow_Sum <= 1.22487e+07 )
							if( Positive_Money_Flow_Sum <= 3.39012e+06 )
								if( Negative_Money_Flow_Sum <= 1.19227e+06 )
									ret := 0.263514
								if( Negative_Money_Flow_Sum > 1.19227e+06 )
									ret := -0.103306
							if( Positive_Money_Flow_Sum > 3.39012e+06 )
								if( Typical_Price <= 0.608255 )
									ret := 0.048159
								if( Typical_Price > 0.608255 )
									ret := 0.308511
						if( Negative_Money_Flow_Sum > 1.22487e+07 )
							if( MFI_Low <= 42.6903 )
								if( Raw_Money_Flow <= 2.10918e+06 )
									ret := -0.581858
								if( Raw_Money_Flow > 2.10918e+06 )
									ret := -0.093023
							if( MFI_Low > 42.6903 )
								if( Negative_Money_Flow_Sum <= 1.49217e+07 )
									ret := -0.130841
								if( Negative_Money_Flow_Sum > 1.49217e+07 )
									ret := 0.373077
		if( ema1 > 0.61907 )
			if( ema13 <= 0.012375 )
				if( Negative_Money_Flow <= 213446 )
					if( Positive_Money_Flow <= 1.30326e+06 )
						if( ema12 <= 0.003925 )
							if( Positive_Money_Flow_Sum <= 1.12359e+07 )
								if( MFI_Low <= 54.764 )
									ret := -0.063521
								if( MFI_Low > 54.764 )
									ret := 0.402299
							if( Positive_Money_Flow_Sum > 1.12359e+07 )
								if( ema12 <= 0.003261 )
									ret := -0.354962
								if( ema12 > 0.003261 )
									ret := 0.294118
						if( ema12 > 0.003925 )
							if( tema <= 0.636566 )
								ret := -0.466667
							if( tema > 0.636566 )
								if( ema3 <= 0.662079 )
									ret := -0.857143 // sell
								if( ema3 > 0.662079 )
									ret := -1.000000 // sell
					if( Positive_Money_Flow > 1.30326e+06 )
						if( Positive_Money_Flow_Sum <= 4.83453e+07 )
							if( Negative_Money_Flow_Sum <= 3.60214e+06 )
								if( Raw_Money_Flow <= 1.78468e+06 )
									ret := -0.305556
								if( Raw_Money_Flow > 1.78468e+06 )
									ret := 0.541667
							if( Negative_Money_Flow_Sum > 3.60214e+06 )
								if( MFI_High <= -47.1127 )
									ret := 0.545455
								if( MFI_High > -47.1127 )
									ret := -0.487047
						if( Positive_Money_Flow_Sum > 4.83453e+07 )
							if( Positive_Money_Flow <= 3.11289e+06 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow > 3.11289e+06 )
								if( Positive_Money_Flow_Sum <= 5.78436e+07 )
									ret := -0.700000 // sell
								if( Positive_Money_Flow_Sum > 5.78436e+07 )
									ret := 0.272727
				if( Negative_Money_Flow > 213446 )
					if( MFI_Low <= 28.3236 )
						if( Negative_Money_Flow_Sum <= 8.91843e+06 )
							if( Negative_Money_Flow_Sum <= 8.32989e+06 )
								if( MFI_High <= -45.6366 )
									ret := 0.444444
								if( MFI_High > -45.6366 )
									ret := -0.124611
							if( Negative_Money_Flow_Sum > 8.32989e+06 )
								if( ema3 <= 0.653221 )
									ret := 1.000000 // buy
								if( ema3 > 0.653221 )
									ret := 0.382353
						if( Negative_Money_Flow_Sum > 8.91843e+06 )
							if( ema3 <= 0.772799 )
								if( MFI_Low <= 15.7899 )
									ret := -0.235294
								if( MFI_Low > 15.7899 )
									ret := -0.534091
							if( ema3 > 0.772799 )
								if( MFI_High <= -45.4442 )
									ret := -0.541667
								if( MFI_High > -45.4442 )
									ret := 0.354167
					if( MFI_Low > 28.3236 )
						if( ema12 <= 0.005604 )
							if( Negative_Money_Flow_Sum <= 2.65784e+07 )
								if( ema1 <= 0.765617 )
									ret := 0.049242
								if( ema1 > 0.765617 )
									ret := -0.205263
							if( Negative_Money_Flow_Sum > 2.65784e+07 )
								if( Raw_Money_Flow <= 3.93549e+06 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 3.93549e+06 )
									ret := 0.000000
						if( ema12 > 0.005604 )
							if( Positive_Money_Flow_Sum <= 2.229e+07 )
								ret := -0.952381 // sell
							if( Positive_Money_Flow_Sum > 2.229e+07 )
								if( Typical_Price <= 0.650608 )
									ret := -0.571429
								if( Typical_Price > 0.650608 )
									ret := 0.444444
			if( ema13 > 0.012375 )
				if( MFI_High <= -16.3143 )
					if( MFI_High <= -16.9516 )
						ret := -0.454545
					if( MFI_High > -16.9516 )
						ret := -1.000000 // sell
				if( MFI_High > -16.3143 )
					if( Typical_Price <= 0.634494 )
						ret := -0.600000
					if( Typical_Price > 0.634494 )
						if( MFI <= 81.604 )
							if( ema1 <= 0.642022 )
								if( ema3 <= 0.619656 )
									ret := 0.419355
								if( ema3 > 0.619656 )
									ret := -0.800000 // sell
							if( ema1 > 0.642022 )
								if( MFI_High <= -1.15897 )
									ret := 0.763889 // buy
								if( MFI_High > -1.15897 )
									ret := 0.338983
						if( MFI > 81.604 )
							if( tema <= 0.7919 )
								if( ema12 <= 0.008537 )
									ret := -0.413043
								if( ema12 > 0.008537 )
									ret := 0.450000
							if( tema > 0.7919 )
								if( Typical_Price <= 0.800546 )
									ret := -0.615385
								if( Typical_Price > 0.800546 )
									ret := -0.777778 // sell
	
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
float op_operation = decision_tree_0_ADAUSDT_15Min_46c33d04(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)

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


