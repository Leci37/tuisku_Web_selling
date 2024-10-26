//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: AVAXUSDT_30Min_2MS0_012efaf4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_30Min_2MS0_012efaf4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_30Min_012efaf4(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( k <= 49.4791 )
		if( rsi1 <= 45.0957 )
			if( Typical_Price <= 10.0957 )
				if( rsi1 <= 40.0225 )
					if( MFI_High <= -58.4266 )
						if( Typical_Price <= 8.77474 )
							if( Raw_Money_Flow <= 25009.1 )
								if( d <= 28.7808 )
									ret := -0.197368
								if( d > 28.7808 )
									ret := 0.352941
							if( Raw_Money_Flow > 25009.1 )
								if( Negative_Money_Flow_Sum <= 1.7197e+06 )
									ret := 0.375000
								if( Negative_Money_Flow_Sum > 1.7197e+06 )
									ret := 0.880000 // buy
						if( Typical_Price > 8.77474 )
							if( Positive_Money_Flow_Sum <= 580209 )
								if( rsi1 <= 28.2901 )
									ret := -0.050000
								if( rsi1 > 28.2901 )
									ret := 0.304348
							if( Positive_Money_Flow_Sum > 580209 )
								if( smoothK_k <= 20.7948 )
									ret := -0.030303
								if( smoothK_k > 20.7948 )
									ret := -0.478261
					if( MFI_High > -58.4266 )
						if( d_k <= -1.01112 )
							if( rsi1 <= 33.5281 )
								if( Negative_Money_Flow <= 355076 )
									ret := -0.337662
								if( Negative_Money_Flow > 355076 )
									ret := 0.500000
							if( rsi1 > 33.5281 )
								if( Typical_Price <= 3.46797 )
									ret := 0.373832
								if( Typical_Price > 3.46797 )
									ret := -0.116208
						if( d_k > -1.01112 )
							if( Typical_Price <= 7.34454 )
								if( Raw_Money_Flow <= 219382 )
									ret := 0.151652
								if( Raw_Money_Flow > 219382 )
									ret := 0.527273
							if( Typical_Price > 7.34454 )
								if( d <= 29.8769 )
									ret := -0.037344
								if( d > 29.8769 )
									ret := -0.340206
				if( rsi1 > 40.0225 )
					if( Positive_Money_Flow_Sum <= 74323.9 )
						if( Negative_Money_Flow <= 1762.15 )
							ret := 0.000000
						if( Negative_Money_Flow > 1762.15 )
							if( MFI_High <= -47.2477 )
								ret := 0.533333
							if( MFI_High > -47.2477 )
								ret := 0.947368 // buy
					if( Positive_Money_Flow_Sum > 74323.9 )
						if( d_k <= 17.4607 )
							if( smoothD_d <= 27.997 )
								if( Positive_Money_Flow_Sum <= 664202 )
									ret := -0.380556
								if( Positive_Money_Flow_Sum > 664202 )
									ret := -0.060241
							if( smoothD_d > 27.997 )
								if( Typical_Price <= 3.02498 )
									ret := 0.785714 // buy
								if( Typical_Price > 3.02498 )
									ret := -0.082988
						if( d_k > 17.4607 )
							if( k <= 29.7753 )
								if( rsi1 <= 42.4925 )
									ret := 0.562500
								if( rsi1 > 42.4925 )
									ret := 0.200000
							if( k > 29.7753 )
								ret := -0.333333
			if( Typical_Price > 10.0957 )
				if( d_k <= -2.75708 )
					if( rsi1 <= 31.1526 )
						if( Negative_Money_Flow <= 1.34849e+07 )
							if( MFI <= 16.1589 )
								if( Negative_Money_Flow_Sum <= 3.26059e+07 )
									ret := -0.391608
								if( Negative_Money_Flow_Sum > 3.26059e+07 )
									ret := 0.044248
							if( MFI > 16.1589 )
								if( d_k <= -15.9665 )
									ret := -0.063830
								if( d_k > -15.9665 )
									ret := -0.547091
						if( Negative_Money_Flow > 1.34849e+07 )
							if( smoothD_d <= 7.29122 )
								if( Money_Flow_Ratio <= 0.185393 )
									ret := -0.909091 // sell
								if( Money_Flow_Ratio > 0.185393 )
									ret := -0.666667
							if( smoothD_d > 7.29122 )
								if( Money_Flow_Ratio <= 0.195453 )
									ret := 0.897436 // buy
								if( Money_Flow_Ratio > 0.195453 )
									ret := 0.250000
					if( rsi1 > 31.1526 )
						if( Negative_Money_Flow <= 2.12891e+06 )
							if( Positive_Money_Flow <= 238808 )
								if( MFI_Low <= 11.9889 )
									ret := 0.247831
								if( MFI_Low > 11.9889 )
									ret := -0.196878
							if( Positive_Money_Flow > 238808 )
								if( k <= 16.5351 )
									ret := -0.529825
								if( k > 16.5351 )
									ret := -0.203320
						if( Negative_Money_Flow > 2.12891e+06 )
							if( smoothK_k <= 20.2959 )
								if( rsi1 <= 39.5874 )
									ret := -0.097493
								if( rsi1 > 39.5874 )
									ret := 0.324022
							if( smoothK_k > 20.2959 )
								if( MFI_High <= -48.3377 )
									ret := 0.668954
								if( MFI_High > -48.3377 )
									ret := 0.206780
				if( d_k > -2.75708 )
					if( Positive_Money_Flow <= 656157 )
						if( Raw_Money_Flow <= 313208 )
							if( Typical_Price <= 11.4945 )
								if( MFI_Low <= 9.36155 )
									ret := -0.212500
								if( MFI_Low > 9.36155 )
									ret := -0.619946
							if( Typical_Price > 11.4945 )
								if( Raw_Money_Flow <= 171461 )
									ret := -0.250323
								if( Raw_Money_Flow > 171461 )
									ret := -0.414815
						if( Raw_Money_Flow > 313208 )
							if( Positive_Money_Flow_Sum <= 2.41964e+06 )
								if( smoothD_d <= 23.7589 )
									ret := -0.499448
								if( smoothD_d > 23.7589 )
									ret := -0.075658
							if( Positive_Money_Flow_Sum > 2.41964e+06 )
								if( Raw_Money_Flow <= 1.45581e+07 )
									ret := -0.623272
								if( Raw_Money_Flow > 1.45581e+07 )
									ret := -0.265487
					if( Positive_Money_Flow > 656157 )
						if( rsi1 <= 28.2236 )
							if( Positive_Money_Flow_Sum <= 4.44417e+06 )
								if( smoothK_k <= 17.3833 )
									ret := -0.784091 // sell
								if( smoothK_k > 17.3833 )
									ret := -0.142857
							if( Positive_Money_Flow_Sum > 4.44417e+06 )
								if( d_k <= -0.257119 )
									ret := -0.765957 // sell
								if( d_k > -0.257119 )
									ret := -0.860419 // sell
						if( rsi1 > 28.2236 )
							if( Positive_Money_Flow_Sum <= 9.23404e+06 )
								if( d_k <= 6.17844 )
									ret := -0.542553
								if( d_k > 6.17844 )
									ret := -0.693780
							if( Positive_Money_Flow_Sum > 9.23404e+06 )
								if( d_k <= 3.84244 )
									ret := -0.695333
								if( d_k > 3.84244 )
									ret := -0.790188 // sell
		if( rsi1 > 45.0957 )
			if( MFI_High <= -23.8502 )
				if( Negative_Money_Flow <= 2.11765e+06 )
					if( k <= 36.5233 )
						if( Negative_Money_Flow_Sum <= 1.6732e+07 )
							if( d_k <= -0.767891 )
								if( rsi1 <= 50.0098 )
									ret := 0.099185
								if( rsi1 > 50.0098 )
									ret := 0.303116
							if( d_k > -0.767891 )
								if( MFI_Low <= 32.73 )
									ret := -0.085066
								if( MFI_Low > 32.73 )
									ret := -0.309148
						if( Negative_Money_Flow_Sum > 1.6732e+07 )
							if( smoothD_d <= 44.3596 )
								if( Positive_Money_Flow <= 2.45452e+07 )
									ret := 0.336120
								if( Positive_Money_Flow > 2.45452e+07 )
									ret := -1.000000 // sell
							if( smoothD_d > 44.3596 )
								if( d_k <= 23.9726 )
									ret := -0.545455
								if( d_k > 23.9726 )
									ret := -1.000000 // sell
					if( k > 36.5233 )
						if( smoothD_d <= 36.676 )
							if( Typical_Price <= 6.4986 )
								if( smoothD_d <= 23.8798 )
									ret := 0.545455
								if( smoothD_d > 23.8798 )
									ret := -0.392857
							if( Typical_Price > 6.4986 )
								if( k <= 41.4574 )
									ret := 0.385081
								if( k > 41.4574 )
									ret := 0.569925
						if( smoothD_d > 36.676 )
							if( Typical_Price <= 3.44053 )
								if( Negative_Money_Flow <= 23238.5 )
									ret := -0.769231 // sell
								if( Negative_Money_Flow > 23238.5 )
									ret := -0.071429
							if( Typical_Price > 3.44053 )
								if( rsi1 <= 55.3819 )
									ret := -0.066940
								if( rsi1 > 55.3819 )
									ret := 0.453608
				if( Negative_Money_Flow > 2.11765e+06 )
					if( d_k <= -0.604173 )
						if( MFI_Low <= 26.2318 )
							if( smoothD_d <= 5.61542 )
								if( d_k <= -3.88049 )
									ret := 0.200000
								if( d_k > -3.88049 )
									ret := -0.166667
							if( smoothD_d > 5.61542 )
								if( k <= 36.5528 )
									ret := 0.730924 // buy
								if( k > 36.5528 )
									ret := 0.901961 // buy
						if( MFI_Low > 26.2318 )
							if( Negative_Money_Flow_Sum <= 3.49099e+07 )
								if( d <= 20.6733 )
									ret := 0.603175
								if( d > 20.6733 )
									ret := 0.870968 // buy
							if( Negative_Money_Flow_Sum > 3.49099e+07 )
								if( MFI <= 55.4372 )
									ret := 0.301370
								if( MFI > 55.4372 )
									ret := 0.947368 // buy
					if( d_k > -0.604173 )
						if( smoothK_k <= 0.447745 )
							if( MFI <= 51.2006 )
								ret := -0.923077 // sell
							if( MFI > 51.2006 )
								ret := -0.636364
						if( smoothK_k > 0.447745 )
							if( Money_Flow_Ratio <= 0.942863 )
								if( d_k <= 7.91703 )
									ret := 0.683761
								if( d_k > 7.91703 )
									ret := 0.052632
							if( Money_Flow_Ratio > 0.942863 )
								if( MFI <= 55.682 )
									ret := -0.036290
								if( MFI > 55.682 )
									ret := 0.625000
			if( MFI_High > -23.8502 )
				if( Money_Flow_Ratio <= 2.8428 )
					if( rsi1 <= 58.4525 )
						if( Positive_Money_Flow_Sum <= 3.15153e+06 )
							if( Negative_Money_Flow_Sum <= 2.27905e+06 )
								if( d_k <= 4.30805 )
									ret := 0.168950
								if( d_k > 4.30805 )
									ret := -0.233405
							if( Negative_Money_Flow_Sum > 2.27905e+06 )
								ret := 0.888889 // buy
						if( Positive_Money_Flow_Sum > 3.15153e+06 )
							if( d_k <= 4.69827 )
								if( Positive_Money_Flow <= 5.80648e+06 )
									ret := -0.016402
								if( Positive_Money_Flow > 5.80648e+06 )
									ret := -0.329480
							if( d_k > 4.69827 )
								if( Positive_Money_Flow_Sum <= 1.92024e+07 )
									ret := -0.414141
								if( Positive_Money_Flow_Sum > 1.92024e+07 )
									ret := -0.626961
					if( rsi1 > 58.4525 )
						if( Negative_Money_Flow_Sum <= 2.42146e+06 )
							if( Raw_Money_Flow <= 133127 )
								if( Raw_Money_Flow <= 30711.8 )
									ret := 0.132353
								if( Raw_Money_Flow > 30711.8 )
									ret := -0.343434
							if( Raw_Money_Flow > 133127 )
								if( Negative_Money_Flow_Sum <= 2.12172e+06 )
									ret := 0.155080
								if( Negative_Money_Flow_Sum > 2.12172e+06 )
									ret := -0.196078
						if( Negative_Money_Flow_Sum > 2.42146e+06 )
							if( Positive_Money_Flow_Sum <= 1.0675e+08 )
								if( Raw_Money_Flow <= 859799 )
									ret := 0.585132
								if( Raw_Money_Flow > 859799 )
									ret := 0.321343
							if( Positive_Money_Flow_Sum > 1.0675e+08 )
								if( Typical_Price <= 105.27 )
									ret := 0.784946 // buy
								if( Typical_Price > 105.27 )
									ret := 0.214286
				if( Money_Flow_Ratio > 2.8428 )
					if( d_k <= 6.45147 )
						if( Positive_Money_Flow <= 356032 )
							if( rsi1 <= 66.8658 )
								if( Positive_Money_Flow_Sum <= 2.70615e+07 )
									ret := -0.189003
								if( Positive_Money_Flow_Sum > 2.70615e+07 )
									ret := 0.029412
							if( rsi1 > 66.8658 )
								if( Money_Flow_Ratio <= 3.47127 )
									ret := 0.961538 // buy
								if( Money_Flow_Ratio > 3.47127 )
									ret := 0.414141
						if( Positive_Money_Flow > 356032 )
							if( rsi1 <= 68.4606 )
								if( MFI <= 78.6848 )
									ret := -0.341085
								if( MFI > 78.6848 )
									ret := -0.669231
							if( rsi1 > 68.4606 )
								if( Typical_Price <= 41.05 )
									ret := 0.015267
								if( Typical_Price > 41.05 )
									ret := 0.782609 // buy
					if( d_k > 6.45147 )
						if( Typical_Price <= 49.7285 )
							if( Negative_Money_Flow <= 5779.76 )
								if( Positive_Money_Flow_Sum <= 5.14031e+07 )
									ret := -0.497713
								if( Positive_Money_Flow_Sum > 5.14031e+07 )
									ret := -0.181034
							if( Negative_Money_Flow > 5779.76 )
								if( Money_Flow_Ratio <= 3.66187 )
									ret := -0.338645
								if( Money_Flow_Ratio > 3.66187 )
									ret := 0.071895
						if( Typical_Price > 49.7285 )
							if( Typical_Price <= 70.8544 )
								if( Negative_Money_Flow_Sum <= 2.6684e+07 )
									ret := -0.817647 // sell
								if( Negative_Money_Flow_Sum > 2.6684e+07 )
									ret := -0.978495 // sell
							if( Typical_Price > 70.8544 )
								if( MFI_Low <= 56.3176 )
									ret := -0.790476 // sell
								if( MFI_Low > 56.3176 )
									ret := -0.566116
	if( k > 49.4791 )
		if( Positive_Money_Flow_Sum <= 1.02338e+06 )
			if( Typical_Price <= 4.79899 )
				if( MFI_High <= 2.01781 )
					if( Positive_Money_Flow <= 5926.78 )
						if( Negative_Money_Flow_Sum <= 97159.6 )
							if( Money_Flow_Ratio <= 1.79794 )
								if( Positive_Money_Flow_Sum <= 65625.3 )
									ret := -0.903846 // sell
								if( Positive_Money_Flow_Sum > 65625.3 )
									ret := -0.419355
							if( Money_Flow_Ratio > 1.79794 )
								if( Positive_Money_Flow_Sum <= 150561 )
									ret := -0.421053
								if( Positive_Money_Flow_Sum > 150561 )
									ret := 0.558140
						if( Negative_Money_Flow_Sum > 97159.6 )
							if( Negative_Money_Flow_Sum <= 204139 )
								if( Negative_Money_Flow_Sum <= 195478 )
									ret := 0.314351
								if( Negative_Money_Flow_Sum > 195478 )
									ret := 0.844828 // buy
							if( Negative_Money_Flow_Sum > 204139 )
								if( Typical_Price <= 3.27943 )
									ret := 0.292398
								if( Typical_Price > 3.27943 )
									ret := -0.073699
					if( Positive_Money_Flow > 5926.78 )
						if( Raw_Money_Flow <= 27645.3 )
							if( Raw_Money_Flow <= 9065.25 )
								if( Typical_Price <= 4.08559 )
									ret := 0.296296
								if( Typical_Price > 4.08559 )
									ret := -0.428571
							if( Raw_Money_Flow > 9065.25 )
								if( MFI <= 25.9641 )
									ret := 0.341463
								if( MFI > 25.9641 )
									ret := -0.404494
						if( Raw_Money_Flow > 27645.3 )
							if( MFI_Low <= 37.98 )
								if( Typical_Price <= 4.29697 )
									ret := 0.107759
								if( Typical_Price > 4.29697 )
									ret := 0.775510 // buy
							if( MFI_Low > 37.98 )
								if( Raw_Money_Flow <= 145517 )
									ret := -0.300676
								if( Raw_Money_Flow > 145517 )
									ret := 0.340426
				if( MFI_High > 2.01781 )
					if( d <= 72.7622 )
						ret := -0.250000
					if( d > 72.7622 )
						if( d <= 96.5849 )
							if( smoothD_d <= 88.7668 )
								if( rsi1 <= 72.3743 )
									ret := 0.400000
								if( rsi1 > 72.3743 )
									ret := 0.750000 // buy
							if( smoothD_d > 88.7668 )
								if( Positive_Money_Flow_Sum <= 536963 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 536963 )
									ret := 0.900000 // buy
						if( d > 96.5849 )
							if( rsi1 <= 87.0319 )
								ret := 0.000000
							if( rsi1 > 87.0319 )
								ret := 0.833333 // buy
			if( Typical_Price > 4.79899 )
				if( d_k <= 0.777275 )
					if( MFI_Low <= 39.1612 )
						if( rsi1 <= 31.1807 )
							if( Typical_Price <= 10.0663 )
								if( smoothK_k <= 66.5671 )
									ret := -1.000000 // sell
								if( smoothK_k > 66.5671 )
									ret := -0.875000 // sell
							if( Typical_Price > 10.0663 )
								if( d <= 45.6825 )
									ret := -0.540541
								if( d > 45.6825 )
									ret := 0.021739
						if( rsi1 > 31.1807 )
							if( Negative_Money_Flow_Sum <= 1.41801e+06 )
								if( Positive_Money_Flow <= 292323 )
									ret := 0.094215
								if( Positive_Money_Flow > 292323 )
									ret := 0.923077 // buy
							if( Negative_Money_Flow_Sum > 1.41801e+06 )
								if( Typical_Price <= 8.69844 )
									ret := 1.000000 // buy
								if( Typical_Price > 8.69844 )
									ret := 0.301394
					if( MFI_Low > 39.1612 )
						if( Positive_Money_Flow_Sum <= 752000 )
							ret := 0.000000
						if( Positive_Money_Flow_Sum > 752000 )
							if( Typical_Price <= 10.9082 )
								if( Negative_Money_Flow_Sum <= 454632 )
									ret := 0.600000
								if( Negative_Money_Flow_Sum > 454632 )
									ret := 0.974359 // buy
							if( Typical_Price > 10.9082 )
								ret := 0.000000
				if( d_k > 0.777275 )
					if( Typical_Price <= 6.43471 )
						ret := -0.636364
					if( Typical_Price > 6.43471 )
						if( rsi1 <= 47.01 )
							if( MFI <= 47.856 )
								if( Positive_Money_Flow_Sum <= 956325 )
									ret := -0.024590
								if( Positive_Money_Flow_Sum > 956325 )
									ret := -0.291667
							if( MFI > 47.856 )
								if( smoothD_d <= 63.2472 )
									ret := -1.000000 // sell
								if( smoothD_d > 63.2472 )
									ret := -0.250000
						if( rsi1 > 47.01 )
							if( MFI <= 68.4584 )
								if( MFI_High <= -14.5032 )
									ret := 0.107266
								if( MFI_High > -14.5032 )
									ret := 0.615385
							if( MFI > 68.4584 )
								ret := -0.230769
		if( Positive_Money_Flow_Sum > 1.02338e+06 )
			if( k <= 77.3814 )
				if( d_k <= 0.356543 )
					if( d_k <= -7.38359 )
						if( MFI <= 54.0518 )
							if( Positive_Money_Flow_Sum <= 5.22614e+06 )
								if( rsi1 <= 32.3271 )
									ret := -0.384000
								if( rsi1 > 32.3271 )
									ret := 0.472951
							if( Positive_Money_Flow_Sum > 5.22614e+06 )
								if( Raw_Money_Flow <= 9.3907e+06 )
									ret := 0.577938
								if( Raw_Money_Flow > 9.3907e+06 )
									ret := 0.837037 // buy
						if( MFI > 54.0518 )
							if( Negative_Money_Flow <= 821789 )
								if( smoothK_k <= 52.2403 )
									ret := 0.465969
								if( smoothK_k > 52.2403 )
									ret := 0.274324
							if( Negative_Money_Flow > 821789 )
								if( rsi1 <= 47.7916 )
									ret := -0.850000 // sell
								if( rsi1 > 47.7916 )
									ret := 0.765766 // buy
					if( d_k > -7.38359 )
						if( MFI_High <= -35.472 )
							if( rsi1 <= 49.9862 )
								if( rsi1 <= 40.6367 )
									ret := -0.276899
								if( rsi1 > 40.6367 )
									ret := 0.079316
							if( rsi1 > 49.9862 )
								if( Negative_Money_Flow <= 700168 )
									ret := 0.463576
								if( Negative_Money_Flow > 700168 )
									ret := 0.811688 // buy
						if( MFI_High > -35.472 )
							if( Positive_Money_Flow_Sum <= 6.6146e+06 )
								if( rsi1 <= 57.1579 )
									ret := -0.125000
								if( rsi1 > 57.1579 )
									ret := 0.390438
							if( Positive_Money_Flow_Sum > 6.6146e+06 )
								if( Positive_Money_Flow <= 1.50907e+06 )
									ret := 0.596774
								if( Positive_Money_Flow > 1.50907e+06 )
									ret := 0.271557
				if( d_k > 0.356543 )
					if( Negative_Money_Flow <= 60015.4 )
						if( rsi1 <= 63.3843 )
							if( rsi1 <= 48.9445 )
								if( Raw_Money_Flow <= 667890 )
									ret := -0.419355
								if( Raw_Money_Flow > 667890 )
									ret := -0.648050
							if( rsi1 > 48.9445 )
								if( Raw_Money_Flow <= 2.44905e+06 )
									ret := -0.182011
								if( Raw_Money_Flow > 2.44905e+06 )
									ret := -0.586580
						if( rsi1 > 63.3843 )
							if( MFI_Low <= 48.7379 )
								if( d_k <= 7.29493 )
									ret := 0.621429
								if( d_k > 7.29493 )
									ret := 0.213483
							if( MFI_Low > 48.7379 )
								if( Positive_Money_Flow <= 1.69787e+07 )
									ret := -0.005627
								if( Positive_Money_Flow > 1.69787e+07 )
									ret := -0.639175
					if( Negative_Money_Flow > 60015.4 )
						if( rsi1 <= 54.9544 )
							if( MFI_High <= -35.6824 )
								if( rsi1 <= 34.5177 )
									ret := -0.527523
								if( rsi1 > 34.5177 )
									ret := 0.114490
							if( MFI_High > -35.6824 )
								if( Positive_Money_Flow_Sum <= 1.74422e+07 )
									ret := -0.257212
								if( Positive_Money_Flow_Sum > 1.74422e+07 )
									ret := -0.493913
						if( rsi1 > 54.9544 )
							if( Raw_Money_Flow <= 5.14347e+06 )
								if( MFI <= 64.1647 )
									ret := 0.408135
								if( MFI > 64.1647 )
									ret := 0.292973
							if( Raw_Money_Flow > 5.14347e+06 )
								if( Positive_Money_Flow_Sum <= 2.48627e+08 )
									ret := -0.071642
								if( Positive_Money_Flow_Sum > 2.48627e+08 )
									ret := 0.875000 // buy
			if( k > 77.3814 )
				if( rsi1 <= 62.2227 )
					if( smoothD_d <= 74.6589 )
						if( MFI <= 52.6771 )
							if( Negative_Money_Flow <= 759082 )
								if( Typical_Price <= 9.55083 )
									ret := -0.172414
								if( Typical_Price > 9.55083 )
									ret := 0.422949
							if( Negative_Money_Flow > 759082 )
								if( rsi1 <= 30.2426 )
									ret := 0.040000
								if( rsi1 > 30.2426 )
									ret := 0.738555 // buy
						if( MFI > 52.6771 )
							if( Negative_Money_Flow_Sum <= 1.41883e+07 )
								if( d_k <= -5.46713 )
									ret := 0.229508
								if( d_k > -5.46713 )
									ret := 0.521739
							if( Negative_Money_Flow_Sum > 1.41883e+07 )
								if( Negative_Money_Flow <= 7.06613e+06 )
									ret := -0.217391
								if( Negative_Money_Flow > 7.06613e+06 )
									ret := 0.545455
					if( smoothD_d > 74.6589 )
						if( k <= 87.6746 )
							if( Positive_Money_Flow <= 1.54848e+06 )
								if( d_k <= -0.442226 )
									ret := 0.291536
								if( d_k > -0.442226 )
									ret := 0.012777
							if( Positive_Money_Flow > 1.54848e+06 )
								if( d_k <= 1.77259 )
									ret := -0.082317
								if( d_k > 1.77259 )
									ret := -0.391304
						if( k > 87.6746 )
							if( Typical_Price <= 8.46048 )
								if( Positive_Money_Flow_Sum <= 1.66976e+06 )
									ret := -0.055556
								if( Positive_Money_Flow_Sum > 1.66976e+06 )
									ret := -0.659574
							if( Typical_Price > 8.46048 )
								if( d_k <= -2.95772 )
									ret := 0.405895
								if( d_k > -2.95772 )
									ret := 0.143781
				if( rsi1 > 62.2227 )
					if( Money_Flow_Ratio <= 2.17108 )
						if( Negative_Money_Flow_Sum <= 3.54408e+06 )
							if( Negative_Money_Flow <= 162093 )
								if( Typical_Price <= 18.1108 )
									ret := 0.401701
								if( Typical_Price > 18.1108 )
									ret := 0.605072
							if( Negative_Money_Flow > 162093 )
								if( rsi1 <= 66.2262 )
									ret := 0.359155
								if( rsi1 > 66.2262 )
									ret := 0.716312 // buy
						if( Negative_Money_Flow_Sum > 3.54408e+06 )
							if( Negative_Money_Flow <= 1.05419e+06 )
								if( rsi1 <= 70.0006 )
									ret := 0.593910
								if( rsi1 > 70.0006 )
									ret := 0.762938 // buy
							if( Negative_Money_Flow > 1.05419e+06 )
								if( d_k <= -1.40984 )
									ret := 0.878916 // buy
								if( d_k > -1.40984 )
									ret := 0.709003 // buy
					if( Money_Flow_Ratio > 2.17108 )
						if( rsi1 <= 74.5908 )
							if( d_k <= 3.80326 )
								if( Negative_Money_Flow_Sum <= 1.83613e+06 )
									ret := 0.205357
								if( Negative_Money_Flow_Sum > 1.83613e+06 )
									ret := 0.517435
							if( d_k > 3.80326 )
								if( Positive_Money_Flow_Sum <= 2.94283e+07 )
									ret := 0.181333
								if( Positive_Money_Flow_Sum > 2.94283e+07 )
									ret := -0.426606
						if( rsi1 > 74.5908 )
							if( Positive_Money_Flow_Sum <= 1.48167e+06 )
								if( Negative_Money_Flow_Sum <= 320055 )
									ret := -0.581395
								if( Negative_Money_Flow_Sum > 320055 )
									ret := 0.472222
							if( Positive_Money_Flow_Sum > 1.48167e+06 )
								if( Positive_Money_Flow_Sum <= 2.92571e+06 )
									ret := 0.409524
								if( Positive_Money_Flow_Sum > 2.92571e+06 )
									ret := 0.666203
	
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
float op_operation = decision_tree_0_AVAXUSDT_30Min_012efaf4(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


