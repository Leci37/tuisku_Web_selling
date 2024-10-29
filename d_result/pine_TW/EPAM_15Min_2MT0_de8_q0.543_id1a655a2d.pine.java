//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: EPAM_15Min_2MT0_1a655a2d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_EPAM_15Min_2MT0_1a655a2d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_EPAM_15Min_1a655a2d(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( tema <= 278.443 )
		if( Positive_Money_Flow_Sum <= 1.29565e+07 )
			if( Raw_Money_Flow <= 5.23074e+06 )
				if( ema13 <= -0.44869 )
					if( MFI_High <= -75.1029 )
						if( Positive_Money_Flow <= 4198.46 )
							if( Negative_Money_Flow_Sum <= 6.61663e+07 )
								if( tema <= 247.932 )
									ret := 0.390244
								if( tema > 247.932 )
									ret := -0.538462
							if( Negative_Money_Flow_Sum > 6.61663e+07 )
								if( Typical_Price <= 220.712 )
									ret := 0.545455
								if( Typical_Price > 220.712 )
									ret := 0.944444 // buy
						if( Positive_Money_Flow > 4198.46 )
							if( MFI <= 2.50258 )
								ret := 0.818182 // buy
							if( MFI > 2.50258 )
								ret := 1.000000 // buy
					if( MFI_High > -75.1029 )
						if( Negative_Money_Flow <= 1.21751e+06 )
							if( MFI_Low <= 7.80474 )
								if( ema3 <= 231.421 )
									ret := -0.326911
								if( ema3 > 231.421 )
									ret := -0.063492
							if( MFI_Low > 7.80474 )
								if( Positive_Money_Flow_Sum <= 6.35078e+06 )
									ret := 0.090361
								if( Positive_Money_Flow_Sum > 6.35078e+06 )
									ret := -0.174107
						if( Negative_Money_Flow > 1.21751e+06 )
							if( Positive_Money_Flow_Sum <= 8.92089e+06 )
								if( ema13 <= -1.37961 )
									ret := 0.245810
								if( ema13 > -1.37961 )
									ret := 0.040155
							if( Positive_Money_Flow_Sum > 8.92089e+06 )
								if( Typical_Price <= 240.357 )
									ret := -0.398113
								if( Typical_Price > 240.357 )
									ret := 0.061538
				if( ema13 > -0.44869 )
					if( tema <= 169.87 )
						if( ema1 <= 118.16 )
							if( Money_Flow_Ratio <= 1.46992 )
								if( Positive_Money_Flow_Sum <= 1.18635e+07 )
									ret := 0.026937
								if( Positive_Money_Flow_Sum > 1.18635e+07 )
									ret := 0.404580
							if( Money_Flow_Ratio > 1.46992 )
								if( ema12 <= 0.801212 )
									ret := -0.085066
								if( ema12 > 0.801212 )
									ret := 0.739130 // buy
						if( ema1 > 118.16 )
							if( MFI <= 51.6633 )
								if( ema1 <= 121.365 )
									ret := 0.344086
								if( ema1 > 121.365 )
									ret := 0.029928
							if( MFI > 51.6633 )
								if( Negative_Money_Flow <= 3.35543e+06 )
									ret := 0.180945
								if( Negative_Money_Flow > 3.35543e+06 )
									ret := -0.565217
					if( tema > 169.87 )
						if( Positive_Money_Flow <= 3.23302e+06 )
							if( Positive_Money_Flow_Sum <= 1.169e+06 )
								if( Negative_Money_Flow_Sum <= 735953 )
									ret := 0.352941
								if( Negative_Money_Flow_Sum > 735953 )
									ret := 0.971429 // buy
							if( Positive_Money_Flow_Sum > 1.169e+06 )
								if( ema13 <= 2.06259 )
									ret := -0.079406
								if( ema13 > 2.06259 )
									ret := -0.402985
						if( Positive_Money_Flow > 3.23302e+06 )
							if( ema12 <= 0.089701 )
								if( MFI_Low <= 31.8433 )
									ret := -0.307692
								if( MFI_Low > 31.8433 )
									ret := 0.565217
							if( ema12 > 0.089701 )
								if( ema2 <= 235.662 )
									ret := 0.900000 // buy
								if( ema2 > 235.662 )
									ret := 0.500000
			if( Raw_Money_Flow > 5.23074e+06 )
				if( Raw_Money_Flow <= 3.17603e+07 )
					if( Positive_Money_Flow_Sum <= 9.29269e+06 )
						if( Negative_Money_Flow_Sum <= 7.82805e+07 )
							if( Money_Flow_Ratio <= 0.360866 )
								if( MFI_Low <= 6.02919 )
									ret := 0.251265
								if( MFI_Low > 6.02919 )
									ret := -0.714286 // sell
							if( Money_Flow_Ratio > 0.360866 )
								if( MFI <= 27.4862 )
									ret := 1.000000 // buy
								if( MFI > 27.4862 )
									ret := 0.374302
						if( Negative_Money_Flow_Sum > 7.82805e+07 )
							if( Positive_Money_Flow_Sum <= 5.09638e+06 )
								ret := 0.782609 // buy
							if( Positive_Money_Flow_Sum > 5.09638e+06 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 9.29269e+06 )
						if( MFI_High <= -42.1105 )
							if( Money_Flow_Ratio <= 0.564553 )
								if( Positive_Money_Flow_Sum <= 1.04771e+07 )
									ret := -0.381443
								if( Positive_Money_Flow_Sum > 1.04771e+07 )
									ret := 0.140541
							if( Money_Flow_Ratio > 0.564553 )
								if( Raw_Money_Flow <= 8.27777e+06 )
									ret := -0.785714 // sell
								if( Raw_Money_Flow > 8.27777e+06 )
									ret := -1.000000 // sell
						if( MFI_High > -42.1105 )
							if( MFI_High <= -24.4921 )
								if( Negative_Money_Flow <= 8.52677e+06 )
									ret := 0.547009
								if( Negative_Money_Flow > 8.52677e+06 )
									ret := -0.785714 // sell
							if( MFI_High > -24.4921 )
								if( Negative_Money_Flow_Sum <= 4.91331e+06 )
									ret := 0.214286
								if( Negative_Money_Flow_Sum > 4.91331e+06 )
									ret := -0.615385
				if( Raw_Money_Flow > 3.17603e+07 )
					if( ema2 <= 188.82 )
						ret := 0.277778
					if( ema2 > 188.82 )
						if( Money_Flow_Ratio <= 0.038892 )
							ret := -1.000000 // sell
						if( Money_Flow_Ratio > 0.038892 )
							if( Typical_Price <= 224.619 )
								if( MFI <= 12.4152 )
									ret := -0.666667
								if( MFI > 12.4152 )
									ret := -1.000000 // sell
							if( Typical_Price > 224.619 )
								ret := -0.384615
		if( Positive_Money_Flow_Sum > 1.29565e+07 )
			if( Positive_Money_Flow <= 9.89175e+06 )
				if( Negative_Money_Flow <= 4.3807e+07 )
					if( Money_Flow_Ratio <= 0.180578 )
						if( ema1 <= 270.618 )
							if( Positive_Money_Flow_Sum <= 1.37967e+07 )
								ret := 0.368421
							if( Positive_Money_Flow_Sum > 1.37967e+07 )
								if( ema12 <= -0.755828 )
									ret := 0.970297 // buy
								if( ema12 > -0.755828 )
									ret := 0.642857
						if( ema1 > 270.618 )
							if( Typical_Price <= 270.359 )
								ret := -0.454545
							if( Typical_Price > 270.359 )
								ret := 0.875000 // buy
					if( Money_Flow_Ratio > 0.180578 )
						if( ema13 <= 1.73675 )
							if( ema12 <= -6.08269 )
								if( Negative_Money_Flow_Sum <= 2.85193e+07 )
									ret := -0.945946 // sell
								if( Negative_Money_Flow_Sum > 2.85193e+07 )
									ret := -0.275862
							if( ema12 > -6.08269 )
								if( ema12 <= -0.370743 )
									ret := 0.028634
								if( ema12 > -0.370743 )
									ret := 0.105827
						if( ema13 > 1.73675 )
							if( Positive_Money_Flow_Sum <= 6.86513e+07 )
								if( Negative_Money_Flow <= 2.66262e+06 )
									ret := -0.047595
								if( Negative_Money_Flow > 2.66262e+06 )
									ret := -0.365994
							if( Positive_Money_Flow_Sum > 6.86513e+07 )
								if( Typical_Price <= 212.047 )
									ret := -0.195122
								if( Typical_Price > 212.047 )
									ret := 0.330544
				if( Negative_Money_Flow > 4.3807e+07 )
					if( ema12 <= 0.205695 )
						if( Raw_Money_Flow <= 8.68985e+07 )
							if( Raw_Money_Flow <= 5.87988e+07 )
								ret := -1.000000 // sell
							if( Raw_Money_Flow > 5.87988e+07 )
								if( MFI <= 30.6098 )
									ret := -0.904762 // sell
								if( MFI > 30.6098 )
									ret := -0.090909
						if( Raw_Money_Flow > 8.68985e+07 )
							ret := 0.750000 // buy
					if( ema12 > 0.205695 )
						if( Positive_Money_Flow_Sum <= 8.38649e+07 )
							ret := -0.444444
						if( Positive_Money_Flow_Sum > 8.38649e+07 )
							ret := 0.400000
			if( Positive_Money_Flow > 9.89175e+06 )
				if( ema13 <= -5.43323 )
					if( ema13 <= -36.8014 )
						ret := 0.000000
					if( ema13 > -36.8014 )
						if( ema3 <= 210.866 )
							ret := -0.529412
						if( ema3 > 210.866 )
							ret := -1.000000 // sell
				if( ema13 > -5.43323 )
					if( Negative_Money_Flow_Sum <= 1.2259e+07 )
						if( MFI <= 81.4421 )
							if( ema12 <= -0.265322 )
								ret := 0.411765
							if( ema12 > -0.265322 )
								if( ema3 <= 241.064 )
									ret := -0.704225 // sell
								if( ema3 > 241.064 )
									ret := -0.188679
						if( MFI > 81.4421 )
							if( Positive_Money_Flow_Sum <= 2.33798e+07 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 2.33798e+07 )
								if( ema13 <= 0.527427 )
									ret := 0.443038
								if( ema13 > 0.527427 )
									ret := -0.087179
					if( Negative_Money_Flow_Sum > 1.2259e+07 )
						if( MFI <= 82.8017 )
							if( ema2 <= 172.337 )
								if( Positive_Money_Flow <= 1.85925e+07 )
									ret := 0.714286 // buy
								if( Positive_Money_Flow > 1.85925e+07 )
									ret := 0.000000
							if( ema2 > 172.337 )
								if( ema1 <= 275.715 )
									ret := -0.102784
								if( ema1 > 275.715 )
									ret := 0.459459
						if( MFI > 82.8017 )
							if( Typical_Price <= 230.478 )
								ret := -0.111111
							if( Typical_Price > 230.478 )
								if( Negative_Money_Flow_Sum <= 2.08734e+07 )
									ret := 0.666667
								if( Negative_Money_Flow_Sum > 2.08734e+07 )
									ret := 1.000000 // buy
	if( tema > 278.443 )
		if( Positive_Money_Flow_Sum <= 2.10196e+08 )
			if( Money_Flow_Ratio <= 0.428466 )
				if( Positive_Money_Flow_Sum <= 1.19968e+07 )
					if( Negative_Money_Flow_Sum <= 1.75987e+07 )
						if( MFI_High <= -53.9652 )
							if( Money_Flow_Ratio <= 0.343794 )
								if( ema3 <= 297.581 )
									ret := 0.818182 // buy
								if( ema3 > 297.581 )
									ret := -0.039474
							if( Money_Flow_Ratio > 0.343794 )
								ret := -0.600000
						if( MFI_High > -53.9652 )
							if( Raw_Money_Flow <= 619633 )
								ret := -0.217391
							if( Raw_Money_Flow > 619633 )
								if( Negative_Money_Flow <= 2.00494e+06 )
									ret := 0.622449
								if( Negative_Money_Flow > 2.00494e+06 )
									ret := -0.153846
					if( Negative_Money_Flow_Sum > 1.75987e+07 )
						if( Typical_Price <= 318.982 )
							if( ema13 <= -4.70068 )
								if( tema <= 295.024 )
									ret := 0.125000
								if( tema > 295.024 )
									ret := 0.806452 // buy
							if( ema13 > -4.70068 )
								if( Raw_Money_Flow <= 6.15612e+06 )
									ret := -0.152805
								if( Raw_Money_Flow > 6.15612e+06 )
									ret := 0.289474
						if( Typical_Price > 318.982 )
							if( Money_Flow_Ratio <= 0.369872 )
								if( ema12 <= -9.63644 )
									ret := 1.000000 // buy
								if( ema12 > -9.63644 )
									ret := -0.239409
							if( Money_Flow_Ratio > 0.369872 )
								if( Negative_Money_Flow <= 2.72058e+06 )
									ret := -0.301887
								if( Negative_Money_Flow > 2.72058e+06 )
									ret := 0.536585
				if( Positive_Money_Flow_Sum > 1.19968e+07 )
					if( Negative_Money_Flow <= 1.65967e+07 )
						if( MFI_Low <= -9.56203 )
							if( Negative_Money_Flow <= 49722.8 )
								if( ema12 <= -3.11376 )
									ret := -0.705882 // sell
								if( ema12 > -3.11376 )
									ret := 0.428571
							if( Negative_Money_Flow > 49722.8 )
								if( Negative_Money_Flow_Sum <= 1.6064e+08 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 1.6064e+08 )
									ret := 0.763636 // buy
						if( MFI_Low > -9.56203 )
							if( Positive_Money_Flow_Sum <= 3.27932e+07 )
								if( Positive_Money_Flow <= 6.51855e+06 )
									ret := 0.151401
								if( Positive_Money_Flow > 6.51855e+06 )
									ret := 0.640000
							if( Positive_Money_Flow_Sum > 3.27932e+07 )
								if( MFI_Low <= -0.106139 )
									ret := -0.515723
								if( MFI_Low > -0.106139 )
									ret := 0.002755
					if( Negative_Money_Flow > 1.65967e+07 )
						if( Raw_Money_Flow <= 3.35131e+07 )
							if( Typical_Price <= 467.467 )
								if( Negative_Money_Flow_Sum <= 8.90601e+07 )
									ret := -0.624113
								if( Negative_Money_Flow_Sum > 8.90601e+07 )
									ret := 0.000000
							if( Typical_Price > 467.467 )
								if( tema <= 575.348 )
									ret := 0.245614
								if( tema > 575.348 )
									ret := -0.666667
						if( Raw_Money_Flow > 3.35131e+07 )
							if( MFI_Low <= -0.738308 )
								if( Negative_Money_Flow_Sum <= 2.3735e+08 )
									ret := 0.574074
								if( Negative_Money_Flow_Sum > 2.3735e+08 )
									ret := -0.357143
							if( MFI_Low > -0.738308 )
								if( Negative_Money_Flow_Sum <= 1.34452e+08 )
									ret := 0.216667
								if( Negative_Money_Flow_Sum > 1.34452e+08 )
									ret := -0.326087
			if( Money_Flow_Ratio > 0.428466 )
				if( MFI <= 47.5439 )
					if( ema3 <= 318.75 )
						if( Negative_Money_Flow_Sum <= 3.26694e+07 )
							if( ema3 <= 292.294 )
								if( Positive_Money_Flow_Sum <= 1.62848e+07 )
									ret := 0.015326
								if( Positive_Money_Flow_Sum > 1.62848e+07 )
									ret := -0.385417
							if( ema3 > 292.294 )
								if( MFI_Low <= 27.1697 )
									ret := 0.240000
								if( MFI_Low > 27.1697 )
									ret := -0.523810
						if( Negative_Money_Flow_Sum > 3.26694e+07 )
							if( MFI <= 44.7221 )
								if( ema13 <= -7.83309 )
									ret := 0.800000 // buy
								if( ema13 > -7.83309 )
									ret := -0.069323
							if( MFI > 44.7221 )
								if( ema12 <= -2.37753 )
									ret := 0.615385
								if( ema12 > -2.37753 )
									ret := -0.428571
					if( ema3 > 318.75 )
						if( Positive_Money_Flow <= 3.75488e+06 )
							if( Positive_Money_Flow_Sum <= 3.23652e+07 )
								if( MFI_Low <= 15.8766 )
									ret := -0.196312
								if( MFI_Low > 15.8766 )
									ret := 0.026057
							if( Positive_Money_Flow_Sum > 3.23652e+07 )
								if( ema12 <= -0.504519 )
									ret := 0.003856
								if( ema12 > -0.504519 )
									ret := -0.369251
						if( Positive_Money_Flow > 3.75488e+06 )
							if( MFI <= 34.7336 )
								if( ema12 <= 1.74958 )
									ret := 0.013274
								if( ema12 > 1.74958 )
									ret := 0.800000 // buy
							if( MFI > 34.7336 )
								if( Positive_Money_Flow <= 3.74333e+07 )
									ret := -0.321777
								if( Positive_Money_Flow > 3.74333e+07 )
									ret := 0.642857
				if( MFI > 47.5439 )
					if( Raw_Money_Flow <= 1.36606e+06 )
						if( MFI_High <= -11.3288 )
							if( Raw_Money_Flow <= 742039 )
								if( ema3 <= 282.056 )
									ret := 0.757576 // buy
								if( ema3 > 282.056 )
									ret := 0.028283
							if( Raw_Money_Flow > 742039 )
								if( MFI <= 67.919 )
									ret := -0.204104
								if( MFI > 67.919 )
									ret := 0.473684
						if( MFI_High > -11.3288 )
							if( Positive_Money_Flow_Sum <= 3.86252e+07 )
								if( Negative_Money_Flow_Sum <= 1.08699e+07 )
									ret := -0.131841
								if( Negative_Money_Flow_Sum > 1.08699e+07 )
									ret := 0.220779
							if( Positive_Money_Flow_Sum > 3.86252e+07 )
								if( MFI_Low <= 57.7678 )
									ret := -0.664495
								if( MFI_Low > 57.7678 )
									ret := -0.179310
					if( Raw_Money_Flow > 1.36606e+06 )
						if( Typical_Price <= 653.489 )
							if( ema12 <= -5.56079 )
								if( tema <= 594.513 )
									ret := -0.896552 // sell
								if( tema > 594.513 )
									ret := -0.409091
							if( ema12 > -5.56079 )
								if( MFI <= 68.9633 )
									ret := -0.017897
								if( MFI > 68.9633 )
									ret := 0.048718
						if( Typical_Price > 653.489 )
							if( Negative_Money_Flow_Sum <= 4.35398e+07 )
								if( ema3 <= 711.032 )
									ret := -0.072072
								if( ema3 > 711.032 )
									ret := -0.954545 // sell
							if( Negative_Money_Flow_Sum > 4.35398e+07 )
								if( Typical_Price <= 666.651 )
									ret := -0.840000 // sell
								if( Typical_Price > 666.651 )
									ret := -0.239583
		if( Positive_Money_Flow_Sum > 2.10196e+08 )
			if( MFI_High <= -29.6479 )
				if( Positive_Money_Flow <= 2.53047e+07 )
					if( Money_Flow_Ratio <= 0.625382 )
						ret := 0.400000
					if( Money_Flow_Ratio > 0.625382 )
						if( Positive_Money_Flow <= 15072.4 )
							if( Typical_Price <= 636.207 )
								ret := -0.272727
							if( Typical_Price > 636.207 )
								ret := 0.285714
						if( Positive_Money_Flow > 15072.4 )
							if( MFI <= 40.624 )
								ret := -1.000000 // sell
							if( MFI > 40.624 )
								ret := -0.454545
				if( Positive_Money_Flow > 2.53047e+07 )
					if( Positive_Money_Flow_Sum <= 4.1633e+08 )
						ret := 0.625000
					if( Positive_Money_Flow_Sum > 4.1633e+08 )
						ret := 1.000000 // buy
			if( MFI_High > -29.6479 )
				if( Positive_Money_Flow <= 188353 )
					if( Typical_Price <= 377.939 )
						if( ema2 <= 361.547 )
							if( Negative_Money_Flow <= 9.38733e+06 )
								if( ema12 <= -0.839067 )
									ret := -0.444444
								if( ema12 > -0.839067 )
									ret := -0.862500 // sell
							if( Negative_Money_Flow > 9.38733e+06 )
								if( Positive_Money_Flow_Sum <= 2.75451e+08 )
									ret := -0.771429 // sell
								if( Positive_Money_Flow_Sum > 2.75451e+08 )
									ret := 0.034483
						if( ema2 > 361.547 )
							ret := -1.000000 // sell
					if( Typical_Price > 377.939 )
						if( ema2 <= 646.324 )
							if( Typical_Price <= 624.822 )
								if( Positive_Money_Flow <= 51205.8 )
									ret := -0.386792
								if( Positive_Money_Flow > 51205.8 )
									ret := 0.777778 // buy
							if( Typical_Price > 624.822 )
								ret := 0.500000
						if( ema2 > 646.324 )
							if( Raw_Money_Flow <= 5.29562e+07 )
								if( tema <= 699.781 )
									ret := -0.957746 // sell
								if( tema > 699.781 )
									ret := -0.588235
							if( Raw_Money_Flow > 5.29562e+07 )
								ret := 0.166667
				if( Positive_Money_Flow > 188353 )
					if( ema2 <= 688.081 )
						if( Negative_Money_Flow_Sum <= 2.22815e+07 )
							if( Positive_Money_Flow_Sum <= 3.5058e+08 )
								if( Typical_Price <= 362.76 )
									ret := -1.000000 // sell
								if( Typical_Price > 362.76 )
									ret := -0.900000 // sell
							if( Positive_Money_Flow_Sum > 3.5058e+08 )
								if( Raw_Money_Flow <= 5.01069e+06 )
									ret := -0.666667
								if( Raw_Money_Flow > 5.01069e+06 )
									ret := 0.363636
						if( Negative_Money_Flow_Sum > 2.22815e+07 )
							if( ema13 <= 8.06273 )
								if( ema2 <= 303.046 )
									ret := -0.750000 // sell
								if( ema2 > 303.046 )
									ret := 0.066351
							if( ema13 > 8.06273 )
								if( ema2 <= 673.174 )
									ret := 0.404762
								if( ema2 > 673.174 )
									ret := 1.000000 // buy
					if( ema2 > 688.081 )
						if( Negative_Money_Flow_Sum <= 2.35005e+08 )
							ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 2.35005e+08 )
							ret := -0.166667
	
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
float op_operation = decision_tree_0_EPAM_15Min_1a655a2d(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)

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


