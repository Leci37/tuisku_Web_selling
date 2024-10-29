//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: UNIUSDT_15Min_2MV0_36465600 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_15Min_2MV0_36465600", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_15Min_36465600(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( VIP <= 0.933307 )
		if( Raw_Money_Flow <= 255479 )
			if( Raw_Money_Flow <= 35914 )
				if( Negative_Money_Flow_Sum <= 2.04671e+06 )
					if( VIM <= 1.06967 )
						if( VIM <= 1.05241 )
							if( Negative_Money_Flow <= 30678.3 )
								if( VIM <= 0.994172 )
									ret := 0.800000 // buy
								if( VIM > 0.994172 )
									ret := 0.042254
							if( Negative_Money_Flow > 30678.3 )
								if( VIP_VIM <= -0.126917 )
									ret := -0.750000 // sell
								if( VIP_VIM > -0.126917 )
									ret := -0.090909
						if( VIM > 1.05241 )
							if( MFI_High <= -40.9468 )
								if( MFI_High <= -41.2143 )
									ret := 0.123457
								if( MFI_High > -41.2143 )
									ret := -0.750000 // sell
							if( MFI_High > -40.9468 )
								if( Positive_Money_Flow_Sum <= 630765 )
									ret := 0.340000
								if( Positive_Money_Flow_Sum > 630765 )
									ret := -0.400000
					if( VIM > 1.06967 )
						if( Typical_Price <= 6.35768 )
							if( Money_Flow_Ratio <= 0.313381 )
								if( Negative_Money_Flow_Sum <= 1.84869e+06 )
									ret := -0.110009
								if( Negative_Money_Flow_Sum > 1.84869e+06 )
									ret := 0.437500
							if( Money_Flow_Ratio > 0.313381 )
								if( MFI_Low <= 10.6289 )
									ret := 0.054233
								if( MFI_Low > 10.6289 )
									ret := -0.032787
						if( Typical_Price > 6.35768 )
							if( Negative_Money_Flow_Sum <= 1.64219e+06 )
								if( Negative_Money_Flow_Sum <= 1.57162e+06 )
									ret := 0.059540
								if( Negative_Money_Flow_Sum > 1.57162e+06 )
									ret := 0.736842 // buy
							if( Negative_Money_Flow_Sum > 1.64219e+06 )
								if( Typical_Price <= 6.83717 )
									ret := -0.681818
								if( Typical_Price > 6.83717 )
									ret := 0.000000
				if( Negative_Money_Flow_Sum > 2.04671e+06 )
					if( Positive_Money_Flow_Sum <= 336522 )
						if( VIP_VIM <= -0.496236 )
							if( Money_Flow_Ratio <= 0.02366 )
								ret := 0.250000
							if( Money_Flow_Ratio > 0.02366 )
								ret := 0.000000
						if( VIP_VIM > -0.496236 )
							if( Negative_Money_Flow_Sum <= 2.41137e+06 )
								if( Positive_Money_Flow <= 159.327 )
									ret := 0.714286 // buy
								if( Positive_Money_Flow > 159.327 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 2.41137e+06 )
								ret := 0.250000
					if( Positive_Money_Flow_Sum > 336522 )
						if( VIP_VIM <= -0.221133 )
							if( Raw_Money_Flow <= 35166.6 )
								if( Negative_Money_Flow_Sum <= 3.06292e+06 )
									ret := 0.200000
								if( Negative_Money_Flow_Sum > 3.06292e+06 )
									ret := -0.062500
							if( Raw_Money_Flow > 35166.6 )
								ret := 0.600000
						if( VIP_VIM > -0.221133 )
							ret := -0.571429
			if( Raw_Money_Flow > 35914 )
				if( Money_Flow_Ratio <= 0.771472 )
					if( Raw_Money_Flow <= 109929 )
						if( Negative_Money_Flow_Sum <= 1.45664e+06 )
							if( MFI <= 15.3038 )
								if( Negative_Money_Flow_Sum <= 1.39246e+06 )
									ret := 0.279121
								if( Negative_Money_Flow_Sum > 1.39246e+06 )
									ret := -0.205128
							if( MFI > 15.3038 )
								if( VIP <= 0.847714 )
									ret := 0.019846
								if( VIP > 0.847714 )
									ret := 0.123980
						if( Negative_Money_Flow_Sum > 1.45664e+06 )
							if( Negative_Money_Flow_Sum <= 1.59829e+06 )
								if( Typical_Price <= 4.438 )
									ret := -0.200000
								if( Typical_Price > 4.438 )
									ret := 0.412664
							if( Negative_Money_Flow_Sum > 1.59829e+06 )
								if( Negative_Money_Flow_Sum <= 1.66624e+06 )
									ret := -0.158824
								if( Negative_Money_Flow_Sum > 1.66624e+06 )
									ret := 0.167572
					if( Raw_Money_Flow > 109929 )
						if( Negative_Money_Flow_Sum <= 6.46256e+06 )
							if( Typical_Price <= 5.14788 )
								if( Negative_Money_Flow_Sum <= 1.79479e+06 )
									ret := 0.064677
								if( Negative_Money_Flow_Sum > 1.79479e+06 )
									ret := 0.383333
							if( Typical_Price > 5.14788 )
								if( Negative_Money_Flow_Sum <= 970932 )
									ret := -0.067532
								if( Negative_Money_Flow_Sum > 970932 )
									ret := 0.072857
						if( Negative_Money_Flow_Sum > 6.46256e+06 )
							if( Negative_Money_Flow_Sum <= 8.75215e+06 )
								if( MFI <= 36.2451 )
									ret := -0.512821
								if( MFI > 36.2451 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 8.75215e+06 )
								if( Money_Flow_Ratio <= 0.420803 )
									ret := 0.348837
								if( Money_Flow_Ratio > 0.420803 )
									ret := -0.833333 // sell
				if( Money_Flow_Ratio > 0.771472 )
					if( Positive_Money_Flow_Sum <= 2.1886e+06 )
						if( MFI_Low <= 23.9269 )
							if( Positive_Money_Flow <= 185552 )
								if( Raw_Money_Flow <= 74554.7 )
									ret := -0.041667
								if( Raw_Money_Flow > 74554.7 )
									ret := -0.370000
							if( Positive_Money_Flow > 185552 )
								if( VIM <= 1.08609 )
									ret := 1.000000 // buy
								if( VIM > 1.08609 )
									ret := 0.000000
						if( MFI_Low > 23.9269 )
							if( VIP <= 0.770522 )
								if( Raw_Money_Flow <= 60181.2 )
									ret := -0.200000
								if( Raw_Money_Flow > 60181.2 )
									ret := 0.548387
							if( VIP > 0.770522 )
								if( Negative_Money_Flow_Sum <= 2.42571e+06 )
									ret := -0.011183
								if( Negative_Money_Flow_Sum > 2.42571e+06 )
									ret := -0.520000
					if( Positive_Money_Flow_Sum > 2.1886e+06 )
						if( Negative_Money_Flow_Sum <= 1.84506e+06 )
							if( Typical_Price <= 5.834 )
								if( VIP_VIM <= -0.246951 )
									ret := 0.250000
								if( VIP_VIM > -0.246951 )
									ret := -0.583333
							if( Typical_Price > 5.834 )
								if( Positive_Money_Flow <= 60652.5 )
									ret := 0.272727
								if( Positive_Money_Flow > 60652.5 )
									ret := -0.166667
						if( Negative_Money_Flow_Sum > 1.84506e+06 )
							if( VIP_VIM <= -0.136496 )
								if( Raw_Money_Flow <= 227215 )
									ret := 0.696429
								if( Raw_Money_Flow > 227215 )
									ret := 0.405405
							if( VIP_VIM > -0.136496 )
								if( MFI <= 45.872 )
									ret := -0.800000 // sell
								if( MFI > 45.872 )
									ret := 0.083333
		if( Raw_Money_Flow > 255479 )
			if( Money_Flow_Ratio <= 0.295598 )
				if( Negative_Money_Flow_Sum <= 8.82636e+06 )
					if( Negative_Money_Flow_Sum <= 8.46342e+06 )
						if( Negative_Money_Flow <= 4.03192e+06 )
							if( Typical_Price <= 4.62914 )
								if( Negative_Money_Flow_Sum <= 5.47984e+06 )
									ret := -0.446809
								if( Negative_Money_Flow_Sum > 5.47984e+06 )
									ret := 0.454545
							if( Typical_Price > 4.62914 )
								if( Typical_Price <= 7.00307 )
									ret := 0.132374
								if( Typical_Price > 7.00307 )
									ret := -0.039526
						if( Negative_Money_Flow > 4.03192e+06 )
							ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 8.46342e+06 )
						if( Typical_Price <= 11.0647 )
							if( Typical_Price <= 7.1465 )
								ret := 0.000000
							if( Typical_Price > 7.1465 )
								ret := -1.000000 // sell
						if( Typical_Price > 11.0647 )
							ret := 1.000000 // buy
				if( Negative_Money_Flow_Sum > 8.82636e+06 )
					if( VIM <= 1.26776 )
						if( Positive_Money_Flow_Sum <= 2.05294e+06 )
							if( Typical_Price <= 13.457 )
								if( MFI_Low <= -3.99417 )
									ret := 0.181818
								if( MFI_Low > -3.99417 )
									ret := 0.931034 // buy
							if( Typical_Price > 13.457 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 2.05294e+06 )
							if( VIP <= 0.705441 )
								if( Money_Flow_Ratio <= 0.219222 )
									ret := -0.047619
								if( Money_Flow_Ratio > 0.219222 )
									ret := 0.888889 // buy
							if( VIP > 0.705441 )
								if( Negative_Money_Flow <= 1.80938e+06 )
									ret := -0.203390
								if( Negative_Money_Flow > 1.80938e+06 )
									ret := -0.875000 // sell
					if( VIM > 1.26776 )
						if( Typical_Price <= 9.91933 )
							if( VIP <= 0.693748 )
								if( VIP_VIM <= -0.808528 )
									ret := 0.625000
								if( VIP_VIM > -0.808528 )
									ret := 0.961039 // buy
							if( VIP > 0.693748 )
								if( Typical_Price <= 5.8462 )
									ret := -0.750000 // sell
								if( Typical_Price > 5.8462 )
									ret := 0.678571
						if( Typical_Price > 9.91933 )
							if( Negative_Money_Flow_Sum <= 9.7116e+06 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 9.7116e+06 )
								if( Raw_Money_Flow <= 3.90749e+06 )
									ret := 0.771930 // buy
								if( Raw_Money_Flow > 3.90749e+06 )
									ret := -0.200000
			if( Money_Flow_Ratio > 0.295598 )
				if( Positive_Money_Flow_Sum <= 5.37608e+06 )
					if( Raw_Money_Flow <= 652107 )
						if( Typical_Price <= 11.1708 )
							if( Negative_Money_Flow_Sum <= 3.33823e+06 )
								if( Positive_Money_Flow_Sum <= 1.31723e+06 )
									ret := 0.214494
								if( Positive_Money_Flow_Sum > 1.31723e+06 )
									ret := 0.046892
							if( Negative_Money_Flow_Sum > 3.33823e+06 )
								if( Positive_Money_Flow_Sum <= 2.34946e+06 )
									ret := 0.492481
								if( Positive_Money_Flow_Sum > 2.34946e+06 )
									ret := 0.157618
						if( Typical_Price > 11.1708 )
							if( MFI <= 45.6384 )
								if( MFI_High <= -49.9929 )
									ret := -0.297521
								if( MFI_High > -49.9929 )
									ret := 0.018692
							if( MFI > 45.6384 )
								if( MFI <= 51.6666 )
									ret := 0.375000
								if( MFI > 51.6666 )
									ret := 0.833333 // buy
					if( Raw_Money_Flow > 652107 )
						if( VIP_VIM <= -0.301171 )
							if( Typical_Price <= 4.77544 )
								if( VIP <= 0.635912 )
									ret := 1.000000 // buy
								if( VIP > 0.635912 )
									ret := -0.500000
							if( Typical_Price > 4.77544 )
								if( VIM <= 1.1639 )
									ret := 0.644330
								if( VIM > 1.1639 )
									ret := 0.423423
						if( VIP_VIM > -0.301171 )
							if( VIM <= 0.993821 )
								if( Typical_Price <= 11.0658 )
									ret := 0.701299 // buy
								if( Typical_Price > 11.0658 )
									ret := -0.200000
							if( VIM > 0.993821 )
								if( MFI <= 24.745 )
									ret := -0.391304
								if( MFI > 24.745 )
									ret := 0.235679
				if( Positive_Money_Flow_Sum > 5.37608e+06 )
					if( Positive_Money_Flow_Sum <= 8.37049e+06 )
						if( Money_Flow_Ratio <= 0.337599 )
							if( VIP_VIM <= -0.43364 )
								if( Typical_Price <= 12.9073 )
									ret := 1.000000 // buy
								if( Typical_Price > 12.9073 )
									ret := 0.500000
							if( VIP_VIM > -0.43364 )
								ret := -0.750000 // sell
						if( Money_Flow_Ratio > 0.337599 )
							if( Positive_Money_Flow <= 705449 )
								if( Positive_Money_Flow_Sum <= 6.58903e+06 )
									ret := 0.105263
								if( Positive_Money_Flow_Sum > 6.58903e+06 )
									ret := -0.393939
							if( Positive_Money_Flow > 705449 )
								if( Negative_Money_Flow_Sum <= 1.86695e+07 )
									ret := -0.478261
								if( Negative_Money_Flow_Sum > 1.86695e+07 )
									ret := 0.857143 // buy
					if( Positive_Money_Flow_Sum > 8.37049e+06 )
						if( Typical_Price <= 5.88931 )
							if( Raw_Money_Flow <= 1.09804e+06 )
								ret := -1.000000 // sell
							if( Raw_Money_Flow > 1.09804e+06 )
								ret := 0.333333
						if( Typical_Price > 5.88931 )
							if( Negative_Money_Flow_Sum <= 2.52313e+07 )
								if( Raw_Money_Flow <= 4.31481e+06 )
									ret := 0.686813
								if( Raw_Money_Flow > 4.31481e+06 )
									ret := -0.533333
							if( Negative_Money_Flow_Sum > 2.52313e+07 )
								if( VIP <= 0.808966 )
									ret := 0.311111
								if( VIP > 0.808966 )
									ret := -0.387097
	if( VIP > 0.933307 )
		if( Typical_Price <= 6.60626 )
			if( Raw_Money_Flow <= 27632.5 )
				if( Negative_Money_Flow_Sum <= 755788 )
					if( Negative_Money_Flow <= 14632.6 )
						if( Positive_Money_Flow_Sum <= 848344 )
							if( Money_Flow_Ratio <= 1.31465 )
								if( Positive_Money_Flow_Sum <= 521817 )
									ret := -0.085423
								if( Positive_Money_Flow_Sum > 521817 )
									ret := 0.234783
							if( Money_Flow_Ratio > 1.31465 )
								if( Negative_Money_Flow_Sum <= 312127 )
									ret := 0.026242
								if( Negative_Money_Flow_Sum > 312127 )
									ret := -0.153005
						if( Positive_Money_Flow_Sum > 848344 )
							if( Typical_Price <= 5.03167 )
								if( Raw_Money_Flow <= 12904.5 )
									ret := -0.111111
								if( Raw_Money_Flow > 12904.5 )
									ret := -0.648649
							if( Typical_Price > 5.03167 )
								if( VIP_VIM <= 0.048977 )
									ret := 0.277778
								if( VIP_VIM > 0.048977 )
									ret := -0.245763
					if( Negative_Money_Flow > 14632.6 )
						if( MFI_High <= -48.2136 )
							if( VIM <= 0.980307 )
								if( VIP <= 1.04554 )
									ret := -1.000000 // sell
								if( VIP > 1.04554 )
									ret := -0.200000
							if( VIM > 0.980307 )
								if( Positive_Money_Flow_Sum <= 179247 )
									ret := -0.016393
								if( Positive_Money_Flow_Sum > 179247 )
									ret := -0.428571
						if( MFI_High > -48.2136 )
							if( Negative_Money_Flow_Sum <= 89898.6 )
								if( Typical_Price <= 5.59634 )
									ret := 0.326316
								if( Typical_Price > 5.59634 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 89898.6 )
								if( Positive_Money_Flow_Sum <= 396328 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 396328 )
									ret := 0.121951
				if( Negative_Money_Flow_Sum > 755788 )
					if( Money_Flow_Ratio <= 0.786605 )
						if( Typical_Price <= 4.338 )
							if( MFI <= 33.3284 )
								ret := 0.000000
							if( MFI > 33.3284 )
								ret := -0.600000
						if( Typical_Price > 4.338 )
							if( Raw_Money_Flow <= 13658.2 )
								if( Typical_Price <= 6.16817 )
									ret := 0.000000
								if( Typical_Price > 6.16817 )
									ret := -0.750000 // sell
							if( Raw_Money_Flow > 13658.2 )
								if( MFI_Low <= 11.4229 )
									ret := 0.170213
								if( MFI_Low > 11.4229 )
									ret := 0.479592
					if( Money_Flow_Ratio > 0.786605 )
						if( Typical_Price <= 5.74245 )
							if( MFI_High <= -27.7887 )
								if( Positive_Money_Flow <= 6813.08 )
									ret := 0.500000
								if( Positive_Money_Flow > 6813.08 )
									ret := 1.000000 // buy
							if( MFI_High > -27.7887 )
								if( MFI_High <= -20.5472 )
									ret := 0.000000
								if( MFI_High > -20.5472 )
									ret := 0.250000
						if( Typical_Price > 5.74245 )
							if( Raw_Money_Flow <= 25237.2 )
								if( Raw_Money_Flow <= 22553.2 )
									ret := -0.300000
								if( Raw_Money_Flow > 22553.2 )
									ret := 0.214286
							if( Raw_Money_Flow > 25237.2 )
								if( MFI <= 48.5433 )
									ret := -0.750000 // sell
								if( MFI > 48.5433 )
									ret := -0.500000
			if( Raw_Money_Flow > 27632.5 )
				if( Positive_Money_Flow_Sum <= 2.11206e+06 )
					if( Typical_Price <= 3.70927 )
						if( Positive_Money_Flow_Sum <= 1.73963e+06 )
							if( Positive_Money_Flow_Sum <= 1.43559e+06 )
								if( Positive_Money_Flow_Sum <= 606154 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 606154 )
									ret := 0.842105 // buy
							if( Positive_Money_Flow_Sum > 1.43559e+06 )
								if( Typical_Price <= 3.61833 )
									ret := 0.000000
								if( Typical_Price > 3.61833 )
									ret := -0.714286 // sell
						if( Positive_Money_Flow_Sum > 1.73963e+06 )
							if( Typical_Price <= 3.64667 )
								ret := 1.000000 // buy
							if( Typical_Price > 3.64667 )
								if( Positive_Money_Flow_Sum <= 2.02008e+06 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 2.02008e+06 )
									ret := 0.250000
					if( Typical_Price > 3.70927 )
						if( VIM <= 0.947599 )
							if( Positive_Money_Flow_Sum <= 325824 )
								if( Positive_Money_Flow <= 49858.2 )
									ret := -0.049569
								if( Positive_Money_Flow > 49858.2 )
									ret := 0.105263
							if( Positive_Money_Flow_Sum > 325824 )
								if( Positive_Money_Flow_Sum <= 1.21925e+06 )
									ret := 0.137905
								if( Positive_Money_Flow_Sum > 1.21925e+06 )
									ret := 0.068386
						if( VIM > 0.947599 )
							if( Negative_Money_Flow_Sum <= 893230 )
								if( Negative_Money_Flow_Sum <= 183506 )
									ret := -0.194888
								if( Negative_Money_Flow_Sum > 183506 )
									ret := 0.030000
							if( Negative_Money_Flow_Sum > 893230 )
								if( Positive_Money_Flow_Sum <= 675072 )
									ret := 0.274696
								if( Positive_Money_Flow_Sum > 675072 )
									ret := 0.071502
				if( Positive_Money_Flow_Sum > 2.11206e+06 )
					if( Money_Flow_Ratio <= 16.2664 )
						if( Positive_Money_Flow_Sum <= 1.36007e+07 )
							if( Negative_Money_Flow_Sum <= 938373 )
								if( Negative_Money_Flow_Sum <= 580284 )
									ret := -0.086527
								if( Negative_Money_Flow_Sum > 580284 )
									ret := 0.180585
							if( Negative_Money_Flow_Sum > 938373 )
								if( Positive_Money_Flow_Sum <= 2.25825e+06 )
									ret := -0.418750
								if( Positive_Money_Flow_Sum > 2.25825e+06 )
									ret := -0.046660
						if( Positive_Money_Flow_Sum > 1.36007e+07 )
							if( MFI_Low <= 67.8516 )
								if( MFI <= 83.835 )
									ret := 0.944444 // buy
								if( MFI > 83.835 )
									ret := 0.625000
							if( MFI_Low > 67.8516 )
								ret := 0.000000
					if( Money_Flow_Ratio > 16.2664 )
						if( Negative_Money_Flow_Sum <= 348152 )
							if( Positive_Money_Flow_Sum <= 4.45395e+06 )
								if( Positive_Money_Flow <= 14368.1 )
									ret := -0.285714
								if( Positive_Money_Flow > 14368.1 )
									ret := 0.549020
							if( Positive_Money_Flow_Sum > 4.45395e+06 )
								if( Positive_Money_Flow_Sum <= 5.58619e+06 )
									ret := -0.363636
								if( Positive_Money_Flow_Sum > 5.58619e+06 )
									ret := 0.428571
						if( Negative_Money_Flow_Sum > 348152 )
							ret := 1.000000 // buy
		if( Typical_Price > 6.60626 )
			if( VIP_VIM <= 0.750487 )
				if( Money_Flow_Ratio <= 33.4046 )
					if( Positive_Money_Flow_Sum <= 635861 )
						if( Positive_Money_Flow <= 105390 )
							if( Raw_Money_Flow <= 28128.5 )
								if( Money_Flow_Ratio <= 2.31387 )
									ret := -0.031046
								if( Money_Flow_Ratio > 2.31387 )
									ret := -0.342105
							if( Raw_Money_Flow > 28128.5 )
								if( Negative_Money_Flow_Sum <= 848993 )
									ret := 0.067607
								if( Negative_Money_Flow_Sum > 848993 )
									ret := 0.251101
						if( Positive_Money_Flow > 105390 )
							if( Money_Flow_Ratio <= 0.699154 )
								if( VIP <= 0.945215 )
									ret := -0.300000
								if( VIP > 0.945215 )
									ret := 0.170213
							if( Money_Flow_Ratio > 0.699154 )
								if( Raw_Money_Flow <= 122070 )
									ret := -0.649123
								if( Raw_Money_Flow > 122070 )
									ret := -0.213333
					if( Positive_Money_Flow_Sum > 635861 )
						if( Negative_Money_Flow <= 171789 )
							if( Positive_Money_Flow_Sum <= 2.77785e+06 )
								if( VIM <= 0.893632 )
									ret := 0.037476
								if( VIM > 0.893632 )
									ret := -0.065141
							if( Positive_Money_Flow_Sum > 2.77785e+06 )
								if( VIM <= 1.02829 )
									ret := -0.128472
								if( VIM > 1.02829 )
									ret := 0.162946
						if( Negative_Money_Flow > 171789 )
							if( Positive_Money_Flow_Sum <= 6.49022e+06 )
								if( MFI_Low <= 46.3968 )
									ret := 0.020742
								if( MFI_Low > 46.3968 )
									ret := 0.178611
							if( Positive_Money_Flow_Sum > 6.49022e+06 )
								if( Negative_Money_Flow_Sum <= 2.76905e+06 )
									ret := -0.530120
								if( Negative_Money_Flow_Sum > 2.76905e+06 )
									ret := -0.016114
				if( Money_Flow_Ratio > 33.4046 )
					if( Negative_Money_Flow_Sum <= 252738 )
						if( VIM <= 0.596414 )
							ret := -0.250000
						if( VIM > 0.596414 )
							ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 252738 )
						ret := 1.000000 // buy
			if( VIP_VIM > 0.750487 )
				if( Positive_Money_Flow_Sum <= 1.74248e+08 )
					if( Raw_Money_Flow <= 1.30354e+06 )
						if( Raw_Money_Flow <= 936102 )
							if( Negative_Money_Flow_Sum <= 191801 )
								if( Typical_Price <= 6.65019 )
									ret := -0.500000
								if( Typical_Price > 6.65019 )
									ret := 0.538462
							if( Negative_Money_Flow_Sum > 191801 )
								if( Raw_Money_Flow <= 218043 )
									ret := -0.394737
								if( Raw_Money_Flow > 218043 )
									ret := 0.262411
						if( Raw_Money_Flow > 936102 )
							if( MFI <= 87.5757 )
								ret := 0.428571
							if( MFI > 87.5757 )
								if( MFI <= 93.9062 )
									ret := -0.875000 // sell
								if( MFI > 93.9062 )
									ret := -0.250000
					if( Raw_Money_Flow > 1.30354e+06 )
						if( Positive_Money_Flow_Sum <= 1.46629e+07 )
							if( VIP_VIM <= 0.82788 )
								if( MFI_Low <= 71.4918 )
									ret := 0.928571 // buy
								if( MFI_Low > 71.4918 )
									ret := 0.000000
							if( VIP_VIM > 0.82788 )
								if( Positive_Money_Flow <= 1.37458e+06 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow > 1.37458e+06 )
									ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 1.46629e+07 )
							if( Typical_Price <= 13.9375 )
								if( Positive_Money_Flow_Sum <= 2.04422e+07 )
									ret := -0.636364
								if( Positive_Money_Flow_Sum > 2.04422e+07 )
									ret := 0.450000
							if( Typical_Price > 13.9375 )
								if( Positive_Money_Flow_Sum <= 3.70122e+07 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 3.70122e+07 )
									ret := 0.750000 // buy
				if( Positive_Money_Flow_Sum > 1.74248e+08 )
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


//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_UNIUSDT_15Min_36465600(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, VIP, VIP_VIM, VIM)

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


