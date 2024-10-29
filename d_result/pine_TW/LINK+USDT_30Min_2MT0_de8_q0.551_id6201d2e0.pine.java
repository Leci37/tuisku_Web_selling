//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: LINKUSDT_30Min_2MT0_6201d2e0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LINKUSDT_30Min_2MT0_6201d2e0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LINKUSDT_30Min_6201d2e0(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( tema <= 7.04011 )
		if( Positive_Money_Flow_Sum <= 4.35741e+06 )
			if( Raw_Money_Flow <= 1.48701e+06 )
				if( ema12 <= 0.001712 )
					if( MFI_High <= -31.0779 )
						if( Positive_Money_Flow_Sum <= 1.30295e+06 )
							if( Negative_Money_Flow_Sum <= 3.9762e+06 )
								if( MFI_High <= -63.7814 )
									ret := 0.545455
								if( MFI_High > -63.7814 )
									ret := -0.064050
							if( Negative_Money_Flow_Sum > 3.9762e+06 )
								if( Money_Flow_Ratio <= 0.198769 )
									ret := 0.006803
								if( Money_Flow_Ratio > 0.198769 )
									ret := -0.470149
						if( Positive_Money_Flow_Sum > 1.30295e+06 )
							if( Negative_Money_Flow_Sum <= 1.72256e+07 )
								if( ema12 <= -0.032011 )
									ret := -0.053261
								if( ema12 > -0.032011 )
									ret := 0.068631
							if( Negative_Money_Flow_Sum > 1.72256e+07 )
								if( MFI_Low <= -2.28653 )
									ret := -0.076923
								if( MFI_Low > -2.28653 )
									ret := -1.000000 // sell
					if( MFI_High > -31.0779 )
						if( Positive_Money_Flow <= 120486 )
							if( Raw_Money_Flow <= 556174 )
								if( ema3 <= 7.01944 )
									ret := -0.021956
								if( ema3 > 7.01944 )
									ret := 0.700000 // buy
							if( Raw_Money_Flow > 556174 )
								if( ema13 <= -0.013736 )
									ret := -0.818182 // sell
								if( ema13 > -0.013736 )
									ret := -0.125000
						if( Positive_Money_Flow > 120486 )
							if( Negative_Money_Flow_Sum <= 3.90014e+06 )
								if( Negative_Money_Flow_Sum <= 2.35287e+06 )
									ret := -0.186207
								if( Negative_Money_Flow_Sum > 2.35287e+06 )
									ret := -0.429487
							if( Negative_Money_Flow_Sum > 3.90014e+06 )
								ret := 0.454545
				if( ema12 > 0.001712 )
					if( ema1 <= 5.92111 )
						if( ema2 <= 5.40645 )
							if( Positive_Money_Flow_Sum <= 1.42695e+06 )
								ret := 0.384615
							if( Positive_Money_Flow_Sum > 1.42695e+06 )
								if( MFI_High <= -6.20241 )
									ret := 0.018349
								if( MFI_High > -6.20241 )
									ret := -0.363636
						if( ema2 > 5.40645 )
							if( ema12 <= 0.007161 )
								if( ema13 <= -0.002318 )
									ret := 0.833333 // buy
								if( ema13 > -0.002318 )
									ret := -0.010417
							if( ema12 > 0.007161 )
								if( MFI <= 66.3715 )
									ret := 0.670000
								if( MFI > 66.3715 )
									ret := 0.255556
					if( ema1 > 5.92111 )
						if( MFI_High <= -29.8334 )
							if( Positive_Money_Flow_Sum <= 4.10592e+06 )
								if( MFI_Low <= 24.9904 )
									ret := 0.103542
								if( MFI_Low > 24.9904 )
									ret := 0.280130
							if( Positive_Money_Flow_Sum > 4.10592e+06 )
								if( ema13 <= 0.035596 )
									ret := 0.100000
								if( ema13 > 0.035596 )
									ret := -0.777778 // sell
						if( MFI_High > -29.8334 )
							if( Money_Flow_Ratio <= 1.87626 )
								if( Positive_Money_Flow_Sum <= 3.12587e+06 )
									ret := 0.072059
								if( Positive_Money_Flow_Sum > 3.12587e+06 )
									ret := -0.258364
							if( Money_Flow_Ratio > 1.87626 )
								if( Negative_Money_Flow <= 280313 )
									ret := 0.022688
								if( Negative_Money_Flow > 280313 )
									ret := 0.446809
			if( Raw_Money_Flow > 1.48701e+06 )
				if( Typical_Price <= 6.46387 )
					if( ema13 <= -0.041795 )
						if( Negative_Money_Flow_Sum <= 9.92089e+06 )
							if( Negative_Money_Flow <= 1.61055e+06 )
								ret := 0.333333
							if( Negative_Money_Flow > 1.61055e+06 )
								if( tema <= 5.9421 )
									ret := 0.588235
								if( tema > 5.9421 )
									ret := 0.915789 // buy
						if( Negative_Money_Flow_Sum > 9.92089e+06 )
							if( Positive_Money_Flow_Sum <= 2.5952e+06 )
								if( ema2 <= 6.5087 )
									ret := 0.285714
								if( ema2 > 6.5087 )
									ret := -0.666667
							if( Positive_Money_Flow_Sum > 2.5952e+06 )
								ret := 0.666667
					if( ema13 > -0.041795 )
						if( Raw_Money_Flow <= 2.01349e+06 )
							if( MFI_Low <= 19.6662 )
								ret := 0.000000
							if( MFI_Low > 19.6662 )
								ret := 0.454545
						if( Raw_Money_Flow > 2.01349e+06 )
							ret := -0.545455
				if( Typical_Price > 6.46387 )
					if( MFI_High <= -53.8885 )
						if( Negative_Money_Flow <= 1.9409e+06 )
							if( Negative_Money_Flow <= 1.77266e+06 )
								if( MFI <= 12.37 )
									ret := 0.000000
								if( MFI > 12.37 )
									ret := 0.500000
							if( Negative_Money_Flow > 1.77266e+06 )
								ret := -0.450000
						if( Negative_Money_Flow > 1.9409e+06 )
							if( MFI_High <= -60.5613 )
								if( Typical_Price <= 6.8879 )
									ret := 0.441176
								if( Typical_Price > 6.8879 )
									ret := -0.230769
							if( MFI_High > -60.5613 )
								if( Positive_Money_Flow_Sum <= 2.77394e+06 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 2.77394e+06 )
									ret := 0.875000 // buy
					if( MFI_High > -53.8885 )
						if( Negative_Money_Flow <= 2.26565e+06 )
							if( tema <= 6.60639 )
								ret := -0.454545
							if( tema > 6.60639 )
								if( Positive_Money_Flow <= 1.55283e+06 )
									ret := 0.642857
								if( Positive_Money_Flow > 1.55283e+06 )
									ret := 0.000000
						if( Negative_Money_Flow > 2.26565e+06 )
							if( Negative_Money_Flow <= 2.64463e+06 )
								ret := -0.736842 // sell
							if( Negative_Money_Flow > 2.64463e+06 )
								ret := 0.100000
		if( Positive_Money_Flow_Sum > 4.35741e+06 )
			if( Money_Flow_Ratio <= 0.858761 )
				if( Negative_Money_Flow <= 3.0811e+06 )
					if( MFI <= 28.9986 )
						if( Money_Flow_Ratio <= 0.344222 )
							if( Negative_Money_Flow_Sum <= 2.53873e+07 )
								if( tema <= 6.87979 )
									ret := -0.176471
								if( tema > 6.87979 )
									ret := 0.444444
							if( Negative_Money_Flow_Sum > 2.53873e+07 )
								ret := 0.666667
						if( Money_Flow_Ratio > 0.344222 )
							if( Positive_Money_Flow <= 430759 )
								if( ema12 <= -0.091913 )
									ret := -0.875000 // sell
								if( ema12 > -0.091913 )
									ret := -0.181818
							if( Positive_Money_Flow > 430759 )
								if( Raw_Money_Flow <= 1.59909e+06 )
									ret := 0.291667
								if( Raw_Money_Flow > 1.59909e+06 )
									ret := -0.333333
					if( MFI > 28.9986 )
						if( Raw_Money_Flow <= 322999 )
							if( ema3 <= 6.84917 )
								if( Negative_Money_Flow_Sum <= 7.72191e+06 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 7.72191e+06 )
									ret := -0.285714
							if( ema3 > 6.84917 )
								ret := -0.785714 // sell
						if( Raw_Money_Flow > 322999 )
							if( ema13 <= -0.046333 )
								if( ema13 <= -0.227654 )
									ret := 0.647059
								if( ema13 > -0.227654 )
									ret := 0.223195
							if( ema13 > -0.046333 )
								if( ema2 <= 6.38858 )
									ret := 0.271930
								if( ema2 > 6.38858 )
									ret := 0.484536
				if( Negative_Money_Flow > 3.0811e+06 )
					if( Raw_Money_Flow <= 7.62428e+06 )
						if( Raw_Money_Flow <= 3.36141e+06 )
							ret := 0.954545 // buy
						if( Raw_Money_Flow > 3.36141e+06 )
							if( ema12 <= -0.169225 )
								ret := 0.894737 // buy
							if( ema12 > -0.169225 )
								if( tema <= 6.34178 )
									ret := 0.388889
								if( tema > 6.34178 )
									ret := -0.095238
					if( Raw_Money_Flow > 7.62428e+06 )
						ret := 1.000000 // buy
			if( Money_Flow_Ratio > 0.858761 )
				if( Money_Flow_Ratio <= 0.9857 )
					if( Negative_Money_Flow_Sum <= 5.16603e+06 )
						if( ema13 <= -0.022294 )
							if( ema3 <= 6.67373 )
								ret := -0.733333 // sell
							if( ema3 > 6.67373 )
								ret := -0.916667 // sell
						if( ema13 > -0.022294 )
							if( Negative_Money_Flow_Sum <= 4.9456e+06 )
								ret := -0.071429
							if( Negative_Money_Flow_Sum > 4.9456e+06 )
								ret := -0.642857
					if( Negative_Money_Flow_Sum > 5.16603e+06 )
						if( ema3 <= 7.03332 )
							if( Positive_Money_Flow_Sum <= 7.00088e+06 )
								if( ema2 <= 6.95945 )
									ret := 0.078261
								if( ema2 > 6.95945 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 7.00088e+06 )
								if( Negative_Money_Flow_Sum <= 7.54759e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 7.54759e+06 )
									ret := -0.263158
						if( ema3 > 7.03332 )
							ret := 0.687500
				if( Money_Flow_Ratio > 0.9857 )
					if( ema1 <= 6.9825 )
						if( Raw_Money_Flow <= 861884 )
							if( Negative_Money_Flow_Sum <= 6.39083e+06 )
								if( ema1 <= 6.93838 )
									ret := 0.298282
								if( ema1 > 6.93838 )
									ret := -0.009524
							if( Negative_Money_Flow_Sum > 6.39083e+06 )
								if( Negative_Money_Flow_Sum <= 8.50174e+06 )
									ret := 0.666667
								if( Negative_Money_Flow_Sum > 8.50174e+06 )
									ret := 0.078947
						if( Raw_Money_Flow > 861884 )
							if( Raw_Money_Flow <= 4.73006e+06 )
								if( Money_Flow_Ratio <= 1.23881 )
									ret := 0.262673
								if( Money_Flow_Ratio > 1.23881 )
									ret := 0.003484
							if( Raw_Money_Flow > 4.73006e+06 )
								if( Positive_Money_Flow <= 6.59197e+06 )
									ret := 0.888889 // buy
								if( Positive_Money_Flow > 6.59197e+06 )
									ret := 0.090909
					if( ema1 > 6.9825 )
						if( Raw_Money_Flow <= 439684 )
							if( Positive_Money_Flow_Sum <= 6.69932e+06 )
								if( MFI_High <= -14.6523 )
									ret := -0.526316
								if( MFI_High > -14.6523 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 6.69932e+06 )
								ret := 0.000000
						if( Raw_Money_Flow > 439684 )
							if( Positive_Money_Flow_Sum <= 7.94437e+06 )
								if( MFI_Low <= 33.7409 )
									ret := 0.900000 // buy
								if( MFI_Low > 33.7409 )
									ret := 0.098361
							if( Positive_Money_Flow_Sum > 7.94437e+06 )
								if( MFI_High <= -12.9601 )
									ret := -0.600000
								if( MFI_High > -12.9601 )
									ret := 0.285714
	if( tema > 7.04011 )
		if( Negative_Money_Flow <= 1.70603e+06 )
			if( ema2 <= 35.2248 )
				if( Positive_Money_Flow_Sum <= 1.28405e+08 )
					if( Positive_Money_Flow <= 1.08799e+07 )
						if( Positive_Money_Flow_Sum <= 1.00389e+08 )
							if( ema2 <= 15.3234 )
								if( Negative_Money_Flow_Sum <= 8.99051e+07 )
									ret := -0.023292
								if( Negative_Money_Flow_Sum > 8.99051e+07 )
									ret := 0.972973 // buy
							if( ema2 > 15.3234 )
								if( MFI_High <= -25.6315 )
									ret := -0.096310
								if( MFI_High > -25.6315 )
									ret := -0.023464
						if( Positive_Money_Flow_Sum > 1.00389e+08 )
							if( Raw_Money_Flow <= 1.02981e+07 )
								if( ema3 <= 29.1661 )
									ret := 0.533981
								if( ema3 > 29.1661 )
									ret := 0.230769
							if( Raw_Money_Flow > 1.02981e+07 )
								ret := -0.384615
					if( Positive_Money_Flow > 1.08799e+07 )
						if( Typical_Price <= 25.4272 )
							if( MFI_Low <= 41.0875 )
								if( Raw_Money_Flow <= 1.16507e+07 )
									ret := 0.066667
								if( Raw_Money_Flow > 1.16507e+07 )
									ret := 0.672043
							if( MFI_Low > 41.0875 )
								if( MFI_High <= 9.83863 )
									ret := -0.070352
								if( MFI_High > 9.83863 )
									ret := 0.761905 // buy
						if( Typical_Price > 25.4272 )
							if( Money_Flow_Ratio <= 0.441094 )
								ret := -1.000000 // sell
							if( Money_Flow_Ratio > 0.441094 )
								if( ema3 <= 25.2774 )
									ret := -0.655172
								if( ema3 > 25.2774 )
									ret := 0.076316
				if( Positive_Money_Flow_Sum > 1.28405e+08 )
					if( ema13 <= -3.46367 )
						ret := 1.000000 // buy
					if( ema13 > -3.46367 )
						if( tema <= 25.0832 )
							if( Positive_Money_Flow <= 7.85583e+06 )
								if( Raw_Money_Flow <= 6.3892e+06 )
									ret := -0.800000 // sell
								if( Raw_Money_Flow > 6.3892e+06 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow > 7.85583e+06 )
								if( ema2 <= 19.6615 )
									ret := -0.866667 // sell
								if( ema2 > 19.6615 )
									ret := 0.268293
						if( tema > 25.0832 )
							if( ema12 <= 0.530953 )
								if( tema <= 27.3496 )
									ret := -0.800000 // sell
								if( tema > 27.3496 )
									ret := -1.000000 // sell
							if( ema12 > 0.530953 )
								ret := -0.533333
			if( ema2 > 35.2248 )
				if( Positive_Money_Flow_Sum <= 7.64068e+07 )
					if( ema2 <= 48.5224 )
						if( MFI_High <= -12.1484 )
							if( ema13 <= 0.512004 )
								if( tema <= 42.5914 )
									ret := -0.001825
								if( tema > 42.5914 )
									ret := -0.304878
							if( ema13 > 0.512004 )
								if( Negative_Money_Flow_Sum <= 3.69628e+07 )
									ret := 0.968750 // buy
								if( Negative_Money_Flow_Sum > 3.69628e+07 )
									ret := 0.173913
						if( MFI_High > -12.1484 )
							if( Positive_Money_Flow <= 1.06e+07 )
								if( ema2 <= 46.4183 )
									ret := -0.686957
								if( ema2 > 46.4183 )
									ret := 0.375000
							if( Positive_Money_Flow > 1.06e+07 )
								ret := 0.050000
					if( ema2 > 48.5224 )
						if( Positive_Money_Flow <= 5.25431e+06 )
							ret := -0.769231 // sell
						if( Positive_Money_Flow > 5.25431e+06 )
							ret := -1.000000 // sell
				if( Positive_Money_Flow_Sum > 7.64068e+07 )
					if( Raw_Money_Flow <= 1.06974e+07 )
						if( ema3 <= 47.976 )
							if( Typical_Price <= 40.9586 )
								if( ema13 <= 0.99968 )
									ret := -0.954023 // sell
								if( ema13 > 0.99968 )
									ret := -0.416667
							if( Typical_Price > 40.9586 )
								if( ema2 <= 41.2509 )
									ret := -0.450000
								if( ema2 > 41.2509 )
									ret := -0.800000 // sell
						if( ema3 > 47.976 )
							ret := -0.187500
					if( Raw_Money_Flow > 1.06974e+07 )
						if( MFI_High <= -15.3382 )
							if( ema1 <= 38.1764 )
								if( Negative_Money_Flow_Sum <= 7.03936e+07 )
									ret := -0.833333 // sell
								if( Negative_Money_Flow_Sum > 7.03936e+07 )
									ret := 0.157895
							if( ema1 > 38.1764 )
								if( MFI <= 59.565 )
									ret := -0.571429
								if( MFI > 59.565 )
									ret := -0.847458 // sell
						if( MFI_High > -15.3382 )
							if( Negative_Money_Flow_Sum <= 3.17739e+07 )
								ret := -0.888889 // sell
							if( Negative_Money_Flow_Sum > 3.17739e+07 )
								if( Positive_Money_Flow_Sum <= 1.30246e+08 )
									ret := 0.863636 // buy
								if( Positive_Money_Flow_Sum > 1.30246e+08 )
									ret := 0.138889
		if( Negative_Money_Flow > 1.70603e+06 )
			if( Raw_Money_Flow <= 1.22978e+07 )
				if( Negative_Money_Flow_Sum <= 9.83665e+07 )
					if( Positive_Money_Flow_Sum <= 1.39156e+08 )
						if( ema1 <= 18.2748 )
							if( Positive_Money_Flow_Sum <= 6.62708e+06 )
								if( ema3 <= 17.5068 )
									ret := -0.035693
								if( ema3 > 17.5068 )
									ret := 0.464286
							if( Positive_Money_Flow_Sum > 6.62708e+06 )
								if( MFI_Low <= 23.5461 )
									ret := 0.237448
								if( MFI_Low > 23.5461 )
									ret := 0.075987
						if( ema1 > 18.2748 )
							if( Positive_Money_Flow_Sum <= 1.05886e+08 )
								if( ema3 <= 34.7918 )
									ret := 0.028747
								if( ema3 > 34.7918 )
									ret := -0.150562
							if( Positive_Money_Flow_Sum > 1.05886e+08 )
								if( Raw_Money_Flow <= 1.06007e+07 )
									ret := 0.775000 // buy
								if( Raw_Money_Flow > 1.06007e+07 )
									ret := -0.285714
					if( Positive_Money_Flow_Sum > 1.39156e+08 )
						if( ema2 <= 22.2272 )
							ret := 0.000000
						if( ema2 > 22.2272 )
							if( ema13 <= 0.678675 )
								ret := -0.777778 // sell
							if( ema13 > 0.678675 )
								if( Raw_Money_Flow <= 1.03717e+07 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 1.03717e+07 )
									ret := -0.818182 // sell
				if( Negative_Money_Flow_Sum > 9.83665e+07 )
					if( ema1 <= 29.2335 )
						if( Negative_Money_Flow_Sum <= 1.25295e+08 )
							if( ema13 <= -0.719685 )
								if( ema12 <= -0.77349 )
									ret := 0.625000
								if( ema12 > -0.77349 )
									ret := 0.981651 // buy
							if( ema13 > -0.719685 )
								if( MFI_High <= -53.0138 )
									ret := -0.470588
								if( MFI_High > -53.0138 )
									ret := 0.675000
						if( Negative_Money_Flow_Sum > 1.25295e+08 )
							if( ema13 <= -1.61453 )
								if( ema2 <= 21.141 )
									ret := -1.000000 // sell
								if( ema2 > 21.141 )
									ret := -0.583333
							if( ema13 > -1.61453 )
								if( ema12 <= -0.310341 )
									ret := 1.000000 // buy
								if( ema12 > -0.310341 )
									ret := -0.750000 // sell
					if( ema1 > 29.2335 )
						if( MFI <= 48.0552 )
							if( ema12 <= -0.607199 )
								if( ema1 <= 35.4228 )
									ret := -0.296296
								if( ema1 > 35.4228 )
									ret := -0.814815 // sell
							if( ema12 > -0.607199 )
								if( Raw_Money_Flow <= 1.02385e+07 )
									ret := 0.690722
								if( Raw_Money_Flow > 1.02385e+07 )
									ret := 0.130435
						if( MFI > 48.0552 )
							ret := -1.000000 // sell
			if( Raw_Money_Flow > 1.22978e+07 )
				if( MFI_Low <= 13.9008 )
					if( Positive_Money_Flow_Sum <= 3.99231e+06 )
						if( MFI_Low <= -14.9832 )
							ret := -0.454545
						if( MFI_Low > -14.9832 )
							ret := -0.812500 // sell
					if( Positive_Money_Flow_Sum > 3.99231e+06 )
						if( Money_Flow_Ratio <= 0.413005 )
							if( ema13 <= -2.18071 )
								ret := 1.000000 // buy
							if( ema13 > -2.18071 )
								if( ema3 <= 24.4641 )
									ret := 0.639053
								if( ema3 > 24.4641 )
									ret := 0.286920
						if( Money_Flow_Ratio > 0.413005 )
							if( Money_Flow_Ratio <= 0.489506 )
								if( Negative_Money_Flow <= 2.64556e+07 )
									ret := 0.964706 // buy
								if( Negative_Money_Flow > 2.64556e+07 )
									ret := 0.692308
							if( Money_Flow_Ratio > 0.489506 )
								if( MFI <= 33.3824 )
									ret := 0.200000
								if( MFI > 33.3824 )
									ret := 0.933333 // buy
				if( MFI_Low > 13.9008 )
					if( ema12 <= -0.257218 )
						if( Raw_Money_Flow <= 1.33993e+07 )
							if( MFI_High <= -44.6034 )
								ret := -0.727273 // sell
							if( MFI_High > -44.6034 )
								if( ema1 <= 30.2091 )
									ret := 0.888889 // buy
								if( ema1 > 30.2091 )
									ret := 0.500000
						if( Raw_Money_Flow > 1.33993e+07 )
							if( Money_Flow_Ratio <= 0.781818 )
								if( Positive_Money_Flow_Sum <= 7.06312e+07 )
									ret := -0.191489
								if( Positive_Money_Flow_Sum > 7.06312e+07 )
									ret := -0.950000 // sell
							if( Money_Flow_Ratio > 0.781818 )
								if( Positive_Money_Flow_Sum <= 2.01597e+08 )
									ret := 0.714286 // buy
								if( Positive_Money_Flow_Sum > 2.01597e+08 )
									ret := -0.818182 // sell
					if( ema12 > -0.257218 )
						if( MFI_High <= -31.5256 )
							if( ema2 <= 19.2295 )
								ret := 0.300000
							if( ema2 > 19.2295 )
								if( MFI_High <= -38.3583 )
									ret := 1.000000 // buy
								if( MFI_High > -38.3583 )
									ret := 0.896552 // buy
						if( MFI_High > -31.5256 )
							if( Typical_Price <= 27.6729 )
								if( ema2 <= 20.4393 )
									ret := 0.054054
								if( ema2 > 20.4393 )
									ret := 0.597826
							if( Typical_Price > 27.6729 )
								if( Negative_Money_Flow <= 1.89015e+07 )
									ret := -0.229814
								if( Negative_Money_Flow > 1.89015e+07 )
									ret := 0.483333
	
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
float op_operation = decision_tree_0_LINKUSDT_30Min_6201d2e0(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)

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


