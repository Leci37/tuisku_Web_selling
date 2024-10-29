//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: NVDA_30Min_2MT0_bfd676fc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_30Min_2MT0_bfd676fc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_30Min_bfd676fc(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( MFI <= 68.6272 )
		if( ema12 <= -0.166589 )
			if( Raw_Money_Flow <= 9.30678e+07 )
				if( ema12 <= -3.99848 )
					if( MFI_High <= -27.3654 )
						if( Positive_Money_Flow <= 7.25285e+07 )
							if( ema2 <= 189.491 )
								ret := -0.615385
							if( ema2 > 189.491 )
								if( ema1 <= 508.424 )
									ret := 0.652672
								if( ema1 > 508.424 )
									ret := 0.374408
						if( Positive_Money_Flow > 7.25285e+07 )
							ret := -0.833333 // sell
					if( MFI_High > -27.3654 )
						if( Typical_Price <= 475.023 )
							if( Negative_Money_Flow_Sum <= 6.43296e+08 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 6.43296e+08 )
								ret := -0.636364
						if( Typical_Price > 475.023 )
							ret := -0.461538
				if( ema12 > -3.99848 )
					if( tema <= 34.3158 )
						if( Positive_Money_Flow <= 1.04257e+07 )
							if( MFI_High <= -65.0855 )
								if( Raw_Money_Flow <= 1.29091e+07 )
									ret := -0.972973 // sell
								if( Raw_Money_Flow > 1.29091e+07 )
									ret := -0.562500
							if( MFI_High > -65.0855 )
								if( Positive_Money_Flow_Sum <= 7.06538e+07 )
									ret := 0.297872
								if( Positive_Money_Flow_Sum > 7.06538e+07 )
									ret := -0.682353
						if( Positive_Money_Flow > 1.04257e+07 )
							if( ema13 <= -0.576456 )
								if( Typical_Price <= 27.6779 )
									ret := -0.100000
								if( Typical_Price > 27.6779 )
									ret := 0.952381 // buy
							if( ema13 > -0.576456 )
								ret := 0.100000
					if( tema > 34.3158 )
						if( Negative_Money_Flow_Sum <= 1.00828e+10 )
							if( Raw_Money_Flow <= 6.98286e+06 )
								if( MFI <= 23.6904 )
									ret := 0.039565
								if( MFI > 23.6904 )
									ret := -0.052764
							if( Raw_Money_Flow > 6.98286e+06 )
								if( Positive_Money_Flow_Sum <= 5.55971e+07 )
									ret := 0.165064
								if( Positive_Money_Flow_Sum > 5.55971e+07 )
									ret := -0.018347
						if( Negative_Money_Flow_Sum > 1.00828e+10 )
							if( MFI_High <= -44.4847 )
								if( ema13 <= -4.47239 )
									ret := 0.421053
								if( ema13 > -4.47239 )
									ret := 0.097938
							if( MFI_High > -44.4847 )
								if( ema1 <= 880.844 )
									ret := 0.528169
								if( ema1 > 880.844 )
									ret := 0.083333
			if( Raw_Money_Flow > 9.30678e+07 )
				if( ema12 <= -3.24248 )
					if( Money_Flow_Ratio <= 0.127756 )
						if( ema12 <= -3.88824 )
							if( Negative_Money_Flow_Sum <= 2.28241e+09 )
								if( ema13 <= -7.08985 )
									ret := -0.800000 // sell
								if( ema13 > -7.08985 )
									ret := 0.076923
							if( Negative_Money_Flow_Sum > 2.28241e+09 )
								if( ema1 <= 493.686 )
									ret := 0.785714 // buy
								if( ema1 > 493.686 )
									ret := 0.181818
						if( ema12 > -3.88824 )
							if( Typical_Price <= 173.03 )
								if( Negative_Money_Flow_Sum <= 9.18695e+09 )
									ret := -0.222222
								if( Negative_Money_Flow_Sum > 9.18695e+09 )
									ret := -1.000000 // sell
							if( Typical_Price > 173.03 )
								if( Typical_Price <= 614.416 )
									ret := 0.171779
								if( Typical_Price > 614.416 )
									ret := 0.882353 // buy
					if( Money_Flow_Ratio > 0.127756 )
						if( Negative_Money_Flow <= 2.89304e+08 )
							if( Negative_Money_Flow_Sum <= 1.79529e+09 )
								if( MFI_Low <= 18.3134 )
									ret := -0.790698 // sell
								if( MFI_Low > 18.3134 )
									ret := -0.133333
							if( Negative_Money_Flow_Sum > 1.79529e+09 )
								if( MFI_Low <= 39.9678 )
									ret := 0.130435
								if( MFI_Low > 39.9678 )
									ret := -0.800000 // sell
						if( Negative_Money_Flow > 2.89304e+08 )
							if( Typical_Price <= 334.382 )
								if( Negative_Money_Flow_Sum <= 7.47855e+09 )
									ret := -0.212500
								if( Negative_Money_Flow_Sum > 7.47855e+09 )
									ret := 0.391304
							if( Typical_Price > 334.382 )
								if( Positive_Money_Flow_Sum <= 3.17481e+09 )
									ret := -0.543147
								if( Positive_Money_Flow_Sum > 3.17481e+09 )
									ret := -0.198020
				if( ema12 > -3.24248 )
					if( Negative_Money_Flow_Sum <= 1.93212e+10 )
						if( Positive_Money_Flow_Sum <= 3.78551e+09 )
							if( Raw_Money_Flow <= 5.89325e+08 )
								if( MFI_High <= -35.2191 )
									ret := -0.090468
								if( MFI_High > -35.2191 )
									ret := -0.235605
							if( Raw_Money_Flow > 5.89325e+08 )
								if( ema13 <= -0.235623 )
									ret := -0.263554
								if( ema13 > -0.235623 )
									ret := -0.015625
						if( Positive_Money_Flow_Sum > 3.78551e+09 )
							if( Negative_Money_Flow_Sum <= 1.00728e+10 )
								if( Money_Flow_Ratio <= 0.696005 )
									ret := 0.392857
								if( Money_Flow_Ratio > 0.696005 )
									ret := -0.017196
							if( Negative_Money_Flow_Sum > 1.00728e+10 )
								if( Raw_Money_Flow <= 1.91155e+08 )
									ret := 0.369048
								if( Raw_Money_Flow > 1.91155e+08 )
									ret := -0.179650
					if( Negative_Money_Flow_Sum > 1.93212e+10 )
						if( MFI_Low <= -11.2561 )
							if( Raw_Money_Flow <= 2.78292e+09 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 2.78292e+09 )
								ret := 0.636364
						if( MFI_Low > -11.2561 )
							if( Raw_Money_Flow <= 4.37907e+08 )
								if( tema <= 108.873 )
									ret := 0.600000
								if( tema > 108.873 )
									ret := -0.137931
							if( Raw_Money_Flow > 4.37907e+08 )
								if( Positive_Money_Flow_Sum <= 1.01237e+10 )
									ret := -0.775785 // sell
								if( Positive_Money_Flow_Sum > 1.01237e+10 )
									ret := -0.470899
		if( ema12 > -0.166589 )
			if( tema <= 165.787 )
				if( MFI_High <= -34.2582 )
					if( Positive_Money_Flow_Sum <= 5.01379e+06 )
						if( MFI <= 4.37794 )
							if( ema13 <= 0.041797 )
								if( ema1 <= 124.506 )
									ret := 0.510000
								if( ema1 > 124.506 )
									ret := -0.583333
							if( ema13 > 0.041797 )
								if( Negative_Money_Flow_Sum <= 4.16446e+08 )
									ret := -0.410256
								if( Negative_Money_Flow_Sum > 4.16446e+08 )
									ret := 0.194444
						if( MFI > 4.37794 )
							if( Negative_Money_Flow_Sum <= 4.90281e+06 )
								ret := -0.388889
							if( Negative_Money_Flow_Sum > 4.90281e+06 )
								if( MFI_High <= -44.175 )
									ret := 0.868056 // buy
								if( MFI_High > -44.175 )
									ret := 0.400000
					if( Positive_Money_Flow_Sum > 5.01379e+06 )
						if( Negative_Money_Flow_Sum <= 2.03375e+08 )
							if( ema1 <= 139.112 )
								if( Positive_Money_Flow_Sum <= 8.00881e+07 )
									ret := 0.145985
								if( Positive_Money_Flow_Sum > 8.00881e+07 )
									ret := -0.160671
							if( ema1 > 139.112 )
								if( Raw_Money_Flow <= 4.37766e+06 )
									ret := 0.063492
								if( Raw_Money_Flow > 4.37766e+06 )
									ret := -0.456693
						if( Negative_Money_Flow_Sum > 2.03375e+08 )
							if( Raw_Money_Flow <= 1.93796e+09 )
								if( MFI <= 0.76777 )
									ret := -0.764706 // sell
								if( MFI > 0.76777 )
									ret := 0.190126
							if( Raw_Money_Flow > 1.93796e+09 )
								if( Negative_Money_Flow_Sum <= 6.40336e+09 )
									ret := 0.250000
								if( Negative_Money_Flow_Sum > 6.40336e+09 )
									ret := -0.608696
				if( MFI_High > -34.2582 )
					if( ema12 <= 1.86173 )
						if( ema3 <= 28.0477 )
							if( Money_Flow_Ratio <= 1.18542 )
								ret := -0.100000
							if( Money_Flow_Ratio > 1.18542 )
								if( ema12 <= 0.029274 )
									ret := 0.975000 // buy
								if( ema12 > 0.029274 )
									ret := 0.185185
						if( ema3 > 28.0477 )
							if( ema3 <= 34.2021 )
								if( Positive_Money_Flow_Sum <= 1.17381e+08 )
									ret := -0.331858
								if( Positive_Money_Flow_Sum > 1.17381e+08 )
									ret := 0.065217
							if( ema3 > 34.2021 )
								if( ema2 <= 136.905 )
									ret := 0.073642
								if( ema2 > 136.905 )
									ret := -0.008679
					if( ema12 > 1.86173 )
						if( MFI_High <= -16.8758 )
							ret := -0.933333 // sell
						if( MFI_High > -16.8758 )
							ret := -0.642857
			if( tema > 165.787 )
				if( Positive_Money_Flow_Sum <= 2.03394e+08 )
					if( Money_Flow_Ratio <= 1.67395 )
						if( ema13 <= 1.4512 )
							if( ema12 <= -0.086267 )
								if( MFI <= 30.5968 )
									ret := 0.195531
								if( MFI > 30.5968 )
									ret := -0.142857
							if( ema12 > -0.086267 )
								if( Negative_Money_Flow_Sum <= 4.7298e+07 )
									ret := 0.052314
								if( Negative_Money_Flow_Sum > 4.7298e+07 )
									ret := -0.168757
						if( ema13 > 1.4512 )
							if( MFI_High <= -35.1993 )
								if( ema3 <= 187.297 )
									ret := -0.418919
								if( ema3 > 187.297 )
									ret := 0.160093
							if( MFI_High > -35.1993 )
								if( ema12 <= 1.15111 )
									ret := 0.065502
								if( ema12 > 1.15111 )
									ret := -0.373665
					if( Money_Flow_Ratio > 1.67395 )
						if( Typical_Price <= 195.389 )
							if( MFI_High <= -14.029 )
								if( Positive_Money_Flow <= 5.64484e+06 )
									ret := -0.421053
								if( Positive_Money_Flow > 5.64484e+06 )
									ret := 0.555556
							if( MFI_High > -14.029 )
								if( ema3 <= 181.913 )
									ret := -0.705882 // sell
								if( ema3 > 181.913 )
									ret := -0.100000
						if( Typical_Price > 195.389 )
							if( MFI_Low <= 46.9158 )
								if( Raw_Money_Flow <= 1.41714e+07 )
									ret := -0.312500
								if( Raw_Money_Flow > 1.41714e+07 )
									ret := -0.721053 // sell
							if( MFI_Low > 46.9158 )
								if( Positive_Money_Flow <= 6.64735e+06 )
									ret := -0.442308
								if( Positive_Money_Flow > 6.64735e+06 )
									ret := 0.304878
				if( Positive_Money_Flow_Sum > 2.03394e+08 )
					if( Positive_Money_Flow <= 2.18125e+09 )
						if( Positive_Money_Flow <= 1.16239e+09 )
							if( ema12 <= 0.962079 )
								if( Positive_Money_Flow_Sum <= 5.49931e+08 )
									ret := 0.072574
								if( Positive_Money_Flow_Sum > 5.49931e+08 )
									ret := -0.061538
							if( ema12 > 0.962079 )
								if( ema12 <= 7.13108 )
									ret := 0.078118
								if( ema12 > 7.13108 )
									ret := 0.500000
						if( Positive_Money_Flow > 1.16239e+09 )
							if( Typical_Price <= 366.127 )
								if( ema2 <= 286.152 )
									ret := -0.264368
								if( ema2 > 286.152 )
									ret := 0.230769
							if( Typical_Price > 366.127 )
								if( ema1 <= 863.238 )
									ret := -0.482301
								if( ema1 > 863.238 )
									ret := 0.019231
					if( Positive_Money_Flow > 2.18125e+09 )
						if( MFI <= 55.752 )
							if( MFI_High <= -33.052 )
								if( ema2 <= 580.662 )
									ret := 0.750000 // buy
								if( ema2 > 580.662 )
									ret := 0.125000
							if( MFI_High > -33.052 )
								if( ema3 <= 748.947 )
									ret := -0.444444
								if( ema3 > 748.947 )
									ret := -0.125000
						if( MFI > 55.752 )
							if( ema13 <= 5.06602 )
								if( ema1 <= 778.432 )
									ret := 0.982759 // buy
								if( ema1 > 778.432 )
									ret := 0.666667
							if( ema13 > 5.06602 )
								if( MFI <= 64.9045 )
									ret := 0.677419
								if( MFI > 64.9045 )
									ret := -0.625000
	if( MFI > 68.6272 )
		if( Positive_Money_Flow_Sum <= 8.06457e+09 )
			if( ema1 <= 116.804 )
				if( Positive_Money_Flow <= 5.3701e+07 )
					if( ema12 <= 1.13459 )
						if( ema12 <= 0.830855 )
							if( Positive_Money_Flow <= 4.46271e+07 )
								if( ema2 <= 30.0184 )
									ret := 0.405941
								if( ema2 > 30.0184 )
									ret := 0.111176
							if( Positive_Money_Flow > 4.46271e+07 )
								if( Money_Flow_Ratio <= 3.01032 )
									ret := -0.520000
								if( Money_Flow_Ratio > 3.01032 )
									ret := -0.085106
						if( ema12 > 0.830855 )
							if( Money_Flow_Ratio <= 6.15441 )
								if( Typical_Price <= 110.579 )
									ret := 0.181818
								if( Typical_Price > 110.579 )
									ret := 0.666667
							if( Money_Flow_Ratio > 6.15441 )
								ret := 0.866667 // buy
					if( ema12 > 1.13459 )
						if( tema <= 86.913 )
							ret := -1.000000 // sell
						if( tema > 86.913 )
							if( ema3 <= 105.967 )
								ret := -0.411765
							if( ema3 > 105.967 )
								ret := 0.250000
				if( Positive_Money_Flow > 5.3701e+07 )
					if( MFI_High <= 19.7761 )
						if( ema12 <= 0.946065 )
							if( Raw_Money_Flow <= 1.10781e+08 )
								if( ema1 <= 106.009 )
									ret := 0.202381
								if( ema1 > 106.009 )
									ret := 0.555556
							if( Raw_Money_Flow > 1.10781e+08 )
								if( ema3 <= 114.488 )
									ret := 0.037500
								if( ema3 > 114.488 )
									ret := 0.692308
						if( ema12 > 0.946065 )
							if( Positive_Money_Flow <= 2.31974e+08 )
								ret := 0.153846
							if( Positive_Money_Flow > 2.31974e+08 )
								if( Typical_Price <= 115.237 )
									ret := 0.925926 // buy
								if( Typical_Price > 115.237 )
									ret := 0.636364
					if( MFI_High > 19.7761 )
						if( ema3 <= 92.0109 )
							if( tema <= 69.7415 )
								ret := 0.400000
							if( tema > 69.7415 )
								if( Negative_Money_Flow_Sum <= 1.47127e+06 )
									ret := 0.714286 // buy
								if( Negative_Money_Flow_Sum > 1.47127e+06 )
									ret := 1.000000 // buy
						if( ema3 > 92.0109 )
							ret := 0.181818
			if( ema1 > 116.804 )
				if( Negative_Money_Flow_Sum <= 3.35585e+09 )
					if( Negative_Money_Flow_Sum <= 2.16024e+09 )
						if( tema <= 922.116 )
							if( Negative_Money_Flow <= 1.25607e+09 )
								if( Raw_Money_Flow <= 9.23998e+08 )
									ret := 0.001204
								if( Raw_Money_Flow > 9.23998e+08 )
									ret := 0.127353
							if( Negative_Money_Flow > 1.25607e+09 )
								if( ema2 <= 454.279 )
									ret := 0.960784 // buy
								if( ema2 > 454.279 )
									ret := 0.000000
						if( tema > 922.116 )
							if( Negative_Money_Flow_Sum <= 5.08786e+08 )
								ret := -0.200000
							if( Negative_Money_Flow_Sum > 5.08786e+08 )
								if( Raw_Money_Flow <= 4.72465e+08 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 4.72465e+08 )
									ret := -0.833333 // sell
					if( Negative_Money_Flow_Sum > 2.16024e+09 )
						if( MFI <= 75.8966 )
							if( Positive_Money_Flow_Sum <= 7.62473e+09 )
								if( ema3 <= 444.382 )
									ret := 0.476323
								if( ema3 > 444.382 )
									ret := 0.023529
							if( Positive_Money_Flow_Sum > 7.62473e+09 )
								if( ema13 <= 0.112225 )
									ret := 0.733333 // buy
								if( ema13 > 0.112225 )
									ret := -0.275362
						if( MFI > 75.8966 )
							if( Raw_Money_Flow <= 6.70286e+08 )
								if( Negative_Money_Flow_Sum <= 2.28742e+09 )
									ret := -0.263158
								if( Negative_Money_Flow_Sum > 2.28742e+09 )
									ret := -0.692308
							if( Raw_Money_Flow > 6.70286e+08 )
								ret := 0.250000
				if( Negative_Money_Flow_Sum > 3.35585e+09 )
					if( Raw_Money_Flow <= 8.07632e+08 )
						ret := -0.545455
					if( Raw_Money_Flow > 8.07632e+08 )
						ret := -1.000000 // sell
		if( Positive_Money_Flow_Sum > 8.06457e+09 )
			if( tema <= 223.098 )
				if( ema1 <= 118.866 )
					if( Negative_Money_Flow_Sum <= 9.38962e+09 )
						if( MFI_Low <= 57.4342 )
							if( ema3 <= 113.622 )
								if( Positive_Money_Flow_Sum <= 1.92714e+10 )
									ret := -0.363636
								if( Positive_Money_Flow_Sum > 1.92714e+10 )
									ret := -0.800000 // sell
							if( ema3 > 113.622 )
								if( ema13 <= 1.05868 )
									ret := 0.000000
								if( ema13 > 1.05868 )
									ret := 0.300000
						if( MFI_Low > 57.4342 )
							if( MFI <= 88.6806 )
								if( ema2 <= 105.756 )
									ret := 0.285714
								if( ema2 > 105.756 )
									ret := 0.800000 // buy
							if( MFI > 88.6806 )
								if( MFI_Low <= 76.2079 )
									ret := -0.407407
								if( MFI_Low > 76.2079 )
									ret := 0.727273 // buy
					if( Negative_Money_Flow_Sum > 9.38962e+09 )
						if( ema13 <= 1.78287 )
							ret := 1.000000 // buy
						if( ema13 > 1.78287 )
							ret := 0.666667
				if( ema1 > 118.866 )
					if( MFI_Low <= 58.967 )
						if( Money_Flow_Ratio <= 2.38944 )
							if( Raw_Money_Flow <= 1.04029e+09 )
								ret := -0.375000
							if( Raw_Money_Flow > 1.04029e+09 )
								ret := 0.384615
						if( Money_Flow_Ratio > 2.38944 )
							if( ema3 <= 119.887 )
								if( tema <= 120.786 )
									ret := -0.864865 // sell
								if( tema > 120.786 )
									ret := -0.214286
							if( ema3 > 119.887 )
								if( ema1 <= 144.485 )
									ret := -0.132530
								if( ema1 > 144.485 )
									ret := -0.632653
					if( MFI_Low > 58.967 )
						if( Negative_Money_Flow_Sum <= 8.15941e+07 )
							ret := -0.857143 // sell
						if( Negative_Money_Flow_Sum > 8.15941e+07 )
							if( Positive_Money_Flow <= 3.27974e+09 )
								if( Negative_Money_Flow <= 1.9847e+09 )
									ret := 0.382716
								if( Negative_Money_Flow > 1.9847e+09 )
									ret := -0.500000
							if( Positive_Money_Flow > 3.27974e+09 )
								if( Typical_Price <= 125.322 )
									ret := 0.000000
								if( Typical_Price > 125.322 )
									ret := -0.758621 // sell
			if( tema > 223.098 )
				if( Positive_Money_Flow_Sum <= 3.98264e+10 )
					if( Money_Flow_Ratio <= 31.153 )
						if( Negative_Money_Flow_Sum <= 7.04325e+09 )
							if( MFI <= 90.4443 )
								if( Raw_Money_Flow <= 1.46844e+08 )
									ret := 0.091644
								if( Raw_Money_Flow > 1.46844e+08 )
									ret := 0.352995
							if( MFI > 90.4443 )
								if( ema3 <= 219.563 )
									ret := 1.000000 // buy
								if( ema3 > 219.563 )
									ret := -0.137821
						if( Negative_Money_Flow_Sum > 7.04325e+09 )
							if( Negative_Money_Flow_Sum <= 9.19815e+09 )
								if( Positive_Money_Flow <= 2.09325e+09 )
									ret := -0.185185
								if( Positive_Money_Flow > 2.09325e+09 )
									ret := -0.838710 // sell
							if( Negative_Money_Flow_Sum > 9.19815e+09 )
								if( Raw_Money_Flow <= 1.99318e+09 )
									ret := -0.421053
								if( Raw_Money_Flow > 1.99318e+09 )
									ret := 0.500000
					if( Money_Flow_Ratio > 31.153 )
						if( ema13 <= 6.28394 )
							if( Positive_Money_Flow_Sum <= 1.24358e+10 )
								if( Money_Flow_Ratio <= 89.1286 )
									ret := 0.390244
								if( Money_Flow_Ratio > 89.1286 )
									ret := -0.428571
							if( Positive_Money_Flow_Sum > 1.24358e+10 )
								if( MFI_High <= 18.8454 )
									ret := 1.000000 // buy
								if( MFI_High > 18.8454 )
									ret := 0.571429
						if( ema13 > 6.28394 )
							if( MFI_Low <= 77.4166 )
								if( Money_Flow_Ratio <= 37.3848 )
									ret := 0.192308
								if( Money_Flow_Ratio > 37.3848 )
									ret := 0.777778 // buy
							if( MFI_Low > 77.4166 )
								if( Typical_Price <= 458.318 )
									ret := 0.976744 // buy
								if( Typical_Price > 458.318 )
									ret := 0.666667
				if( Positive_Money_Flow_Sum > 3.98264e+10 )
					if( ema12 <= 10.4271 )
						if( Negative_Money_Flow_Sum <= 1.59917e+10 )
							ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 1.59917e+10 )
							ret := 0.538462
					if( ema12 > 10.4271 )
						ret := -0.181818
	
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
float op_operation = decision_tree_0_NVDA_30Min_bfd676fc(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)

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


