//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: MATICUSDT_30Min_2MT0_088c7585 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_30Min_2MT0_088c7585", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_30Min_088c7585(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.017103 )
		if( Typical_Price <= 1.84222 )
			if( MFI_High <= -51.3655 )
				if( Negative_Money_Flow_Sum <= 8.09702e+07 )
					if( Raw_Money_Flow <= 6.36499e+06 )
						if( Positive_Money_Flow_Sum <= 1.78274e+07 )
							if( tema <= 0.817306 )
								if( ema13 <= -0.038013 )
									ret := 0.969697 // buy
								if( ema13 > -0.038013 )
									ret := 0.275862
							if( tema > 0.817306 )
								if( ema13 <= -0.031743 )
									ret := 0.219298
								if( ema13 > -0.031743 )
									ret := 0.573171
						if( Positive_Money_Flow_Sum > 1.78274e+07 )
							if( Positive_Money_Flow_Sum <= 2.15977e+07 )
								if( Raw_Money_Flow <= 5.21809e+06 )
									ret := 0.800000 // buy
								if( Raw_Money_Flow > 5.21809e+06 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 2.15977e+07 )
								if( Positive_Money_Flow <= 3.43246e+06 )
									ret := 0.250000
								if( Positive_Money_Flow > 3.43246e+06 )
									ret := 1.000000 // buy
					if( Raw_Money_Flow > 6.36499e+06 )
						if( Money_Flow_Ratio <= 0.089388 )
							if( ema1 <= 0.827331 )
								ret := 0.000000
							if( ema1 > 0.827331 )
								ret := -1.000000 // sell
						if( Money_Flow_Ratio > 0.089388 )
							if( MFI_High <= -58.2831 )
								if( Negative_Money_Flow <= 2.08283e+07 )
									ret := 0.512605
								if( Negative_Money_Flow > 2.08283e+07 )
									ret := -0.600000
							if( MFI_High > -58.2831 )
								if( Negative_Money_Flow_Sum <= 6.53429e+07 )
									ret := 0.071429
								if( Negative_Money_Flow_Sum > 6.53429e+07 )
									ret := -0.516129
				if( Negative_Money_Flow_Sum > 8.09702e+07 )
					if( Positive_Money_Flow_Sum <= 7.83702e+07 )
						if( Negative_Money_Flow_Sum <= 1.35238e+08 )
							if( ema12 <= -0.058984 )
								ret := -0.500000
							if( ema12 > -0.058984 )
								if( Positive_Money_Flow <= 1.61146e+07 )
									ret := 0.728097 // buy
								if( Positive_Money_Flow > 1.61146e+07 )
									ret := -0.166667
						if( Negative_Money_Flow_Sum > 1.35238e+08 )
							if( Negative_Money_Flow_Sum <= 1.43351e+08 )
								if( Negative_Money_Flow_Sum <= 1.39808e+08 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 1.39808e+08 )
									ret := -0.750000 // sell
							if( Negative_Money_Flow_Sum > 1.43351e+08 )
								if( Raw_Money_Flow <= 1.9631e+07 )
									ret := 0.205882
								if( Raw_Money_Flow > 1.9631e+07 )
									ret := 0.650943
					if( Positive_Money_Flow_Sum > 7.83702e+07 )
						if( Raw_Money_Flow <= 2.5977e+07 )
							if( Typical_Price <= 1.60517 )
								if( tema <= 1.3498 )
									ret := -1.000000 // sell
								if( tema > 1.3498 )
									ret := 0.900000 // buy
							if( Typical_Price > 1.60517 )
								ret := -1.000000 // sell
						if( Raw_Money_Flow > 2.5977e+07 )
							if( ema1 <= 1.01125 )
								ret := -0.500000
							if( ema1 > 1.01125 )
								if( Negative_Money_Flow_Sum <= 2.9793e+08 )
									ret := 0.571429
								if( Negative_Money_Flow_Sum > 2.9793e+08 )
									ret := 1.000000 // buy
			if( MFI_High > -51.3655 )
				if( Positive_Money_Flow_Sum <= 1.8372e+08 )
					if( ema13 <= -0.029363 )
						if( Money_Flow_Ratio <= 0.451454 )
							if( Typical_Price <= 1.25776 )
								if( Raw_Money_Flow <= 1.14872e+07 )
									ret := -0.073171
								if( Raw_Money_Flow > 1.14872e+07 )
									ret := 0.875000 // buy
							if( Typical_Price > 1.25776 )
								if( ema2 <= 1.80322 )
									ret := -0.555556
								if( ema2 > 1.80322 )
									ret := 0.300000
						if( Money_Flow_Ratio > 0.451454 )
							if( ema2 <= 0.838794 )
								if( MFI_Low <= 14.1114 )
									ret := 0.857143 // buy
								if( MFI_Low > 14.1114 )
									ret := -0.750000 // sell
							if( ema2 > 0.838794 )
								if( ema1 <= 1.14122 )
									ret := 0.547826
								if( ema1 > 1.14122 )
									ret := 0.050000
					if( ema13 > -0.029363 )
						if( Positive_Money_Flow_Sum <= 6.38236e+07 )
							if( Negative_Money_Flow <= 1.68435e+06 )
								if( ema13 <= -0.025987 )
									ret := -0.714286 // sell
								if( ema13 > -0.025987 )
									ret := 0.200000
							if( Negative_Money_Flow > 1.68435e+06 )
								if( Raw_Money_Flow <= 1.24427e+07 )
									ret := 0.710526 // buy
								if( Raw_Money_Flow > 1.24427e+07 )
									ret := -0.181818
						if( Positive_Money_Flow_Sum > 6.38236e+07 )
							if( Positive_Money_Flow <= 1.83975e+07 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow > 1.83975e+07 )
								ret := 0.333333
				if( Positive_Money_Flow_Sum > 1.8372e+08 )
					if( Negative_Money_Flow_Sum <= 2.34599e+08 )
						if( MFI_Low <= 35.9346 )
							if( Positive_Money_Flow_Sum <= 1.9327e+08 )
								ret := 0.000000
							if( Positive_Money_Flow_Sum > 1.9327e+08 )
								ret := -1.000000 // sell
						if( MFI_Low > 35.9346 )
							ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 2.34599e+08 )
						if( Positive_Money_Flow <= 4.2166e+07 )
							if( ema12 <= -0.07131 )
								if( Negative_Money_Flow_Sum <= 6.7307e+08 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 6.7307e+08 )
									ret := 1.000000 // buy
							if( ema12 > -0.07131 )
								if( ema13 <= -0.106257 )
									ret := 0.846154 // buy
								if( ema13 > -0.106257 )
									ret := 1.000000 // buy
						if( Positive_Money_Flow > 4.2166e+07 )
							if( MFI_Low <= 26.895 )
								ret := -0.250000
							if( MFI_Low > 26.895 )
								ret := 0.666667
		if( Typical_Price > 1.84222 )
			if( Money_Flow_Ratio <= 0.527098 )
				if( Raw_Money_Flow <= 2.59812e+07 )
					if( ema3 <= 2.08394 )
						if( ema13 <= -0.031624 )
							if( Negative_Money_Flow_Sum <= 5.60854e+07 )
								if( Negative_Money_Flow_Sum <= 5.48612e+07 )
									ret := 0.266667
								if( Negative_Money_Flow_Sum > 5.48612e+07 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 5.60854e+07 )
								if( Negative_Money_Flow_Sum <= 1.4199e+08 )
									ret := 0.594595
								if( Negative_Money_Flow_Sum > 1.4199e+08 )
									ret := -0.076923
						if( ema13 > -0.031624 )
							if( Negative_Money_Flow_Sum <= 6.33368e+07 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 6.33368e+07 )
								if( ema12 <= -0.019336 )
									ret := 0.285714
								if( ema12 > -0.019336 )
									ret := -0.500000
					if( ema3 > 2.08394 )
						if( ema13 <= -0.085043 )
							if( Negative_Money_Flow <= 4.63251e+06 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow > 4.63251e+06 )
								ret := -0.400000
						if( ema13 > -0.085043 )
							if( Positive_Money_Flow_Sum <= 1.62920e+07 )
								if( Positive_Money_Flow_Sum <= 1.03766e+07 )
									ret := -0.185185
								if( Positive_Money_Flow_Sum > 1.03766e+07 )
									ret := -0.750000 // sell
							if( Positive_Money_Flow_Sum > 1.62920e+07 )
								if( ema12 <= -0.034367 )
									ret := 0.454545
								if( ema12 > -0.034367 )
									ret := -0.071429
				if( Raw_Money_Flow > 2.59812e+07 )
					if( Typical_Price <= 2.16943 )
						if( Negative_Money_Flow <= 3.33294e+07 )
							if( Raw_Money_Flow <= 6.11386e+07 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 6.11386e+07 )
								ret := 0.750000 // buy
						if( Negative_Money_Flow > 3.33294e+07 )
							if( Negative_Money_Flow <= 4.14399e+07 )
								if( Raw_Money_Flow <= 3.84686e+07 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 3.84686e+07 )
									ret := -0.500000
							if( Negative_Money_Flow > 4.14399e+07 )
								if( ema1 <= 2.11696 )
									ret := 0.944444 // buy
								if( ema1 > 2.11696 )
									ret := 0.125000
					if( Typical_Price > 2.16943 )
						ret := -1.000000 // sell
			if( Money_Flow_Ratio > 0.527098 )
				if( Negative_Money_Flow_Sum <= 1.25647e+08 )
					if( Negative_Money_Flow_Sum <= 9.00973e+07 )
						if( Negative_Money_Flow_Sum <= 7.83956e+07 )
							if( Positive_Money_Flow <= 5.29398e+06 )
								if( Negative_Money_Flow_Sum <= 3.94342e+07 )
									ret := 0.666667
								if( Negative_Money_Flow_Sum > 3.94342e+07 )
									ret := -0.173077
							if( Positive_Money_Flow > 5.29398e+06 )
								if( ema12 <= -0.024166 )
									ret := 1.000000 // buy
								if( ema12 > -0.024166 )
									ret := 0.428571
						if( Negative_Money_Flow_Sum > 7.83956e+07 )
							if( ema1 <= 2.08244 )
								if( Negative_Money_Flow <= 8.5427e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 8.5427e+06 )
									ret := -0.750000 // sell
							if( ema1 > 2.08244 )
								ret := -0.400000
					if( Negative_Money_Flow_Sum > 9.00973e+07 )
						if( Typical_Price <= 2.26044 )
							if( Raw_Money_Flow <= 1.59455e+07 )
								if( Positive_Money_Flow_Sum <= 6.63661e+07 )
									ret := 0.500000
								if( Positive_Money_Flow_Sum > 6.63661e+07 )
									ret := 0.916667 // buy
							if( Raw_Money_Flow > 1.59455e+07 )
								ret := 1.000000 // buy
						if( Typical_Price > 2.26044 )
							ret := 0.000000
				if( Negative_Money_Flow_Sum > 1.25647e+08 )
					if( Negative_Money_Flow <= 5.56676e+07 )
						if( Raw_Money_Flow <= 2.21494e+07 )
							if( ema12 <= -0.026382 )
								ret := -1.000000 // sell
							if( ema12 > -0.026382 )
								if( ema13 <= -0.037905 )
									ret := -0.666667
								if( ema13 > -0.037905 )
									ret := -1.000000 // sell
						if( Raw_Money_Flow > 2.21494e+07 )
							if( Typical_Price <= 2.14951 )
								if( ema13 <= -0.031578 )
									ret := -0.775510 // sell
								if( ema13 > -0.031578 )
									ret := 0.250000
							if( Typical_Price > 2.14951 )
								if( ema12 <= -0.025582 )
									ret := -0.250000
								if( ema12 > -0.025582 )
									ret := 0.500000
					if( Negative_Money_Flow > 5.56676e+07 )
						if( Positive_Money_Flow_Sum <= 6.21002e+08 )
							ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 6.21002e+08 )
							if( Typical_Price <= 2.08246 )
								ret := -0.500000
							if( Typical_Price > 2.08246 )
								ret := -1.000000 // sell
	if( ema12 > -0.017103 )
		if( Typical_Price <= 0.361693 )
			if( MFI_High <= -7.20116 )
				if( Negative_Money_Flow <= 45641.7 )
					if( Raw_Money_Flow <= 1.65915e+06 )
						if( Positive_Money_Flow_Sum <= 1.49066e+07 )
							if( ema12 <= 6.1e-05 )
								if( Positive_Money_Flow_Sum <= 1.16862e+07 )
									ret := 0.125235
								if( Positive_Money_Flow_Sum > 1.16862e+07 )
									ret := -0.500000
							if( ema12 > 6.1e-05 )
								if( ema3 <= 0.050084 )
									ret := -0.019341
								if( ema3 > 0.050084 )
									ret := 0.165929
						if( Positive_Money_Flow_Sum > 1.49066e+07 )
							if( Negative_Money_Flow_Sum <= 7.73905e+06 )
								if( tema <= 0.077724 )
									ret := 0.750000 // buy
								if( tema > 0.077724 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 7.73905e+06 )
								if( Positive_Money_Flow_Sum <= 1.76386e+07 )
									ret := 0.758621 // buy
								if( Positive_Money_Flow_Sum > 1.76386e+07 )
									ret := -0.086957
					if( Raw_Money_Flow > 1.65915e+06 )
						if( Positive_Money_Flow_Sum <= 2.15868e+07 )
							if( ema2 <= 0.343504 )
								if( ema13 <= 0.004236 )
									ret := -0.309237
								if( ema13 > 0.004236 )
									ret := -0.775000 // sell
							if( ema2 > 0.343504 )
								if( tema <= 0.331206 )
									ret := 1.000000 // buy
								if( tema > 0.331206 )
									ret := -0.021277
						if( Positive_Money_Flow_Sum > 2.15868e+07 )
							if( Negative_Money_Flow_Sum <= 2.76918e+07 )
								if( ema12 <= 0.003481 )
									ret := 0.949153 // buy
								if( ema12 > 0.003481 )
									ret := -0.064516
							if( Negative_Money_Flow_Sum > 2.76918e+07 )
								if( Positive_Money_Flow_Sum <= 6.69815e+07 )
									ret := -0.280000
								if( Positive_Money_Flow_Sum > 6.69815e+07 )
									ret := 1.000000 // buy
				if( Negative_Money_Flow > 45641.7 )
					if( ema12 <= -0.000918 )
						if( ema13 <= -0.019997 )
							if( tema <= 0.339399 )
								ret := 0.000000
							if( tema > 0.339399 )
								if( Negative_Money_Flow_Sum <= 3.99585e+07 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 3.99585e+07 )
									ret := -0.500000
						if( ema13 > -0.019997 )
							if( ema13 <= -0.011817 )
								if( ema13 <= -0.015601 )
									ret := 0.666667
								if( ema13 > -0.015601 )
									ret := 0.942857 // buy
							if( ema13 > -0.011817 )
								if( Raw_Money_Flow <= 224331 )
									ret := -0.636364
								if( Raw_Money_Flow > 224331 )
									ret := 0.371560
					if( ema12 > -0.000918 )
						if( Money_Flow_Ratio <= 1.75078 )
							if( Negative_Money_Flow_Sum <= 549635 )
								if( ema3 <= 0.017678 )
									ret := 0.047619
								if( ema3 > 0.017678 )
									ret := 0.398950
							if( Negative_Money_Flow_Sum > 549635 )
								if( ema13 <= -0.000336 )
									ret := 0.186230
								if( ema13 > -0.000336 )
									ret := 0.052429
						if( Money_Flow_Ratio > 1.75078 )
							if( ema13 <= 0.000279 )
								if( tema <= 0.018257 )
									ret := 0.408163
								if( tema > 0.018257 )
									ret := -0.094737
							if( ema13 > 0.000279 )
								if( ema12 <= 0.003044 )
									ret := 0.518135
								if( ema12 > 0.003044 )
									ret := 0.082353
			if( MFI_High > -7.20116 )
				if( Positive_Money_Flow <= 23922.3 )
					if( Negative_Money_Flow <= 92434.4 )
						if( tema <= 0.018141 )
							if( tema <= 0.013371 )
								ret := -0.571429
							if( tema > 0.013371 )
								if( Raw_Money_Flow <= 72951.3 )
									ret := 0.281250
								if( Raw_Money_Flow > 72951.3 )
									ret := -0.750000 // sell
						if( tema > 0.018141 )
							if( ema2 <= 0.018488 )
								if( Raw_Money_Flow <= 20397.4 )
									ret := 0.111111
								if( Raw_Money_Flow > 20397.4 )
									ret := -0.760000 // sell
							if( ema2 > 0.018488 )
								if( Positive_Money_Flow_Sum <= 560916 )
									ret := -0.322034
								if( Positive_Money_Flow_Sum > 560916 )
									ret := 0.184211
					if( Negative_Money_Flow > 92434.4 )
						if( MFI_Low <= 60.223 )
							if( ema13 <= 0.004059 )
								if( MFI <= 75.2635 )
									ret := 0.828571 // buy
								if( MFI > 75.2635 )
									ret := 0.204082
							if( ema13 > 0.004059 )
								if( Negative_Money_Flow <= 1.34728e+06 )
									ret := 0.666667
								if( Negative_Money_Flow > 1.34728e+06 )
									ret := -0.472222
						if( MFI_Low > 60.223 )
							if( Positive_Money_Flow_Sum <= 5.08915e+06 )
								if( tema <= 0.019124 )
									ret := 1.000000 // buy
								if( tema > 0.019124 )
									ret := -0.200000
							if( Positive_Money_Flow_Sum > 5.08915e+06 )
								if( Negative_Money_Flow_Sum <= 1.17511e+06 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 1.17511e+06 )
									ret := 0.958333 // buy
				if( Positive_Money_Flow > 23922.3 )
					if( Negative_Money_Flow <= 13558.1 )
						if( Negative_Money_Flow_Sum <= 3.06132e+06 )
							if( ema12 <= 4.3e-05 )
								if( Typical_Price <= 0.019714 )
									ret := 0.625000
								if( Typical_Price > 0.019714 )
									ret := -0.200000
							if( ema12 > 4.3e-05 )
								if( ema3 <= 0.017142 )
									ret := -0.098592
								if( ema3 > 0.017142 )
									ret := -0.389199
						if( Negative_Money_Flow_Sum > 3.06132e+06 )
							if( ema13 <= 0.004971 )
								if( Typical_Price <= 0.228903 )
									ret := 0.814815 // buy
								if( Typical_Price > 0.228903 )
									ret := -0.142857
							if( ema13 > 0.004971 )
								if( Positive_Money_Flow_Sum <= 2.11321e+07 )
									ret := -0.625000
								if( Positive_Money_Flow_Sum > 2.11321e+07 )
									ret := 0.032787
					if( Negative_Money_Flow > 13558.1 )
						if( Negative_Money_Flow_Sum <= 1.37845e+06 )
							if( Raw_Money_Flow <= 315128 )
								if( ema12 <= 0.000192 )
									ret := 0.142857
								if( ema12 > 0.000192 )
									ret := 1.000000 // buy
							if( Raw_Money_Flow > 315128 )
								ret := 0.000000
						if( Negative_Money_Flow_Sum > 1.37845e+06 )
							if( MFI_High <= -2.35521 )
								ret := -1.000000 // sell
							if( MFI_High > -2.35521 )
								ret := 0.200000
		if( Typical_Price > 0.361693 )
			if( Negative_Money_Flow <= 2.31008e+06 )
				if( tema <= 1.64365 )
					if( Positive_Money_Flow_Sum <= 7.3311e+06 )
						if( Negative_Money_Flow_Sum <= 5.58136e+06 )
							if( Typical_Price <= 1.13065 )
								if( ema12 <= 0.001566 )
									ret := 0.015167
								if( ema12 > 0.001566 )
									ret := 0.099407
							if( Typical_Price > 1.13065 )
								if( Positive_Money_Flow_Sum <= 5.4153e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 5.4153e+06 )
									ret := -0.335821
						if( Negative_Money_Flow_Sum > 5.58136e+06 )
							if( Raw_Money_Flow <= 866763 )
								if( Negative_Money_Flow <= 866228 )
									ret := -0.082710
								if( Negative_Money_Flow > 866228 )
									ret := -1.000000 // sell
							if( Raw_Money_Flow > 866763 )
								if( Positive_Money_Flow_Sum <= 5.32183e+06 )
									ret := 0.047688
								if( Positive_Money_Flow_Sum > 5.32183e+06 )
									ret := -0.066723
					if( Positive_Money_Flow_Sum > 7.3311e+06 )
						if( Negative_Money_Flow_Sum <= 1.91171e+06 )
							if( MFI <= 86.8601 )
								if( Raw_Money_Flow <= 566707 )
									ret := -0.285714
								if( Raw_Money_Flow > 566707 )
									ret := 0.703704 // buy
							if( MFI > 86.8601 )
								if( Raw_Money_Flow <= 8.40301e+06 )
									ret := 0.203704
								if( Raw_Money_Flow > 8.40301e+06 )
									ret := -0.625000
						if( Negative_Money_Flow_Sum > 1.91171e+06 )
							if( Typical_Price <= 0.920319 )
								if( Negative_Money_Flow_Sum <= 7.26612e+06 )
									ret := 0.007068
								if( Negative_Money_Flow_Sum > 7.26612e+06 )
									ret := 0.096853
							if( Typical_Price > 0.920319 )
								if( ema1 <= 0.958222 )
									ret := -0.080780
								if( ema1 > 0.958222 )
									ret := 0.025085
				if( tema > 1.64365 )
					if( Positive_Money_Flow_Sum <= 1.48801e+08 )
						if( Money_Flow_Ratio <= 4.85482 )
							if( Negative_Money_Flow_Sum <= 1.30182e+07 )
								if( Positive_Money_Flow <= 8.35557e+06 )
									ret := -0.193093
								if( Positive_Money_Flow > 8.35557e+06 )
									ret := 0.555556
							if( Negative_Money_Flow_Sum > 1.30182e+07 )
								if( Money_Flow_Ratio <= 3.17249 )
									ret := -0.005908
								if( Money_Flow_Ratio > 3.17249 )
									ret := 0.376000
						if( Money_Flow_Ratio > 4.85482 )
							if( Raw_Money_Flow <= 2.56265e+07 )
								if( ema13 <= 0.043095 )
									ret := -0.235294
								if( ema13 > 0.043095 )
									ret := -0.648352
							if( Raw_Money_Flow > 2.56265e+07 )
								if( Money_Flow_Ratio <= 7.10746 )
									ret := 0.250000
								if( Money_Flow_Ratio > 7.10746 )
									ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 1.48801e+08 )
						if( Positive_Money_Flow_Sum <= 2.03573e+08 )
							if( Negative_Money_Flow_Sum <= 1.51654e+08 )
								if( Typical_Price <= 1.6564 )
									ret := 0.200000
								if( Typical_Price > 1.6564 )
									ret := -0.757962 // sell
							if( Negative_Money_Flow_Sum > 1.51654e+08 )
								if( ema12 <= -0.003912 )
									ret := -0.800000 // sell
								if( ema12 > -0.003912 )
									ret := 0.571429
						if( Positive_Money_Flow_Sum > 2.03573e+08 )
							if( tema <= 1.74564 )
								if( Typical_Price <= 1.7 )
									ret := 0.035714
								if( Typical_Price > 1.7 )
									ret := 0.806452 // buy
							if( tema > 1.74564 )
								if( Negative_Money_Flow_Sum <= 9.23763e+07 )
									ret := 0.380952
								if( Negative_Money_Flow_Sum > 9.23763e+07 )
									ret := -0.394850
			if( Negative_Money_Flow > 2.31008e+06 )
				if( ema3 <= 1.82239 )
					if( Money_Flow_Ratio <= 1.09942 )
						if( Money_Flow_Ratio <= 0.30844 )
							if( Negative_Money_Flow <= 9.08718e+06 )
								if( MFI_Low <= -16.5293 )
									ret := 0.727273 // buy
								if( MFI_Low > -16.5293 )
									ret := 0.004028
							if( Negative_Money_Flow > 9.08718e+06 )
								if( tema <= 1.5496 )
									ret := 0.420000
								if( tema > 1.5496 )
									ret := -0.857143 // sell
						if( Money_Flow_Ratio > 0.30844 )
							if( Negative_Money_Flow_Sum <= 2.04423e+07 )
								if( Positive_Money_Flow_Sum <= 1.78487e+07 )
									ret := 0.092054
								if( Positive_Money_Flow_Sum > 1.78487e+07 )
									ret := -0.479452
							if( Negative_Money_Flow_Sum > 2.04423e+07 )
								if( Typical_Price <= 1.44433 )
									ret := 0.242634
								if( Typical_Price > 1.44433 )
									ret := 0.090437
					if( Money_Flow_Ratio > 1.09942 )
						if( Money_Flow_Ratio <= 2.44616 )
							if( Raw_Money_Flow <= 3.08237e+06 )
								if( Money_Flow_Ratio <= 1.18248 )
									ret := -0.145161
								if( Money_Flow_Ratio > 1.18248 )
									ret := 0.205793
							if( Raw_Money_Flow > 3.08237e+06 )
								if( ema3 <= 1.64599 )
									ret := -0.054521
								if( ema3 > 1.64599 )
									ret := 0.255144
						if( Money_Flow_Ratio > 2.44616 )
							if( ema13 <= 0.060796 )
								if( Positive_Money_Flow_Sum <= 2.22245e+07 )
									ret := -0.456522
								if( Positive_Money_Flow_Sum > 2.22245e+07 )
									ret := 0.138750
							if( ema13 > 0.060796 )
								if( Raw_Money_Flow <= 9.03585e+06 )
									ret := -0.142857
								if( Raw_Money_Flow > 9.03585e+06 )
									ret := 0.681416
				if( ema3 > 1.82239 )
					if( Negative_Money_Flow_Sum <= 1.34033e+08 )
						if( Positive_Money_Flow_Sum <= 4.81383e+07 )
							if( Negative_Money_Flow <= 5.33486e+06 )
								if( Positive_Money_Flow_Sum <= 3.80721e+07 )
									ret := 0.096000
								if( Positive_Money_Flow_Sum > 3.80721e+07 )
									ret := -0.308943
							if( Negative_Money_Flow > 5.33486e+06 )
								if( ema12 <= 0.011161 )
									ret := -0.298969
								if( ema12 > 0.011161 )
									ret := -0.900000 // sell
						if( Positive_Money_Flow_Sum > 4.81383e+07 )
							if( MFI_Low <= 50.9657 )
								if( ema13 <= -0.03937 )
									ret := -1.000000 // sell
								if( ema13 > -0.03937 )
									ret := 0.220513
							if( MFI_Low > 50.9657 )
								if( MFI_High <= -7.17069 )
									ret := -0.760000 // sell
								if( MFI_High > -7.17069 )
									ret := -0.054945
					if( Negative_Money_Flow_Sum > 1.34033e+08 )
						if( ema1 <= 2.21736 )
							if( tema <= 1.84163 )
								if( Negative_Money_Flow_Sum <= 1.90885e+08 )
									ret := -0.368421
								if( Negative_Money_Flow_Sum > 1.90885e+08 )
									ret := 0.666667
							if( tema > 1.84163 )
								if( Negative_Money_Flow <= 2.39116e+07 )
									ret := -0.791667 // sell
								if( Negative_Money_Flow > 2.39116e+07 )
									ret := -0.391892
						if( ema1 > 2.21736 )
							if( Typical_Price <= 2.21361 )
								if( Raw_Money_Flow <= 7.20249e+07 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 7.20249e+07 )
									ret := 0.625000
							if( Typical_Price > 2.21361 )
								if( MFI <= 49.4513 )
									ret := 0.250000
								if( MFI > 49.4513 )
									ret := -0.370370
	
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
float op_operation = decision_tree_0_MATICUSDT_30Min_088c7585(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)

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


