//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: MSFT_30Min_2MT0_ef225488 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_30Min_2MT0_ef225488", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_30Min_ef225488(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= 1.0362 )
		if( Negative_Money_Flow <= 7067.83 )
			if( Positive_Money_Flow <= 1.35234e+08 )
				if( ema12 <= -0.238229 )
					if( Raw_Money_Flow <= 9.74447e+06 )
						if( Negative_Money_Flow_Sum <= 2.22857e+07 )
							if( MFI <= 72.9606 )
								if( Positive_Money_Flow <= 4.14699e+06 )
									ret := 0.144928
								if( Positive_Money_Flow > 4.14699e+06 )
									ret := 0.750000 // buy
							if( MFI > 72.9606 )
								if( Positive_Money_Flow_Sum <= 1.90142e+07 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 1.90142e+07 )
									ret := 0.261194
						if( Negative_Money_Flow_Sum > 2.22857e+07 )
							if( Positive_Money_Flow_Sum <= 2.95999e+09 )
								if( Negative_Money_Flow_Sum <= 4.35683e+07 )
									ret := -0.272727
								if( Negative_Money_Flow_Sum > 4.35683e+07 )
									ret := 0.138357
							if( Positive_Money_Flow_Sum > 2.95999e+09 )
								if( MFI_High <= -37.0484 )
									ret := -0.818182 // sell
								if( MFI_High > -37.0484 )
									ret := -0.064777
					if( Raw_Money_Flow > 9.74447e+06 )
						if( Positive_Money_Flow_Sum <= 1.41754e+09 )
							if( Negative_Money_Flow_Sum <= 2.07021e+07 )
								if( Positive_Money_Flow_Sum <= 6.12416e+07 )
									ret := 0.303030
								if( Positive_Money_Flow_Sum > 6.12416e+07 )
									ret := -0.583333
							if( Negative_Money_Flow_Sum > 2.07021e+07 )
								if( Negative_Money_Flow_Sum <= 4.98488e+07 )
									ret := -0.460123
								if( Negative_Money_Flow_Sum > 4.98488e+07 )
									ret := -0.040685
						if( Positive_Money_Flow_Sum > 1.41754e+09 )
							if( Negative_Money_Flow_Sum <= 5.42722e+09 )
								if( Positive_Money_Flow_Sum <= 4.80693e+09 )
									ret := 0.384000
								if( Positive_Money_Flow_Sum > 4.80693e+09 )
									ret := -0.250000
							if( Negative_Money_Flow_Sum > 5.42722e+09 )
								if( MFI <= 18.6689 )
									ret := 0.692308
								if( MFI > 18.6689 )
									ret := -0.410256
				if( ema12 > -0.238229 )
					if( Positive_Money_Flow <= 2.86217e+06 )
						if( Positive_Money_Flow_Sum <= 1.5734e+07 )
							if( Positive_Money_Flow_Sum <= 5.49254e+06 )
								if( MFI_Low <= 54.4953 )
									ret := -0.113580
								if( MFI_Low > 54.4953 )
									ret := 0.467742
							if( Positive_Money_Flow_Sum > 5.49254e+06 )
								if( MFI_Low <= 13.8039 )
									ret := -0.100000
								if( MFI_Low > 13.8039 )
									ret := -0.416185
						if( Positive_Money_Flow_Sum > 1.5734e+07 )
							if( Positive_Money_Flow_Sum <= 9.1649e+07 )
								if( MFI_High <= -72.4403 )
									ret := -0.038278
								if( MFI_High > -72.4403 )
									ret := 0.311475
							if( Positive_Money_Flow_Sum > 9.1649e+07 )
								if( MFI <= 88.1222 )
									ret := -0.029490
								if( MFI > 88.1222 )
									ret := -0.126382
					if( Positive_Money_Flow > 2.86217e+06 )
						if( ema3 <= 277.861 )
							if( Negative_Money_Flow_Sum <= 3.77318e+09 )
								if( Negative_Money_Flow_Sum <= 5.85132e+07 )
									ret := 0.089469
								if( Negative_Money_Flow_Sum > 5.85132e+07 )
									ret := 0.003659
							if( Negative_Money_Flow_Sum > 3.77318e+09 )
								if( ema12 <= -0.022528 )
									ret := 0.722222 // buy
								if( ema12 > -0.022528 )
									ret := 0.188889
						if( ema3 > 277.861 )
							if( MFI_High <= 15.5765 )
								if( ema13 <= 0.688641 )
									ret := -0.132766
								if( ema13 > 0.688641 )
									ret := 0.034796
							if( MFI_High > 15.5765 )
								if( Raw_Money_Flow <= 4.77803e+06 )
									ret := -0.185185
								if( Raw_Money_Flow > 4.77803e+06 )
									ret := -0.600000
			if( Positive_Money_Flow > 1.35234e+08 )
				if( ema13 <= 0.204133 )
					if( ema12 <= -2.33948 )
						if( Negative_Money_Flow_Sum <= 6.05106e+09 )
							if( Positive_Money_Flow_Sum <= 1.46422e+09 )
								if( Negative_Money_Flow_Sum <= 5.33423e+09 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 5.33423e+09 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 1.46422e+09 )
								if( Raw_Money_Flow <= 5.27222e+08 )
									ret := 0.571429
								if( Raw_Money_Flow > 5.27222e+08 )
									ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 6.05106e+09 )
							if( Negative_Money_Flow_Sum <= 8.23467e+09 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 8.23467e+09 )
								if( Negative_Money_Flow_Sum <= 1.02841e+10 )
									ret := 0.200000
								if( Negative_Money_Flow_Sum > 1.02841e+10 )
									ret := 1.000000 // buy
					if( ema12 > -2.33948 )
						if( Negative_Money_Flow_Sum <= 3.28091e+09 )
							if( Negative_Money_Flow_Sum <= 2.9903e+09 )
								if( Negative_Money_Flow_Sum <= 1.68275e+09 )
									ret := 0.070200
								if( Negative_Money_Flow_Sum > 1.68275e+09 )
									ret := -0.047454
							if( Negative_Money_Flow_Sum > 2.9903e+09 )
								if( MFI_High <= -52.7041 )
									ret := 0.645455
								if( MFI_High > -52.7041 )
									ret := 0.033898
						if( Negative_Money_Flow_Sum > 3.28091e+09 )
							if( ema13 <= -3.17953 )
								if( Typical_Price <= 221.757 )
									ret := 0.785714 // buy
								if( Typical_Price > 221.757 )
									ret := 0.171717
							if( ema13 > -3.17953 )
								if( ema13 <= -0.522098 )
									ret := -0.226136
								if( ema13 > -0.522098 )
									ret := 0.186207
				if( ema13 > 0.204133 )
					if( Positive_Money_Flow <= 4.37671e+08 )
						if( Positive_Money_Flow_Sum <= 1.64309e+09 )
							if( Money_Flow_Ratio <= 675.377 )
								if( MFI_High <= -53.874 )
									ret := -0.320755
								if( MFI_High > -53.874 )
									ret := 0.084948
							if( Money_Flow_Ratio > 675.377 )
								if( ema3 <= 205.639 )
									ret := 0.775862 // buy
								if( ema3 > 205.639 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 1.64309e+09 )
							if( Positive_Money_Flow_Sum <= 3.3035e+09 )
								if( Positive_Money_Flow_Sum <= 1.85453e+09 )
									ret := 0.531773
								if( Positive_Money_Flow_Sum > 1.85453e+09 )
									ret := 0.316282
							if( Positive_Money_Flow_Sum > 3.3035e+09 )
								if( Raw_Money_Flow <= 4.03111e+08 )
									ret := 0.011450
								if( Raw_Money_Flow > 4.03111e+08 )
									ret := 0.431373
					if( Positive_Money_Flow > 4.37671e+08 )
						if( ema2 <= 252.525 )
							if( ema13 <= 0.437257 )
								if( ema13 <= 0.434291 )
									ret := 0.013761
								if( ema13 > 0.434291 )
									ret := -1.000000 // sell
							if( ema13 > 0.437257 )
								if( Positive_Money_Flow_Sum <= 1.18535e+09 )
									ret := 0.445714
								if( Positive_Money_Flow_Sum > 1.18535e+09 )
									ret := 0.198347
						if( ema2 > 252.525 )
							if( Raw_Money_Flow <= 1.42113e+09 )
								if( Positive_Money_Flow_Sum <= 5.87368e+09 )
									ret := -0.086475
								if( Positive_Money_Flow_Sum > 5.87368e+09 )
									ret := 0.594595
							if( Raw_Money_Flow > 1.42113e+09 )
								if( Positive_Money_Flow_Sum <= 2.00059e+09 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 2.00059e+09 )
									ret := 0.007752
		if( Negative_Money_Flow > 7067.83 )
			if( Raw_Money_Flow <= 2.11152e+08 )
				if( ema12 <= -0.04551 )
					if( ema2 <= 233.717 )
						if( ema13 <= -0.608422 )
							if( ema12 <= -1.33598 )
								if( Negative_Money_Flow_Sum <= 8.54902e+09 )
									ret := 0.663507
								if( Negative_Money_Flow_Sum > 8.54902e+09 )
									ret := -0.545455
							if( ema12 > -1.33598 )
								if( Negative_Money_Flow_Sum <= 7.01741e+09 )
									ret := 0.290357
								if( Negative_Money_Flow_Sum > 7.01741e+09 )
									ret := -0.850000 // sell
						if( ema13 > -0.608422 )
							if( Negative_Money_Flow <= 3.19865e+06 )
								if( MFI <= 34.9781 )
									ret := 0.292164
								if( MFI > 34.9781 )
									ret := 0.116544
							if( Negative_Money_Flow > 3.19865e+06 )
								if( Positive_Money_Flow_Sum <= 5.58628e+08 )
									ret := 0.042712
								if( Positive_Money_Flow_Sum > 5.58628e+08 )
									ret := 0.253414
					if( ema2 > 233.717 )
						if( Negative_Money_Flow_Sum <= 8.64361e+09 )
							if( Negative_Money_Flow_Sum <= 3.45753e+09 )
								if( Negative_Money_Flow_Sum <= 3.25512e+09 )
									ret := 0.108484
								if( Negative_Money_Flow_Sum > 3.25512e+09 )
									ret := 0.427632
							if( Negative_Money_Flow_Sum > 3.45753e+09 )
								if( ema12 <= -1.23182 )
									ret := 0.281369
								if( ema12 > -1.23182 )
									ret := -0.046249
						if( Negative_Money_Flow_Sum > 8.64361e+09 )
							if( Positive_Money_Flow_Sum <= 1.17694e+09 )
								if( ema3 <= 326.31 )
									ret := -0.871795 // sell
								if( ema3 > 326.31 )
									ret := -0.133333
							if( Positive_Money_Flow_Sum > 1.17694e+09 )
								if( MFI_Low <= -3.374 )
									ret := 0.000000
								if( MFI_Low > -3.374 )
									ret := 0.642857
				if( ema12 > -0.04551 )
					if( Positive_Money_Flow_Sum <= 2.69841e+08 )
						if( ema13 <= 0.838011 )
							if( Negative_Money_Flow_Sum <= 3.72768e+07 )
								if( MFI_Low <= 7.00215 )
									ret := 0.394659
								if( MFI_Low > 7.00215 )
									ret := 0.027703
							if( Negative_Money_Flow_Sum > 3.72768e+07 )
								if( Positive_Money_Flow <= 115.737 )
									ret := -0.016093
								if( Positive_Money_Flow > 115.737 )
									ret := -0.219917
						if( ema13 > 0.838011 )
							if( Negative_Money_Flow_Sum <= 4.55609e+07 )
								if( tema <= 289.701 )
									ret := 0.103659
								if( tema > 289.701 )
									ret := -0.197368
							if( Negative_Money_Flow_Sum > 4.55609e+07 )
								if( Money_Flow_Ratio <= 0.004072 )
									ret := 0.454545
								if( Money_Flow_Ratio > 0.004072 )
									ret := -0.386760
					if( Positive_Money_Flow_Sum > 2.69841e+08 )
						if( MFI <= 94.7976 )
							if( Negative_Money_Flow_Sum <= 1.27817e+10 )
								if( Negative_Money_Flow_Sum <= 6.32003e+08 )
									ret := 0.059659
								if( Negative_Money_Flow_Sum > 6.32003e+08 )
									ret := 0.137813
							if( Negative_Money_Flow_Sum > 1.27817e+10 )
								ret := -1.000000 // sell
						if( MFI > 94.7976 )
							if( Positive_Money_Flow <= 112848 )
								if( Negative_Money_Flow_Sum <= 2.41188e+06 )
									ret := -0.222222
								if( Negative_Money_Flow_Sum > 2.41188e+06 )
									ret := 0.059066
							if( Positive_Money_Flow > 112848 )
								if( MFI <= 98.9271 )
									ret := -0.533333
								if( MFI > 98.9271 )
									ret := -0.108108
			if( Raw_Money_Flow > 2.11152e+08 )
				if( Positive_Money_Flow_Sum <= 1.67124e+09 )
					if( tema <= 244.586 )
						if( Negative_Money_Flow <= 3.7117e+08 )
							if( Negative_Money_Flow_Sum <= 6.00154e+08 )
								if( ema13 <= -0.119875 )
									ret := 0.421488
								if( ema13 > -0.119875 )
									ret := 0.032581
							if( Negative_Money_Flow_Sum > 6.00154e+08 )
								if( Positive_Money_Flow_Sum <= 2.86703e+08 )
									ret := -0.213262
								if( Positive_Money_Flow_Sum > 2.86703e+08 )
									ret := -0.032258
						if( Negative_Money_Flow > 3.7117e+08 )
							if( Positive_Money_Flow_Sum <= 1.29553e+09 )
								if( Positive_Money_Flow_Sum <= 3.82036e+07 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 3.82036e+07 )
									ret := 0.252809
							if( Positive_Money_Flow_Sum > 1.29553e+09 )
								if( Negative_Money_Flow_Sum <= 5.89603e+09 )
									ret := -0.261307
								if( Negative_Money_Flow_Sum > 5.89603e+09 )
									ret := 0.733333 // buy
					if( tema > 244.586 )
						if( ema13 <= -5.12192 )
							if( Negative_Money_Flow_Sum <= 6.77892e+09 )
								if( Raw_Money_Flow <= 7.48678e+08 )
									ret := -0.062500
								if( Raw_Money_Flow > 7.48678e+08 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 6.77892e+09 )
								if( ema13 <= -5.76389 )
									ret := 1.000000 // buy
								if( ema13 > -5.76389 )
									ret := 0.625000
						if( ema13 > -5.12192 )
							if( Negative_Money_Flow <= 4.46365e+08 )
								if( Positive_Money_Flow_Sum <= 1.52314e+09 )
									ret := 0.050743
								if( Positive_Money_Flow_Sum > 1.52314e+09 )
									ret := -0.376623
							if( Negative_Money_Flow > 4.46365e+08 )
								if( tema <= 323.023 )
									ret := -0.044538
								if( tema > 323.023 )
									ret := -0.203368
				if( Positive_Money_Flow_Sum > 1.67124e+09 )
					if( tema <= 232.514 )
						if( Positive_Money_Flow_Sum <= 2.01997e+09 )
							if( ema13 <= 1.18012 )
								if( ema13 <= 0.054706 )
									ret := 0.486239
								if( ema13 > 0.054706 )
									ret := 0.119048
							if( ema13 > 1.18012 )
								if( MFI_High <= -18.9986 )
									ret := 0.600000
								if( MFI_High > -18.9986 )
									ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 2.01997e+09 )
							if( ema13 <= 1.07121 )
								if( Positive_Money_Flow_Sum <= 4.58002e+09 )
									ret := -0.209003
								if( Positive_Money_Flow_Sum > 4.58002e+09 )
									ret := -0.712121 // sell
							if( ema13 > 1.07121 )
								if( Positive_Money_Flow_Sum <= 4.01031e+09 )
									ret := 0.095238
								if( Positive_Money_Flow_Sum > 4.01031e+09 )
									ret := 0.605263
					if( tema > 232.514 )
						if( ema13 <= -3.64013 )
							if( Negative_Money_Flow_Sum <= 5.35389e+09 )
								if( ema12 <= -2.4428 )
									ret := 0.750000 // buy
								if( ema12 > -2.4428 )
									ret := -0.250000
							if( Negative_Money_Flow_Sum > 5.35389e+09 )
								if( ema13 <= -4.30826 )
									ret := 1.000000 // buy
								if( ema13 > -4.30826 )
									ret := 0.681818
						if( ema13 > -3.64013 )
							if( Positive_Money_Flow_Sum <= 3.12762e+09 )
								if( Negative_Money_Flow <= 4.183e+08 )
									ret := 0.279847
								if( Negative_Money_Flow > 4.183e+08 )
									ret := 0.067047
							if( Positive_Money_Flow_Sum > 3.12762e+09 )
								if( Positive_Money_Flow_Sum <= 4.05644e+09 )
									ret := -0.141256
								if( Positive_Money_Flow_Sum > 4.05644e+09 )
									ret := 0.202934
	if( ema12 > 1.0362 )
		if( Positive_Money_Flow_Sum <= 2.22767e+09 )
			if( Positive_Money_Flow_Sum <= 2.95882e+07 )
				if( tema <= 372.349 )
					if( Positive_Money_Flow_Sum <= 1.41242e+07 )
						ret := -0.250000
					if( Positive_Money_Flow_Sum > 1.41242e+07 )
						if( Negative_Money_Flow <= 1.58756e+07 )
							if( Raw_Money_Flow <= 4.6452e+06 )
								if( Raw_Money_Flow <= 2.75345e+06 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 2.75345e+06 )
									ret := -0.500000
							if( Raw_Money_Flow > 4.6452e+06 )
								ret := -1.000000 // sell
						if( Negative_Money_Flow > 1.58756e+07 )
							if( ema12 <= 1.30817 )
								ret := -0.250000
							if( ema12 > 1.30817 )
								ret := -1.000000 // sell
				if( tema > 372.349 )
					ret := 0.000000
			if( Positive_Money_Flow_Sum > 2.95882e+07 )
				if( MFI <= 77.1656 )
					if( Positive_Money_Flow_Sum <= 6.95528e+07 )
						if( Positive_Money_Flow <= 2.02266e+07 )
							if( Positive_Money_Flow_Sum <= 5.02754e+07 )
								if( MFI_High <= -78.481 )
									ret := -0.200000
								if( MFI_High > -78.481 )
									ret := 0.393939
							if( Positive_Money_Flow_Sum > 5.02754e+07 )
								if( ema12 <= 1.30821 )
									ret := 0.363636
								if( ema12 > 1.30821 )
									ret := 0.941176 // buy
						if( Positive_Money_Flow > 2.02266e+07 )
							if( Positive_Money_Flow_Sum <= 5.40775e+07 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 5.40775e+07 )
								ret := 0.166667
					if( Positive_Money_Flow_Sum > 6.95528e+07 )
						if( ema12 <= 2.0023 )
							if( Negative_Money_Flow_Sum <= 1.08592e+08 )
								if( Money_Flow_Ratio <= 2.82554 )
									ret := -0.846154 // sell
								if( Money_Flow_Ratio > 2.82554 )
									ret := 0.400000
							if( Negative_Money_Flow_Sum > 1.08592e+08 )
								if( Negative_Money_Flow_Sum <= 1.49615e+09 )
									ret := 0.171598
								if( Negative_Money_Flow_Sum > 1.49615e+09 )
									ret := -0.283784
						if( ema12 > 2.0023 )
							if( tema <= 295.203 )
								ret := -1.000000 // sell
							if( tema > 295.203 )
								if( ema1 <= 315.237 )
									ret := 0.800000 // buy
								if( ema1 > 315.237 )
									ret := -0.416667
				if( MFI > 77.1656 )
					if( ema12 <= 1.12718 )
						if( Negative_Money_Flow_Sum <= 1.02877e+08 )
							if( Positive_Money_Flow_Sum <= 1.92794e+09 )
								if( Money_Flow_Ratio <= 16.0075 )
									ret := 0.555556
								if( Money_Flow_Ratio > 16.0075 )
									ret := -0.137931
							if( Positive_Money_Flow_Sum > 1.92794e+09 )
								if( Money_Flow_Ratio <= 82.6079 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 82.6079 )
									ret := 0.200000
						if( Negative_Money_Flow_Sum > 1.02877e+08 )
							if( ema2 <= 232.059 )
								if( ema1 <= 89.511 )
									ret := -0.500000
								if( ema1 > 89.511 )
									ret := -1.000000 // sell
							if( ema2 > 232.059 )
								if( Negative_Money_Flow_Sum <= 4.62026e+08 )
									ret := -0.200000
								if( Negative_Money_Flow_Sum > 4.62026e+08 )
									ret := 0.500000
					if( ema12 > 1.12718 )
						if( ema13 <= 2.60328 )
							if( Positive_Money_Flow <= 6.68515e+07 )
								if( Positive_Money_Flow_Sum <= 2.03342e+09 )
									ret := -0.851852 // sell
								if( Positive_Money_Flow_Sum > 2.03342e+09 )
									ret := -0.411765
							if( Positive_Money_Flow > 6.68515e+07 )
								if( Raw_Money_Flow <= 1.80171e+08 )
									ret := 0.500000
								if( Raw_Money_Flow > 1.80171e+08 )
									ret := -0.455224
						if( ema13 > 2.60328 )
							if( Positive_Money_Flow <= 8.54578e+07 )
								if( tema <= 348.467 )
									ret := 0.550000
								if( tema > 348.467 )
									ret := -0.083333
							if( Positive_Money_Flow > 8.54578e+07 )
								if( tema <= 228.785 )
									ret := -1.000000 // sell
								if( tema > 228.785 )
									ret := -0.482759
		if( Positive_Money_Flow_Sum > 2.22767e+09 )
			if( ema12 <= 4.34185 )
				if( Positive_Money_Flow <= 8.67128e+08 )
					if( Positive_Money_Flow_Sum <= 4.27446e+09 )
						if( Raw_Money_Flow <= 6.59112e+06 )
							if( ema2 <= 220.481 )
								if( Positive_Money_Flow_Sum <= 2.87024e+09 )
									ret := 0.142857
								if( Positive_Money_Flow_Sum > 2.87024e+09 )
									ret := -0.619048
							if( ema2 > 220.481 )
								if( Positive_Money_Flow_Sum <= 4.19632e+09 )
									ret := -0.150000
								if( Positive_Money_Flow_Sum > 4.19632e+09 )
									ret := -0.615385
						if( Raw_Money_Flow > 6.59112e+06 )
							if( Positive_Money_Flow <= 7.58142e+08 )
								if( ema3 <= 206.469 )
									ret := 0.224806
								if( ema3 > 206.469 )
									ret := -0.068627
							if( Positive_Money_Flow > 7.58142e+08 )
								if( Positive_Money_Flow_Sum <= 3.71031e+09 )
									ret := 0.846154 // buy
								if( Positive_Money_Flow_Sum > 3.71031e+09 )
									ret := -0.333333
					if( Positive_Money_Flow_Sum > 4.27446e+09 )
						if( Positive_Money_Flow_Sum <= 5.00642e+09 )
							if( Negative_Money_Flow <= 8.30794e+07 )
								if( MFI_Low <= 76.7059 )
									ret := 0.257009
								if( MFI_Low > 76.7059 )
									ret := -0.302326
							if( Negative_Money_Flow > 8.30794e+07 )
								if( ema3 <= 333.454 )
									ret := 0.849315 // buy
								if( ema3 > 333.454 )
									ret := 0.000000
						if( Positive_Money_Flow_Sum > 5.00642e+09 )
							if( Negative_Money_Flow_Sum <= 2.41068e+09 )
								if( Negative_Money_Flow <= 4.41375e+08 )
									ret := 0.064892
								if( Negative_Money_Flow > 4.41375e+08 )
									ret := 0.520548
							if( Negative_Money_Flow_Sum > 2.41068e+09 )
								if( Negative_Money_Flow_Sum <= 2.96859e+09 )
									ret := -0.648649
								if( Negative_Money_Flow_Sum > 2.96859e+09 )
									ret := 0.028369
				if( Positive_Money_Flow > 8.67128e+08 )
					if( ema3 <= 232.696 )
						if( MFI_Low <= 63.6984 )
							if( Positive_Money_Flow <= 1.73994e+09 )
								if( Raw_Money_Flow <= 1.01046e+09 )
									ret := -0.250000
								if( Raw_Money_Flow > 1.01046e+09 )
									ret := 0.200000
							if( Positive_Money_Flow > 1.73994e+09 )
								if( Raw_Money_Flow <= 2.04757e+09 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 2.04757e+09 )
									ret := -0.272727
						if( MFI_Low > 63.6984 )
							if( Raw_Money_Flow <= 1.78018e+09 )
								if( Positive_Money_Flow_Sum <= 2.69455e+09 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 2.69455e+09 )
									ret := 0.571429
							if( Raw_Money_Flow > 1.78018e+09 )
								ret := 0.166667
					if( ema3 > 232.696 )
						if( tema <= 290.682 )
							if( MFI_Low <= 51.841 )
								if( ema12 <= 1.27976 )
									ret := -0.750000 // sell
								if( ema12 > 1.27976 )
									ret := -1.000000 // sell
							if( MFI_Low > 51.841 )
								if( ema2 <= 250.289 )
									ret := 0.000000
								if( ema2 > 250.289 )
									ret := -0.558140
						if( tema > 290.682 )
							if( Negative_Money_Flow_Sum <= 3.16571e+07 )
								if( MFI_High <= 19.7633 )
									ret := -1.000000 // sell
								if( MFI_High > 19.7633 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 3.16571e+07 )
								if( Positive_Money_Flow_Sum <= 2.74958e+09 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 2.74958e+09 )
									ret := -0.153061
			if( ema12 > 4.34185 )
				if( ema13 <= 7.31968 )
					if( MFI_Low <= 53.8892 )
						ret := -1.000000 // sell
					if( MFI_Low > 53.8892 )
						ret := 0.500000
				if( ema13 > 7.31968 )
					if( Negative_Money_Flow <= 1.1053e+08 )
						ret := -1.000000 // sell
					if( Negative_Money_Flow > 1.1053e+08 )
						ret := -0.400000
	
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
float op_operation = decision_tree_0_MSFT_30Min_ef225488(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)

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


