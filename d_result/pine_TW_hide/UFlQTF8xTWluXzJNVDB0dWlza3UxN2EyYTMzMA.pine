//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: PYPL_1Min_2MT0_17a2a330 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PYPL_1Min_2MT0_17a2a330", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PYPL_1Min_17a2a330(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.010443 )
		if( Raw_Money_Flow <= 212386 )
			if( Negative_Money_Flow <= 445.133 )
				if( ema12 <= -0.059444 )
					if( MFI_High <= -71.0729 )
						if( Negative_Money_Flow_Sum <= 1.05141e+06 )
							ret := 0.166667
						if( Negative_Money_Flow_Sum > 1.05141e+06 )
							if( tema <= 63.5705 )
								ret := -0.750000 // sell
							if( tema > 63.5705 )
								ret := -1.000000 // sell
					if( MFI_High > -71.0729 )
						if( Raw_Money_Flow <= 31382.9 )
							if( Negative_Money_Flow_Sum <= 434363 )
								if( Raw_Money_Flow <= 13148 )
									ret := 0.176471
								if( Raw_Money_Flow > 13148 )
									ret := 0.726190 // buy
							if( Negative_Money_Flow_Sum > 434363 )
								if( MFI_Low <= -0.370712 )
									ret := 0.684211
								if( MFI_Low > -0.370712 )
									ret := 0.106383
						if( Raw_Money_Flow > 31382.9 )
							if( ema3 <= 61.1663 )
								if( Negative_Money_Flow_Sum <= 927443 )
									ret := 0.269231
								if( Negative_Money_Flow_Sum > 927443 )
									ret := 0.794118 // buy
							if( ema3 > 61.1663 )
								if( ema12 <= -0.096058 )
									ret := -0.083333
								if( ema12 > -0.096058 )
									ret := 0.290323
				if( ema12 > -0.059444 )
					if( Money_Flow_Ratio <= 0.229265 )
						if( Typical_Price <= 59.4967 )
							if( ema1 <= 59.3549 )
								if( MFI_Low <= -8.79129 )
									ret := 0.375000
								if( MFI_Low > -8.79129 )
									ret := 0.000000
							if( ema1 > 59.3549 )
								ret := 1.000000 // buy
						if( Typical_Price > 59.4967 )
							if( Positive_Money_Flow_Sum <= 196090 )
								if( MFI <= 16.2614 )
									ret := -0.204082
								if( MFI > 16.2614 )
									ret := -0.666667
							if( Positive_Money_Flow_Sum > 196090 )
								if( MFI_High <= -63.0694 )
									ret := -0.098592
								if( MFI_High > -63.0694 )
									ret := 0.454545
					if( Money_Flow_Ratio > 0.229265 )
						if( Negative_Money_Flow_Sum <= 577274 )
							if( Negative_Money_Flow_Sum <= 558535 )
								if( MFI_High <= -47.5206 )
									ret := 0.198953
								if( MFI_High > -47.5206 )
									ret := 0.016293
							if( Negative_Money_Flow_Sum > 558535 )
								if( Positive_Money_Flow <= 33437.6 )
									ret := -0.760000 // sell
								if( Positive_Money_Flow > 33437.6 )
									ret := -0.125000
						if( Negative_Money_Flow_Sum > 577274 )
							if( Negative_Money_Flow_Sum <= 737894 )
								if( tema <= 59.6511 )
									ret := -0.181818
								if( tema > 59.6511 )
									ret := 0.497110
							if( Negative_Money_Flow_Sum > 737894 )
								if( Raw_Money_Flow <= 123020 )
									ret := 0.166197
								if( Raw_Money_Flow > 123020 )
									ret := -0.155556
			if( Negative_Money_Flow > 445.133 )
				if( MFI <= 11.4271 )
					if( ema3 <= 63.7292 )
						if( Negative_Money_Flow_Sum <= 1.36237e+06 )
							if( Negative_Money_Flow_Sum <= 437544 )
								if( Positive_Money_Flow_Sum <= 24806.5 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 24806.5 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 437544 )
								if( ema1 <= 60.7947 )
									ret := 0.100000
								if( ema1 > 60.7947 )
									ret := -0.631579
						if( Negative_Money_Flow_Sum > 1.36237e+06 )
							if( Positive_Money_Flow_Sum <= 161119 )
								if( Raw_Money_Flow <= 14141.7 )
									ret := 0.166667
								if( Raw_Money_Flow > 14141.7 )
									ret := 0.936170 // buy
							if( Positive_Money_Flow_Sum > 161119 )
								if( Negative_Money_Flow_Sum <= 2.23959e+06 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 2.23959e+06 )
									ret := 0.388889
					if( ema3 > 63.7292 )
						if( ema3 <= 63.9874 )
							ret := -1.000000 // sell
						if( ema3 > 63.9874 )
							if( Positive_Money_Flow <= 4096 )
								if( Money_Flow_Ratio <= 0.052584 )
									ret := 0.344828
								if( Money_Flow_Ratio > 0.052584 )
									ret := -0.087912
							if( Positive_Money_Flow > 4096 )
								if( Typical_Price <= 64.569 )
									ret := 0.600000
								if( Typical_Price > 64.569 )
									ret := -0.920000 // sell
				if( MFI > 11.4271 )
					if( Positive_Money_Flow_Sum <= 252308 )
						if( Raw_Money_Flow <= 17921.3 )
							if( ema12 <= -0.044162 )
								if( ema3 <= 62.0784 )
									ret := 0.125000
								if( ema3 > 62.0784 )
									ret := 0.825000 // buy
							if( ema12 > -0.044162 )
								if( Positive_Money_Flow_Sum <= 73861.8 )
									ret := -0.250000
								if( Positive_Money_Flow_Sum > 73861.8 )
									ret := 0.376033
						if( Raw_Money_Flow > 17921.3 )
							if( MFI_High <= -61.1544 )
								if( ema2 <= 70.5647 )
									ret := 0.570588
								if( ema2 > 70.5647 )
									ret := -0.018519
							if( MFI_High > -61.1544 )
								if( ema1 <= 72.4266 )
									ret := 0.083333
								if( ema1 > 72.4266 )
									ret := 0.524272
					if( Positive_Money_Flow_Sum > 252308 )
						if( Negative_Money_Flow <= 72264.4 )
							if( MFI_Low <= 19.3198 )
								if( Raw_Money_Flow <= 7850.86 )
									ret := 0.047619
								if( Raw_Money_Flow > 7850.86 )
									ret := 0.719697 // buy
							if( MFI_Low > 19.3198 )
								if( Negative_Money_Flow_Sum <= 434526 )
									ret := 0.536822
								if( Negative_Money_Flow_Sum > 434526 )
									ret := 0.226700
						if( Negative_Money_Flow > 72264.4 )
							if( ema3 <= 64.8905 )
								if( Typical_Price <= 63.0354 )
									ret := 0.288770
								if( Typical_Price > 63.0354 )
									ret := -0.203704
							if( ema3 > 64.8905 )
								if( ema1 <= 78.1504 )
									ret := 0.489879
								if( ema1 > 78.1504 )
									ret := 0.000000
		if( Raw_Money_Flow > 212386 )
			if( Negative_Money_Flow_Sum <= 4.54847e+07 )
				if( Positive_Money_Flow_Sum <= 1.11914e+07 )
					if( Negative_Money_Flow_Sum <= 2.82377e+07 )
						if( Negative_Money_Flow <= 1.07044e+06 )
							if( Negative_Money_Flow_Sum <= 2.02969e+06 )
								if( Negative_Money_Flow <= 288473 )
									ret := 0.099631
								if( Negative_Money_Flow > 288473 )
									ret := 0.461883
							if( Negative_Money_Flow_Sum > 2.02969e+06 )
								if( Negative_Money_Flow_Sum <= 8.16138e+06 )
									ret := -0.031654
								if( Negative_Money_Flow_Sum > 8.16138e+06 )
									ret := 0.063658
						if( Negative_Money_Flow > 1.07044e+06 )
							if( MFI_High <= -73.6739 )
								if( ema13 <= -0.100397 )
									ret := 0.062500
								if( ema13 > -0.100397 )
									ret := -0.568627
							if( MFI_High > -73.6739 )
								if( MFI_Low <= 40.4904 )
									ret := 0.129752
								if( MFI_Low > 40.4904 )
									ret := -0.590909
					if( Negative_Money_Flow_Sum > 2.82377e+07 )
						if( Positive_Money_Flow_Sum <= 7.58937e+06 )
							if( Negative_Money_Flow <= 7.41811e+06 )
								if( ema12 <= -0.294911 )
									ret := -0.315789
								if( ema12 > -0.294911 )
									ret := 0.584656
							if( Negative_Money_Flow > 7.41811e+06 )
								if( ema2 <= 69.4421 )
									ret := -0.611111
								if( ema2 > 69.4421 )
									ret := 0.833333 // buy
						if( Positive_Money_Flow_Sum > 7.58937e+06 )
							if( Raw_Money_Flow <= 2.3573e+06 )
								if( Positive_Money_Flow_Sum <= 9.65223e+06 )
									ret := -0.587500
								if( Positive_Money_Flow_Sum > 9.65223e+06 )
									ret := 0.433333
							if( Raw_Money_Flow > 2.3573e+06 )
								if( Raw_Money_Flow <= 7.49046e+06 )
									ret := 0.408602
								if( Raw_Money_Flow > 7.49046e+06 )
									ret := -0.444444
				if( Positive_Money_Flow_Sum > 1.11914e+07 )
					if( Negative_Money_Flow_Sum <= 3.58553e+07 )
						if( Positive_Money_Flow_Sum <= 1.21327e+07 )
							if( Typical_Price <= 70.1561 )
								if( Money_Flow_Ratio <= 0.858911 )
									ret := -0.343590
								if( Money_Flow_Ratio > 0.858911 )
									ret := 0.079755
							if( Typical_Price > 70.1561 )
								if( Negative_Money_Flow_Sum <= 1.26612e+07 )
									ret := -0.510204
								if( Negative_Money_Flow_Sum > 1.26612e+07 )
									ret := 0.306452
						if( Positive_Money_Flow_Sum > 1.21327e+07 )
							if( Positive_Money_Flow_Sum <= 8.97052e+07 )
								if( Positive_Money_Flow_Sum <= 2.46703e+07 )
									ret := 0.015539
								if( Positive_Money_Flow_Sum > 2.46703e+07 )
									ret := 0.223853
							if( Positive_Money_Flow_Sum > 8.97052e+07 )
								if( Typical_Price <= 67.2083 )
									ret := -0.806452 // sell
								if( Typical_Price > 67.2083 )
									ret := 0.000000
					if( Negative_Money_Flow_Sum > 3.58553e+07 )
						if( Negative_Money_Flow <= 4.59889e+06 )
							if( MFI_High <= -53.6637 )
								if( Positive_Money_Flow_Sum <= 1.36023e+07 )
									ret := 0.382353
								if( Positive_Money_Flow_Sum > 1.36023e+07 )
									ret := -0.233333
							if( MFI_High > -53.6637 )
								if( ema2 <= 62.3442 )
									ret := 0.437500
								if( ema2 > 62.3442 )
									ret := -0.520979
						if( Negative_Money_Flow > 4.59889e+06 )
							if( MFI <= 30.827 )
								if( Raw_Money_Flow <= 6.30044e+06 )
									ret := -0.888889 // sell
								if( Raw_Money_Flow > 6.30044e+06 )
									ret := 0.000000
							if( MFI > 30.827 )
								if( ema3 <= 63.8188 )
									ret := -0.545455
								if( ema3 > 63.8188 )
									ret := 0.687500
			if( Negative_Money_Flow_Sum > 4.54847e+07 )
				if( tema <= 67.9132 )
					if( ema13 <= -0.160861 )
						if( Positive_Money_Flow_Sum <= 3.64777e+06 )
							if( Negative_Money_Flow_Sum <= 7.1029e+07 )
								if( tema <= 62.7279 )
									ret := -0.750000 // sell
								if( tema > 62.7279 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 7.1029e+07 )
								ret := 0.500000
						if( Positive_Money_Flow_Sum > 3.64777e+06 )
							if( Positive_Money_Flow_Sum <= 1.09514e+08 )
								if( ema2 <= 63.0264 )
									ret := 0.879310 // buy
								if( ema2 > 63.0264 )
									ret := 0.577358
							if( Positive_Money_Flow_Sum > 1.09514e+08 )
								ret := -0.857143 // sell
					if( ema13 > -0.160861 )
						if( Positive_Money_Flow <= 6.87227e+06 )
							if( MFI_Low <= -10.5492 )
								if( Negative_Money_Flow <= 2.18475e+06 )
									ret := -0.526316
								if( Negative_Money_Flow > 2.18475e+06 )
									ret := 0.500000
							if( MFI_Low > -10.5492 )
								if( Positive_Money_Flow_Sum <= 1.14815e+08 )
									ret := 0.405063
								if( Positive_Money_Flow_Sum > 1.14815e+08 )
									ret := -0.333333
						if( Positive_Money_Flow > 6.87227e+06 )
							if( ema12 <= -0.024523 )
								if( ema12 <= -0.056601 )
									ret := -1.000000 // sell
								if( ema12 > -0.056601 )
									ret := -0.700000 // sell
							if( ema12 > -0.024523 )
								ret := 0.000000
				if( tema > 67.9132 )
					if( Negative_Money_Flow_Sum <= 8.69225e+07 )
						if( ema12 <= -0.131158 )
							if( Negative_Money_Flow_Sum <= 7.49442e+07 )
								if( MFI_High <= -41.3632 )
									ret := -0.955556 // sell
								if( MFI_High > -41.3632 )
									ret := -0.250000
							if( Negative_Money_Flow_Sum > 7.49442e+07 )
								ret := 0.571429
						if( ema12 > -0.131158 )
							if( MFI_Low <= -6.25903 )
								if( Typical_Price <= 78.4319 )
									ret := -1.000000 // sell
								if( Typical_Price > 78.4319 )
									ret := -0.222222
							if( MFI_Low > -6.25903 )
								if( Positive_Money_Flow_Sum <= 1.6076e+07 )
									ret := 0.880000 // buy
								if( Positive_Money_Flow_Sum > 1.6076e+07 )
									ret := -0.075342
					if( Negative_Money_Flow_Sum > 8.69225e+07 )
						if( MFI_Low <= 23.4813 )
							if( Positive_Money_Flow <= 403046 )
								if( Money_Flow_Ratio <= 0.60777 )
									ret := 0.820225 // buy
								if( Money_Flow_Ratio > 0.60777 )
									ret := -0.500000
							if( Positive_Money_Flow > 403046 )
								if( ema13 <= -0.255988 )
									ret := 0.666667
								if( ema13 > -0.255988 )
									ret := -0.615385
						if( MFI_Low > 23.4813 )
							if( ema1 <= 69.257 )
								ret := -1.000000 // sell
							if( ema1 > 69.257 )
								ret := -0.500000
	if( ema12 > -0.010443 )
		if( ema12 <= 0.045005 )
			if( Negative_Money_Flow <= 335.734 )
				if( Raw_Money_Flow <= 89704.3 )
					if( ema12 <= 0.017982 )
						if( Positive_Money_Flow_Sum <= 164798 )
							if( ema13 <= -0.01252 )
								if( Positive_Money_Flow_Sum <= 132025 )
									ret := -0.485294
								if( Positive_Money_Flow_Sum > 132025 )
									ret := -0.065217
							if( ema13 > -0.01252 )
								if( Negative_Money_Flow_Sum <= 397829 )
									ret := 0.234469
								if( Negative_Money_Flow_Sum > 397829 )
									ret := -0.287671
						if( Positive_Money_Flow_Sum > 164798 )
							if( Typical_Price <= 65.9989 )
								if( ema13 <= 0.023299 )
									ret := -0.184375
								if( ema13 > 0.023299 )
									ret := 0.003509
							if( Typical_Price > 65.9989 )
								if( Positive_Money_Flow <= 10956.9 )
									ret := -0.137255
								if( Positive_Money_Flow > 10956.9 )
									ret := 0.071429
					if( ema12 > 0.017982 )
						if( Positive_Money_Flow_Sum <= 550094 )
							if( tema <= 68.6496 )
								if( MFI_Low <= 23.7815 )
									ret := -0.540773
								if( MFI_Low > 23.7815 )
									ret := -0.353201
							if( tema > 68.6496 )
								if( Negative_Money_Flow_Sum <= 131458 )
									ret := 0.449275
								if( Negative_Money_Flow_Sum > 131458 )
									ret := -0.250000
						if( Positive_Money_Flow_Sum > 550094 )
							if( Positive_Money_Flow_Sum <= 1.01177e+06 )
								if( ema2 <= 60.4536 )
									ret := -0.236842
								if( ema2 > 60.4536 )
									ret := 0.225455
							if( Positive_Money_Flow_Sum > 1.01177e+06 )
								if( Negative_Money_Flow_Sum <= 152321 )
									ret := -0.575758
								if( Negative_Money_Flow_Sum > 152321 )
									ret := -0.192825
				if( Raw_Money_Flow > 89704.3 )
					if( ema13 <= 0.068004 )
						if( MFI <= 26.5618 )
							if( Negative_Money_Flow_Sum <= 1.51461e+07 )
								if( ema12 <= 0.00477 )
									ret := 0.068966
								if( ema12 > 0.00477 )
									ret := -0.421053
							if( Negative_Money_Flow_Sum > 1.51461e+07 )
								if( ema13 <= -0.018536 )
									ret := -0.090909
								if( ema13 > -0.018536 )
									ret := -0.548387
						if( MFI > 26.5618 )
							if( Raw_Money_Flow <= 5.23413e+07 )
								if( Negative_Money_Flow_Sum <= 1.83547e+07 )
									ret := -0.000894
								if( Negative_Money_Flow_Sum > 1.83547e+07 )
									ret := 0.104286
							if( Raw_Money_Flow > 5.23413e+07 )
								if( ema12 <= 0.03539 )
									ret := -0.642857
								if( ema12 > 0.03539 )
									ret := 0.428571
					if( ema13 > 0.068004 )
						if( Raw_Money_Flow <= 1.99743e+06 )
							if( Positive_Money_Flow_Sum <= 1.04254e+07 )
								if( ema13 <= 0.10252 )
									ret := 0.075426
								if( ema13 > 0.10252 )
									ret := 0.550000
							if( Positive_Money_Flow_Sum > 1.04254e+07 )
								if( Negative_Money_Flow_Sum <= 2.86354e+06 )
									ret := -0.285714
								if( Negative_Money_Flow_Sum > 2.86354e+06 )
									ret := 0.337058
						if( Raw_Money_Flow > 1.99743e+06 )
							if( Money_Flow_Ratio <= 1.54997 )
								if( MFI <= 58.4331 )
									ret := 0.136364
								if( MFI > 58.4331 )
									ret := 0.846154 // buy
							if( Money_Flow_Ratio > 1.54997 )
								if( Negative_Money_Flow_Sum <= 2.91178e+06 )
									ret := 0.714286 // buy
								if( Negative_Money_Flow_Sum > 2.91178e+06 )
									ret := -0.211765
			if( Negative_Money_Flow > 335.734 )
				if( Negative_Money_Flow_Sum <= 1.50774e+06 )
					if( ema12 <= 0.016988 )
						if( ema13 <= -0.021537 )
							if( Negative_Money_Flow <= 6762.61 )
								if( MFI <= 38.7508 )
									ret := -0.250000
								if( MFI > 38.7508 )
									ret := -0.916667 // sell
							if( Negative_Money_Flow > 6762.61 )
								if( ema13 <= -0.024583 )
									ret := 0.161290
								if( ema13 > -0.024583 )
									ret := -0.375000
						if( ema13 > -0.021537 )
							if( ema3 <= 81.6278 )
								if( MFI_High <= -49.076 )
									ret := 0.167984
								if( MFI_High > -49.076 )
									ret := 0.320354
							if( ema3 > 81.6278 )
								ret := -1.000000 // sell
					if( ema12 > 0.016988 )
						if( ema1 <= 67.8296 )
							if( ema13 <= 0.094653 )
								if( MFI_High <= 19.4093 )
									ret := 0.030366
								if( MFI_High > 19.4093 )
									ret := 0.733333 // buy
							if( ema13 > 0.094653 )
								if( Positive_Money_Flow_Sum <= 525326 )
									ret := -0.166667
								if( Positive_Money_Flow_Sum > 525326 )
									ret := 0.725000 // buy
						if( ema1 > 67.8296 )
							if( Negative_Money_Flow <= 109685 )
								if( ema13 <= 0.059662 )
									ret := 0.174528
								if( ema13 > 0.059662 )
									ret := 0.537572
							if( Negative_Money_Flow > 109685 )
								if( Raw_Money_Flow <= 127509 )
									ret := -0.647059
								if( Raw_Money_Flow > 127509 )
									ret := -0.085106
				if( Negative_Money_Flow_Sum > 1.50774e+06 )
					if( Raw_Money_Flow <= 1.0551e+06 )
						if( Money_Flow_Ratio <= 3.21782 )
							if( Negative_Money_Flow_Sum <= 1.26093e+08 )
								if( Raw_Money_Flow <= 276109 )
									ret := 0.124601
								if( Raw_Money_Flow > 276109 )
									ret := -0.005983
							if( Negative_Money_Flow_Sum > 1.26093e+08 )
								if( ema2 <= 63.3137 )
									ret := 0.157895
								if( ema2 > 63.3137 )
									ret := -0.666667
						if( Money_Flow_Ratio > 3.21782 )
							if( Negative_Money_Flow_Sum <= 1.89404e+07 )
								if( Money_Flow_Ratio <= 11.1897 )
									ret := 0.114379
								if( Money_Flow_Ratio > 11.1897 )
									ret := 0.460000
							if( Negative_Money_Flow_Sum > 1.89404e+07 )
								if( Positive_Money_Flow_Sum <= 1.02003e+08 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 1.02003e+08 )
									ret := 0.775000 // buy
					if( Raw_Money_Flow > 1.0551e+06 )
						if( MFI <= 56.4773 )
							if( Positive_Money_Flow_Sum <= 5.32919e+06 )
								if( Positive_Money_Flow_Sum <= 358376 )
									ret := 0.608696
								if( Positive_Money_Flow_Sum > 358376 )
									ret := -0.081678
							if( Positive_Money_Flow_Sum > 5.32919e+06 )
								if( Negative_Money_Flow_Sum <= 2.25534e+07 )
									ret := 0.130015
								if( Negative_Money_Flow_Sum > 2.25534e+07 )
									ret := 0.316854
						if( MFI > 56.4773 )
							if( Positive_Money_Flow_Sum <= 1.70102e+07 )
								if( ema13 <= 0.09985 )
									ret := 0.050505
								if( ema13 > 0.09985 )
									ret := 0.866667 // buy
							if( Positive_Money_Flow_Sum > 1.70102e+07 )
								if( Raw_Money_Flow <= 1.65029e+06 )
									ret := -0.295720
								if( Raw_Money_Flow > 1.65029e+06 )
									ret := -0.013769
		if( ema12 > 0.045005 )
			if( Raw_Money_Flow <= 211642 )
				if( Positive_Money_Flow <= 1297.65 )
					if( ema13 <= 0.206565 )
						if( MFI_High <= 9.26963 )
							if( ema12 <= 0.121912 )
								if( ema2 <= 67.0499 )
									ret := -0.165339
								if( ema2 > 67.0499 )
									ret := 0.020202
							if( ema12 > 0.121912 )
								if( ema1 <= 66.2086 )
									ret := -0.500000
								if( ema1 > 66.2086 )
									ret := -1.000000 // sell
						if( MFI_High > 9.26963 )
							if( Positive_Money_Flow_Sum <= 728504 )
								if( ema1 <= 67.2273 )
									ret := 0.625000
								if( ema1 > 67.2273 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 728504 )
								if( MFI_Low <= 75.057 )
									ret := -0.235294
								if( MFI_Low > 75.057 )
									ret := 0.636364
					if( ema13 > 0.206565 )
						if( ema2 <= 62.1205 )
							if( Raw_Money_Flow <= 64361.5 )
								if( ema12 <= 0.112304 )
									ret := 0.000000
								if( ema12 > 0.112304 )
									ret := -0.600000
							if( Raw_Money_Flow > 64361.5 )
								if( ema3 <= 57.9962 )
									ret := -0.750000 // sell
								if( ema3 > 57.9962 )
									ret := 0.769231 // buy
						if( ema2 > 62.1205 )
							if( MFI_High <= 9.46507 )
								if( Negative_Money_Flow <= 56091.2 )
									ret := 0.393939
								if( Negative_Money_Flow > 56091.2 )
									ret := 0.687500
							if( MFI_High > 9.46507 )
								if( ema1 <= 62.784 )
									ret := 0.000000
								if( ema1 > 62.784 )
									ret := -0.833333 // sell
				if( Positive_Money_Flow > 1297.65 )
					if( Negative_Money_Flow_Sum <= 83539.8 )
						if( MFI_Low <= 66.7429 )
							if( tema <= 67.2996 )
								if( Positive_Money_Flow_Sum <= 390778 )
									ret := -0.576923
								if( Positive_Money_Flow_Sum > 390778 )
									ret := 0.714286 // buy
							if( tema > 67.2996 )
								if( Positive_Money_Flow <= 3224.59 )
									ret := -0.500000
								if( Positive_Money_Flow > 3224.59 )
									ret := 0.702128 // buy
						if( MFI_Low > 66.7429 )
							if( Positive_Money_Flow_Sum <= 407696 )
								if( ema12 <= 0.087189 )
									ret := -1.000000 // sell
								if( ema12 > 0.087189 )
									ret := -0.500000
							if( Positive_Money_Flow_Sum > 407696 )
								if( Positive_Money_Flow_Sum <= 787591 )
									ret := 0.321429
								if( Positive_Money_Flow_Sum > 787591 )
									ret := -0.647059
					if( Negative_Money_Flow_Sum > 83539.8 )
						if( Positive_Money_Flow_Sum <= 1.39074e+06 )
							if( ema13 <= 0.208457 )
								if( Positive_Money_Flow_Sum <= 227773 )
									ret := -0.722772 // sell
								if( Positive_Money_Flow_Sum > 227773 )
									ret := -0.284974
							if( ema13 > 0.208457 )
								if( Positive_Money_Flow_Sum <= 1.01608e+06 )
									ret := -0.200000
								if( Positive_Money_Flow_Sum > 1.01608e+06 )
									ret := 0.653846
						if( Positive_Money_Flow_Sum > 1.39074e+06 )
							if( Positive_Money_Flow <= 2787.8 )
								ret := 0.428571
							if( Positive_Money_Flow > 2787.8 )
								if( ema2 <= 71.0107 )
									ret := -0.695473
								if( ema2 > 71.0107 )
									ret := -0.348837
			if( Raw_Money_Flow > 211642 )
				if( ema12 <= 0.17356 )
					if( Positive_Money_Flow_Sum <= 8.67196e+07 )
						if( ema12 <= 0.141865 )
							if( Positive_Money_Flow_Sum <= 4.34072e+07 )
								if( Positive_Money_Flow_Sum <= 2.83708e+07 )
									ret := 0.012848
								if( Positive_Money_Flow_Sum > 2.83708e+07 )
									ret := -0.160248
							if( Positive_Money_Flow_Sum > 4.34072e+07 )
								if( Negative_Money_Flow_Sum <= 1.67323e+07 )
									ret := 0.032432
								if( Negative_Money_Flow_Sum > 1.67323e+07 )
									ret := 0.374502
						if( ema12 > 0.141865 )
							if( MFI_Low <= 74.4546 )
								if( MFI_High <= 6.13067 )
									ret := -0.229008
								if( MFI_High > 6.13067 )
									ret := -0.573770
							if( MFI_Low > 74.4546 )
								if( Positive_Money_Flow_Sum <= 2.97707e+07 )
									ret := -0.600000
								if( Positive_Money_Flow_Sum > 2.97707e+07 )
									ret := 0.791667 // buy
					if( Positive_Money_Flow_Sum > 8.67196e+07 )
						if( Money_Flow_Ratio <= 99.1732 )
							if( ema2 <= 72.3183 )
								if( MFI_High <= -1.08172 )
									ret := -0.743243 // sell
								if( MFI_High > -1.08172 )
									ret := -0.320513
							if( ema2 > 72.3183 )
								if( MFI_High <= -3.52535 )
									ret := 1.000000 // buy
								if( MFI_High > -3.52535 )
									ret := -0.375000
						if( Money_Flow_Ratio > 99.1732 )
							ret := 1.000000 // buy
				if( ema12 > 0.17356 )
					if( MFI_Low <= 75.6245 )
						if( Money_Flow_Ratio <= 2.89001 )
							if( ema12 <= 0.238762 )
								if( ema13 <= 0.293941 )
									ret := 0.444444
								if( ema13 > 0.293941 )
									ret := -0.342105
							if( ema12 > 0.238762 )
								if( ema12 <= 0.526664 )
									ret := 0.358491
								if( ema12 > 0.526664 )
									ret := -0.800000 // sell
						if( Money_Flow_Ratio > 2.89001 )
							if( ema2 <= 71.742 )
								if( Positive_Money_Flow_Sum <= 7.30095e+07 )
									ret := 0.394422
								if( Positive_Money_Flow_Sum > 7.30095e+07 )
									ret := 0.820144 // buy
							if( ema2 > 71.742 )
								if( ema13 <= 0.34754 )
									ret := 0.190476
								if( ema13 > 0.34754 )
									ret := -0.565217
					if( MFI_Low > 75.6245 )
						if( ema12 <= 0.191786 )
							ret := 0.250000
						if( ema12 > 0.191786 )
							if( Negative_Money_Flow_Sum <= 3.1405e+06 )
								if( Money_Flow_Ratio <= 22.928 )
									ret := -0.600000
								if( Money_Flow_Ratio > 22.928 )
									ret := -0.937500 // sell
							if( Negative_Money_Flow_Sum > 3.1405e+06 )
								ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_PYPL_1Min_17a2a330(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)

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


