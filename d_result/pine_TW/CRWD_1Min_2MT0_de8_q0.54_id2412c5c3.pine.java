//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: CRWD_1Min_2MT0_2412c5c3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_1Min_2MT0_2412c5c3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_1Min_2412c5c3(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= 0.027053 )
		if( Negative_Money_Flow_Sum <= 3.41238e+06 )
			if( ema13 <= -0.733623 )
				if( Positive_Money_Flow_Sum <= 368711 )
					if( tema <= 299.539 )
						if( MFI_Low <= -9.97189 )
							if( tema <= 257.145 )
								if( ema13 <= -1.98648 )
									ret := 0.000000
								if( ema13 > -1.98648 )
									ret := 0.250000
							if( tema > 257.145 )
								ret := 0.857143 // buy
						if( MFI_Low > -9.97189 )
							if( Negative_Money_Flow_Sum <= 1.79618e+06 )
								if( tema <= 258.523 )
									ret := -0.750000 // sell
								if( tema > 258.523 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.79618e+06 )
								if( ema1 <= 246.299 )
									ret := -1.000000 // sell
								if( ema1 > 246.299 )
									ret := 0.600000
					if( tema > 299.539 )
						if( Positive_Money_Flow_Sum <= 317328 )
							ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 317328 )
							ret := 0.142857
				if( Positive_Money_Flow_Sum > 368711 )
					if( Typical_Price <= 383.036 )
						if( Negative_Money_Flow_Sum <= 644112 )
							if( tema <= 280.754 )
								ret := 0.571429
							if( tema > 280.754 )
								if( Money_Flow_Ratio <= 1.82417 )
									ret := -0.500000
								if( Money_Flow_Ratio > 1.82417 )
									ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 644112 )
							if( ema3 <= 221.195 )
								if( MFI_Low <= 2.37102 )
									ret := 1.000000 // buy
								if( MFI_Low > 2.37102 )
									ret := -0.204082
							if( ema3 > 221.195 )
								if( Negative_Money_Flow_Sum <= 1.97193e+06 )
									ret := 0.598522
								if( Negative_Money_Flow_Sum > 1.97193e+06 )
									ret := 0.312821
					if( Typical_Price > 383.036 )
						if( Negative_Money_Flow <= 31939.8 )
							if( MFI_High <= -34.1785 )
								ret := -0.750000 // sell
							if( MFI_High > -34.1785 )
								ret := -1.000000 // sell
						if( Negative_Money_Flow > 31939.8 )
							if( ema1 <= 385.3 )
								ret := -0.250000
							if( ema1 > 385.3 )
								ret := 0.000000
			if( ema13 > -0.733623 )
				if( Positive_Money_Flow_Sum <= 420690 )
					if( ema1 <= 273.621 )
						if( Negative_Money_Flow_Sum <= 863338 )
							if( ema12 <= -0.082026 )
								if( Typical_Price <= 216.113 )
									ret := -0.666667
								if( Typical_Price > 216.113 )
									ret := -0.954545 // sell
							if( ema12 > -0.082026 )
								if( Negative_Money_Flow_Sum <= 630485 )
									ret := -0.441860
								if( Negative_Money_Flow_Sum > 630485 )
									ret := 0.375000
						if( Negative_Money_Flow_Sum > 863338 )
							if( Negative_Money_Flow_Sum <= 1.3361e+06 )
								if( Negative_Money_Flow <= 462853 )
									ret := 0.347222
								if( Negative_Money_Flow > 462853 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.3361e+06 )
								if( Negative_Money_Flow_Sum <= 1.74622e+06 )
									ret := -0.892857 // sell
								if( Negative_Money_Flow_Sum > 1.74622e+06 )
									ret := -0.224490
					if( ema1 > 273.621 )
						if( MFI_High <= -40.6332 )
							if( ema2 <= 302.703 )
								if( Positive_Money_Flow_Sum <= 246317 )
									ret := 0.850000 // buy
								if( Positive_Money_Flow_Sum > 246317 )
									ret := -0.010000
							if( ema2 > 302.703 )
								if( Money_Flow_Ratio <= 0.142469 )
									ret := 0.095238
								if( Money_Flow_Ratio > 0.142469 )
									ret := 0.755102 // buy
						if( MFI_High > -40.6332 )
							if( Positive_Money_Flow_Sum <= 379280 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 379280 )
								ret := -0.500000
				if( Positive_Money_Flow_Sum > 420690 )
					if( Negative_Money_Flow <= 5666.23 )
						if( tema <= 215.854 )
							if( MFI_High <= -40.7884 )
								ret := 0.000000
							if( MFI_High > -40.7884 )
								if( MFI_High <= -24.5322 )
									ret := -1.000000 // sell
								if( MFI_High > -24.5322 )
									ret := -0.714286 // sell
						if( tema > 215.854 )
							if( Positive_Money_Flow_Sum <= 872598 )
								if( Negative_Money_Flow_Sum <= 532807 )
									ret := -0.371429
								if( Negative_Money_Flow_Sum > 532807 )
									ret := 0.248555
							if( Positive_Money_Flow_Sum > 872598 )
								if( ema13 <= 0.045018 )
									ret := -0.014197
								if( ema13 > 0.045018 )
									ret := 0.306452
					if( Negative_Money_Flow > 5666.23 )
						if( Negative_Money_Flow_Sum <= 1.34684e+06 )
							if( ema13 <= -0.030809 )
								if( Positive_Money_Flow <= 46682.8 )
									ret := 0.432675
								if( Positive_Money_Flow > 46682.8 )
									ret := -0.600000
							if( ema13 > -0.030809 )
								if( ema12 <= -0.091855 )
									ret := -0.363636
								if( ema12 > -0.091855 )
									ret := 0.236515
						if( Negative_Money_Flow_Sum > 1.34684e+06 )
							if( Negative_Money_Flow_Sum <= 1.91451e+06 )
								if( Money_Flow_Ratio <= 0.634915 )
									ret := -0.272727
								if( Money_Flow_Ratio > 0.634915 )
									ret := 0.072664
							if( Negative_Money_Flow_Sum > 1.91451e+06 )
								if( ema3 <= 286.492 )
									ret := 0.357414
								if( ema3 > 286.492 )
									ret := 0.009434
		if( Negative_Money_Flow_Sum > 3.41238e+06 )
			if( Money_Flow_Ratio <= 2.03514 )
				if( Negative_Money_Flow_Sum <= 2.28891e+08 )
					if( Negative_Money_Flow <= 3.22213e+06 )
						if( Positive_Money_Flow_Sum <= 1.85563e+08 )
							if( Raw_Money_Flow <= 6.09568e+06 )
								if( ema3 <= 233.151 )
									ret := 0.178792
								if( ema3 > 233.151 )
									ret := 0.037384
							if( Raw_Money_Flow > 6.09568e+06 )
								if( ema2 <= 283.209 )
									ret := 0.042660
								if( ema2 > 283.209 )
									ret := 0.270402
						if( Positive_Money_Flow_Sum > 1.85563e+08 )
							if( Money_Flow_Ratio <= 1.57702 )
								if( MFI <= 55.1224 )
									ret := -0.944444 // sell
								if( MFI > 55.1224 )
									ret := -0.533333
							if( Money_Flow_Ratio > 1.57702 )
								if( Raw_Money_Flow <= 1.60314e+07 )
									ret := -0.500000
								if( Raw_Money_Flow > 1.60314e+07 )
									ret := 0.900000 // buy
					if( Negative_Money_Flow > 3.22213e+06 )
						if( Negative_Money_Flow_Sum <= 1.94188e+08 )
							if( Positive_Money_Flow_Sum <= 4.94404e+07 )
								if( Positive_Money_Flow_Sum <= 4.07757e+07 )
									ret := 0.127026
								if( Positive_Money_Flow_Sum > 4.07757e+07 )
									ret := 0.395349
							if( Positive_Money_Flow_Sum > 4.94404e+07 )
								if( Positive_Money_Flow_Sum <= 2.07532e+08 )
									ret := -0.090640
								if( Positive_Money_Flow_Sum > 2.07532e+08 )
									ret := 0.965517 // buy
						if( Negative_Money_Flow_Sum > 1.94188e+08 )
							if( Positive_Money_Flow_Sum <= 1.35403e+08 )
								if( Positive_Money_Flow_Sum <= 7.3896e+07 )
									ret := 0.587302
								if( Positive_Money_Flow_Sum > 7.3896e+07 )
									ret := 0.960784 // buy
							if( Positive_Money_Flow_Sum > 1.35403e+08 )
								if( Positive_Money_Flow_Sum <= 1.79912e+08 )
									ret := -0.777778 // sell
								if( Positive_Money_Flow_Sum > 1.79912e+08 )
									ret := 0.466667
				if( Negative_Money_Flow_Sum > 2.28891e+08 )
					if( ema13 <= -1.1018 )
						if( Negative_Money_Flow_Sum <= 3.3766e+08 )
							if( Negative_Money_Flow_Sum <= 2.64255e+08 )
								if( Positive_Money_Flow <= 2.08299e+07 )
									ret := 0.166667
								if( Positive_Money_Flow > 2.08299e+07 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 2.64255e+08 )
								if( Money_Flow_Ratio <= 0.525841 )
									ret := -0.812500 // sell
								if( Money_Flow_Ratio > 0.525841 )
									ret := 0.055556
						if( Negative_Money_Flow_Sum > 3.3766e+08 )
							if( ema2 <= 267.767 )
								if( Raw_Money_Flow <= 3.10669e+07 )
									ret := -0.272727
								if( Raw_Money_Flow > 3.10669e+07 )
									ret := 0.850000 // buy
							if( ema2 > 267.767 )
								if( ema1 <= 283.297 )
									ret := -0.629310
								if( ema1 > 283.297 )
									ret := 0.352941
					if( ema13 > -1.1018 )
						if( Negative_Money_Flow_Sum <= 2.80211e+08 )
							if( MFI_High <= -41.7492 )
								if( ema12 <= -0.346033 )
									ret := 0.333333
								if( ema12 > -0.346033 )
									ret := -0.255319
							if( MFI_High > -41.7492 )
								if( Money_Flow_Ratio <= 0.728943 )
									ret := -0.904762 // sell
								if( Money_Flow_Ratio > 0.728943 )
									ret := -0.261905
						if( Negative_Money_Flow_Sum > 2.80211e+08 )
							if( ema12 <= -0.372596 )
								if( ema1 <= 376.109 )
									ret := 0.961538 // buy
								if( ema1 > 376.109 )
									ret := 0.250000
							if( ema12 > -0.372596 )
								if( Positive_Money_Flow <= 19517.2 )
									ret := 0.487805
								if( Positive_Money_Flow > 19517.2 )
									ret := -0.176471
			if( Money_Flow_Ratio > 2.03514 )
				if( Negative_Money_Flow <= 3546.19 )
					if( MFI_High <= 12.7042 )
						if( ema3 <= 256.5 )
							if( tema <= 231.159 )
								if( ema3 <= 225.086 )
									ret := -0.600000
								if( ema3 > 225.086 )
									ret := 0.833333 // buy
							if( tema > 231.159 )
								if( Positive_Money_Flow <= 1.96631e+06 )
									ret := -0.037037
								if( Positive_Money_Flow > 1.96631e+06 )
									ret := -0.742857 // sell
						if( ema3 > 256.5 )
							if( Negative_Money_Flow_Sum <= 8.72926e+06 )
								if( Positive_Money_Flow_Sum <= 2.20516e+07 )
									ret := 0.096552
								if( Positive_Money_Flow_Sum > 2.20516e+07 )
									ret := -0.447368
							if( Negative_Money_Flow_Sum > 8.72926e+06 )
								if( ema13 <= -1.91056 )
									ret := -0.800000 // sell
								if( ema13 > -1.91056 )
									ret := 0.266436
					if( MFI_High > 12.7042 )
						if( ema12 <= -0.168642 )
							ret := 1.000000 // buy
						if( ema12 > -0.168642 )
							ret := 0.500000
				if( Negative_Money_Flow > 3546.19 )
					if( Positive_Money_Flow_Sum <= 6.71481e+07 )
						if( Raw_Money_Flow <= 6.69780e+06 )
							if( ema12 <= -0.315266 )
								if( MFI <= 77.6517 )
									ret := 0.470588
								if( MFI > 77.6517 )
									ret := 1.000000 // buy
							if( ema12 > -0.315266 )
								if( Money_Flow_Ratio <= 6.13745 )
									ret := 0.241667
								if( Money_Flow_Ratio > 6.13745 )
									ret := -0.600000
						if( Raw_Money_Flow > 6.69780e+06 )
							if( Raw_Money_Flow <= 8.20315e+06 )
								if( ema12 <= -0.314886 )
									ret := -1.000000 // sell
								if( ema12 > -0.314886 )
									ret := -0.400000
							if( Raw_Money_Flow > 8.20315e+06 )
								ret := 0.500000
					if( Positive_Money_Flow_Sum > 6.71481e+07 )
						if( ema3 <= 239.713 )
							if( MFI_High <= 5.59384 )
								if( ema1 <= 230.963 )
									ret := 0.000000
								if( ema1 > 230.963 )
									ret := -0.800000 // sell
							if( MFI_High > 5.59384 )
								ret := 0.285714
						if( ema3 > 239.713 )
							if( MFI_High <= 15.8774 )
								if( ema12 <= -0.00249 )
									ret := 0.780899 // buy
								if( ema12 > -0.00249 )
									ret := 0.240000
							if( MFI_High > 15.8774 )
								ret := -0.400000
	if( ema12 > 0.027053 )
		if( MFI_High <= -50.027 )
			if( Money_Flow_Ratio <= 0.060076 )
				if( Negative_Money_Flow_Sum <= 2.1803e+07 )
					if( Positive_Money_Flow_Sum <= 540862 )
						ret := -0.600000
					if( Positive_Money_Flow_Sum > 540862 )
						if( ema13 <= 0.326999 )
							ret := 0.333333
						if( ema13 > 0.326999 )
							ret := 1.000000 // buy
				if( Negative_Money_Flow_Sum > 2.1803e+07 )
					if( Positive_Money_Flow_Sum <= 2.72334e+06 )
						if( Negative_Money_Flow <= 25513.2 )
							if( ema2 <= 289.37 )
								ret := -0.166667
							if( ema2 > 289.37 )
								if( ema2 <= 325.161 )
									ret := -0.833333 // sell
								if( ema2 > 325.161 )
									ret := -0.333333
						if( Negative_Money_Flow > 25513.2 )
							if( ema12 <= 0.041852 )
								ret := 1.000000 // buy
							if( ema12 > 0.041852 )
								if( MFI <= 3.92409 )
									ret := 0.230769
								if( MFI > 3.92409 )
									ret := -0.666667
					if( Positive_Money_Flow_Sum > 2.72334e+06 )
						if( ema3 <= 367.25 )
							if( ema12 <= 0.09436 )
								ret := -0.166667
							if( ema12 > 0.09436 )
								if( Negative_Money_Flow <= 8711.96 )
									ret := 0.571429
								if( Negative_Money_Flow > 8711.96 )
									ret := 1.000000 // buy
						if( ema3 > 367.25 )
							if( ema13 <= 1.32908 )
								ret := 0.000000
							if( ema13 > 1.32908 )
								ret := -0.750000 // sell
			if( Money_Flow_Ratio > 0.060076 )
				if( Positive_Money_Flow <= 3524.26 )
					if( ema1 <= 301.694 )
						if( Negative_Money_Flow_Sum <= 1.15626e+07 )
							if( Positive_Money_Flow_Sum <= 665866 )
								if( ema13 <= 0.763105 )
									ret := -0.320513
								if( ema13 > 0.763105 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 665866 )
								if( ema13 <= 0.12661 )
									ret := -0.031250
								if( ema13 > 0.12661 )
									ret := 0.515789
						if( Negative_Money_Flow_Sum > 1.15626e+07 )
							if( Raw_Money_Flow <= 6.32767e+07 )
								if( Typical_Price <= 296.614 )
									ret := -0.261194
								if( Typical_Price > 296.614 )
									ret := 0.714286 // buy
							if( Raw_Money_Flow > 6.32767e+07 )
								ret := 0.714286 // buy
					if( ema1 > 301.694 )
						if( ema13 <= 0.385422 )
							if( Positive_Money_Flow_Sum <= 5.58877e+07 )
								if( Negative_Money_Flow_Sum <= 1.99738e+06 )
									ret := 0.272727
								if( Negative_Money_Flow_Sum > 1.99738e+06 )
									ret := -0.222222
							if( Positive_Money_Flow_Sum > 5.58877e+07 )
								if( ema1 <= 318.562 )
									ret := 0.000000
								if( ema1 > 318.562 )
									ret := 1.000000 // buy
						if( ema13 > 0.385422 )
							if( ema3 <= 342.974 )
								if( ema2 <= 318.057 )
									ret := -0.961538 // sell
								if( ema2 > 318.057 )
									ret := -0.687500
							if( ema3 > 342.974 )
								if( Positive_Money_Flow_Sum <= 1.15792e+06 )
									ret := -0.666667
								if( Positive_Money_Flow_Sum > 1.15792e+06 )
									ret := 0.214286
				if( Positive_Money_Flow > 3524.26 )
					if( Positive_Money_Flow_Sum <= 400377 )
						if( Positive_Money_Flow <= 57655.7 )
							if( Raw_Money_Flow <= 47923.5 )
								ret := 0.000000
							if( Raw_Money_Flow > 47923.5 )
								ret := -0.500000
						if( Positive_Money_Flow > 57655.7 )
							if( ema13 <= 0.483044 )
								if( MFI <= 18.521 )
									ret := 0.250000
								if( MFI > 18.521 )
									ret := 0.000000
							if( ema13 > 0.483044 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 400377 )
						if( ema12 <= 0.545254 )
							if( ema13 <= 0.919754 )
								if( Positive_Money_Flow <= 334473 )
									ret := -0.399254
								if( Positive_Money_Flow > 334473 )
									ret := -0.134752
							if( ema13 > 0.919754 )
								if( Typical_Price <= 291.162 )
									ret := 0.500000
								if( Typical_Price > 291.162 )
									ret := 1.000000 // buy
						if( ema12 > 0.545254 )
							if( Money_Flow_Ratio <= 0.334179 )
								ret := -1.000000 // sell
							if( Money_Flow_Ratio > 0.334179 )
								ret := -0.200000
		if( MFI_High > -50.027 )
			if( Negative_Money_Flow_Sum <= 4.14484e+07 )
				if( ema12 <= 0.51613 )
					if( ema2 <= 202.231 )
						ret := 1.000000 // buy
					if( ema2 > 202.231 )
						if( Positive_Money_Flow_Sum <= 1.36542e+06 )
							if( MFI <= 60.3501 )
								if( Positive_Money_Flow_Sum <= 768923 )
									ret := -0.059426
								if( Positive_Money_Flow_Sum > 768923 )
									ret := 0.171068
							if( MFI > 60.3501 )
								if( ema12 <= 0.305491 )
									ret := 0.419753
								if( ema12 > 0.305491 )
									ret := 0.057971
						if( Positive_Money_Flow_Sum > 1.36542e+06 )
							if( Raw_Money_Flow <= 52369.1 )
								if( Positive_Money_Flow <= 42228.6 )
									ret := -0.116592
								if( Positive_Money_Flow > 42228.6 )
									ret := -0.619048
							if( Raw_Money_Flow > 52369.1 )
								if( Positive_Money_Flow_Sum <= 2.70416e+08 )
									ret := 0.011951
								if( Positive_Money_Flow_Sum > 2.70416e+08 )
									ret := 0.651163
				if( ema12 > 0.51613 )
					if( ema3 <= 295.58 )
						if( Positive_Money_Flow_Sum <= 890373 )
							if( Raw_Money_Flow <= 31565.2 )
								ret := -0.750000 // sell
							if( Raw_Money_Flow > 31565.2 )
								if( Raw_Money_Flow <= 143386 )
									ret := 0.702128 // buy
								if( Raw_Money_Flow > 143386 )
									ret := -0.125000
						if( Positive_Money_Flow_Sum > 890373 )
							if( Raw_Money_Flow <= 1.95804e+07 )
								if( Raw_Money_Flow <= 363310 )
									ret := -0.418421
								if( Raw_Money_Flow > 363310 )
									ret := -0.180403
							if( Raw_Money_Flow > 1.95804e+07 )
								if( Positive_Money_Flow_Sum <= 1.2076e+08 )
									ret := 0.812500 // buy
								if( Positive_Money_Flow_Sum > 1.2076e+08 )
									ret := -0.069767
					if( ema3 > 295.58 )
						if( Typical_Price <= 388.922 )
							if( Negative_Money_Flow_Sum <= 361806 )
								if( ema1 <= 331.496 )
									ret := 0.824561 // buy
								if( ema1 > 331.496 )
									ret := -0.250000
							if( Negative_Money_Flow_Sum > 361806 )
								if( ema12 <= 1.02502 )
									ret := 0.058552
								if( ema12 > 1.02502 )
									ret := -0.147651
						if( Typical_Price > 388.922 )
							if( Positive_Money_Flow <= 1.72502e+06 )
								if( Typical_Price <= 390.032 )
									ret := 0.000000
								if( Typical_Price > 390.032 )
									ret := -0.680000
							if( Positive_Money_Flow > 1.72502e+06 )
								if( ema13 <= 0.851459 )
									ret := -0.500000
								if( ema13 > 0.851459 )
									ret := -0.916667 // sell
			if( Negative_Money_Flow_Sum > 4.14484e+07 )
				if( tema <= 377.856 )
					if( ema13 <= 1.43828 )
						if( ema13 <= 0.420242 )
							if( Raw_Money_Flow <= 6.73932e+06 )
								if( tema <= 223.791 )
									ret := 0.807692 // buy
								if( tema > 223.791 )
									ret := 0.023499
							if( Raw_Money_Flow > 6.73932e+06 )
								if( ema13 <= -0.035167 )
									ret := 0.619048
								if( ema13 > -0.035167 )
									ret := 0.286458
						if( ema13 > 0.420242 )
							if( ema3 <= 235.019 )
								if( Raw_Money_Flow <= 5.61952e+06 )
									ret := -0.794872 // sell
								if( Raw_Money_Flow > 5.61952e+06 )
									ret := -0.293333
							if( ema3 > 235.019 )
								if( Negative_Money_Flow_Sum <= 2.64709e+08 )
									ret := 0.008403
								if( Negative_Money_Flow_Sum > 2.64709e+08 )
									ret := 0.685714
					if( ema13 > 1.43828 )
						if( Raw_Money_Flow <= 3.87413e+07 )
							if( MFI_High <= -3.78639 )
								if( Raw_Money_Flow <= 5.47946e+06 )
									ret := 0.861111 // buy
								if( Raw_Money_Flow > 5.47946e+06 )
									ret := 0.204947
							if( MFI_High > -3.78639 )
								if( Positive_Money_Flow_Sum <= 3.74437e+08 )
									ret := 0.828358 // buy
								if( Positive_Money_Flow_Sum > 3.74437e+08 )
									ret := -0.666667
						if( Raw_Money_Flow > 3.87413e+07 )
							if( Negative_Money_Flow_Sum <= 3.19388e+08 )
								if( ema2 <= 266.594 )
									ret := 0.818182 // buy
								if( ema2 > 266.594 )
									ret := -0.513889
							if( Negative_Money_Flow_Sum > 3.19388e+08 )
								if( MFI_Low <= 41.105 )
									ret := 0.300000
								if( MFI_Low > 41.105 )
									ret := 1.000000 // buy
				if( tema > 377.856 )
					if( ema3 <= 376.493 )
						if( ema1 <= 377.547 )
							ret := -0.750000 // sell
						if( ema1 > 377.547 )
							ret := -1.000000 // sell
					if( ema3 > 376.493 )
						if( Positive_Money_Flow <= 4.07585e+06 )
							if( ema3 <= 384.786 )
								if( Raw_Money_Flow <= 1.08102e+07 )
									ret := 0.115942
								if( Raw_Money_Flow > 1.08102e+07 )
									ret := -0.275000
							if( ema3 > 384.786 )
								if( Raw_Money_Flow <= 5.96346e+06 )
									ret := -0.250000
								if( Raw_Money_Flow > 5.96346e+06 )
									ret := -0.818182 // sell
						if( Positive_Money_Flow > 4.07585e+06 )
							if( MFI <= 40.1665 )
								if( Negative_Money_Flow_Sum <= 7.11172e+07 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 7.11172e+07 )
									ret := -0.500000
							if( MFI > 40.1665 )
								if( Positive_Money_Flow_Sum <= 3.69346e+07 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 3.69346e+07 )
									ret := -0.386667
	
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
float op_operation = decision_tree_0_CRWD_1Min_2412c5c3(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)

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


