//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: RIVN_5Min_1M00_16703672 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RIVN_5Min_1M00_16703672", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RIVN_5Min_16703672(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 43.8749 )
		if( Raw_Money_Flow <= 935872 )
			if( MFI <= 69.0281 )
				if( Negative_Money_Flow_Sum <= 185355 )
					if( MFI <= 29.0798 )
						if( Negative_Money_Flow_Sum <= 79395.2 )
							if( MFI_Low <= 7.48723 )
								if( Positive_Money_Flow_Sum <= 17844.1 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 17844.1 )
									ret := -0.600000
							if( MFI_Low > 7.48723 )
								ret := -0.333333
						if( Negative_Money_Flow_Sum > 79395.2 )
							if( Positive_Money_Flow <= 73.8019 )
								if( Money_Flow_Ratio <= 0.107319 )
									ret := 0.250000
								if( Money_Flow_Ratio > 0.107319 )
									ret := -0.044444
							if( Positive_Money_Flow > 73.8019 )
								if( Typical_Price <= 11.4787 )
									ret := -0.160000
								if( Typical_Price > 11.4787 )
									ret := -0.524590
					if( MFI > 29.0798 )
						if( Positive_Money_Flow <= 52752.1 )
							if( Negative_Money_Flow_Sum <= 47171.3 )
								if( MFI_High <= -22.9086 )
									ret := 0.240000
								if( MFI_High > -22.9086 )
									ret := -0.518519
							if( Negative_Money_Flow_Sum > 47171.3 )
								if( Positive_Money_Flow <= 51191 )
									ret := -0.028079
								if( Positive_Money_Flow > 51191 )
									ret := 0.600000
						if( Positive_Money_Flow > 52752.1 )
							if( Positive_Money_Flow_Sum <= 318653 )
								if( Positive_Money_Flow_Sum <= 293110 )
									ret := -0.229167
								if( Positive_Money_Flow_Sum > 293110 )
									ret := -0.733333 // sell
							if( Positive_Money_Flow_Sum > 318653 )
								if( Negative_Money_Flow_Sum <= 156178 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow_Sum > 156178 )
									ret := -0.181818
				if( Negative_Money_Flow_Sum > 185355 )
					if( Positive_Money_Flow_Sum <= 146368 )
						if( Typical_Price <= 12.1614 )
							if( Positive_Money_Flow <= 73943.1 )
								if( Positive_Money_Flow_Sum <= 55868.7 )
									ret := 0.146667
								if( Positive_Money_Flow_Sum > 55868.7 )
									ret := -0.065672
							if( Positive_Money_Flow > 73943.1 )
								ret := 0.750000 // buy
						if( Typical_Price > 12.1614 )
							if( Raw_Money_Flow <= 7752.51 )
								if( Negative_Money_Flow_Sum <= 211447 )
									ret := 0.263158
								if( Negative_Money_Flow_Sum > 211447 )
									ret := -0.045918
							if( Raw_Money_Flow > 7752.51 )
								if( Money_Flow_Ratio <= 0.532699 )
									ret := 0.142500
								if( Money_Flow_Ratio > 0.532699 )
									ret := 0.382353
					if( Positive_Money_Flow_Sum > 146368 )
						if( Negative_Money_Flow_Sum <= 572601 )
							if( Raw_Money_Flow <= 46646.6 )
								if( Negative_Money_Flow_Sum <= 493278 )
									ret := -0.065915
								if( Negative_Money_Flow_Sum > 493278 )
									ret := 0.104317
							if( Raw_Money_Flow > 46646.6 )
								if( Negative_Money_Flow_Sum <= 473792 )
									ret := 0.067745
								if( Negative_Money_Flow_Sum > 473792 )
									ret := 0.258824
						if( Negative_Money_Flow_Sum > 572601 )
							if( Raw_Money_Flow <= 221229 )
								if( Positive_Money_Flow <= 157006 )
									ret := -0.056338
								if( Positive_Money_Flow > 157006 )
									ret := -0.165094
							if( Raw_Money_Flow > 221229 )
								if( Positive_Money_Flow_Sum <= 730271 )
									ret := 0.279412
								if( Positive_Money_Flow_Sum > 730271 )
									ret := 0.004169
			if( MFI > 69.0281 )
				if( Typical_Price <= 22.7384 )
					if( Positive_Money_Flow <= 156904 )
						if( Typical_Price <= 10.4317 )
							if( Negative_Money_Flow_Sum <= 404762 )
								if( MFI <= 78.5943 )
									ret := 0.291262
								if( MFI > 78.5943 )
									ret := 0.059259
							if( Negative_Money_Flow_Sum > 404762 )
								if( Money_Flow_Ratio <= 2.59971 )
									ret := -0.277778
								if( Money_Flow_Ratio > 2.59971 )
									ret := 0.000000
						if( Typical_Price > 10.4317 )
							if( Negative_Money_Flow_Sum <= 434634 )
								if( MFI <= 90.3813 )
									ret := -0.135488
								if( MFI > 90.3813 )
									ret := 0.026022
							if( Negative_Money_Flow_Sum > 434634 )
								if( Negative_Money_Flow_Sum <= 475407 )
									ret := 0.294118
								if( Negative_Money_Flow_Sum > 475407 )
									ret := -0.021442
					if( Positive_Money_Flow > 156904 )
						if( Negative_Money_Flow_Sum <= 366314 )
							if( Negative_Money_Flow_Sum <= 244363 )
								if( MFI_High <= -4.4219 )
									ret := -0.771429 // sell
								if( MFI_High > -4.4219 )
									ret := -0.102190
							if( Negative_Money_Flow_Sum > 244363 )
								if( Typical_Price <= 22.3049 )
									ret := 0.351562
								if( Typical_Price > 22.3049 )
									ret := -0.714286 // sell
						if( Negative_Money_Flow_Sum > 366314 )
							if( Positive_Money_Flow_Sum <= 3.13553e+06 )
								if( Positive_Money_Flow_Sum <= 1.15548e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 1.15548e+06 )
									ret := -0.535270
							if( Positive_Money_Flow_Sum > 3.13553e+06 )
								if( Money_Flow_Ratio <= 6.66408 )
									ret := -0.192771
								if( Money_Flow_Ratio > 6.66408 )
									ret := 0.169811
				if( Typical_Price > 22.7384 )
					if( Positive_Money_Flow_Sum <= 1.80889e+06 )
						if( Raw_Money_Flow <= 117566 )
							if( Positive_Money_Flow_Sum <= 172334 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 172334 )
								if( Positive_Money_Flow_Sum <= 1.07122e+06 )
									ret := -0.020979
								if( Positive_Money_Flow_Sum > 1.07122e+06 )
									ret := 0.250000
						if( Raw_Money_Flow > 117566 )
							if( Money_Flow_Ratio <= 2.32583 )
								if( Negative_Money_Flow_Sum <= 599745 )
									ret := -0.250000
								if( Negative_Money_Flow_Sum > 599745 )
									ret := -0.500000
							if( Money_Flow_Ratio > 2.32583 )
								if( Positive_Money_Flow_Sum <= 1.22975e+06 )
									ret := 0.266667
								if( Positive_Money_Flow_Sum > 1.22975e+06 )
									ret := 0.616667
					if( Positive_Money_Flow_Sum > 1.80889e+06 )
						if( Money_Flow_Ratio <= 6.18091 )
							if( Positive_Money_Flow <= 860438 )
								if( MFI <= 69.4711 )
									ret := 0.444444
								if( MFI > 69.4711 )
									ret := -0.110236
							if( Positive_Money_Flow > 860438 )
								ret := 0.833333 // buy
						if( Money_Flow_Ratio > 6.18091 )
							if( Positive_Money_Flow <= 117623 )
								ret := 0.000000
							if( Positive_Money_Flow > 117623 )
								if( Positive_Money_Flow_Sum <= 9.22358e+07 )
									ret := -0.371429
								if( Positive_Money_Flow_Sum > 9.22358e+07 )
									ret := -1.000000 // sell
		if( Raw_Money_Flow > 935872 )
			if( Raw_Money_Flow <= 8.79695e+06 )
				if( Typical_Price <= 23.2751 )
					if( Positive_Money_Flow_Sum <= 1.84665e+08 )
						if( MFI_Low <= 18.7848 )
							if( Money_Flow_Ratio <= 0.552291 )
								if( Raw_Money_Flow <= 1.75285e+06 )
									ret := -0.043333
								if( Raw_Money_Flow > 1.75285e+06 )
									ret := 0.117741
							if( Money_Flow_Ratio > 0.552291 )
								if( Raw_Money_Flow <= 7.3892e+06 )
									ret := 0.275766
								if( Raw_Money_Flow > 7.3892e+06 )
									ret := 0.750000 // buy
						if( MFI_Low > 18.7848 )
							if( Raw_Money_Flow <= 996094 )
								if( Positive_Money_Flow_Sum <= 2.19209e+06 )
									ret := -0.375000
								if( Positive_Money_Flow_Sum > 2.19209e+06 )
									ret := 0.450549
							if( Raw_Money_Flow > 996094 )
								if( Money_Flow_Ratio <= 21.4309 )
									ret := 0.082332
								if( Money_Flow_Ratio > 21.4309 )
									ret := -0.151724
					if( Positive_Money_Flow_Sum > 1.84665e+08 )
						if( Positive_Money_Flow_Sum <= 4.2202e+08 )
							if( Negative_Money_Flow_Sum <= 3.43425e+07 )
								ret := -0.750000 // sell
							if( Negative_Money_Flow_Sum > 3.43425e+07 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 4.2202e+08 )
							ret := 0.166667
				if( Typical_Price > 23.2751 )
					if( Negative_Money_Flow_Sum <= 5.55390e+06 )
						if( Raw_Money_Flow <= 2.19302e+06 )
							if( Typical_Price <= 25.9034 )
								if( Positive_Money_Flow_Sum <= 9.71035e+06 )
									ret := 0.666667
								if( Positive_Money_Flow_Sum > 9.71035e+06 )
									ret := -0.200000
							if( Typical_Price > 25.9034 )
								if( Typical_Price <= 26.1321 )
									ret := -0.500000
								if( Typical_Price > 26.1321 )
									ret := 0.166667
						if( Raw_Money_Flow > 2.19302e+06 )
							if( MFI_High <= -3.71264 )
								ret := -0.666667
							if( MFI_High > -3.71264 )
								ret := 0.000000
					if( Negative_Money_Flow_Sum > 5.55390e+06 )
						if( Raw_Money_Flow <= 4.54813e+06 )
							if( Raw_Money_Flow <= 982253 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 982253 )
								if( MFI_High <= -52.7226 )
									ret := -0.695652
								if( MFI_High > -52.7226 )
									ret := -0.184438
						if( Raw_Money_Flow > 4.54813e+06 )
							if( Raw_Money_Flow <= 7.70604e+06 )
								if( MFI_High <= -46.5448 )
									ret := 0.372093
								if( MFI_High > -46.5448 )
									ret := -0.017804
							if( Raw_Money_Flow > 7.70604e+06 )
								if( Positive_Money_Flow_Sum <= 4.20686e+07 )
									ret := -0.846154 // sell
								if( Positive_Money_Flow_Sum > 4.20686e+07 )
									ret := -0.117647
			if( Raw_Money_Flow > 8.79695e+06 )
				if( Money_Flow_Ratio <= 4.54588 )
					if( Negative_Money_Flow_Sum <= 1.13568e+08 )
						if( Money_Flow_Ratio <= 0.714087 )
							if( Negative_Money_Flow_Sum <= 8.37865e+07 )
								if( Typical_Price <= 19.6985 )
									ret := 0.300000
								if( Typical_Price > 19.6985 )
									ret := -0.177778
							if( Negative_Money_Flow_Sum > 8.37865e+07 )
								if( Negative_Money_Flow_Sum <= 8.68909e+07 )
									ret := -0.727273 // sell
								if( Negative_Money_Flow_Sum > 8.68909e+07 )
									ret := -0.022059
						if( Money_Flow_Ratio > 0.714087 )
							if( Typical_Price <= 19.0377 )
								if( Positive_Money_Flow <= 2.30576e+07 )
									ret := -0.251618
								if( Positive_Money_Flow > 2.30576e+07 )
									ret := 0.064516
							if( Typical_Price > 19.0377 )
								if( Typical_Price <= 24.1466 )
									ret := 0.000000
								if( Typical_Price > 24.1466 )
									ret := -0.238854
					if( Negative_Money_Flow_Sum > 1.13568e+08 )
						if( MFI_Low <= 9.6924 )
							if( Raw_Money_Flow <= 9.85944e+06 )
								if( Money_Flow_Ratio <= 0.384054 )
									ret := 0.657895
								if( Money_Flow_Ratio > 0.384054 )
									ret := -0.666667
							if( Raw_Money_Flow > 9.85944e+06 )
								if( Negative_Money_Flow_Sum <= 5.3168e+08 )
									ret := -0.266667
								if( Negative_Money_Flow_Sum > 5.3168e+08 )
									ret := 0.636364
						if( MFI_Low > 9.6924 )
							if( Typical_Price <= 25.4601 )
								if( Positive_Money_Flow_Sum <= 1.94383e+08 )
									ret := 0.342294
								if( Positive_Money_Flow_Sum > 1.94383e+08 )
									ret := 0.093023
							if( Typical_Price > 25.4601 )
								if( Negative_Money_Flow_Sum <= 2.04478e+08 )
									ret := -0.455446
								if( Negative_Money_Flow_Sum > 2.04478e+08 )
									ret := 0.186047
				if( Money_Flow_Ratio > 4.54588 )
					if( Positive_Money_Flow_Sum <= 3.71298e+08 )
						if( Positive_Money_Flow_Sum <= 1.77312e+08 )
							if( Typical_Price <= 10.61 )
								if( Positive_Money_Flow <= 2.34351e+07 )
									ret := -0.702128 // sell
								if( Positive_Money_Flow > 2.34351e+07 )
									ret := 1.000000 // buy
							if( Typical_Price > 10.61 )
								if( Positive_Money_Flow_Sum <= 8.7486e+07 )
									ret := 0.169925
								if( Positive_Money_Flow_Sum > 8.7486e+07 )
									ret := 0.462366
						if( Positive_Money_Flow_Sum > 1.77312e+08 )
							if( Raw_Money_Flow <= 1.91448e+07 )
								if( Negative_Money_Flow_Sum <= 1.61285e+07 )
									ret := 0.250000
								if( Negative_Money_Flow_Sum > 1.61285e+07 )
									ret := -0.781250 // sell
							if( Raw_Money_Flow > 1.91448e+07 )
								if( Typical_Price <= 20.7653 )
									ret := 0.383721
								if( Typical_Price > 20.7653 )
									ret := -0.162791
					if( Positive_Money_Flow_Sum > 3.71298e+08 )
						if( Negative_Money_Flow_Sum <= 3.22682e+07 )
							ret := 0.500000
						if( Negative_Money_Flow_Sum > 3.22682e+07 )
							if( Positive_Money_Flow <= 5.33472e+07 )
								if( MFI_High <= 7.41721 )
									ret := -0.866667 // sell
								if( MFI_High > 7.41721 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow > 5.33472e+07 )
								if( Positive_Money_Flow_Sum <= 5.77231e+08 )
									ret := -0.181818
								if( Positive_Money_Flow_Sum > 5.77231e+08 )
									ret := -1.000000 // sell
	if( Negative_Money_Flow > 43.8749 )
		if( Negative_Money_Flow <= 5.47502e+06 )
			if( Positive_Money_Flow_Sum <= 1.46419e+06 )
				if( Negative_Money_Flow <= 428962 )
					if( Typical_Price <= 18.8109 )
						if( Positive_Money_Flow <= 8037.97 )
							if( Positive_Money_Flow_Sum <= 1.39943e+06 )
								if( Positive_Money_Flow_Sum <= 137651 )
									ret := 0.195050
								if( Positive_Money_Flow_Sum > 137651 )
									ret := 0.100862
							if( Positive_Money_Flow_Sum > 1.39943e+06 )
								if( MFI <= 74.8614 )
									ret := 0.352113
								if( MFI > 74.8614 )
									ret := 0.871795 // buy
						if( Positive_Money_Flow > 8037.97 )
							if( MFI <= 73.8629 )
								if( MFI <= 14.7207 )
									ret := 0.641791
								if( MFI > 14.7207 )
									ret := 0.238372
							if( MFI > 73.8629 )
								if( Negative_Money_Flow_Sum <= 96584.1 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 96584.1 )
									ret := 0.836735 // buy
					if( Typical_Price > 18.8109 )
						if( Positive_Money_Flow <= 98961.9 )
							if( MFI_High <= -64.8665 )
								if( Positive_Money_Flow <= 1322.72 )
									ret := -0.078431
								if( Positive_Money_Flow > 1322.72 )
									ret := -0.764706 // sell
							if( MFI_High > -64.8665 )
								if( MFI_Low <= 0.521912 )
									ret := 0.257862
								if( MFI_Low > 0.521912 )
									ret := 0.031525
						if( Positive_Money_Flow > 98961.9 )
							if( Raw_Money_Flow <= 204944 )
								ret := 0.500000
							if( Raw_Money_Flow > 204944 )
								ret := 1.000000 // buy
				if( Negative_Money_Flow > 428962 )
					if( Negative_Money_Flow <= 1.21839e+06 )
						if( Negative_Money_Flow_Sum <= 9.4122e+06 )
							if( Negative_Money_Flow <= 539477 )
								if( MFI_Low <= 13.3966 )
									ret := 0.440994
								if( MFI_Low > 13.3966 )
									ret := -0.052632
							if( Negative_Money_Flow > 539477 )
								if( Typical_Price <= 13.5298 )
									ret := 0.440000
								if( Typical_Price > 13.5298 )
									ret := 0.633065
						if( Negative_Money_Flow_Sum > 9.4122e+06 )
							if( MFI <= 3.81304 )
								if( MFI_Low <= -18.9888 )
									ret := -0.200000
								if( MFI_Low > -18.9888 )
									ret := 0.500000
							if( MFI > 3.81304 )
								if( Negative_Money_Flow_Sum <= 1.2093e+07 )
									ret := -0.500000
								if( Negative_Money_Flow_Sum > 1.2093e+07 )
									ret := -1.000000 // sell
					if( Negative_Money_Flow > 1.21839e+06 )
						if( Positive_Money_Flow_Sum <= 604631 )
							if( Positive_Money_Flow_Sum <= 81501.6 )
								ret := -0.750000 // sell
							if( Positive_Money_Flow_Sum > 81501.6 )
								if( Negative_Money_Flow_Sum <= 1.04868e+07 )
									ret := 0.338983
								if( Negative_Money_Flow_Sum > 1.04868e+07 )
									ret := 0.931034 // buy
						if( Positive_Money_Flow_Sum > 604631 )
							if( Negative_Money_Flow_Sum <= 6.35909e+06 )
								if( Raw_Money_Flow <= 2.26404e+06 )
									ret := -0.108108
								if( Raw_Money_Flow > 2.26404e+06 )
									ret := 0.625000
							if( Negative_Money_Flow_Sum > 6.35909e+06 )
								if( Negative_Money_Flow_Sum <= 1.40313e+07 )
									ret := -0.833333 // sell
								if( Negative_Money_Flow_Sum > 1.40313e+07 )
									ret := 0.400000
			if( Positive_Money_Flow_Sum > 1.46419e+06 )
				if( Money_Flow_Ratio <= 0.845171 )
					if( Money_Flow_Ratio <= 0.595858 )
						if( Positive_Money_Flow <= 21243.7 )
							if( Typical_Price <= 13.1903 )
								if( Negative_Money_Flow_Sum <= 1.54238e+07 )
									ret := 0.375691
								if( Negative_Money_Flow_Sum > 1.54238e+07 )
									ret := 0.097318
							if( Typical_Price > 13.1903 )
								if( MFI_High <= -44.5052 )
									ret := 0.037292
								if( MFI_High > -44.5052 )
									ret := -0.170569
						if( Positive_Money_Flow > 21243.7 )
							if( Raw_Money_Flow <= 197853 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 197853 )
								if( Money_Flow_Ratio <= 0.508564 )
									ret := 0.259016
								if( Money_Flow_Ratio > 0.508564 )
									ret := -0.100000
					if( Money_Flow_Ratio > 0.595858 )
						if( Raw_Money_Flow <= 401859 )
							if( Positive_Money_Flow_Sum <= 1.60786e+06 )
								if( Typical_Price <= 15.695 )
									ret := -0.250000
								if( Typical_Price > 15.695 )
									ret := 0.800000 // buy
							if( Positive_Money_Flow_Sum > 1.60786e+06 )
								if( Negative_Money_Flow_Sum <= 4.20267e+06 )
									ret := -0.317647
								if( Negative_Money_Flow_Sum > 4.20267e+06 )
									ret := 0.072398
						if( Raw_Money_Flow > 401859 )
							if( Positive_Money_Flow_Sum <= 2.7038e+06 )
								if( Negative_Money_Flow_Sum <= 2.45595e+06 )
									ret := -0.400000
								if( Negative_Money_Flow_Sum > 2.45595e+06 )
									ret := 0.676923
							if( Positive_Money_Flow_Sum > 2.7038e+06 )
								if( Positive_Money_Flow_Sum <= 4.03695e+06 )
									ret := -0.476190
								if( Positive_Money_Flow_Sum > 4.03695e+06 )
									ret := 0.201398
				if( Money_Flow_Ratio > 0.845171 )
					if( Negative_Money_Flow <= 1.46253e+06 )
						if( Positive_Money_Flow <= 571042 )
							if( Negative_Money_Flow <= 113135 )
								if( Positive_Money_Flow_Sum <= 1.96531e+06 )
									ret := 0.227811
								if( Positive_Money_Flow_Sum > 1.96531e+06 )
									ret := 0.017490
							if( Negative_Money_Flow > 113135 )
								if( MFI <= 72.0333 )
									ret := -0.067405
								if( MFI > 72.0333 )
									ret := 0.048387
						if( Positive_Money_Flow > 571042 )
							if( Negative_Money_Flow_Sum <= 5.8502e+07 )
								if( Negative_Money_Flow <= 1.04899e+06 )
									ret := 0.457627
								if( Negative_Money_Flow > 1.04899e+06 )
									ret := -0.250000
							if( Negative_Money_Flow_Sum > 5.8502e+07 )
								if( Negative_Money_Flow <= 217934 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 217934 )
									ret := 0.266667
					if( Negative_Money_Flow > 1.46253e+06 )
						if( Positive_Money_Flow <= 79223.6 )
							if( Positive_Money_Flow_Sum <= 8.73538e+07 )
								if( Positive_Money_Flow_Sum <= 8.21741e+07 )
									ret := 0.057963
								if( Positive_Money_Flow_Sum > 8.21741e+07 )
									ret := -0.560000
							if( Positive_Money_Flow_Sum > 8.73538e+07 )
								if( Typical_Price <= 15.0743 )
									ret := 0.640000
								if( Typical_Price > 15.0743 )
									ret := 0.195122
						if( Positive_Money_Flow > 79223.6 )
							if( Money_Flow_Ratio <= 3.26641 )
								if( MFI <= 52.9065 )
									ret := -0.166667
								if( MFI > 52.9065 )
									ret := 0.625000
							if( Money_Flow_Ratio > 3.26641 )
								if( Typical_Price <= 18.381 )
									ret := -0.185185
								if( Typical_Price > 18.381 )
									ret := 0.600000
		if( Negative_Money_Flow > 5.47502e+06 )
			if( Money_Flow_Ratio <= 0.033066 )
				if( Negative_Money_Flow_Sum <= 1.39873e+08 )
					if( Typical_Price <= 13.3173 )
						if( Negative_Money_Flow_Sum <= 8.25942e+07 )
							if( MFI_Low <= -19.1874 )
								if( MFI_High <= -79.8967 )
									ret := 0.000000
								if( MFI_High > -79.8967 )
									ret := -0.909091 // sell
							if( MFI_Low > -19.1874 )
								if( Positive_Money_Flow_Sum <= 745899 )
									ret := 0.109375
								if( Positive_Money_Flow_Sum > 745899 )
									ret := -0.583333
						if( Negative_Money_Flow_Sum > 8.25942e+07 )
							if( Typical_Price <= 10.0104 )
								ret := 0.250000
							if( Typical_Price > 10.0104 )
								ret := 1.000000 // buy
					if( Typical_Price > 13.3173 )
						if( Negative_Money_Flow_Sum <= 6.37517e+07 )
							if( Raw_Money_Flow <= 2.01526e+07 )
								if( Typical_Price <= 22.9034 )
									ret := -0.581967
								if( Typical_Price > 22.9034 )
									ret := 0.538462
							if( Raw_Money_Flow > 2.01526e+07 )
								if( MFI <= 2.07154 )
									ret := 0.000000
								if( MFI > 2.07154 )
									ret := 0.923077 // buy
						if( Negative_Money_Flow_Sum > 6.37517e+07 )
							if( Negative_Money_Flow <= 3.87419e+07 )
								if( MFI_Low <= -18.0941 )
									ret := -0.837209 // sell
								if( MFI_Low > -18.0941 )
									ret := -0.619048
							if( Negative_Money_Flow > 3.87419e+07 )
								ret := 0.500000
				if( Negative_Money_Flow_Sum > 1.39873e+08 )
					if( MFI_Low <= -19.4479 )
						if( Money_Flow_Ratio <= 0.003155 )
							ret := 1.000000 // buy
						if( Money_Flow_Ratio > 0.003155 )
							ret := 0.857143 // buy
					if( MFI_Low > -19.4479 )
						if( Positive_Money_Flow_Sum <= 1.77915e+06 )
							ret := -0.571429
						if( Positive_Money_Flow_Sum > 1.77915e+06 )
							if( Positive_Money_Flow_Sum <= 1.9656e+06 )
								ret := 0.500000
							if( Positive_Money_Flow_Sum > 1.9656e+06 )
								ret := 1.000000 // buy
			if( Money_Flow_Ratio > 0.033066 )
				if( Positive_Money_Flow_Sum <= 8.62425e+07 )
					if( Negative_Money_Flow_Sum <= 5.28469e+08 )
						if( Negative_Money_Flow_Sum <= 3.2552e+08 )
							if( Negative_Money_Flow_Sum <= 6.469e+07 )
								if( Positive_Money_Flow_Sum <= 501991 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 501991 )
									ret := -0.057518
							if( Negative_Money_Flow_Sum > 6.469e+07 )
								if( Positive_Money_Flow_Sum <= 2.71869e+07 )
									ret := 0.217270
								if( Positive_Money_Flow_Sum > 2.71869e+07 )
									ret := 0.004313
						if( Negative_Money_Flow_Sum > 3.2552e+08 )
							if( Raw_Money_Flow <= 4.44543e+07 )
								ret := 0.500000
							if( Raw_Money_Flow > 4.44543e+07 )
								if( Negative_Money_Flow <= 1.2791e+08 )
									ret := -0.972973 // sell
								if( Negative_Money_Flow > 1.2791e+08 )
									ret := 0.500000
					if( Negative_Money_Flow_Sum > 5.28469e+08 )
						if( Negative_Money_Flow_Sum <= 6.55022e+08 )
							ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 6.55022e+08 )
							ret := 0.500000
				if( Positive_Money_Flow_Sum > 8.62425e+07 )
					if( Positive_Money_Flow_Sum <= 1.64094e+08 )
						if( Typical_Price <= 17.0789 )
							if( Negative_Money_Flow <= 5.78772e+06 )
								if( Raw_Money_Flow <= 5.6249e+06 )
									ret := 0.800000 // buy
								if( Raw_Money_Flow > 5.6249e+06 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow > 5.78772e+06 )
								if( MFI_High <= -56.6396 )
									ret := -0.739130 // sell
								if( MFI_High > -56.6396 )
									ret := -0.004132
						if( Typical_Price > 17.0789 )
							if( Negative_Money_Flow_Sum <= 1.61589e+08 )
								if( Negative_Money_Flow <= 1.61738e+07 )
									ret := 0.291439
								if( Negative_Money_Flow > 1.61738e+07 )
									ret := -0.162679
							if( Negative_Money_Flow_Sum > 1.61589e+08 )
								if( Money_Flow_Ratio <= 0.213242 )
									ret := -0.650000
								if( Money_Flow_Ratio > 0.213242 )
									ret := 0.589844
					if( Positive_Money_Flow_Sum > 1.64094e+08 )
						if( Typical_Price <= 24.9379 )
							if( Positive_Money_Flow_Sum <= 2.66766e+08 )
								if( Positive_Money_Flow_Sum <= 2.37091e+08 )
									ret := -0.006479
								if( Positive_Money_Flow_Sum > 2.37091e+08 )
									ret := -0.480000
							if( Positive_Money_Flow_Sum > 2.66766e+08 )
								if( Money_Flow_Ratio <= 4.03494 )
									ret := 0.475336
								if( Money_Flow_Ratio > 4.03494 )
									ret := -0.192308
						if( Typical_Price > 24.9379 )
							if( Positive_Money_Flow_Sum <= 2.81912e+08 )
								if( Negative_Money_Flow_Sum <= 5.85022e+07 )
									ret := 0.818182 // buy
								if( Negative_Money_Flow_Sum > 5.85022e+07 )
									ret := -0.104895
							if( Positive_Money_Flow_Sum > 2.81912e+08 )
								if( Negative_Money_Flow_Sum <= 5.34306e+08 )
									ret := -0.622378
								if( Negative_Money_Flow_Sum > 5.34306e+08 )
									ret := 0.500000
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_RIVN_5Min_16703672(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)

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


