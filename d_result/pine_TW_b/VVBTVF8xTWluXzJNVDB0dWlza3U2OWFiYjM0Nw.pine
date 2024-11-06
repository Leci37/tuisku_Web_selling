//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: UPST_1Min_2MT0_69abb347 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Min_2MT0_69abb347", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Min_69abb347(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 4.97217 )
		if( Negative_Money_Flow_Sum <= 551139 )
			if( ema12 <= 0.014341 )
				if( ema12 <= -1e-05 )
					if( Raw_Money_Flow <= 4591.09 )
						if( MFI_Low <= 33.9146 )
							if( Money_Flow_Ratio <= 0.310558 )
								if( Positive_Money_Flow_Sum <= 29380.5 )
									ret := -0.375000
								if( Positive_Money_Flow_Sum > 29380.5 )
									ret := 0.263158
							if( Money_Flow_Ratio > 0.310558 )
								if( Negative_Money_Flow_Sum <= 79610.1 )
									ret := 0.193548
								if( Negative_Money_Flow_Sum > 79610.1 )
									ret := -0.331658
						if( MFI_Low > 33.9146 )
							if( Positive_Money_Flow_Sum <= 216919 )
								if( Raw_Money_Flow <= 3133.3 )
									ret := 0.320000
								if( Raw_Money_Flow > 3133.3 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 216919 )
								if( Negative_Money_Flow_Sum <= 57022.8 )
									ret := -0.625000
								if( Negative_Money_Flow_Sum > 57022.8 )
									ret := -0.060606
					if( Raw_Money_Flow > 4591.09 )
						if( ema3 <= 23.5622 )
							if( ema13 <= -0.158116 )
								if( ema13 <= -0.381382 )
									ret := 0.000000
								if( ema13 > -0.381382 )
									ret := -0.692308
							if( ema13 > -0.158116 )
								if( Positive_Money_Flow_Sum <= 1.60341e+06 )
									ret := 0.015428
								if( Positive_Money_Flow_Sum > 1.60341e+06 )
									ret := -0.818182 // sell
						if( ema3 > 23.5622 )
							if( Raw_Money_Flow <= 111257 )
								if( ema12 <= -0.026554 )
									ret := 0.163484
								if( ema12 > -0.026554 )
									ret := 0.044444
							if( Raw_Money_Flow > 111257 )
								if( ema12 <= -0.091111 )
									ret := -0.750000 // sell
								if( ema12 > -0.091111 )
									ret := 0.401274
				if( ema12 > -1e-05 )
					if( ema13 <= 0.004975 )
						if( Negative_Money_Flow_Sum <= 485064 )
							if( MFI <= 70.9267 )
								if( Raw_Money_Flow <= 174833 )
									ret := -0.184061
								if( Raw_Money_Flow > 174833 )
									ret := -0.722222 // sell
							if( MFI > 70.9267 )
								if( ema3 <= 22.063 )
									ret := 0.714286 // buy
								if( ema3 > 22.063 )
									ret := 0.038462
						if( Negative_Money_Flow_Sum > 485064 )
							if( Positive_Money_Flow <= 92776.7 )
								if( Positive_Money_Flow <= 63705.2 )
									ret := 0.230769
								if( Positive_Money_Flow > 63705.2 )
									ret := -0.333333
							if( Positive_Money_Flow > 92776.7 )
								if( ema13 <= -0.000103 )
									ret := 0.800000 // buy
								if( ema13 > -0.000103 )
									ret := 0.000000
					if( ema13 > 0.004975 )
						if( Money_Flow_Ratio <= 48.5404 )
							if( Negative_Money_Flow_Sum <= 49963.6 )
								if( Positive_Money_Flow <= 57808.8 )
									ret := 0.196629
								if( Positive_Money_Flow > 57808.8 )
									ret := -0.571429
							if( Negative_Money_Flow_Sum > 49963.6 )
								if( Raw_Money_Flow <= 16775.8 )
									ret := -0.094778
								if( Raw_Money_Flow > 16775.8 )
									ret := 0.014218
						if( Money_Flow_Ratio > 48.5404 )
							if( ema3 <= 24.5542 )
								ret := -0.750000 // sell
							if( ema3 > 24.5542 )
								if( ema2 <= 26.1749 )
									ret := 0.000000
								if( ema2 > 26.1749 )
									ret := -0.750000 // sell
			if( ema12 > 0.014341 )
				if( Positive_Money_Flow_Sum <= 579105 )
					if( ema3 <= 35.8191 )
						if( ema12 <= 0.032402 )
							if( Negative_Money_Flow_Sum <= 21025 )
								if( Positive_Money_Flow_Sum <= 109171 )
									ret := 0.823529 // buy
								if( Positive_Money_Flow_Sum > 109171 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 21025 )
								if( Positive_Money_Flow <= 84817.7 )
									ret := -0.184727
								if( Positive_Money_Flow > 84817.7 )
									ret := -0.479167
						if( ema12 > 0.032402 )
							if( Positive_Money_Flow_Sum <= 332102 )
								if( Negative_Money_Flow_Sum <= 437025 )
									ret := -0.395374
								if( Negative_Money_Flow_Sum > 437025 )
									ret := 0.232558
							if( Positive_Money_Flow_Sum > 332102 )
								if( MFI <= 82.6327 )
									ret := -0.526531
								if( MFI > 82.6327 )
									ret := -0.851852 // sell
					if( ema3 > 35.8191 )
						if( MFI <= 53.7942 )
							if( Positive_Money_Flow <= 86897 )
								if( Negative_Money_Flow_Sum <= 89838.7 )
									ret := -0.818182 // sell
								if( Negative_Money_Flow_Sum > 89838.7 )
									ret := -0.172996
							if( Positive_Money_Flow > 86897 )
								if( Negative_Money_Flow_Sum <= 364549 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 364549 )
									ret := 0.166667
						if( MFI > 53.7942 )
							if( ema12 <= 0.066602 )
								if( ema13 <= 0.128816 )
									ret := 0.066667
								if( ema13 > 0.128816 )
									ret := 0.875000 // buy
							if( ema12 > 0.066602 )
								if( Raw_Money_Flow <= 21644.7 )
									ret := -0.571429
								if( Raw_Money_Flow > 21644.7 )
									ret := -0.023438
				if( Positive_Money_Flow_Sum > 579105 )
					if( Positive_Money_Flow_Sum <= 1.51713e+06 )
						if( ema12 <= 0.119072 )
							if( Positive_Money_Flow <= 263022 )
								if( Positive_Money_Flow <= 180810 )
									ret := -0.034949
								if( Positive_Money_Flow > 180810 )
									ret := 0.310811
							if( Positive_Money_Flow > 263022 )
								if( Money_Flow_Ratio <= 1.80698 )
									ret := -0.888889 // sell
								if( Money_Flow_Ratio > 1.80698 )
									ret := -0.225490
						if( ema12 > 0.119072 )
							if( ema13 <= 0.401249 )
								if( ema13 <= 0.233969 )
									ret := 0.000000
								if( ema13 > 0.233969 )
									ret := 0.659574
							if( ema13 > 0.401249 )
								if( Positive_Money_Flow <= 157953 )
									ret := -0.181818
								if( Positive_Money_Flow > 157953 )
									ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 1.51713e+06 )
						if( Negative_Money_Flow_Sum <= 58420.9 )
							if( ema3 <= 24.4399 )
								if( ema2 <= 22.0466 )
									ret := 0.750000 // buy
								if( ema2 > 22.0466 )
									ret := 1.000000 // buy
							if( ema3 > 24.4399 )
								ret := 0.000000
						if( Negative_Money_Flow_Sum > 58420.9 )
							if( Positive_Money_Flow <= 2.07953e+06 )
								if( MFI_Low <= 72.331 )
									ret := -0.142857
								if( MFI_Low > 72.331 )
									ret := -0.347826
							if( Positive_Money_Flow > 2.07953e+06 )
								if( MFI_Low <= 72.329 )
									ret := -0.416667
								if( MFI_Low > 72.329 )
									ret := 0.666667
		if( Negative_Money_Flow_Sum > 551139 )
			if( Positive_Money_Flow_Sum <= 5.11947e+07 )
				if( ema12 <= 0.364489 )
					if( MFI <= 91.6808 )
						if( Money_Flow_Ratio <= 4.61074 )
							if( MFI_Low <= 38.4223 )
								if( ema3 <= 23.3252 )
									ret := 0.107971
								if( ema3 > 23.3252 )
									ret := 0.011034
							if( MFI_Low > 38.4223 )
								if( Positive_Money_Flow <= 469415 )
									ret := 0.047231
								if( Positive_Money_Flow > 469415 )
									ret := 0.137269
						if( Money_Flow_Ratio > 4.61074 )
							if( ema12 <= 0.196879 )
								if( Typical_Price <= 32.5301 )
									ret := -0.173210
								if( Typical_Price > 32.5301 )
									ret := 0.024390
							if( ema12 > 0.196879 )
								if( Positive_Money_Flow_Sum <= 1.62337e+07 )
									ret := -0.777778 // sell
								if( Positive_Money_Flow_Sum > 1.62337e+07 )
									ret := 0.079545
					if( MFI > 91.6808 )
						if( Positive_Money_Flow_Sum <= 1.43226e+07 )
							if( ema13 <= 0.465909 )
								if( Positive_Money_Flow_Sum <= 1.00624e+07 )
									ret := 0.565217
								if( Positive_Money_Flow_Sum > 1.00624e+07 )
									ret := 0.867647 // buy
							if( ema13 > 0.465909 )
								ret := -0.500000
						if( Positive_Money_Flow_Sum > 1.43226e+07 )
							if( Typical_Price <= 42.8003 )
								if( Positive_Money_Flow_Sum <= 2.16524e+07 )
									ret := -0.048780
								if( Positive_Money_Flow_Sum > 2.16524e+07 )
									ret := -0.615385
							if( Typical_Price > 42.8003 )
								if( MFI <= 96.5151 )
									ret := 0.888889 // buy
								if( MFI > 96.5151 )
									ret := 0.200000
				if( ema12 > 0.364489 )
					if( Negative_Money_Flow_Sum <= 3.84015e+06 )
						if( MFI_High <= 8.09152 )
							ret := 0.750000 // buy
						if( MFI_High > 8.09152 )
							ret := -0.428571
					if( Negative_Money_Flow_Sum > 3.84015e+06 )
						if( Raw_Money_Flow <= 1.70116e+06 )
							ret := -0.250000
						if( Raw_Money_Flow > 1.70116e+06 )
							if( MFI <= 79.327 )
								ret := -1.000000 // sell
							if( MFI > 79.327 )
								ret := -0.666667
			if( Positive_Money_Flow_Sum > 5.11947e+07 )
				if( Positive_Money_Flow_Sum <= 7.94313e+07 )
					if( Raw_Money_Flow <= 9.96881e+06 )
						if( tema <= 55.5495 )
							if( Negative_Money_Flow_Sum <= 2.95328e+07 )
								if( Negative_Money_Flow_Sum <= 1.78215e+07 )
									ret := 0.620690
								if( Negative_Money_Flow_Sum > 1.78215e+07 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 2.95328e+07 )
								ret := -0.500000
						if( tema > 55.5495 )
							ret := -0.750000 // sell
					if( Raw_Money_Flow > 9.96881e+06 )
						ret := -0.428571
				if( Positive_Money_Flow_Sum > 7.94313e+07 )
					if( Positive_Money_Flow_Sum <= 8.46495e+07 )
						ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 8.46495e+07 )
						ret := -0.500000
	if( Negative_Money_Flow > 4.97217 )
		if( Raw_Money_Flow <= 42260.8 )
			if( ema12 <= 0.010537 )
				if( Negative_Money_Flow <= 28015.7 )
					if( ema2 <= 39.859 )
						if( tema <= 24.3946 )
							if( ema13 <= -0.145398 )
								if( Positive_Money_Flow_Sum <= 39340.4 )
									ret := 0.937500 // buy
								if( Positive_Money_Flow_Sum > 39340.4 )
									ret := -0.525641
							if( ema13 > -0.145398 )
								if( MFI <= 8.48012 )
									ret := 0.730769 // buy
								if( MFI > 8.48012 )
									ret := 0.239576
						if( tema > 24.3946 )
							if( ema12 <= -0.032547 )
								if( ema3 <= 33.7347 )
									ret := 0.549708
								if( ema3 > 33.7347 )
									ret := 0.333333
							if( ema12 > -0.032547 )
								if( Positive_Money_Flow_Sum <= 13504 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 13504 )
									ret := 0.302198
					if( ema2 > 39.859 )
						if( ema13 <= 0.051696 )
							if( tema <= 39.89 )
								if( MFI_High <= -27.5892 )
									ret := -0.250000
								if( MFI_High > -27.5892 )
									ret := -1.000000 // sell
							if( tema > 39.89 )
								if( ema2 <= 42.6679 )
									ret := 0.237069
								if( ema2 > 42.6679 )
									ret := -0.014925
						if( ema13 > 0.051696 )
							ret := -0.857143 // sell
				if( Negative_Money_Flow > 28015.7 )
					if( ema2 <= 23.4752 )
						if( MFI_High <= -57.2472 )
							if( MFI <= 18.5409 )
								if( ema2 <= 22.9056 )
									ret := -0.333333
								if( ema2 > 22.9056 )
									ret := 0.315789
							if( MFI > 18.5409 )
								if( Negative_Money_Flow <= 32514 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 32514 )
									ret := 0.368421
						if( MFI_High > -57.2472 )
							if( ema12 <= -0.117851 )
								if( ema2 <= 21.9631 )
									ret := -0.750000 // sell
								if( ema2 > 21.9631 )
									ret := -1.000000 // sell
							if( ema12 > -0.117851 )
								if( Positive_Money_Flow_Sum <= 60910.1 )
									ret := -0.909091 // sell
								if( Positive_Money_Flow_Sum > 60910.1 )
									ret := -0.003448
					if( ema2 > 23.4752 )
						if( ema1 <= 36.9943 )
							if( MFI_Low <= 31.8798 )
								if( Negative_Money_Flow_Sum <= 611051 )
									ret := 0.075000
								if( Negative_Money_Flow_Sum > 611051 )
									ret := 0.403315
							if( MFI_Low > 31.8798 )
								if( ema12 <= -0.014258 )
									ret := 0.804348 // buy
								if( ema12 > -0.014258 )
									ret := 0.292683
						if( ema1 > 36.9943 )
							if( ema12 <= -0.04128 )
								if( Negative_Money_Flow <= 37462.2 )
									ret := -0.086957
								if( Negative_Money_Flow > 37462.2 )
									ret := 0.857143 // buy
							if( ema12 > -0.04128 )
								if( ema13 <= -0.048899 )
									ret := -0.409091
								if( ema13 > -0.048899 )
									ret := -0.091954
			if( ema12 > 0.010537 )
				if( Positive_Money_Flow <= 42.7519 )
					if( ema2 <= 27.4973 )
						if( ema12 <= 0.037235 )
							if( MFI_Low <= 65.6736 )
								if( Positive_Money_Flow_Sum <= 41496.4 )
									ret := 0.607143
								if( Positive_Money_Flow_Sum > 41496.4 )
									ret := 0.086076
							if( MFI_Low > 65.6736 )
								if( Raw_Money_Flow <= 31667.8 )
									ret := -0.147059
								if( Raw_Money_Flow > 31667.8 )
									ret := -1.000000 // sell
						if( ema12 > 0.037235 )
							if( MFI_High <= -31.3764 )
								if( MFI_High <= -46.9095 )
									ret := 0.026316
								if( MFI_High > -46.9095 )
									ret := -0.478873
							if( MFI_High > -31.3764 )
								if( MFI_Low <= 31.8842 )
									ret := 0.636364
								if( MFI_Low > 31.8842 )
									ret := 0.044554
					if( ema2 > 27.4973 )
						if( Raw_Money_Flow <= 21988.8 )
							if( MFI_Low <= 50.5014 )
								if( MFI <= 59.7875 )
									ret := 0.070122
								if( MFI > 59.7875 )
									ret := 0.443709
							if( MFI_Low > 50.5014 )
								if( Money_Flow_Ratio <= 5.76027 )
									ret := -0.176101
								if( Money_Flow_Ratio > 5.76027 )
									ret := 0.310811
						if( Raw_Money_Flow > 21988.8 )
							if( ema1 <= 36.7856 )
								if( Negative_Money_Flow_Sum <= 71358.7 )
									ret := -0.200000
								if( Negative_Money_Flow_Sum > 71358.7 )
									ret := 0.534031
							if( ema1 > 36.7856 )
								if( Raw_Money_Flow <= 28486.1 )
									ret := 0.309091
								if( Raw_Money_Flow > 28486.1 )
									ret := 0.000000
				if( Positive_Money_Flow > 42.7519 )
					if( Positive_Money_Flow_Sum <= 66541.5 )
						if( ema2 <= 23.2129 )
							ret := 0.500000
						if( ema2 > 23.2129 )
							ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 66541.5 )
						if( MFI_High <= 9.78973 )
							if( ema12 <= 0.025025 )
								if( MFI_High <= -35.5558 )
									ret := -0.333333
								if( MFI_High > -35.5558 )
									ret := 0.451852
							if( ema12 > 0.025025 )
								if( ema1 <= 27.4598 )
									ret := -0.333333
								if( ema1 > 27.4598 )
									ret := 0.040000
						if( MFI_High > 9.78973 )
							if( ema2 <= 29.4612 )
								ret := -1.000000 // sell
							if( ema2 > 29.4612 )
								if( Raw_Money_Flow <= 13382.8 )
									ret := 0.600000
								if( Raw_Money_Flow > 13382.8 )
									ret := -1.000000 // sell
		if( Raw_Money_Flow > 42260.8 )
			if( Negative_Money_Flow_Sum <= 2.60068e+07 )
				if( Raw_Money_Flow <= 3.28897e+06 )
					if( ema13 <= -0.465827 )
						if( Money_Flow_Ratio <= 0.269971 )
							if( ema12 <= -0.432646 )
								ret := -0.666667
							if( ema12 > -0.432646 )
								if( Typical_Price <= 26.2794 )
									ret := 0.500000
								if( Typical_Price > 26.2794 )
									ret := 0.905882 // buy
						if( Money_Flow_Ratio > 0.269971 )
							if( Typical_Price <= 28.0537 )
								if( Negative_Money_Flow_Sum <= 1.38971e+07 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow_Sum > 1.38971e+07 )
									ret := 1.000000 // buy
							if( Typical_Price > 28.0537 )
								if( ema12 <= -0.229409 )
									ret := -0.384615
								if( ema12 > -0.229409 )
									ret := 1.000000 // buy
					if( ema13 > -0.465827 )
						if( ema13 <= -0.23852 )
							if( MFI_Low <= 25.5097 )
								if( Negative_Money_Flow_Sum <= 8.14757e+06 )
									ret := -0.314214
								if( Negative_Money_Flow_Sum > 8.14757e+06 )
									ret := -0.059783
							if( MFI_Low > 25.5097 )
								if( Negative_Money_Flow <= 1.76926e+06 )
									ret := 0.781250 // buy
								if( Negative_Money_Flow > 1.76926e+06 )
									ret := -0.750000 // sell
						if( ema13 > -0.23852 )
							if( Positive_Money_Flow <= 238271 )
								if( Negative_Money_Flow_Sum <= 458580 )
									ret := 0.149107
								if( Negative_Money_Flow_Sum > 458580 )
									ret := 0.037237
							if( Positive_Money_Flow > 238271 )
								if( ema1 <= 54.8044 )
									ret := 0.365696
								if( ema1 > 54.8044 )
									ret := -1.000000 // sell
				if( Raw_Money_Flow > 3.28897e+06 )
					if( tema <= 33.2126 )
						if( ema13 <= -0.231959 )
							if( Negative_Money_Flow_Sum <= 1.24622e+07 )
								ret := -0.571429
							if( Negative_Money_Flow_Sum > 1.24622e+07 )
								if( Negative_Money_Flow_Sum <= 1.80766e+07 )
									ret := 0.923077 // buy
								if( Negative_Money_Flow_Sum > 1.80766e+07 )
									ret := 0.142857
						if( ema13 > -0.231959 )
							if( Positive_Money_Flow_Sum <= 3.29553e+07 )
								if( Positive_Money_Flow_Sum <= 9.20076e+06 )
									ret := 0.781250 // buy
								if( Positive_Money_Flow_Sum > 9.20076e+06 )
									ret := -0.055556
							if( Positive_Money_Flow_Sum > 3.29553e+07 )
								if( ema13 <= 0.536217 )
									ret := 1.000000 // buy
								if( ema13 > 0.536217 )
									ret := 0.750000 // buy
					if( tema > 33.2126 )
						if( Negative_Money_Flow <= 2.61266e+06 )
							if( Money_Flow_Ratio <= 2.52517 )
								ret := -0.500000
							if( Money_Flow_Ratio > 2.52517 )
								ret := -1.000000 // sell
						if( Negative_Money_Flow > 2.61266e+06 )
							if( Positive_Money_Flow_Sum <= 2.9172e+07 )
								if( Positive_Money_Flow_Sum <= 8.64011e+06 )
									ret := 0.504348
								if( Positive_Money_Flow_Sum > 8.64011e+06 )
									ret := -0.275000
							if( Positive_Money_Flow_Sum > 2.9172e+07 )
								if( ema13 <= 0.676446 )
									ret := 0.897959 // buy
								if( ema13 > 0.676446 )
									ret := 0.416667
			if( Negative_Money_Flow_Sum > 2.60068e+07 )
				if( MFI_Low <= 29.5727 )
					if( ema1 <= 54.711 )
						if( Positive_Money_Flow <= 427.376 )
							if( ema12 <= -0.101261 )
								if( Positive_Money_Flow_Sum <= 9.80846e+06 )
									ret := 0.571429
								if( Positive_Money_Flow_Sum > 9.80846e+06 )
									ret := 0.878505 // buy
							if( ema12 > -0.101261 )
								if( ema12 <= -0.039202 )
									ret := 0.233333
								if( ema12 > -0.039202 )
									ret := 0.763158 // buy
						if( Positive_Money_Flow > 427.376 )
							if( Positive_Money_Flow_Sum <= 1.038e+07 )
								if( ema2 <= 35.6404 )
									ret := -1.000000 // sell
								if( ema2 > 35.6404 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 1.038e+07 )
								if( Typical_Price <= 44.5298 )
									ret := 0.547170
								if( Typical_Price > 44.5298 )
									ret := -0.600000
					if( ema1 > 54.711 )
						ret := -0.428571
				if( MFI_Low > 29.5727 )
					if( Negative_Money_Flow_Sum <= 3.38396e+07 )
						if( tema <= 51.4252 )
							if( Positive_Money_Flow <= 1.76944e+06 )
								if( Typical_Price <= 36.9732 )
									ret := 0.272727
								if( Typical_Price > 36.9732 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow > 1.76944e+06 )
								if( Negative_Money_Flow <= 906167 )
									ret := 0.500000
								if( Negative_Money_Flow > 906167 )
									ret := -1.000000 // sell
						if( tema > 51.4252 )
							if( Positive_Money_Flow_Sum <= 3.55822e+07 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 3.55822e+07 )
								ret := 0.000000
					if( Negative_Money_Flow_Sum > 3.38396e+07 )
						if( MFI_High <= -22.2355 )
							ret := -1.000000 // sell
						if( MFI_High > -22.2355 )
							ret := -0.500000
	
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
float op_operation = decision_tree_0_UPST_1Min_69abb347(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, ema2, ema1, ema12, ema3, ema13, tema)

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


