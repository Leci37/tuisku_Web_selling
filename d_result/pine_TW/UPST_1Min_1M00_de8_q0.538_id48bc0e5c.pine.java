//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: UPST_1Min_1M00_48bc0e5c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Min_1M00_48bc0e5c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Min_48bc0e5c(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Positive_Money_Flow <= 148.033 )
		if( Money_Flow_Ratio <= 0.541357 )
			if( Negative_Money_Flow <= 43266.6 )
				if( MFI <= 23.5887 )
					if( Negative_Money_Flow <= 130.059 )
						if( Negative_Money_Flow_Sum <= 120410 )
							ret := -0.476190
						if( Negative_Money_Flow_Sum > 120410 )
							if( Positive_Money_Flow_Sum <= 17340.4 )
								ret := -0.416667
							if( Positive_Money_Flow_Sum > 17340.4 )
								if( Negative_Money_Flow_Sum <= 349605 )
									ret := 0.283784
								if( Negative_Money_Flow_Sum > 349605 )
									ret := 0.000000
					if( Negative_Money_Flow > 130.059 )
						if( MFI <= 7.94858 )
							if( Negative_Money_Flow_Sum <= 1.36168e+06 )
								if( Typical_Price <= 27.8252 )
									ret := 0.780000 // buy
								if( Typical_Price > 27.8252 )
									ret := -0.535714
							if( Negative_Money_Flow_Sum > 1.36168e+06 )
								if( MFI <= 4.65082 )
									ret := 0.592105
								if( MFI > 4.65082 )
									ret := 0.931818 // buy
						if( MFI > 7.94858 )
							if( MFI <= 9.42506 )
								if( MFI_High <= -71.7749 )
									ret := 0.222222
								if( MFI_High > -71.7749 )
									ret := -0.613636
							if( MFI > 9.42506 )
								if( MFI_Low <= -10.2988 )
									ret := 0.823529 // buy
								if( MFI_Low > -10.2988 )
									ret := 0.333333
				if( MFI > 23.5887 )
					if( Typical_Price <= 24.563 )
						if( MFI <= 25.2784 )
							if( Positive_Money_Flow_Sum <= 440684 )
								if( MFI_Low <= 4.60869 )
									ret := -0.441176
								if( MFI_Low > 4.60869 )
									ret := -0.888889 // sell
							if( Positive_Money_Flow_Sum > 440684 )
								ret := 0.166667
						if( MFI > 25.2784 )
							if( Raw_Money_Flow <= 35735 )
								if( Negative_Money_Flow_Sum <= 202894 )
									ret := -0.070588
								if( Negative_Money_Flow_Sum > 202894 )
									ret := 0.318008
							if( Raw_Money_Flow > 35735 )
								if( Negative_Money_Flow_Sum <= 525625 )
									ret := 0.028571
								if( Negative_Money_Flow_Sum > 525625 )
									ret := -0.373134
					if( Typical_Price > 24.563 )
						if( Raw_Money_Flow <= 42756.2 )
							if( Raw_Money_Flow <= 12702.6 )
								if( Money_Flow_Ratio <= 0.382792 )
									ret := 0.454054
								if( Money_Flow_Ratio > 0.382792 )
									ret := 0.207317
							if( Raw_Money_Flow > 12702.6 )
								if( MFI <= 34.3779 )
									ret := 0.046025
								if( MFI > 34.3779 )
									ret := 0.744186 // buy
						if( Raw_Money_Flow > 42756.2 )
							if( MFI_Low <= 10.3365 )
								if( Negative_Money_Flow <= 1413.34 )
									ret := 0.166667
								if( Negative_Money_Flow > 1413.34 )
									ret := 0.870968 // buy
							if( MFI_Low > 10.3365 )
								if( MFI_Low <= 11.1898 )
									ret := 0.166667
								if( MFI_Low > 11.1898 )
									ret := 0.571429
			if( Negative_Money_Flow > 43266.6 )
				if( Typical_Price <= 23.7858 )
					if( Raw_Money_Flow <= 85586.7 )
						if( Negative_Money_Flow_Sum <= 1.40405e+06 )
							if( Raw_Money_Flow <= 54518.7 )
								if( MFI <= 22.8373 )
									ret := -0.100000
								if( MFI > 22.8373 )
									ret := -0.507042
							if( Raw_Money_Flow > 54518.7 )
								if( Positive_Money_Flow_Sum <= 53130.7 )
									ret := 0.500000
								if( Positive_Money_Flow_Sum > 53130.7 )
									ret := -0.114286
						if( Negative_Money_Flow_Sum > 1.40405e+06 )
							if( Typical_Price <= 23.4407 )
								if( MFI_Low <= -2.05617 )
									ret := 0.264706
								if( MFI_Low > -2.05617 )
									ret := 0.657895
							if( Typical_Price > 23.4407 )
								ret := -0.111111
					if( Raw_Money_Flow > 85586.7 )
						if( Raw_Money_Flow <= 3.01813e+06 )
							if( Raw_Money_Flow <= 913505 )
								if( Negative_Money_Flow <= 750047 )
									ret := 0.168399
								if( Negative_Money_Flow > 750047 )
									ret := 0.724138 // buy
							if( Raw_Money_Flow > 913505 )
								if( Money_Flow_Ratio <= 0.145015 )
									ret := 0.297297
								if( Money_Flow_Ratio > 0.145015 )
									ret := -0.568182
						if( Raw_Money_Flow > 3.01813e+06 )
							ret := 1.000000 // buy
				if( Typical_Price > 23.7858 )
					if( Raw_Money_Flow <= 3.2991e+06 )
						if( Negative_Money_Flow <= 177375 )
							if( Positive_Money_Flow_Sum <= 77888.2 )
								if( MFI_Low <= 3.06178 )
									ret := 0.230263
								if( MFI_Low > 3.06178 )
									ret := 0.839286 // buy
							if( Positive_Money_Flow_Sum > 77888.2 )
								if( Raw_Money_Flow <= 140298 )
									ret := -0.009783
								if( Raw_Money_Flow > 140298 )
									ret := 0.247379
						if( Negative_Money_Flow > 177375 )
							if( MFI_High <= -63.4883 )
								if( MFI <= 15.9247 )
									ret := -0.121378
								if( MFI > 15.9247 )
									ret := -0.533981
							if( MFI_High > -63.4883 )
								if( Negative_Money_Flow <= 1.14181e+06 )
									ret := -0.056977
								if( Negative_Money_Flow > 1.14181e+06 )
									ret := 0.138889
					if( Raw_Money_Flow > 3.2991e+06 )
						if( Money_Flow_Ratio <= 0.1446 )
							if( Typical_Price <= 33.1817 )
								if( Positive_Money_Flow_Sum <= 754112 )
									ret := 0.733333 // buy
								if( Positive_Money_Flow_Sum > 754112 )
									ret := 0.083333
							if( Typical_Price > 33.1817 )
								if( Positive_Money_Flow_Sum <= 1.3013e+06 )
									ret := -0.527778
								if( Positive_Money_Flow_Sum > 1.3013e+06 )
									ret := 0.500000
						if( Money_Flow_Ratio > 0.1446 )
							if( MFI_Low <= 7.14669 )
								if( Positive_Money_Flow_Sum <= 3.38906e+06 )
									ret := 0.854839 // buy
								if( Positive_Money_Flow_Sum > 3.38906e+06 )
									ret := 0.682927
							if( MFI_Low > 7.14669 )
								if( MFI_High <= -47.0365 )
									ret := 0.952381 // buy
								if( MFI_High > -47.0365 )
									ret := 0.727273 // buy
		if( Money_Flow_Ratio > 0.541357 )
			if( Negative_Money_Flow_Sum <= 225718 )
				if( MFI <= 71.1718 )
					if( Negative_Money_Flow <= 1296.52 )
						if( Negative_Money_Flow <= 806.957 )
							if( Positive_Money_Flow_Sum <= 30085 )
								ret := 0.750000 // buy
							if( Positive_Money_Flow_Sum > 30085 )
								if( MFI_High <= -28.098 )
									ret := 0.136564
								if( MFI_High > -28.098 )
									ret := -0.055901
						if( Negative_Money_Flow > 806.957 )
							ret := -0.692308
					if( Negative_Money_Flow > 1296.52 )
						if( Positive_Money_Flow_Sum <= 105727 )
							if( Positive_Money_Flow_Sum <= 77434 )
								if( MFI <= 55.6415 )
									ret := 0.337838
								if( MFI > 55.6415 )
									ret := -0.172840
							if( Positive_Money_Flow_Sum > 77434 )
								if( Raw_Money_Flow <= 8684.94 )
									ret := 0.195531
								if( Raw_Money_Flow > 8684.94 )
									ret := -0.208202
						if( Positive_Money_Flow_Sum > 105727 )
							if( Negative_Money_Flow_Sum <= 84160.3 )
								if( MFI_Low <= 48.2031 )
									ret := 0.617021
								if( MFI_Low > 48.2031 )
									ret := 0.250000
							if( Negative_Money_Flow_Sum > 84160.3 )
								if( Raw_Money_Flow <= 30122.5 )
									ret := 0.347295
								if( Raw_Money_Flow > 30122.5 )
									ret := 0.152542
				if( MFI > 71.1718 )
					if( Money_Flow_Ratio <= 2.99858 )
						if( Money_Flow_Ratio <= 2.69471 )
							if( MFI_High <= -8.15412 )
								if( Raw_Money_Flow <= 13832.8 )
									ret := -0.368421
								if( Raw_Money_Flow > 13832.8 )
									ret := 0.166667
							if( MFI_High > -8.15412 )
								if( Typical_Price <= 34.2618 )
									ret := 0.523810
								if( Typical_Price > 34.2618 )
									ret := -0.240000
						if( Money_Flow_Ratio > 2.69471 )
							if( Positive_Money_Flow_Sum <= 220783 )
								if( MFI_Low <= 54.4651 )
									ret := -0.671233
								if( MFI_Low > 54.4651 )
									ret := -0.055556
							if( Positive_Money_Flow_Sum > 220783 )
								if( Money_Flow_Ratio <= 2.96908 )
									ret := -0.078431
								if( Money_Flow_Ratio > 2.96908 )
									ret := -0.666667
					if( Money_Flow_Ratio > 2.99858 )
						if( Negative_Money_Flow <= 2989.5 )
							if( Positive_Money_Flow_Sum <= 116394 )
								if( Money_Flow_Ratio <= 3.62566 )
									ret := 0.866667 // buy
								if( Money_Flow_Ratio > 3.62566 )
									ret := 0.312500
							if( Positive_Money_Flow_Sum > 116394 )
								if( Negative_Money_Flow_Sum <= 59299 )
									ret := -0.211180
								if( Negative_Money_Flow_Sum > 59299 )
									ret := 0.033333
						if( Negative_Money_Flow > 2989.5 )
							if( Typical_Price <= 28.195 )
								if( MFI_Low <= 69.3429 )
									ret := 0.380403
								if( MFI_Low > 69.3429 )
									ret := -0.108108
							if( Typical_Price > 28.195 )
								if( MFI_Low <= 63.5793 )
									ret := -0.059459
								if( MFI_Low > 63.5793 )
									ret := 0.318966
			if( Negative_Money_Flow_Sum > 225718 )
				if( Negative_Money_Flow_Sum <= 2.07253e+07 )
					if( Money_Flow_Ratio <= 0.623336 )
						if( Typical_Price <= 40.3418 )
							if( Negative_Money_Flow_Sum <= 276261 )
								if( Typical_Price <= 26.5832 )
									ret := 0.368421
								if( Typical_Price > 26.5832 )
									ret := 0.865385 // buy
							if( Negative_Money_Flow_Sum > 276261 )
								if( Positive_Money_Flow_Sum <= 186538 )
									ret := -0.766667 // sell
								if( Positive_Money_Flow_Sum > 186538 )
									ret := -0.086368
						if( Typical_Price > 40.3418 )
							if( Negative_Money_Flow <= 184179 )
								if( Positive_Money_Flow_Sum <= 241912 )
									ret := 0.437500
								if( Positive_Money_Flow_Sum > 241912 )
									ret := 0.133333
							if( Negative_Money_Flow > 184179 )
								if( Positive_Money_Flow_Sum <= 2.07827e+06 )
									ret := -0.163265
								if( Positive_Money_Flow_Sum > 2.07827e+06 )
									ret := -0.750000 // sell
					if( Money_Flow_Ratio > 0.623336 )
						if( Negative_Money_Flow_Sum <= 259181 )
							if( Raw_Money_Flow <= 58229.5 )
								if( MFI <= 66.8834 )
									ret := -0.425439
								if( MFI > 66.8834 )
									ret := 0.194444
							if( Raw_Money_Flow > 58229.5 )
								if( Negative_Money_Flow_Sum <= 234700 )
									ret := 0.600000
								if( Negative_Money_Flow_Sum > 234700 )
									ret := 0.051282
						if( Negative_Money_Flow_Sum > 259181 )
							if( Negative_Money_Flow <= 40599.8 )
								if( Negative_Money_Flow <= 1693.07 )
									ret := -0.067751
								if( Negative_Money_Flow > 1693.07 )
									ret := 0.165857
							if( Negative_Money_Flow > 40599.8 )
								if( Negative_Money_Flow <= 172960 )
									ret := -0.062068
								if( Negative_Money_Flow > 172960 )
									ret := 0.025271
				if( Negative_Money_Flow_Sum > 2.07253e+07 )
					if( Typical_Price <= 36.0759 )
						if( MFI_Low <= 41.3172 )
							if( MFI_Low <= 17.3285 )
								if( MFI <= 36.1681 )
									ret := 0.806452 // buy
								if( MFI > 36.1681 )
									ret := 1.000000 // buy
							if( MFI_Low > 17.3285 )
								if( Negative_Money_Flow_Sum <= 4.82835e+07 )
									ret := 0.320000
								if( Negative_Money_Flow_Sum > 4.82835e+07 )
									ret := 1.000000 // buy
						if( MFI_Low > 41.3172 )
							if( Negative_Money_Flow <= 3.82162e+06 )
								ret := 0.900000 // buy
							if( Negative_Money_Flow > 3.82162e+06 )
								ret := 1.000000 // buy
					if( Typical_Price > 36.0759 )
						if( MFI_High <= -20.7062 )
							if( Raw_Money_Flow <= 3.20991e+06 )
								if( MFI_High <= -27.7174 )
									ret := 0.464286
								if( MFI_High > -27.7174 )
									ret := -0.705882 // sell
							if( Raw_Money_Flow > 3.20991e+06 )
								if( Money_Flow_Ratio <= 1.08289 )
									ret := -0.906250 // sell
								if( Money_Flow_Ratio > 1.08289 )
									ret := -0.500000
						if( MFI_High > -20.7062 )
							if( MFI_Low <= 47.758 )
								ret := 0.904762 // buy
							if( MFI_Low > 47.758 )
								ret := 0.200000
	if( Positive_Money_Flow > 148.033 )
		if( Positive_Money_Flow_Sum <= 578327 )
			if( Positive_Money_Flow <= 224067 )
				if( Negative_Money_Flow <= 279.927 )
					if( Money_Flow_Ratio <= 1.79443 )
						if( Typical_Price <= 35.5269 )
							if( Raw_Money_Flow <= 16880.4 )
								if( Positive_Money_Flow <= 4529.44 )
									ret := -0.435103
								if( Positive_Money_Flow > 4529.44 )
									ret := -0.172477
							if( Raw_Money_Flow > 16880.4 )
								if( Typical_Price <= 26.3805 )
									ret := 0.009962
								if( Typical_Price > 26.3805 )
									ret := -0.143208
						if( Typical_Price > 35.5269 )
							if( Money_Flow_Ratio <= 0.566652 )
								if( Raw_Money_Flow <= 53562.7 )
									ret := 0.062378
								if( Raw_Money_Flow > 53562.7 )
									ret := 0.377358
							if( Money_Flow_Ratio > 0.566652 )
								if( Money_Flow_Ratio <= 0.992209 )
									ret := -0.206311
								if( Money_Flow_Ratio > 0.992209 )
									ret := 0.030635
					if( Money_Flow_Ratio > 1.79443 )
						if( Positive_Money_Flow <= 28866.4 )
							if( Positive_Money_Flow_Sum <= 152176 )
								if( MFI <= 69.0071 )
									ret := -0.189349
								if( MFI > 69.0071 )
									ret := 0.217391
							if( Positive_Money_Flow_Sum > 152176 )
								if( Typical_Price <= 35.2274 )
									ret := -0.379679
								if( Typical_Price > 35.2274 )
									ret := -0.003571
						if( Positive_Money_Flow > 28866.4 )
							if( Typical_Price <= 35.344 )
								if( Money_Flow_Ratio <= 2.63962 )
									ret := -0.342949
								if( Money_Flow_Ratio > 2.63962 )
									ret := -0.501062
							if( Typical_Price > 35.344 )
								if( Negative_Money_Flow_Sum <= 83951 )
									ret := -0.400000
								if( Negative_Money_Flow_Sum > 83951 )
									ret := -0.010000
				if( Negative_Money_Flow > 279.927 )
					if( Negative_Money_Flow_Sum <= 68045.3 )
						if( Money_Flow_Ratio <= 0.858772 )
							ret := -0.777778 // sell
						if( Money_Flow_Ratio > 0.858772 )
							if( MFI <= 68.9442 )
								if( Money_Flow_Ratio <= 1.68871 )
									ret := 0.600000
								if( Money_Flow_Ratio > 1.68871 )
									ret := 1.000000 // buy
							if( MFI > 68.9442 )
								if( MFI <= 74.3841 )
									ret := -0.300000
								if( MFI > 74.3841 )
									ret := 0.469027
					if( Negative_Money_Flow_Sum > 68045.3 )
						if( Money_Flow_Ratio <= 3.04536 )
							if( Negative_Money_Flow <= 648.481 )
								if( MFI <= 25.5273 )
									ret := -0.130435
								if( MFI > 25.5273 )
									ret := 0.614035
							if( Negative_Money_Flow > 648.481 )
								if( Raw_Money_Flow <= 10846.3 )
									ret := 0.092486
								if( Raw_Money_Flow > 10846.3 )
									ret := -0.195358
						if( Money_Flow_Ratio > 3.04536 )
							if( Money_Flow_Ratio <= 4.85798 )
								if( Typical_Price <= 27.1146 )
									ret := -1.000000 // sell
								if( Typical_Price > 27.1146 )
									ret := -0.696970
							if( Money_Flow_Ratio > 4.85798 )
								ret := -0.230769
			if( Positive_Money_Flow > 224067 )
				if( Typical_Price <= 40.8747 )
					if( MFI_High <= -7.18564 )
						if( MFI <= 9.57298 )
							ret := -0.941176 // sell
						if( MFI > 9.57298 )
							if( Typical_Price <= 35.875 )
								if( Positive_Money_Flow <= 358507 )
									ret := -0.343284
								if( Positive_Money_Flow > 358507 )
									ret := -0.772727 // sell
							if( Typical_Price > 35.875 )
								ret := 0.176471
					if( MFI_High > -7.18564 )
						if( MFI <= 84.109 )
							if( Positive_Money_Flow_Sum <= 527449 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 527449 )
								ret := -0.888889 // sell
						if( MFI > 84.109 )
							ret := -0.700000 // sell
				if( Typical_Price > 40.8747 )
					ret := 0.333333
		if( Positive_Money_Flow_Sum > 578327 )
			if( MFI <= 81.5159 )
				if( MFI_High <= -20.4453 )
					if( Positive_Money_Flow_Sum <= 2.74074e+06 )
						if( Money_Flow_Ratio <= 1.04659 )
							if( Money_Flow_Ratio <= 0.81992 )
								if( Positive_Money_Flow <= 554727 )
									ret := 0.016391
								if( Positive_Money_Flow > 554727 )
									ret := -0.133333
							if( Money_Flow_Ratio > 0.81992 )
								if( Negative_Money_Flow_Sum <= 2.21543e+06 )
									ret := 0.074519
								if( Negative_Money_Flow_Sum > 2.21543e+06 )
									ret := 0.344828
						if( Money_Flow_Ratio > 1.04659 )
							if( Money_Flow_Ratio <= 1.10997 )
								if( Positive_Money_Flow <= 305883 )
									ret := -0.270341
								if( Positive_Money_Flow > 305883 )
									ret := 0.060241
							if( Money_Flow_Ratio > 1.10997 )
								if( Raw_Money_Flow <= 787467 )
									ret := -0.009483
								if( Raw_Money_Flow > 787467 )
									ret := -0.533333
					if( Positive_Money_Flow_Sum > 2.74074e+06 )
						if( MFI_Low <= 6.17485 )
							if( MFI_Low <= 4.69163 )
								if( Negative_Money_Flow_Sum <= 1.19118e+07 )
									ret := 0.384615
								if( Negative_Money_Flow_Sum > 1.19118e+07 )
									ret := -0.067485
							if( MFI_Low > 4.69163 )
								if( Typical_Price <= 38.8788 )
									ret := 0.631148
								if( Typical_Price > 38.8788 )
									ret := -0.388889
						if( MFI_Low > 6.17485 )
							if( Positive_Money_Flow_Sum <= 5.00689e+06 )
								if( MFI <= 29.487 )
									ret := -0.467033
								if( MFI > 29.487 )
									ret := -0.127263
							if( Positive_Money_Flow_Sum > 5.00689e+06 )
								if( Negative_Money_Flow_Sum <= 1.48009e+07 )
									ret := 0.044152
								if( Negative_Money_Flow_Sum > 1.48009e+07 )
									ret := -0.159477
				if( MFI_High > -20.4453 )
					if( Negative_Money_Flow_Sum <= 2.65994e+07 )
						if( Negative_Money_Flow_Sum <= 1.34243e+07 )
							if( Raw_Money_Flow <= 469461 )
								if( Positive_Money_Flow_Sum <= 5.91599e+06 )
									ret := 0.019383
								if( Positive_Money_Flow_Sum > 5.91599e+06 )
									ret := -0.182540
							if( Raw_Money_Flow > 469461 )
								if( Positive_Money_Flow <= 1.13122e+06 )
									ret := 0.164638
								if( Positive_Money_Flow > 1.13122e+06 )
									ret := 0.009963
						if( Negative_Money_Flow_Sum > 1.34243e+07 )
							if( Typical_Price <= 36.2357 )
								if( Positive_Money_Flow <= 6.90605e+06 )
									ret := 0.866667 // buy
								if( Positive_Money_Flow > 6.90605e+06 )
									ret := 0.300000
							if( Typical_Price > 36.2357 )
								if( Negative_Money_Flow_Sum <= 2.17661e+07 )
									ret := 0.177778
								if( Negative_Money_Flow_Sum > 2.17661e+07 )
									ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 2.65994e+07 )
						ret := -1.000000 // sell
			if( MFI > 81.5159 )
				if( Negative_Money_Flow <= 53772 )
					if( Typical_Price <= 31.0907 )
						if( Negative_Money_Flow_Sum <= 2.17799e+06 )
							if( MFI_Low <= 66.4428 )
								if( Negative_Money_Flow_Sum <= 143259 )
									ret := -0.489362
								if( Negative_Money_Flow_Sum > 143259 )
									ret := -0.024427
							if( MFI_Low > 66.4428 )
								if( Money_Flow_Ratio <= 6.62966 )
									ret := -0.520000
								if( Money_Flow_Ratio > 6.62966 )
									ret := -0.265033
						if( Negative_Money_Flow_Sum > 2.17799e+06 )
							if( MFI_High <= 5.60376 )
								if( Positive_Money_Flow <= 682733 )
									ret := -0.166667
								if( Positive_Money_Flow > 682733 )
									ret := -0.901408 // sell
							if( MFI_High > 5.60376 )
								if( MFI <= 87.9556 )
									ret := 0.416667
								if( MFI > 87.9556 )
									ret := 0.900000 // buy
					if( Typical_Price > 31.0907 )
						if( Raw_Money_Flow <= 1.71541e+06 )
							if( MFI_Low <= 76.33 )
								if( Negative_Money_Flow_Sum <= 1.5469e+06 )
									ret := 0.020811
								if( Negative_Money_Flow_Sum > 1.5469e+06 )
									ret := -0.295139
							if( MFI_Low > 76.33 )
								if( Typical_Price <= 41.3636 )
									ret := -0.745098 // sell
								if( Typical_Price > 41.3636 )
									ret := -0.235294
						if( Raw_Money_Flow > 1.71541e+06 )
							if( MFI_High <= 11.4501 )
								if( Typical_Price <= 43.9799 )
									ret := -0.109635
								if( Typical_Price > 43.9799 )
									ret := 0.647059
							if( MFI_High > 11.4501 )
								if( Negative_Money_Flow_Sum <= 1.2315e+06 )
									ret := 0.821429 // buy
								if( Negative_Money_Flow_Sum > 1.2315e+06 )
									ret := 0.034483
				if( Negative_Money_Flow > 53772 )
					if( MFI <= 84.4337 )
						if( Typical_Price <= 39.7147 )
							ret := 0.368421
						if( Typical_Price > 39.7147 )
							ret := -0.727273 // sell
					if( MFI > 84.4337 )
						if( Positive_Money_Flow_Sum <= 1.03721e+07 )
							if( Raw_Money_Flow <= 219104 )
								ret := -1.000000 // sell
							if( Raw_Money_Flow > 219104 )
								ret := -0.866667 // sell
						if( Positive_Money_Flow_Sum > 1.03721e+07 )
							if( MFI_Low <= 69.072 )
								ret := -0.750000 // sell
							if( MFI_Low > 69.072 )
								ret := 0.200000
	
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
float op_operation = decision_tree_0_UPST_1Min_48bc0e5c(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)

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


