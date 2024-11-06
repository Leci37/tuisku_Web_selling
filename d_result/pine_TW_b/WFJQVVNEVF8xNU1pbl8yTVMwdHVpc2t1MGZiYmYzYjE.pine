//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: XRPUSDT_15Min_2MS0_0fbbf3b1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_15Min_2MS0_0fbbf3b1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_15Min_0fbbf3b1(Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum, smoothK_k, d_k, k, smoothD_d, rsi1, d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( smoothK_k <= 40.4732 )
		if( rsi1 <= 46.1537 )
			if( MFI_Low <= 20.7599 )
				if( Typical_Price <= 0.429448 )
					if( Negative_Money_Flow_Sum <= 1.78582e+07 )
						if( d <= 18.4252 )
							if( Typical_Price <= 0.399483 )
								if( Negative_Money_Flow_Sum <= 1.1575e+07 )
									ret := 0.054340
								if( Negative_Money_Flow_Sum > 1.1575e+07 )
									ret := -0.087209
							if( Typical_Price > 0.399483 )
								if( Positive_Money_Flow_Sum <= 1.07626e+07 )
									ret := -0.315789
								if( Positive_Money_Flow_Sum > 1.07626e+07 )
									ret := 1.000000 // buy
						if( d > 18.4252 )
							if( Negative_Money_Flow <= 677461 )
								if( Negative_Money_Flow_Sum <= 7.29523e+06 )
									ret := -0.109551
								if( Negative_Money_Flow_Sum > 7.29523e+06 )
									ret := 0.063943
							if( Negative_Money_Flow > 677461 )
								if( Negative_Money_Flow <= 3.37745e+06 )
									ret := 0.212398
								if( Negative_Money_Flow > 3.37745e+06 )
									ret := -0.107143
					if( Negative_Money_Flow_Sum > 1.78582e+07 )
						if( Negative_Money_Flow_Sum <= 3.6681e+07 )
							if( Negative_Money_Flow_Sum <= 2.23528e+07 )
								if( Typical_Price <= 0.305984 )
									ret := -1.000000 // sell
								if( Typical_Price > 0.305984 )
									ret := 0.302432
							if( Negative_Money_Flow_Sum > 2.23528e+07 )
								if( MFI <= 16.7497 )
									ret := 0.330317
								if( MFI > 16.7497 )
									ret := -0.042808
						if( Negative_Money_Flow_Sum > 3.6681e+07 )
							if( d <= 16.2541 )
								if( Raw_Money_Flow <= 5.43388e+06 )
									ret := 0.401961
								if( Raw_Money_Flow > 5.43388e+06 )
									ret := -0.215686
							if( d > 16.2541 )
								if( Typical_Price <= 0.419735 )
									ret := 0.793388 // buy
								if( Typical_Price > 0.419735 )
									ret := 0.333333
				if( Typical_Price > 0.429448 )
					if( d <= 14.4918 )
						if( Typical_Price <= 0.502683 )
							if( Positive_Money_Flow_Sum <= 1.99917e+07 )
								if( d_k <= -0.167521 )
									ret := -0.430233
								if( d_k > -0.167521 )
									ret := -0.198971
							if( Positive_Money_Flow_Sum > 1.99917e+07 )
								if( smoothD_d <= 7.73594 )
									ret := 0.574074
								if( smoothD_d > 7.73594 )
									ret := -0.388889
						if( Typical_Price > 0.502683 )
							if( d <= 8.50086 )
								if( rsi1 <= 29.9987 )
									ret := -0.651376
								if( rsi1 > 29.9987 )
									ret := -0.352083
							if( d > 8.50086 )
								if( rsi1 <= 30.8998 )
									ret := -0.612903
								if( rsi1 > 30.8998 )
									ret := -0.184701
					if( d > 14.4918 )
						if( rsi1 <= 33.7656 )
							if( Negative_Money_Flow <= 1.07407e+07 )
								if( Money_Flow_Ratio <= 0.281494 )
									ret := -0.065531
								if( Money_Flow_Ratio > 0.281494 )
									ret := -0.439762
							if( Negative_Money_Flow > 1.07407e+07 )
								if( MFI <= 30.8647 )
									ret := 0.693431
								if( MFI > 30.8647 )
									ret := -0.176471
						if( rsi1 > 33.7656 )
							if( Negative_Money_Flow <= 2.40086e+06 )
								if( MFI_High <= -45.9416 )
									ret := 0.014757
								if( MFI_High > -45.9416 )
									ret := -0.205556
							if( Negative_Money_Flow > 2.40086e+06 )
								if( MFI_Low <= 12.4786 )
									ret := 0.520270
								if( MFI_Low > 12.4786 )
									ret := 0.186186
			if( MFI_Low > 20.7599 )
				if( Typical_Price <= 0.418792 )
					if( Positive_Money_Flow_Sum <= 2.79111e+07 )
						if( Positive_Money_Flow_Sum <= 8.76838e+06 )
							if( Typical_Price <= 0.355997 )
								if( Positive_Money_Flow_Sum <= 8.14541e+06 )
									ret := 0.085179
								if( Positive_Money_Flow_Sum > 8.14541e+06 )
									ret := -0.326531
							if( Typical_Price > 0.355997 )
								if( Raw_Money_Flow <= 491039 )
									ret := 0.004739
								if( Raw_Money_Flow > 491039 )
									ret := -0.229114
						if( Positive_Money_Flow_Sum > 8.76838e+06 )
							if( Negative_Money_Flow_Sum <= 1.78379e+07 )
								if( Typical_Price <= 0.401677 )
									ret := 0.212944
								if( Typical_Price > 0.401677 )
									ret := -0.168224
							if( Negative_Money_Flow_Sum > 1.78379e+07 )
								if( MFI_Low <= 21.3534 )
									ret := -0.782609 // sell
								if( MFI_Low > 21.3534 )
									ret := -0.111111
					if( Positive_Money_Flow_Sum > 2.79111e+07 )
						if( Raw_Money_Flow <= 4.74725e+06 )
							if( Positive_Money_Flow_Sum <= 3.10942e+07 )
								ret := 0.600000
							if( Positive_Money_Flow_Sum > 3.10942e+07 )
								ret := 1.000000 // buy
						if( Raw_Money_Flow > 4.74725e+06 )
							if( smoothD_d <= 16.6622 )
								ret := -1.000000 // sell
							if( smoothD_d > 16.6622 )
								ret := 0.000000
				if( Typical_Price > 0.418792 )
					if( rsi1 <= 37.1777 )
						if( Positive_Money_Flow_Sum <= 9.32558e+06 )
							if( Positive_Money_Flow_Sum <= 4.79753e+06 )
								if( d_k <= 13.7703 )
									ret := -0.459750
								if( d_k > 13.7703 )
									ret := -0.096774
							if( Positive_Money_Flow_Sum > 4.79753e+06 )
								if( k <= 8.81939 )
									ret := -0.513361
								if( k > 8.81939 )
									ret := -0.668731
						if( Positive_Money_Flow_Sum > 9.32558e+06 )
							if( Negative_Money_Flow_Sum <= 1.28401e+08 )
								if( Positive_Money_Flow <= 3.09337e+06 )
									ret := -0.692551
								if( Positive_Money_Flow > 3.09337e+06 )
									ret := -0.864865 // sell
							if( Negative_Money_Flow_Sum > 1.28401e+08 )
								if( MFI_Low <= 26.6458 )
									ret := 0.769231 // buy
								if( MFI_Low > 26.6458 )
									ret := -1.000000 // sell
					if( rsi1 > 37.1777 )
						if( Positive_Money_Flow <= 875310 )
							if( Money_Flow_Ratio <= 1.14759 )
								if( Negative_Money_Flow <= 5.72447e+06 )
									ret := -0.237013
								if( Negative_Money_Flow > 5.72447e+06 )
									ret := 0.126316
							if( Money_Flow_Ratio > 1.14759 )
								if( Positive_Money_Flow_Sum <= 7.87404e+06 )
									ret := -0.294915
								if( Positive_Money_Flow_Sum > 7.87404e+06 )
									ret := -0.479795
						if( Positive_Money_Flow > 875310 )
							if( MFI <= 42.6505 )
								if( Positive_Money_Flow_Sum <= 2.24915e+07 )
									ret := -0.320312
								if( Positive_Money_Flow_Sum > 2.24915e+07 )
									ret := 0.297297
							if( MFI > 42.6505 )
								if( MFI <= 57.9464 )
									ret := -0.521314
								if( MFI > 57.9464 )
									ret := -0.691011
		if( rsi1 > 46.1537 )
			if( Positive_Money_Flow <= 1.47105e+06 )
				if( rsi1 <= 63.4934 )
					if( MFI <= 70.1659 )
						if( Negative_Money_Flow_Sum <= 1.81819e+07 )
							if( Negative_Money_Flow <= 261489 )
								if( d <= 24.1369 )
									ret := -0.127646
								if( d > 24.1369 )
									ret := -0.003205
							if( Negative_Money_Flow > 261489 )
								if( MFI_High <= -39.1941 )
									ret := 0.245370
								if( MFI_High > -39.1941 )
									ret := 0.033739
						if( Negative_Money_Flow_Sum > 1.81819e+07 )
							if( MFI_High <= -31.9405 )
								if( d <= 16.7975 )
									ret := 0.093750
								if( d > 16.7975 )
									ret := 0.541076
							if( MFI_High > -31.9405 )
								if( rsi1 <= 47.5432 )
									ret := -0.310345
								if( rsi1 > 47.5432 )
									ret := 0.159652
					if( MFI > 70.1659 )
						if( Typical_Price <= 0.336383 )
							if( rsi1 <= 57.4465 )
								ret := 0.500000
							if( rsi1 > 57.4465 )
								if( d_k <= 6.69361 )
									ret := 0.750000 // buy
								if( d_k > 6.69361 )
									ret := 1.000000 // buy
						if( Typical_Price > 0.336383 )
							if( Negative_Money_Flow_Sum <= 6.97049e+07 )
								if( Negative_Money_Flow <= 6.0119e+06 )
									ret := -0.231562
								if( Negative_Money_Flow > 6.0119e+06 )
									ret := -0.944444 // sell
							if( Negative_Money_Flow_Sum > 6.97049e+07 )
								if( smoothD_d <= 9.37973 )
									ret := 0.250000
								if( smoothD_d > 9.37973 )
									ret := 1.000000 // buy
				if( rsi1 > 63.4934 )
					if( Negative_Money_Flow_Sum <= 1.00477e+07 )
						if( smoothK_k <= 27.0101 )
							if( d_k <= -1.82084 )
								if( d <= 18.3226 )
									ret := 0.090909
								if( d > 18.3226 )
									ret := 0.407407
							if( d_k > -1.82084 )
								if( Typical_Price <= 0.505623 )
									ret := -0.157895
								if( Typical_Price > 0.505623 )
									ret := 0.076087
						if( smoothK_k > 27.0101 )
							if( Negative_Money_Flow_Sum <= 9.80517e+06 )
								if( Raw_Money_Flow <= 770078 )
									ret := 0.009346
								if( Raw_Money_Flow > 770078 )
									ret := 0.367273
							if( Negative_Money_Flow_Sum > 9.80517e+06 )
								if( Money_Flow_Ratio <= 2.64857 )
									ret := 0.400000
								if( Money_Flow_Ratio > 2.64857 )
									ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 1.00477e+07 )
						if( smoothK_k <= 8.04543 )
							if( Raw_Money_Flow <= 1.7114e+06 )
								if( Raw_Money_Flow <= 1.32524e+06 )
									ret := 0.250000
								if( Raw_Money_Flow > 1.32524e+06 )
									ret := 1.000000 // buy
							if( Raw_Money_Flow > 1.7114e+06 )
								if( Negative_Money_Flow_Sum <= 4.59813e+07 )
									ret := -0.135135
								if( Negative_Money_Flow_Sum > 4.59813e+07 )
									ret := 0.600000
						if( smoothK_k > 8.04543 )
							if( Money_Flow_Ratio <= 3.31756 )
								if( Typical_Price <= 0.365544 )
									ret := 0.000000
								if( Typical_Price > 0.365544 )
									ret := 0.639871
							if( Money_Flow_Ratio > 3.31756 )
								if( MFI_Low <= 59.8363 )
									ret := -0.354839
								if( MFI_Low > 59.8363 )
									ret := 0.685714
			if( Positive_Money_Flow > 1.47105e+06 )
				if( MFI <= 55.5742 )
					if( Positive_Money_Flow <= 4.06726e+06 )
						if( Positive_Money_Flow <= 1.59228e+06 )
							if( MFI_Low <= 26.0225 )
								if( Negative_Money_Flow_Sum <= 1.05602e+07 )
									ret := -0.538462
								if( Negative_Money_Flow_Sum > 1.05602e+07 )
									ret := 0.255814
							if( MFI_Low > 26.0225 )
								if( MFI_High <= -24.6534 )
									ret := -0.523077
								if( MFI_High > -24.6534 )
									ret := 0.333333
						if( Positive_Money_Flow > 1.59228e+06 )
							if( rsi1 <= 50.2642 )
								if( smoothD_d <= 23.4921 )
									ret := 0.181818
								if( smoothD_d > 23.4921 )
									ret := -0.149660
							if( rsi1 > 50.2642 )
								if( k <= 17.2017 )
									ret := 0.540000
								if( k > 17.2017 )
									ret := 0.232353
					if( Positive_Money_Flow > 4.06726e+06 )
						if( Positive_Money_Flow <= 1.22987e+07 )
							if( Typical_Price <= 0.538556 )
								if( Raw_Money_Flow <= 7.32658e+06 )
									ret := 0.022727
								if( Raw_Money_Flow > 7.32658e+06 )
									ret := -1.000000 // sell
							if( Typical_Price > 0.538556 )
								if( MFI_High <= -40.252 )
									ret := 0.500000
								if( MFI_High > -40.252 )
									ret := -0.760000 // sell
						if( Positive_Money_Flow > 1.22987e+07 )
							ret := 1.000000 // buy
				if( MFI > 55.5742 )
					if( rsi1 <= 61.2486 )
						if( MFI_High <= -16.0498 )
							if( Positive_Money_Flow_Sum <= 6.51856e+07 )
								if( Raw_Money_Flow <= 1.96165e+06 )
									ret := -0.033708
								if( Raw_Money_Flow > 1.96165e+06 )
									ret := -0.411765
							if( Positive_Money_Flow_Sum > 6.51856e+07 )
								if( Positive_Money_Flow <= 5.84303e+06 )
									ret := 0.818182 // buy
								if( Positive_Money_Flow > 5.84303e+06 )
									ret := -0.400000
						if( MFI_High > -16.0498 )
							if( Raw_Money_Flow <= 8.31385e+06 )
								if( Negative_Money_Flow_Sum <= 1.98413e+07 )
									ret := -0.617841
								if( Negative_Money_Flow_Sum > 1.98413e+07 )
									ret := -0.230216
							if( Raw_Money_Flow > 8.31385e+06 )
								if( rsi1 <= 59.6125 )
									ret := -0.951923 // sell
								if( rsi1 > 59.6125 )
									ret := -0.555556
					if( rsi1 > 61.2486 )
						if( rsi1 <= 74.3024 )
							if( Positive_Money_Flow <= 3.71249e+06 )
								if( Positive_Money_Flow_Sum <= 3.77349e+07 )
									ret := -0.118421
								if( Positive_Money_Flow_Sum > 3.77349e+07 )
									ret := 0.347826
							if( Positive_Money_Flow > 3.71249e+06 )
								if( Negative_Money_Flow_Sum <= 1.25934e+07 )
									ret := -0.750000 // sell
								if( Negative_Money_Flow_Sum > 1.25934e+07 )
									ret := -0.192308
						if( rsi1 > 74.3024 )
							if( smoothD_d <= 38.6774 )
								if( d <= 4.69847 )
									ret := -1.000000 // sell
								if( d > 4.69847 )
									ret := 0.191781
							if( smoothD_d > 38.6774 )
								if( Raw_Money_Flow <= 2.77946e+06 )
									ret := 0.222222
								if( Raw_Money_Flow > 2.77946e+06 )
									ret := 0.794118 // buy
	if( smoothK_k > 40.4732 )
		if( k <= 64.6677 )
			if( Negative_Money_Flow <= 1.27585e+06 )
				if( rsi1 <= 61.9796 )
					if( Money_Flow_Ratio <= 1.48022 )
						if( rsi1 <= 48.2224 )
							if( Typical_Price <= 0.425562 )
								if( Negative_Money_Flow_Sum <= 1.47714e+07 )
									ret := 0.038363
								if( Negative_Money_Flow_Sum > 1.47714e+07 )
									ret := 0.338983
							if( Typical_Price > 0.425562 )
								if( MFI_Low <= 8.25517 )
									ret := 0.078778
								if( MFI_Low > 8.25517 )
									ret := -0.250000
						if( rsi1 > 48.2224 )
							if( MFI_High <= -33.5966 )
								if( Negative_Money_Flow_Sum <= 1.10706e+07 )
									ret := 0.175862
								if( Negative_Money_Flow_Sum > 1.10706e+07 )
									ret := 0.420091
							if( MFI_High > -33.5966 )
								if( rsi1 <= 55.147 )
									ret := -0.038493
								if( rsi1 > 55.147 )
									ret := 0.167914
					if( Money_Flow_Ratio > 1.48022 )
						if( Typical_Price <= 0.404001 )
							if( Positive_Money_Flow_Sum <= 1.70476e+07 )
								if( Positive_Money_Flow_Sum <= 1.41775e+07 )
									ret := 0.080311
								if( Positive_Money_Flow_Sum > 1.41775e+07 )
									ret := -0.652174
							if( Positive_Money_Flow_Sum > 1.70476e+07 )
								if( Positive_Money_Flow_Sum <= 2.51013e+07 )
									ret := 0.888889 // buy
								if( Positive_Money_Flow_Sum > 2.51013e+07 )
									ret := 0.238095
						if( Typical_Price > 0.404001 )
							if( smoothD_d <= 64.0942 )
								if( Negative_Money_Flow_Sum <= 7.81213e+06 )
									ret := -0.261429
								if( Negative_Money_Flow_Sum > 7.81213e+06 )
									ret := -0.544643
							if( smoothD_d > 64.0942 )
								if( Positive_Money_Flow <= 3.24233e+06 )
									ret := 0.078035
								if( Positive_Money_Flow > 3.24233e+06 )
									ret := -0.432432
				if( rsi1 > 61.9796 )
					if( MFI <= 60.0124 )
						if( Negative_Money_Flow_Sum <= 1.41037e+07 )
							if( Typical_Price <= 0.377145 )
								if( MFI <= 59.6707 )
									ret := -0.351852
								if( MFI > 59.6707 )
									ret := 1.000000 // buy
							if( Typical_Price > 0.377145 )
								if( Raw_Money_Flow <= 1.96273e+06 )
									ret := 0.476839
								if( Raw_Money_Flow > 1.96273e+06 )
									ret := 0.093750
						if( Negative_Money_Flow_Sum > 1.41037e+07 )
							if( Typical_Price <= 0.451687 )
								if( rsi1 <= 64.2725 )
									ret := 0.750000 // buy
								if( rsi1 > 64.2725 )
									ret := -0.800000 // sell
							if( Typical_Price > 0.451687 )
								if( Positive_Money_Flow <= 7.51436e+06 )
									ret := 0.687500
								if( Positive_Money_Flow > 7.51436e+06 )
									ret := -0.200000
					if( MFI > 60.0124 )
						if( Positive_Money_Flow <= 1.63081e+07 )
							if( rsi1 <= 67.3285 )
								if( MFI <= 78.842 )
									ret := 0.085784
								if( MFI > 78.842 )
									ret := -0.330275
							if( rsi1 > 67.3285 )
								if( Typical_Price <= 0.49159 )
									ret := 0.128492
								if( Typical_Price > 0.49159 )
									ret := 0.417073
						if( Positive_Money_Flow > 1.63081e+07 )
							if( d_k <= 11.5033 )
								if( Typical_Price <= 0.558757 )
									ret := -0.750000 // sell
								if( Typical_Price > 0.558757 )
									ret := -1.000000 // sell
							if( d_k > 11.5033 )
								ret := 0.000000
			if( Negative_Money_Flow > 1.27585e+06 )
				if( Negative_Money_Flow <= 1.25313e+07 )
					if( rsi1 <= 36.5933 )
						if( Money_Flow_Ratio <= 0.420156 )
							if( Typical_Price <= 0.543949 )
								if( smoothD_d <= 38.9693 )
									ret := 0.037736
								if( smoothD_d > 38.9693 )
									ret := 0.396000
							if( Typical_Price > 0.543949 )
								if( rsi1 <= 34.0732 )
									ret := -0.236364
								if( rsi1 > 34.0732 )
									ret := 0.205882
						if( Money_Flow_Ratio > 0.420156 )
							if( Positive_Money_Flow_Sum <= 4.01337e+07 )
								if( Positive_Money_Flow_Sum <= 1.66954e+07 )
									ret := -0.301587
								if( Positive_Money_Flow_Sum > 1.66954e+07 )
									ret := -0.803922 // sell
							if( Positive_Money_Flow_Sum > 4.01337e+07 )
								if( Typical_Price <= 0.571655 )
									ret := 1.000000 // buy
								if( Typical_Price > 0.571655 )
									ret := -0.375000
					if( rsi1 > 36.5933 )
						if( MFI <= 39.5836 )
							if( rsi1 <= 45.5895 )
								if( Negative_Money_Flow <= 2.63439e+06 )
									ret := 0.240838
								if( Negative_Money_Flow > 2.63439e+06 )
									ret := 0.537838
							if( rsi1 > 45.5895 )
								if( d_k <= -17.8734 )
									ret := 0.329114
								if( d_k > -17.8734 )
									ret := 0.704120 // buy
						if( MFI > 39.5836 )
							if( Negative_Money_Flow <= 3.06114e+06 )
								if( rsi1 <= 48.9784 )
									ret := -0.010811
								if( rsi1 > 48.9784 )
									ret := 0.236970
							if( Negative_Money_Flow > 3.06114e+06 )
								if( rsi1 <= 52.3222 )
									ret := 0.113360
								if( rsi1 > 52.3222 )
									ret := 0.419899
				if( Negative_Money_Flow > 1.25313e+07 )
					if( Positive_Money_Flow_Sum <= 5.29941e+07 )
						if( smoothD_d <= 29.8152 )
							ret := -0.285714
						if( smoothD_d > 29.8152 )
							if( Typical_Price <= 0.704183 )
								if( Negative_Money_Flow <= 1.52637e+07 )
									ret := 0.906977 // buy
								if( Negative_Money_Flow > 1.52637e+07 )
									ret := 1.000000 // buy
							if( Typical_Price > 0.704183 )
								ret := 0.571429
					if( Positive_Money_Flow_Sum > 5.29941e+07 )
						if( d <= 50.8423 )
							if( Raw_Money_Flow <= 2.20964e+07 )
								if( Positive_Money_Flow_Sum <= 6.62454e+07 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 6.62454e+07 )
									ret := -0.400000
							if( Raw_Money_Flow > 2.20964e+07 )
								ret := 1.000000 // buy
						if( d > 50.8423 )
							if( Positive_Money_Flow_Sum <= 9.67363e+07 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 9.67363e+07 )
								ret := 0.500000
		if( k > 64.6677 )
			if( Negative_Money_Flow_Sum <= 8.03758e+06 )
				if( Typical_Price <= 0.414502 )
					if( Positive_Money_Flow_Sum <= 1.19769e+07 )
						if( Positive_Money_Flow_Sum <= 7.0953e+06 )
							if( Money_Flow_Ratio <= 4.18722 )
								if( Negative_Money_Flow <= 586721 )
									ret := 0.029921
								if( Negative_Money_Flow > 586721 )
									ret := 0.153734
							if( Money_Flow_Ratio > 4.18722 )
								if( rsi1 <= 74.7163 )
									ret := -0.151515
								if( rsi1 > 74.7163 )
									ret := 0.546392
						if( Positive_Money_Flow_Sum > 7.0953e+06 )
							if( Raw_Money_Flow <= 790069 )
								if( d_k <= 2.71644 )
									ret := -0.039548
								if( d_k > 2.71644 )
									ret := 0.265217
							if( Raw_Money_Flow > 790069 )
								if( Negative_Money_Flow <= 1.4059e+06 )
									ret := -0.142438
								if( Negative_Money_Flow > 1.4059e+06 )
									ret := 0.198347
					if( Positive_Money_Flow_Sum > 1.19769e+07 )
						if( Raw_Money_Flow <= 1.24446e+06 )
							if( Negative_Money_Flow <= 33571.7 )
								if( Typical_Price <= 0.37197 )
									ret := 0.400000
								if( Typical_Price > 0.37197 )
									ret := 0.040000
							if( Negative_Money_Flow > 33571.7 )
								if( k <= 98.6297 )
									ret := 0.567010
								if( k > 98.6297 )
									ret := -0.111111
						if( Raw_Money_Flow > 1.24446e+06 )
							if( rsi1 <= 79.2413 )
								if( Positive_Money_Flow_Sum <= 1.2409e+07 )
									ret := 0.616667
								if( Positive_Money_Flow_Sum > 1.2409e+07 )
									ret := 0.082298
							if( rsi1 > 79.2413 )
								if( Raw_Money_Flow <= 1.53453e+06 )
									ret := -0.560000
								if( Raw_Money_Flow > 1.53453e+06 )
									ret := 0.011538
				if( Typical_Price > 0.414502 )
					if( rsi1 <= 65.3919 )
						if( rsi1 <= 51.6165 )
							if( smoothD_d <= 95.5638 )
								if( rsi1 <= 37.0078 )
									ret := -0.333333
								if( rsi1 > 37.0078 )
									ret := 0.005543
							if( smoothD_d > 95.5638 )
								ret := 1.000000 // buy
						if( rsi1 > 51.6165 )
							if( MFI_High <= -12.2186 )
								if( Typical_Price <= 0.456983 )
									ret := 0.451220
								if( Typical_Price > 0.456983 )
									ret := 0.207077
							if( MFI_High > -12.2186 )
								if( d <= 72.1117 )
									ret := -0.390476
								if( d > 72.1117 )
									ret := 0.130102
					if( rsi1 > 65.3919 )
						if( Positive_Money_Flow_Sum <= 4.42854e+07 )
							if( Negative_Money_Flow_Sum <= 5.31034e+06 )
								if( Positive_Money_Flow_Sum <= 2.77953e+07 )
									ret := 0.341126
								if( Positive_Money_Flow_Sum > 2.77953e+07 )
									ret := 0.780822 // buy
							if( Negative_Money_Flow_Sum > 5.31034e+06 )
								if( rsi1 <= 71.4476 )
									ret := 0.419547
								if( rsi1 > 71.4476 )
									ret := 0.600000
						if( Positive_Money_Flow_Sum > 4.42854e+07 )
							if( rsi1 <= 76.7666 )
								if( d <= 83.0403 )
									ret := -0.962963 // sell
								if( d > 83.0403 )
									ret := 0.181818
							if( rsi1 > 76.7666 )
								if( MFI <= 88.1805 )
									ret := -1.000000 // sell
								if( MFI > 88.1805 )
									ret := 0.312500
			if( Negative_Money_Flow_Sum > 8.03758e+06 )
				if( rsi1 <= 51.4318 )
					if( Negative_Money_Flow <= 2.56860e+06 )
						if( Money_Flow_Ratio <= 0.592267 )
							if( Typical_Price <= 0.567167 )
								if( d_k <= -19.6831 )
									ret := -0.077491
								if( d_k > -19.6831 )
									ret := 0.301700
							if( Typical_Price > 0.567167 )
								if( rsi1 <= 42.544 )
									ret := -0.168605
								if( rsi1 > 42.544 )
									ret := 0.291667
						if( Money_Flow_Ratio > 0.592267 )
							if( Positive_Money_Flow_Sum <= 6.01029e+07 )
								if( Typical_Price <= 0.459573 )
									ret := 0.149057
								if( Typical_Price > 0.459573 )
									ret := -0.087500
							if( Positive_Money_Flow_Sum > 6.01029e+07 )
								if( Negative_Money_Flow_Sum <= 6.95846e+07 )
									ret := -0.500000
								if( Negative_Money_Flow_Sum > 6.95846e+07 )
									ret := -0.925000 // sell
					if( Negative_Money_Flow > 2.56860e+06 )
						if( Negative_Money_Flow <= 9.45656e+06 )
							if( rsi1 <= 38.6003 )
								if( Positive_Money_Flow_Sum <= 1.11705e+07 )
									ret := 0.537815
								if( Positive_Money_Flow_Sum > 1.11705e+07 )
									ret := -0.072626
							if( rsi1 > 38.6003 )
								if( MFI_High <= -40.7842 )
									ret := 0.633274
								if( MFI_High > -40.7842 )
									ret := 0.275304
						if( Negative_Money_Flow > 9.45656e+06 )
							if( k <= 90.8718 )
								if( rsi1 <= 24.9426 )
									ret := -0.250000
								if( rsi1 > 24.9426 )
									ret := 0.952703 // buy
							if( k > 90.8718 )
								if( d <= 80.954 )
									ret := -0.333333
								if( d > 80.954 )
									ret := 0.869565 // buy
				if( rsi1 > 51.4318 )
					if( rsi1 <= 67.4702 )
						if( MFI_Low <= 31.0393 )
							if( Raw_Money_Flow <= 1.45202e+06 )
								if( rsi1 <= 57.0206 )
									ret := 0.298918
								if( rsi1 > 57.0206 )
									ret := 0.455742
							if( Raw_Money_Flow > 1.45202e+06 )
								if( MFI <= 36.9265 )
									ret := 0.745784 // buy
								if( MFI > 36.9265 )
									ret := 0.542145
						if( MFI_Low > 31.0393 )
							if( Positive_Money_Flow <= 3.71863e+06 )
								if( rsi1 <= 57.0657 )
									ret := 0.084983
								if( rsi1 > 57.0657 )
									ret := 0.316813
							if( Positive_Money_Flow > 3.71863e+06 )
								if( smoothD_d <= 80.4081 )
									ret := -0.223214
								if( smoothD_d > 80.4081 )
									ret := 0.136564
					if( rsi1 > 67.4702 )
						if( Money_Flow_Ratio <= 3.38272 )
							if( Typical_Price <= 0.428726 )
								if( Typical_Price <= 0.379591 )
									ret := 0.072539
								if( Typical_Price > 0.379591 )
									ret := 0.436047
							if( Typical_Price > 0.428726 )
								if( Raw_Money_Flow <= 726864 )
									ret := 0.393365
								if( Raw_Money_Flow > 726864 )
									ret := 0.690958
						if( Money_Flow_Ratio > 3.38272 )
							if( rsi1 <= 85.6224 )
								if( Raw_Money_Flow <= 4.73545e+06 )
									ret := 0.280576
								if( Raw_Money_Flow > 4.73545e+06 )
									ret := -0.122449
							if( rsi1 > 85.6224 )
								if( d <= 99.9882 )
									ret := 0.841121 // buy
								if( d > 99.9882 )
									ret := -0.600000
	
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
float op_operation = decision_tree_0_XRPUSDT_15Min_0fbbf3b1(Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum, smoothK_k, d_k, k, smoothD_d, rsi1, d)

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


