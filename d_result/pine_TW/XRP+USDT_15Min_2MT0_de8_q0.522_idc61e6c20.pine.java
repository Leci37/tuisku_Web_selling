//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: XRPUSDT_15Min_2MT0_c61e6c20 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_15Min_2MT0_c61e6c20", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_15Min_c61e6c20(Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum, ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.000935 )
		if( Negative_Money_Flow <= 7.8425e+06 )
			if( Negative_Money_Flow_Sum <= 1.85646e+07 )
				if( Negative_Money_Flow <= 4.66304e+06 )
					if( Negative_Money_Flow_Sum <= 1.17484e+07 )
						if( Negative_Money_Flow_Sum <= 1.05872e+07 )
							if( Typical_Price <= 0.357088 )
								if( ema12 <= -0.002214 )
									ret := -1.000000 // sell
								if( ema12 > -0.002214 )
									ret := 0.261803
							if( Typical_Price > 0.357088 )
								if( ema12 <= -0.002465 )
									ret := 0.655172
								if( ema12 > -0.002465 )
									ret := 0.021314
						if( Negative_Money_Flow_Sum > 1.05872e+07 )
							if( ema13 <= -0.002359 )
								if( ema13 <= -0.004831 )
									ret := 0.857143 // buy
								if( ema13 > -0.004831 )
									ret := 0.072727
							if( ema13 > -0.002359 )
								if( Money_Flow_Ratio <= 0.708924 )
									ret := 0.449036
								if( Money_Flow_Ratio > 0.708924 )
									ret := 0.068966
					if( Negative_Money_Flow_Sum > 1.17484e+07 )
						if( ema3 <= 0.637408 )
							if( MFI_Low <= 26.452 )
								if( Negative_Money_Flow_Sum <= 1.49171e+07 )
									ret := -0.007668
								if( Negative_Money_Flow_Sum > 1.49171e+07 )
									ret := 0.097919
							if( MFI_Low > 26.452 )
								if( Negative_Money_Flow_Sum <= 1.56258e+07 )
									ret := 0.050725
								if( Negative_Money_Flow_Sum > 1.56258e+07 )
									ret := -0.442953
						if( ema3 > 0.637408 )
							if( Positive_Money_Flow_Sum <= 9.03537e+06 )
								if( ema3 <= 0.700185 )
									ret := -0.607595
								if( ema3 > 0.700185 )
									ret := -0.157895
							if( Positive_Money_Flow_Sum > 9.03537e+06 )
								if( Positive_Money_Flow_Sum <= 1.80616e+07 )
									ret := 0.150000
								if( Positive_Money_Flow_Sum > 1.80616e+07 )
									ret := -0.833333 // sell
				if( Negative_Money_Flow > 4.66304e+06 )
					if( MFI_Low <= -1.68806 )
						if( ema2 <= 0.541195 )
							if( Negative_Money_Flow <= 5.38354e+06 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow > 5.38354e+06 )
								ret := -0.285714
						if( ema2 > 0.541195 )
							ret := 0.250000
					if( MFI_Low > -1.68806 )
						if( Negative_Money_Flow <= 5.73538e+06 )
							if( ema12 <= -0.001003 )
								if( ema1 <= 0.37479 )
									ret := 0.000000
								if( ema1 > 0.37479 )
									ret := 0.830357 // buy
							if( ema12 > -0.001003 )
								if( Raw_Money_Flow <= 5.12234e+06 )
									ret := -0.500000
								if( Raw_Money_Flow > 5.12234e+06 )
									ret := 0.600000
						if( Negative_Money_Flow > 5.73538e+06 )
							if( ema3 <= 0.572161 )
								if( Positive_Money_Flow_Sum <= 7.08192e+06 )
									ret := 0.619048
								if( Positive_Money_Flow_Sum > 7.08192e+06 )
									ret := -0.071429
							if( ema3 > 0.572161 )
								ret := 1.000000 // buy
			if( Negative_Money_Flow_Sum > 1.85646e+07 )
				if( ema3 <= 0.612995 )
					if( Raw_Money_Flow <= 5.7654e+06 )
						if( Negative_Money_Flow_Sum <= 5.36753e+07 )
							if( Negative_Money_Flow_Sum <= 5.19542e+07 )
								if( Money_Flow_Ratio <= 0.717429 )
									ret := 0.232804
								if( Money_Flow_Ratio > 0.717429 )
									ret := 0.092655
							if( Negative_Money_Flow_Sum > 5.19542e+07 )
								if( Positive_Money_Flow_Sum <= 2.65677e+07 )
									ret := -0.073171
								if( Positive_Money_Flow_Sum > 2.65677e+07 )
									ret := -0.714286 // sell
						if( Negative_Money_Flow_Sum > 5.36753e+07 )
							if( Negative_Money_Flow_Sum <= 7.58905e+07 )
								if( ema13 <= -0.003601 )
									ret := 0.479245
								if( ema13 > -0.003601 )
									ret := 0.923077 // buy
							if( Negative_Money_Flow_Sum > 7.58905e+07 )
								if( Money_Flow_Ratio <= 0.620982 )
									ret := 0.201342
								if( Money_Flow_Ratio > 0.620982 )
									ret := -0.589744
					if( Raw_Money_Flow > 5.7654e+06 )
						if( ema13 <= -0.02412 )
							if( Positive_Money_Flow_Sum <= 8.33912e+07 )
								if( Raw_Money_Flow <= 2.85113e+07 )
									ret := 0.954545 // buy
								if( Raw_Money_Flow > 2.85113e+07 )
									ret := 0.200000
							if( Positive_Money_Flow_Sum > 8.33912e+07 )
								if( Raw_Money_Flow <= 1.30849e+07 )
									ret := 0.250000
								if( Raw_Money_Flow > 1.30849e+07 )
									ret := -0.800000 // sell
						if( ema13 > -0.02412 )
							if( tema <= 0.362593 )
								if( Negative_Money_Flow_Sum <= 2.81186e+07 )
									ret := -0.142857
								if( Negative_Money_Flow_Sum > 2.81186e+07 )
									ret := 0.862069 // buy
							if( tema > 0.362593 )
								if( ema3 <= 0.568468 )
									ret := -0.120482
								if( ema3 > 0.568468 )
									ret := 0.154386
				if( ema3 > 0.612995 )
					if( ema12 <= -0.003488 )
						if( ema3 <= 0.628068 )
							if( MFI_Low <= 4.57289 )
								if( Negative_Money_Flow_Sum <= 5.65612e+07 )
									ret := 0.242424
								if( Negative_Money_Flow_Sum > 5.65612e+07 )
									ret := -0.625000
							if( MFI_Low > 4.57289 )
								if( Raw_Money_Flow <= 1.8885e+06 )
									ret := -0.777778 // sell
								if( Raw_Money_Flow > 1.8885e+06 )
									ret := 0.402597
						if( ema3 > 0.628068 )
							if( Positive_Money_Flow_Sum <= 8.20289e+07 )
								if( Positive_Money_Flow_Sum <= 6.12357e+07 )
									ret := 0.358621
								if( Positive_Money_Flow_Sum > 6.12357e+07 )
									ret := -0.148936
							if( Positive_Money_Flow_Sum > 8.20289e+07 )
								if( Positive_Money_Flow_Sum <= 1.36251e+08 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 1.36251e+08 )
									ret := 0.400000
					if( ema12 > -0.003488 )
						if( Money_Flow_Ratio <= 0.214306 )
							if( Negative_Money_Flow_Sum <= 4.85054e+07 )
								if( ema12 <= -0.002847 )
									ret := -0.615385
								if( ema12 > -0.002847 )
									ret := -0.044776
							if( Negative_Money_Flow_Sum > 4.85054e+07 )
								if( MFI_High <= -69.2826 )
									ret := -0.250000
								if( MFI_High > -69.2826 )
									ret := -0.933333 // sell
						if( Money_Flow_Ratio > 0.214306 )
							if( Negative_Money_Flow <= 3.98095e+06 )
								if( Negative_Money_Flow_Sum <= 3.66908e+07 )
									ret := -0.024851
								if( Negative_Money_Flow_Sum > 3.66908e+07 )
									ret := 0.198953
							if( Negative_Money_Flow > 3.98095e+06 )
								if( MFI <= 41.7574 )
									ret := -0.102564
								if( MFI > 41.7574 )
									ret := -0.475610
		if( Negative_Money_Flow > 7.8425e+06 )
			if( ema12 <= -0.005273 )
				if( Raw_Money_Flow <= 1.03626e+07 )
					if( Negative_Money_Flow_Sum <= 6.85479e+07 )
						if( Positive_Money_Flow_Sum <= 1.5532e+07 )
							if( MFI_High <= -71.7156 )
								ret := 0.714286 // buy
							if( MFI_High > -71.7156 )
								if( ema12 <= -0.005644 )
									ret := 1.000000 // buy
								if( ema12 > -0.005644 )
									ret := 0.857143 // buy
						if( Positive_Money_Flow_Sum > 1.5532e+07 )
							ret := 0.285714
					if( Negative_Money_Flow_Sum > 6.85479e+07 )
						if( Negative_Money_Flow_Sum <= 7.5372e+07 )
							if( ema13 <= -0.01438 )
								ret := -0.750000 // sell
							if( ema13 > -0.01438 )
								ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 7.5372e+07 )
							if( ema2 <= 0.470423 )
								if( Money_Flow_Ratio <= 0.689113 )
									ret := -0.500000
								if( Money_Flow_Ratio > 0.689113 )
									ret := -1.000000 // sell
							if( ema2 > 0.470423 )
								if( Positive_Money_Flow_Sum <= 1.52158e+07 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 1.52158e+07 )
									ret := 0.586207
				if( Raw_Money_Flow > 1.03626e+07 )
					if( Negative_Money_Flow_Sum <= 7.24946e+07 )
						if( ema13 <= -0.008717 )
							if( Negative_Money_Flow_Sum <= 6.9324e+07 )
								if( ema3 <= 0.523469 )
									ret := 0.960000 // buy
								if( ema3 > 0.523469 )
									ret := 0.617021
							if( Negative_Money_Flow_Sum > 6.9324e+07 )
								if( ema3 <= 0.566556 )
									ret := -0.833333 // sell
								if( ema3 > 0.566556 )
									ret := 0.500000
						if( ema13 > -0.008717 )
							if( MFI <= 11.9603 )
								ret := 1.000000 // buy
							if( MFI > 11.9603 )
								if( MFI <= 20.7885 )
									ret := -0.200000
								if( MFI > 20.7885 )
									ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 7.24946e+07 )
						if( tema <= 0.695837 )
							if( ema3 <= 0.531995 )
								if( Positive_Money_Flow_Sum <= 8.64603e+07 )
									ret := 0.651163
								if( Positive_Money_Flow_Sum > 8.64603e+07 )
									ret := -0.600000
							if( ema3 > 0.531995 )
								if( Money_Flow_Ratio <= 0.440537 )
									ret := 0.965278 // buy
								if( Money_Flow_Ratio > 0.440537 )
									ret := 0.684211
						if( tema > 0.695837 )
							if( MFI_Low <= 12.7542 )
								if( ema3 <= 0.736635 )
									ret := 0.500000
								if( ema3 > 0.736635 )
									ret := -1.000000 // sell
							if( MFI_Low > 12.7542 )
								ret := 0.857143 // buy
			if( ema12 > -0.005273 )
				if( Money_Flow_Ratio <= 0.154047 )
					if( ema12 <= -0.003254 )
						if( Negative_Money_Flow_Sum <= 4.42556e+07 )
							if( ema12 <= -0.004537 )
								ret := 0.857143 // buy
							if( ema12 > -0.004537 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 4.42556e+07 )
							if( Negative_Money_Flow_Sum <= 4.90972e+07 )
								ret := 0.000000
							if( Negative_Money_Flow_Sum > 4.90972e+07 )
								if( ema13 <= -0.006918 )
									ret := 0.900000 // buy
								if( ema13 > -0.006918 )
									ret := 0.333333
					if( ema12 > -0.003254 )
						if( ema2 <= 0.485256 )
							if( Positive_Money_Flow_Sum <= 3.53128e+06 )
								ret := 0.333333
							if( Positive_Money_Flow_Sum > 3.53128e+06 )
								ret := 1.000000 // buy
						if( ema2 > 0.485256 )
							if( Money_Flow_Ratio <= 0.107873 )
								ret := -0.500000
							if( Money_Flow_Ratio > 0.107873 )
								ret := 0.000000
				if( Money_Flow_Ratio > 0.154047 )
					if( MFI_High <= -51.1992 )
						if( Negative_Money_Flow_Sum <= 1.03715e+08 )
							if( Raw_Money_Flow <= 1.28555e+07 )
								if( Raw_Money_Flow <= 1.0033e+07 )
									ret := 0.306931
								if( Raw_Money_Flow > 1.0033e+07 )
									ret := -0.455357
							if( Raw_Money_Flow > 1.28555e+07 )
								if( MFI <= 23.957 )
									ret := 0.594937
								if( MFI > 23.957 )
									ret := -0.040000
						if( Negative_Money_Flow_Sum > 1.03715e+08 )
							if( Raw_Money_Flow <= 1.05575e+07 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 1.05575e+07 )
								ret := 0.666667
					if( MFI_High > -51.1992 )
						if( Positive_Money_Flow_Sum <= 5.37025e+07 )
							if( Negative_Money_Flow <= 1.98907e+07 )
								if( MFI <= 41.1214 )
									ret := 0.671362
								if( MFI > 41.1214 )
									ret := 0.169811
							if( Negative_Money_Flow > 1.98907e+07 )
								if( ema2 <= 0.620342 )
									ret := -1.000000 // sell
								if( ema2 > 0.620342 )
									ret := 0.000000
						if( Positive_Money_Flow_Sum > 5.37025e+07 )
							if( ema12 <= -0.001568 )
								if( Negative_Money_Flow_Sum <= 1.30897e+08 )
									ret := -0.351852
								if( Negative_Money_Flow_Sum > 1.30897e+08 )
									ret := 1.000000 // buy
							if( ema12 > -0.001568 )
								if( MFI_Low <= 30.1497 )
									ret := 0.500000
								if( MFI_Low > 30.1497 )
									ret := 1.000000 // buy
	if( ema12 > -0.000935 )
		if( ema12 <= 0.002342 )
			if( Negative_Money_Flow_Sum <= 7.79138e+07 )
				if( Positive_Money_Flow_Sum <= 1.17413e+07 )
					if( tema <= 0.375784 )
						if( Negative_Money_Flow <= 1.20613e+06 )
							if( Positive_Money_Flow_Sum <= 8.43747e+06 )
								if( Negative_Money_Flow_Sum <= 9.67577e+06 )
									ret := 0.034483
								if( Negative_Money_Flow_Sum > 9.67577e+06 )
									ret := -0.124476
							if( Positive_Money_Flow_Sum > 8.43747e+06 )
								if( Raw_Money_Flow <= 720483 )
									ret := 0.307692
								if( Raw_Money_Flow > 720483 )
									ret := 0.074579
						if( Negative_Money_Flow > 1.20613e+06 )
							if( ema13 <= 0.000546 )
								if( ema12 <= -0.000205 )
									ret := 0.176692
								if( ema12 > -0.000205 )
									ret := 0.417062
							if( ema13 > 0.000546 )
								if( ema3 <= 0.348213 )
									ret := 0.221053
								if( ema3 > 0.348213 )
									ret := -0.236364
					if( tema > 0.375784 )
						if( Negative_Money_Flow_Sum <= 9.85915e+06 )
							if( Positive_Money_Flow_Sum <= 1.11931e+07 )
								if( ema13 <= -0.001547 )
									ret := -0.161954
								if( ema13 > -0.001547 )
									ret := -0.015158
							if( Positive_Money_Flow_Sum > 1.11931e+07 )
								if( MFI_Low <= 40.7879 )
									ret := -0.275758
								if( MFI_Low > 40.7879 )
									ret := -0.050314
						if( Negative_Money_Flow_Sum > 9.85915e+06 )
							if( Typical_Price <= 0.525601 )
								if( Negative_Money_Flow <= 3.06708e+06 )
									ret := 0.054554
								if( Negative_Money_Flow > 3.06708e+06 )
									ret := 0.278638
							if( Typical_Price > 0.525601 )
								if( Raw_Money_Flow <= 1.00097e+06 )
									ret := 0.053274
								if( Raw_Money_Flow > 1.00097e+06 )
									ret := -0.105828
				if( Positive_Money_Flow_Sum > 1.17413e+07 )
					if( tema <= 0.505828 )
						if( ema13 <= 0.003822 )
							if( Positive_Money_Flow <= 1.14779e+06 )
								if( Money_Flow_Ratio <= 0.95718 )
									ret := 0.284211
								if( Money_Flow_Ratio > 0.95718 )
									ret := 0.147022
							if( Positive_Money_Flow > 1.14779e+06 )
								if( ema12 <= -5.6e-05 )
									ret := 0.214634
								if( ema12 > -5.6e-05 )
									ret := 0.063294
						if( ema13 > 0.003822 )
							if( Positive_Money_Flow_Sum <= 3.506e+07 )
								if( Positive_Money_Flow_Sum <= 2.93592e+07 )
									ret := -0.063084
								if( Positive_Money_Flow_Sum > 2.93592e+07 )
									ret := 0.343137
							if( Positive_Money_Flow_Sum > 3.506e+07 )
								if( Negative_Money_Flow_Sum <= 2.37819e+07 )
									ret := -0.634921
								if( Negative_Money_Flow_Sum > 2.37819e+07 )
									ret := -0.102941
					if( tema > 0.505828 )
						if( Negative_Money_Flow <= 7.59949e+06 )
							if( MFI <= 40.0299 )
								if( ema13 <= 0.003034 )
									ret := 0.179357
								if( ema13 > 0.003034 )
									ret := -0.684211
							if( MFI > 40.0299 )
								if( Negative_Money_Flow_Sum <= 6.11076e+07 )
									ret := 0.018839
								if( Negative_Money_Flow_Sum > 6.11076e+07 )
									ret := -0.473684
						if( Negative_Money_Flow > 7.59949e+06 )
							if( ema3 <= 0.763953 )
								if( ema3 <= 0.553264 )
									ret := 0.789474 // buy
								if( ema3 > 0.553264 )
									ret := 0.352941
							if( ema3 > 0.763953 )
								ret := -1.000000 // sell
			if( Negative_Money_Flow_Sum > 7.79138e+07 )
				if( Negative_Money_Flow_Sum <= 1.28434e+08 )
					if( ema12 <= 0.000289 )
						if( Typical_Price <= 0.696049 )
							if( ema1 <= 0.649694 )
								if( Raw_Money_Flow <= 1.58165e+07 )
									ret := -0.739130 // sell
								if( Raw_Money_Flow > 1.58165e+07 )
									ret := 0.000000
							if( ema1 > 0.649694 )
								if( MFI <= 38.5007 )
									ret := -0.166667
								if( MFI > 38.5007 )
									ret := 0.700000 // buy
						if( Typical_Price > 0.696049 )
							ret := -1.000000 // sell
					if( ema12 > 0.000289 )
						if( Typical_Price <= 0.663533 )
							if( ema2 <= 0.596982 )
								ret := -1.000000 // sell
							if( ema2 > 0.596982 )
								if( Negative_Money_Flow_Sum <= 1.0531e+08 )
									ret := -0.833333 // sell
								if( Negative_Money_Flow_Sum > 1.0531e+08 )
									ret := 0.000000
						if( Typical_Price > 0.663533 )
							ret := -1.000000 // sell
				if( Negative_Money_Flow_Sum > 1.28434e+08 )
					if( ema12 <= 0.001078 )
						if( ema1 <= 0.724803 )
							ret := 0.000000
						if( ema1 > 0.724803 )
							ret := 1.000000 // buy
					if( ema12 > 0.001078 )
						ret := -0.750000 // sell
		if( ema12 > 0.002342 )
			if( ema3 <= 0.45602 )
				if( ema13 <= 0.01087 )
					if( MFI <= 74.1683 )
						if( MFI_Low <= 50.7555 )
							if( ema13 <= 0.009745 )
								if( Typical_Price <= 0.350682 )
									ret := 0.326531
								if( Typical_Price > 0.350682 )
									ret := -0.068702
							if( ema13 > 0.009745 )
								if( ema13 <= 0.010707 )
									ret := -1.000000 // sell
								if( ema13 > 0.010707 )
									ret := -0.250000
						if( MFI_Low > 50.7555 )
							if( ema2 <= 0.33955 )
								if( MFI <= 71.5963 )
									ret := -0.250000
								if( MFI > 71.5963 )
									ret := -0.900000 // sell
							if( ema2 > 0.33955 )
								if( Positive_Money_Flow_Sum <= 1.40612e+07 )
									ret := -0.777778 // sell
								if( Positive_Money_Flow_Sum > 1.40612e+07 )
									ret := 0.405660
					if( MFI > 74.1683 )
						if( Negative_Money_Flow <= 1.47081e+06 )
							if( Negative_Money_Flow <= 932758 )
								if( Positive_Money_Flow_Sum <= 5.02677e+07 )
									ret := -0.070261
								if( Positive_Money_Flow_Sum > 5.02677e+07 )
									ret := -0.727273 // sell
							if( Negative_Money_Flow > 932758 )
								if( Raw_Money_Flow <= 1.25187e+06 )
									ret := 0.733333 // buy
								if( Raw_Money_Flow > 1.25187e+06 )
									ret := -0.038462
						if( Negative_Money_Flow > 1.47081e+06 )
							if( Money_Flow_Ratio <= 5.60405 )
								if( ema13 <= 0.004979 )
									ret := 0.000000
								if( ema13 > 0.004979 )
									ret := -0.699115
							if( Money_Flow_Ratio > 5.60405 )
								if( Positive_Money_Flow_Sum <= 2.62533e+07 )
									ret := -0.857143 // sell
								if( Positive_Money_Flow_Sum > 2.62533e+07 )
									ret := 0.478261
				if( ema13 > 0.01087 )
					if( Typical_Price <= 0.485224 )
						if( Positive_Money_Flow_Sum <= 1.18717e+08 )
							if( Positive_Money_Flow_Sum <= 1.11022e+08 )
								if( Negative_Money_Flow_Sum <= 9.92435e+06 )
									ret := -0.096774
								if( Negative_Money_Flow_Sum > 9.92435e+06 )
									ret := 0.493243
							if( Positive_Money_Flow_Sum > 1.11022e+08 )
								if( Negative_Money_Flow_Sum <= 3.41318e+07 )
									ret := -0.500000
								if( Negative_Money_Flow_Sum > 3.41318e+07 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 1.18717e+08 )
							if( ema13 <= 0.020577 )
								if( ema13 <= 0.019357 )
									ret := 1.000000 // buy
								if( ema13 > 0.019357 )
									ret := 0.666667
							if( ema13 > 0.020577 )
								ret := -0.200000
					if( Typical_Price > 0.485224 )
						if( Money_Flow_Ratio <= 15.7752 )
							ret := -1.000000 // sell
						if( Money_Flow_Ratio > 15.7752 )
							ret := 0.000000
			if( ema3 > 0.45602 )
				if( ema12 <= 0.028241 )
					if( Raw_Money_Flow <= 2.6559e+07 )
						if( ema2 <= 0.740308 )
							if( ema13 <= 0.012018 )
								if( Negative_Money_Flow_Sum <= 4.02259e+07 )
									ret := -0.074979
								if( Negative_Money_Flow_Sum > 4.02259e+07 )
									ret := -0.421320
							if( ema13 > 0.012018 )
								if( ema2 <= 0.508455 )
									ret := 0.000000
								if( ema2 > 0.508455 )
									ret := -0.478510
						if( ema2 > 0.740308 )
							if( tema <= 0.789369 )
								if( Positive_Money_Flow_Sum <= 1.11014e+08 )
									ret := 0.159420
								if( Positive_Money_Flow_Sum > 1.11014e+08 )
									ret := 0.950000 // buy
							if( tema > 0.789369 )
								if( ema13 <= 0.006339 )
									ret := 0.705882 // buy
								if( ema13 > 0.006339 )
									ret := -0.281250
					if( Raw_Money_Flow > 2.6559e+07 )
						if( Positive_Money_Flow_Sum <= 5.75545e+07 )
							if( ema12 <= 0.005319 )
								ret := 1.000000 // buy
							if( ema12 > 0.005319 )
								ret := -0.500000
						if( Positive_Money_Flow_Sum > 5.75545e+07 )
							if( ema12 <= 0.018447 )
								if( Positive_Money_Flow_Sum <= 2.18697e+08 )
									ret := -0.886076 // sell
								if( Positive_Money_Flow_Sum > 2.18697e+08 )
									ret := 0.000000
							if( ema12 > 0.018447 )
								if( Positive_Money_Flow_Sum <= 3.7337e+08 )
									ret := 0.250000
								if( Positive_Money_Flow_Sum > 3.7337e+08 )
									ret := -1.000000 // sell
				if( ema12 > 0.028241 )
					if( ema2 <= 0.677726 )
						if( ema3 <= 0.639268 )
							if( Positive_Money_Flow <= 1.03555e+08 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow > 1.03555e+08 )
								if( Money_Flow_Ratio <= 7.35324 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 7.35324 )
									ret := 0.000000
						if( ema3 > 0.639268 )
							ret := 0.000000
					if( ema2 > 0.677726 )
						if( Raw_Money_Flow <= 3.48067e+07 )
							ret := -0.750000 // sell
						if( Raw_Money_Flow > 3.48067e+07 )
							ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_XRPUSDT_15Min_c61e6c20(Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum, ema2, tema, ema12, ema3, ema1, ema13)

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


