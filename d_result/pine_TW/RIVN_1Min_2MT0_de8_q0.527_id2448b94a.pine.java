//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: RIVN_1Min_2MT0_2448b94a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RIVN_1Min_2MT0_2448b94a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RIVN_1Min_2448b94a(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Negative_Money_Flow <= 312.759 )
		if( Positive_Money_Flow <= 54312.1 )
			if( ema13 <= 0.014646 )
				if( ema12 <= -0.010416 )
					if( Money_Flow_Ratio <= 0.128978 )
						if( Negative_Money_Flow_Sum <= 1.31969e+06 )
							if( ema12 <= -0.023749 )
								if( Positive_Money_Flow_Sum <= 9392.5 )
									ret := 0.800000 // buy
								if( Positive_Money_Flow_Sum > 9392.5 )
									ret := 0.217391
							if( ema12 > -0.023749 )
								if( ema13 <= -0.041478 )
									ret := -0.782609 // sell
								if( ema13 > -0.041478 )
									ret := -0.168539
						if( Negative_Money_Flow_Sum > 1.31969e+06 )
							if( Negative_Money_Flow_Sum <= 3.53823e+06 )
								if( ema2 <= 13.6189 )
									ret := -1.000000 // sell
								if( ema2 > 13.6189 )
									ret := -0.333333
							if( Negative_Money_Flow_Sum > 3.53823e+06 )
								if( tema <= 11.5531 )
									ret := 0.466667
								if( tema > 11.5531 )
									ret := -0.100000
					if( Money_Flow_Ratio > 0.128978 )
						if( Positive_Money_Flow_Sum <= 49847.4 )
							if( Negative_Money_Flow_Sum <= 67715.7 )
								if( Negative_Money_Flow_Sum <= 44703.9 )
									ret := -0.666667
								if( Negative_Money_Flow_Sum > 44703.9 )
									ret := 0.031250
							if( Negative_Money_Flow_Sum > 67715.7 )
								if( Typical_Price <= 12.8386 )
									ret := 0.679245
								if( Typical_Price > 12.8386 )
									ret := 0.135802
						if( Positive_Money_Flow_Sum > 49847.4 )
							if( ema1 <= 10.9035 )
								if( ema1 <= 8.93465 )
									ret := -0.065217
								if( ema1 > 8.93465 )
									ret := 0.259786
							if( ema1 > 10.9035 )
								if( ema12 <= -0.065355 )
									ret := 0.769231 // buy
								if( ema12 > -0.065355 )
									ret := -0.020000
				if( ema12 > -0.010416 )
					if( Money_Flow_Ratio <= 0.373644 )
						if( Negative_Money_Flow_Sum <= 114381 )
							if( Positive_Money_Flow <= 14085.9 )
								if( Money_Flow_Ratio <= 0.10069 )
									ret := -0.514286
								if( Money_Flow_Ratio > 0.10069 )
									ret := -0.026975
							if( Positive_Money_Flow > 14085.9 )
								ret := 0.782609 // buy
						if( Negative_Money_Flow_Sum > 114381 )
							if( ema1 <= 16.2061 )
								if( Money_Flow_Ratio <= 0.116058 )
									ret := -0.098299
								if( Money_Flow_Ratio > 0.116058 )
									ret := -0.264106
							if( ema1 > 16.2061 )
								if( MFI_High <= -78.2866 )
									ret := 1.000000 // buy
								if( MFI_High > -78.2866 )
									ret := -0.031250
					if( Money_Flow_Ratio > 0.373644 )
						if( MFI_High <= -52.758 )
							ret := 0.923077 // buy
						if( MFI_High > -52.758 )
							if( Typical_Price <= 15.005 )
								if( Positive_Money_Flow <= 106.421 )
									ret := 0.018433
								if( Positive_Money_Flow > 106.421 )
									ret := -0.126178
							if( Typical_Price > 15.005 )
								if( tema <= 15.4846 )
									ret := -0.456954
								if( tema > 15.4846 )
									ret := -0.136364
			if( ema13 > 0.014646 )
				if( ema12 <= 0.017811 )
					if( ema1 <= 13.234 )
						if( Positive_Money_Flow <= 261.642 )
							if( ema3 <= 10.528 )
								if( ema13 <= 0.027281 )
									ret := -0.038462
								if( ema13 > 0.027281 )
									ret := 0.571429
							if( ema3 > 10.528 )
								if( Raw_Money_Flow <= 53004.7 )
									ret := -0.514925
								if( Raw_Money_Flow > 53004.7 )
									ret := -0.056604
						if( Positive_Money_Flow > 261.642 )
							if( ema2 <= 10.5361 )
								if( MFI <= 89.0894 )
									ret := -0.233766
								if( MFI > 89.0894 )
									ret := -0.744186 // sell
							if( ema2 > 10.5361 )
								if( ema13 <= 0.033887 )
									ret := -0.526022
								if( ema13 > 0.033887 )
									ret := 0.095238
					if( ema1 > 13.234 )
						if( MFI_High <= -70.1887 )
							if( ema2 <= 16.3941 )
								ret := 0.583333
							if( ema2 > 16.3941 )
								ret := 0.818182 // buy
						if( MFI_High > -70.1887 )
							if( Positive_Money_Flow <= 14898.6 )
								if( MFI_High <= -45.677 )
									ret := 0.161765
								if( MFI_High > -45.677 )
									ret := -0.201493
							if( Positive_Money_Flow > 14898.6 )
								if( Typical_Price <= 16.9177 )
									ret := 0.084416
								if( Typical_Price > 16.9177 )
									ret := 0.527778
				if( ema12 > 0.017811 )
					if( ema3 <= 14.3258 )
						if( MFI_Low <= 43.9186 )
							if( Positive_Money_Flow <= 2084.72 )
								if( MFI_High <= -20.6522 )
									ret := -0.068966
								if( MFI_High > -20.6522 )
									ret := -0.600000
							if( Positive_Money_Flow > 2084.72 )
								if( Raw_Money_Flow <= 7757.42 )
									ret := -0.551724
								if( Raw_Money_Flow > 7757.42 )
									ret := -0.838710 // sell
						if( MFI_Low > 43.9186 )
							if( ema12 <= 0.057867 )
								if( MFI_High <= 14.5369 )
									ret := -0.450472
								if( MFI_High > 14.5369 )
									ret := -0.866667 // sell
							if( ema12 > 0.057867 )
								ret := 0.411765
					if( ema3 > 14.3258 )
						if( ema12 <= 0.035317 )
							if( tema <= 17.4625 )
								if( ema2 <= 15.8453 )
									ret := 0.054054
								if( ema2 > 15.8453 )
									ret := -0.348148
							if( tema > 17.4625 )
								if( tema <= 17.7878 )
									ret := 0.400000
								if( tema > 17.7878 )
									ret := 0.857143 // buy
						if( ema12 > 0.035317 )
							if( ema12 <= 0.038941 )
								if( ema12 <= 0.03634 )
									ret := -0.700000 // sell
								if( ema12 > 0.03634 )
									ret := -1.000000 // sell
							if( ema12 > 0.038941 )
								if( MFI <= 59.8401 )
									ret := 0.200000
								if( MFI > 59.8401 )
									ret := -0.513514
		if( Positive_Money_Flow > 54312.1 )
			if( ema12 <= 0.128374 )
				if( Positive_Money_Flow_Sum <= 4.58259e+07 )
					if( ema3 <= 11.7342 )
						if( Positive_Money_Flow_Sum <= 9.34691e+06 )
							if( Positive_Money_Flow_Sum <= 2.75293e+06 )
								if( ema12 <= -0.025315 )
									ret := -0.525000
								if( ema12 > -0.025315 )
									ret := -0.021162
							if( Positive_Money_Flow_Sum > 2.75293e+06 )
								if( tema <= 11.7672 )
									ret := 0.087772
								if( tema > 11.7672 )
									ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 9.34691e+06 )
							if( tema <= 10.2681 )
								if( MFI_High <= -16.1109 )
									ret := 0.205279
								if( MFI_High > -16.1109 )
									ret := -0.112903
							if( tema > 10.2681 )
								if( Positive_Money_Flow_Sum <= 1.02655e+07 )
									ret := -0.389262
								if( Positive_Money_Flow_Sum > 1.02655e+07 )
									ret := -0.106455
					if( ema3 > 11.7342 )
						if( ema3 <= 15.2261 )
							if( Money_Flow_Ratio <= 1.84295 )
								if( ema13 <= 0.091808 )
									ret := -0.002907
								if( ema13 > 0.091808 )
									ret := 0.630631
							if( Money_Flow_Ratio > 1.84295 )
								if( Negative_Money_Flow_Sum <= 563918 )
									ret := -0.252662
								if( Negative_Money_Flow_Sum > 563918 )
									ret := -0.064969
						if( ema3 > 15.2261 )
							if( MFI_Low <= 56.3178 )
								if( MFI_Low <= 39.0878 )
									ret := -0.102284
								if( MFI_Low > 39.0878 )
									ret := 0.113024
							if( MFI_Low > 56.3178 )
								if( Negative_Money_Flow_Sum <= 420804 )
									ret := 0.059091
								if( Negative_Money_Flow_Sum > 420804 )
									ret := -0.390382
				if( Positive_Money_Flow_Sum > 4.58259e+07 )
					if( ema12 <= 0.074929 )
						if( Positive_Money_Flow <= 1.08068e+07 )
							if( Negative_Money_Flow_Sum <= 6.77755e+07 )
								if( Typical_Price <= 12.8662 )
									ret := -0.225000
								if( Typical_Price > 12.8662 )
									ret := 0.667421
							if( Negative_Money_Flow_Sum > 6.77755e+07 )
								if( ema2 <= 15.1448 )
									ret := 0.200000
								if( ema2 > 15.1448 )
									ret := -0.909091 // sell
						if( Positive_Money_Flow > 1.08068e+07 )
							if( Money_Flow_Ratio <= 2.51745 )
								if( Raw_Money_Flow <= 1.88259e+07 )
									ret := -0.862745 // sell
								if( Raw_Money_Flow > 1.88259e+07 )
									ret := 0.235294
							if( Money_Flow_Ratio > 2.51745 )
								if( ema1 <= 14.7665 )
									ret := 0.222222
								if( ema1 > 14.7665 )
									ret := 0.875000 // buy
					if( ema12 > 0.074929 )
						if( MFI_Low <= 76.2046 )
							if( ema13 <= 0.213866 )
								if( Negative_Money_Flow_Sum <= 3.72577e+07 )
									ret := -0.460606
								if( Negative_Money_Flow_Sum > 3.72577e+07 )
									ret := 0.600000
							if( ema13 > 0.213866 )
								if( Positive_Money_Flow_Sum <= 5.49238e+07 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 5.49238e+07 )
									ret := -0.166667
						if( MFI_Low > 76.2046 )
							ret := 1.000000 // buy
			if( ema12 > 0.128374 )
				if( Positive_Money_Flow_Sum <= 9.09186e+07 )
					if( ema3 <= 15.6376 )
						if( Positive_Money_Flow_Sum <= 3.02343e+07 )
							ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 3.02343e+07 )
							if( ema2 <= 13.6682 )
								if( Negative_Money_Flow_Sum <= 1.29017e+07 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 1.29017e+07 )
									ret := 0.913043 // buy
							if( ema2 > 13.6682 )
								if( ema3 <= 15.2351 )
									ret := 0.540984
								if( ema3 > 15.2351 )
									ret := -0.181818
					if( ema3 > 15.6376 )
						if( ema3 <= 17.4591 )
							if( Negative_Money_Flow_Sum <= 7.83954e+06 )
								ret := 0.833333 // buy
							if( Negative_Money_Flow_Sum > 7.83954e+06 )
								ret := 1.000000 // buy
						if( ema3 > 17.4591 )
							ret := 0.631579
				if( Positive_Money_Flow_Sum > 9.09186e+07 )
					if( tema <= 16.129 )
						ret := 0.000000
					if( tema > 16.129 )
						if( MFI <= 89.2066 )
							ret := -1.000000 // sell
						if( MFI > 89.2066 )
							ret := -0.700000 // sell
	if( Negative_Money_Flow > 312.759 )
		if( Negative_Money_Flow <= 18946.1 )
			if( MFI_High <= -4.90619 )
				if( Negative_Money_Flow_Sum <= 186337 )
					if( MFI_Low <= 54.1716 )
						if( Positive_Money_Flow <= 3542.97 )
							if( MFI_Low <= 45.691 )
								if( MFI_Low <= 41.4661 )
									ret := 0.216792
								if( MFI_Low > 41.4661 )
									ret := 0.437387
							if( MFI_Low > 45.691 )
								if( ema13 <= 0.011218 )
									ret := 0.221003
								if( ema13 > 0.011218 )
									ret := -0.146429
						if( Positive_Money_Flow > 3542.97 )
							if( tema <= 13.7453 )
								if( ema12 <= -0.005474 )
									ret := 0.500000
								if( ema12 > -0.005474 )
									ret := -0.781818 // sell
							if( tema > 13.7453 )
								if( tema <= 14.2187 )
									ret := 1.000000 // buy
								if( tema > 14.2187 )
									ret := -0.058824
					if( MFI_Low > 54.1716 )
						if( Negative_Money_Flow_Sum <= 45352.5 )
							if( Typical_Price <= 10.855 )
								ret := 0.700000 // buy
							if( Typical_Price > 10.855 )
								ret := 0.384615
						if( Negative_Money_Flow_Sum > 45352.5 )
							if( ema13 <= 0.004139 )
								if( Typical_Price <= 11.6075 )
									ret := 0.000000
								if( Typical_Price > 11.6075 )
									ret := 0.760000 // buy
							if( ema13 > 0.004139 )
								if( Money_Flow_Ratio <= 2.95716 )
									ret := 0.782609 // buy
								if( Money_Flow_Ratio > 2.95716 )
									ret := 1.000000 // buy
				if( Negative_Money_Flow_Sum > 186337 )
					if( Money_Flow_Ratio <= 0.453314 )
						if( Typical_Price <= 13.4133 )
							if( Money_Flow_Ratio <= 0.246182 )
								if( Typical_Price <= 12.3278 )
									ret := 0.126382
								if( Typical_Price > 12.3278 )
									ret := 0.438053
							if( Money_Flow_Ratio > 0.246182 )
								if( Raw_Money_Flow <= 18752 )
									ret := 0.526027
								if( Raw_Money_Flow > 18752 )
									ret := -0.081967
						if( Typical_Price > 13.4133 )
							if( ema12 <= 0.011501 )
								if( ema13 <= -0.07464 )
									ret := 0.535211
								if( ema13 > -0.07464 )
									ret := -0.013120
							if( ema12 > 0.011501 )
								if( Money_Flow_Ratio <= 0.255801 )
									ret := -0.937500 // sell
								if( Money_Flow_Ratio > 0.255801 )
									ret := -0.294118
					if( Money_Flow_Ratio > 0.453314 )
						if( Typical_Price <= 12.4324 )
							if( tema <= 12.222 )
								if( Raw_Money_Flow <= 7215.8 )
									ret := 0.082524
								if( Raw_Money_Flow > 7215.8 )
									ret := -0.146868
							if( tema > 12.222 )
								if( Negative_Money_Flow <= 9918.12 )
									ret := -0.600000
								if( Negative_Money_Flow > 9918.12 )
									ret := -1.000000 // sell
						if( Typical_Price > 12.4324 )
							if( Money_Flow_Ratio <= 0.464046 )
								ret := -0.812500 // sell
							if( Money_Flow_Ratio > 0.464046 )
								if( ema13 <= 6.8e-05 )
									ret := 0.244485
								if( ema13 > 6.8e-05 )
									ret := -0.085954
			if( MFI_High > -4.90619 )
				if( Positive_Money_Flow_Sum <= 59336.1 )
					if( Negative_Money_Flow <= 1805.47 )
						if( ema13 <= 0.01158 )
							ret := -0.666667
						if( ema13 > 0.01158 )
							ret := -1.000000 // sell
					if( Negative_Money_Flow > 1805.47 )
						if( ema1 <= 10.9568 )
							ret := 0.000000
						if( ema1 > 10.9568 )
							ret := -0.125000
				if( Positive_Money_Flow_Sum > 59336.1 )
					if( ema12 <= 0.006662 )
						if( Positive_Money_Flow_Sum <= 153448 )
							if( Typical_Price <= 13.3151 )
								if( MFI_High <= 7.84129 )
									ret := 0.670330
								if( MFI_High > 7.84129 )
									ret := 0.153846
							if( Typical_Price > 13.3151 )
								if( ema12 <= -0.002286 )
									ret := 0.000000
								if( ema12 > -0.002286 )
									ret := 0.250000
						if( Positive_Money_Flow_Sum > 153448 )
							if( ema1 <= 12.4825 )
								if( Positive_Money_Flow <= 5667.25 )
									ret := 0.122538
								if( Positive_Money_Flow > 5667.25 )
									ret := 0.787234 // buy
							if( ema1 > 12.4825 )
								if( Positive_Money_Flow_Sum <= 3.14133e+06 )
									ret := -0.070896
								if( Positive_Money_Flow_Sum > 3.14133e+06 )
									ret := 0.750000 // buy
					if( ema12 > 0.006662 )
						if( tema <= 13.7481 )
							if( ema12 <= 0.010653 )
								if( MFI <= 89.4659 )
									ret := 0.214286
								if( MFI > 89.4659 )
									ret := -0.523810
							if( ema12 > 0.010653 )
								if( MFI_High <= 8.5943 )
									ret := -0.262295
								if( MFI_High > 8.5943 )
									ret := -0.580952
						if( tema > 13.7481 )
							if( MFI_Low <= 58.1714 )
								if( ema13 <= 0.032195 )
									ret := -0.744681 // sell
								if( ema13 > 0.032195 )
									ret := 0.157895
							if( MFI_Low > 58.1714 )
								if( ema12 <= 0.029932 )
									ret := 0.442308
								if( ema12 > 0.029932 )
									ret := -0.473684
		if( Negative_Money_Flow > 18946.1 )
			if( Positive_Money_Flow_Sum <= 1.955e+06 )
				if( Negative_Money_Flow <= 1.61438e+06 )
					if( ema13 <= -0.015495 )
						if( Positive_Money_Flow <= 51581.7 )
							if( Negative_Money_Flow_Sum <= 3.64585e+06 )
								if( MFI <= 72.3875 )
									ret := 0.223469
								if( MFI > 72.3875 )
									ret := 0.629032
							if( Negative_Money_Flow_Sum > 3.64585e+06 )
								if( ema13 <= -0.096007 )
									ret := 0.787500 // buy
								if( ema13 > -0.096007 )
									ret := 0.072329
						if( Positive_Money_Flow > 51581.7 )
							if( Negative_Money_Flow <= 74384.9 )
								if( Raw_Money_Flow <= 154979 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 154979 )
									ret := -0.428571
							if( Negative_Money_Flow > 74384.9 )
								if( Typical_Price <= 12.0779 )
									ret := 0.538462
								if( Typical_Price > 12.0779 )
									ret := -0.750000 // sell
					if( ema13 > -0.015495 )
						if( ema3 <= 10.4251 )
							if( ema3 <= 10.1816 )
								if( ema13 <= 0.024327 )
									ret := 0.100075
								if( ema13 > 0.024327 )
									ret := -0.406250
							if( ema3 > 10.1816 )
								if( MFI_Low <= 29.2205 )
									ret := 0.241197
								if( MFI_Low > 29.2205 )
									ret := -0.029197
						if( ema3 > 10.4251 )
							if( ema12 <= -0.012862 )
								if( ema1 <= 14.5789 )
									ret := 0.860465 // buy
								if( ema1 > 14.5789 )
									ret := 0.230769
							if( ema12 > -0.012862 )
								if( ema12 <= 0.045114 )
									ret := 0.008795
								if( ema12 > 0.045114 )
									ret := -0.414634
				if( Negative_Money_Flow > 1.61438e+06 )
					if( ema12 <= -0.037126 )
						if( tema <= 13.7447 )
							if( ema13 <= -0.083786 )
								if( Negative_Money_Flow_Sum <= 2.3427e+07 )
									ret := -0.716418 // sell
								if( Negative_Money_Flow_Sum > 2.3427e+07 )
									ret := -0.033333
							if( ema13 > -0.083786 )
								if( MFI <= 5.40785 )
									ret := -0.166667
								if( MFI > 5.40785 )
									ret := 0.447368
						if( tema > 13.7447 )
							if( Positive_Money_Flow_Sum <= 636411 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 636411 )
								if( ema12 <= -0.047606 )
									ret := 0.275000
								if( ema12 > -0.047606 )
									ret := 0.947368 // buy
					if( ema12 > -0.037126 )
						if( Negative_Money_Flow_Sum <= 4.32716e+06 )
							if( ema1 <= 11.7854 )
								ret := -0.444444
							if( ema1 > 11.7854 )
								if( MFI_Low <= -15.4558 )
									ret := 1.000000 // buy
								if( MFI_Low > -15.4558 )
									ret := 0.375000
						if( Negative_Money_Flow_Sum > 4.32716e+06 )
							if( ema13 <= -0.058177 )
								if( tema <= 13.1951 )
									ret := -0.250000
								if( tema > 13.1951 )
									ret := 0.909091 // buy
							if( ema13 > -0.058177 )
								if( Positive_Money_Flow_Sum <= 337710 )
									ret := -0.757895 // sell
								if( Positive_Money_Flow_Sum > 337710 )
									ret := -0.368132
			if( Positive_Money_Flow_Sum > 1.955e+06 )
				if( ema13 <= -0.030472 )
					if( MFI <= 21.5488 )
						if( ema12 <= -0.038852 )
							if( Money_Flow_Ratio <= 0.062212 )
								if( Negative_Money_Flow <= 9.09344e+06 )
									ret := 0.965517 // buy
								if( Negative_Money_Flow > 9.09344e+06 )
									ret := 0.000000
							if( Money_Flow_Ratio > 0.062212 )
								if( ema2 <= 14.6316 )
									ret := -0.231675
								if( ema2 > 14.6316 )
									ret := 0.088415
						if( ema12 > -0.038852 )
							if( Typical_Price <= 12.0054 )
								if( ema12 <= -0.030436 )
									ret := -0.055556
								if( ema12 > -0.030436 )
									ret := 0.520231
							if( Typical_Price > 12.0054 )
								if( ema12 <= -0.028792 )
									ret := 0.240000
								if( ema12 > -0.028792 )
									ret := -0.245283
					if( MFI > 21.5488 )
						if( MFI_High <= -34.5599 )
							if( ema1 <= 9.82176 )
								if( Negative_Money_Flow <= 1.13016e+06 )
									ret := -0.417722
								if( Negative_Money_Flow > 1.13016e+06 )
									ret := 0.318182
							if( ema1 > 9.82176 )
								if( ema1 <= 11.8384 )
									ret := 0.274002
								if( ema1 > 11.8384 )
									ret := 0.095890
						if( MFI_High > -34.5599 )
							if( ema12 <= -0.007191 )
								if( Money_Flow_Ratio <= 0.895905 )
									ret := -0.412791
								if( Money_Flow_Ratio > 0.895905 )
									ret := -0.006803
							if( ema12 > -0.007191 )
								ret := 0.923077 // buy
				if( ema13 > -0.030472 )
					if( Typical_Price <= 10.0824 )
						if( Positive_Money_Flow <= 8792.63 )
							if( ema12 <= 0.037947 )
								if( ema2 <= 10.0821 )
									ret := 0.090361
								if( ema2 > 10.0821 )
									ret := -0.324675
							if( ema12 > 0.037947 )
								if( MFI_High <= -0.017659 )
									ret := 0.709677 // buy
								if( MFI_High > -0.017659 )
									ret := 0.153846
						if( Positive_Money_Flow > 8792.63 )
							if( Typical_Price <= 9.27261 )
								ret := 0.285714
							if( Typical_Price > 9.27261 )
								ret := 1.000000 // buy
					if( Typical_Price > 10.0824 )
						if( Positive_Money_Flow <= 8.44157 )
							if( MFI_High <= -20.6003 )
								if( ema2 <= 13.285 )
									ret := -0.090042
								if( ema2 > 13.285 )
									ret := -0.014172
							if( MFI_High > -20.6003 )
								if( MFI_High <= -1.11531 )
									ret := 0.053333
								if( MFI_High > -1.11531 )
									ret := -0.112865
						if( Positive_Money_Flow > 8.44157 )
							if( Positive_Money_Flow_Sum <= 3.15755e+06 )
								if( ema2 <= 10.1758 )
									ret := -0.500000
								if( ema2 > 10.1758 )
									ret := 0.333333
							if( Positive_Money_Flow_Sum > 3.15755e+06 )
								if( MFI_Low <= 70.9193 )
									ret := -0.377193
								if( MFI_Low > 70.9193 )
									ret := 0.241379
	
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
float op_operation = decision_tree_0_RIVN_1Min_2448b94a(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, ema1, tema, ema12, ema2, ema3, ema13)

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


