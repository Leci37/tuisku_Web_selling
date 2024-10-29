//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: META_30Min_2MT0_78fca6cb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_META_30Min_2MT0_78fca6cb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_META_30Min_78fca6cb(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=0.7, min_samples_leaf=7,min_samples_split=10, random_state=843828734)
	if( Money_Flow_Ratio <= 1.90294 )
		if( Raw_Money_Flow <= 2.01755e+08 )
			if( ema12 <= -0.154299 )
				if( Negative_Money_Flow_Sum <= 5.27408e+09 )
					if( ema12 <= -0.65448 )
						if( MFI_Low <= -2.44685 )
							if( Positive_Money_Flow_Sum <= 8.74951e+08 )
								if( Typical_Price <= 273.633 )
									ret := 0.359438
								if( Typical_Price > 273.633 )
									ret := 0.134470
							if( Positive_Money_Flow_Sum > 8.74951e+08 )
								ret := -0.700000 // sell
						if( MFI_Low > -2.44685 )
							if( ema12 <= -1.66373 )
								if( Positive_Money_Flow_Sum <= 1.90446e+09 )
									ret := 0.232416
								if( Positive_Money_Flow_Sum > 1.90446e+09 )
									ret := 0.666667
							if( ema12 > -1.66373 )
								if( Negative_Money_Flow_Sum <= 3.68672e+09 )
									ret := 0.121742
								if( Negative_Money_Flow_Sum > 3.68672e+09 )
									ret := -0.191589
					if( ema12 > -0.65448 )
						if( ema13 <= -0.639574 )
							if( Money_Flow_Ratio <= 1.66489 )
								if( Raw_Money_Flow <= 1.97608e+08 )
									ret := 0.031349
								if( Raw_Money_Flow > 1.97608e+08 )
									ret := 0.516667
							if( Money_Flow_Ratio > 1.66489 )
								if( Money_Flow_Ratio <= 1.81255 )
									ret := -0.661765
								if( Money_Flow_Ratio > 1.81255 )
									ret := -0.076923
						if( ema13 > -0.639574 )
							if( ema12 <= -0.530195 )
								if( Negative_Money_Flow_Sum <= 4.03122e+08 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 4.03122e+08 )
									ret := 0.653846
							if( ema12 > -0.530195 )
								if( Typical_Price <= 98.0854 )
									ret := 0.605263
								if( Typical_Price > 98.0854 )
									ret := 0.110940
				if( Negative_Money_Flow_Sum > 5.27408e+09 )
					if( ema2 <= 229.188 )
						if( MFI <= 1.53946 )
							ret := 0.785714 // buy
						if( MFI > 1.53946 )
							if( Negative_Money_Flow_Sum <= 1.03806e+10 )
								if( Typical_Price <= 201.782 )
									ret := -0.601504
								if( Typical_Price > 201.782 )
									ret := -0.971429 // sell
							if( Negative_Money_Flow_Sum > 1.03806e+10 )
								ret := 0.500000
					if( ema2 > 229.188 )
						if( Positive_Money_Flow_Sum <= 3.41309e+09 )
							if( ema12 <= -5.09836 )
								if( Positive_Money_Flow_Sum <= 3.22837e+09 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 3.22837e+09 )
									ret := -0.466667
							if( ema12 > -5.09836 )
								if( MFI_High <= -58.6046 )
									ret := -0.177215
								if( MFI_High > -58.6046 )
									ret := 0.393939
						if( Positive_Money_Flow_Sum > 3.41309e+09 )
							if( tema <= 436.463 )
								if( Positive_Money_Flow_Sum <= 6.2803e+09 )
									ret := 0.886364 // buy
								if( Positive_Money_Flow_Sum > 6.2803e+09 )
									ret := 0.076923
							if( tema > 436.463 )
								ret := 0.000000
			if( ema12 > -0.154299 )
				if( Negative_Money_Flow_Sum <= 1.68674e+09 )
					if( ema13 <= 0.415196 )
						if( Typical_Price <= 169.08 )
							if( ema12 <= 0.28287 )
								if( ema3 <= 155.79 )
									ret := 0.014333
								if( ema3 > 155.79 )
									ret := 0.130217
							if( ema12 > 0.28287 )
								if( Positive_Money_Flow <= 246738 )
									ret := -0.151515
								if( Positive_Money_Flow > 246738 )
									ret := -0.833333 // sell
						if( Typical_Price > 169.08 )
							if( Positive_Money_Flow_Sum <= 1.85118e+09 )
								if( ema13 <= 0.398899 )
									ret := -0.039351
								if( ema13 > 0.398899 )
									ret := -0.330827
							if( Positive_Money_Flow_Sum > 1.85118e+09 )
								if( Negative_Money_Flow <= 1.42213e+08 )
									ret := 0.302013
								if( Negative_Money_Flow > 1.42213e+08 )
									ret := -0.666667
					if( ema13 > 0.415196 )
						if( MFI_High <= -78.9721 )
							if( Typical_Price <= 274.267 )
								if( Negative_Money_Flow_Sum <= 7.84084e+08 )
									ret := 0.035714
								if( Negative_Money_Flow_Sum > 7.84084e+08 )
									ret := -0.628205
							if( Typical_Price > 274.267 )
								if( Positive_Money_Flow_Sum <= 4.95502e+06 )
									ret := 0.687500
								if( Positive_Money_Flow_Sum > 4.95502e+06 )
									ret := -0.181818
						if( MFI_High > -78.9721 )
							if( Raw_Money_Flow <= 921859 )
								if( Negative_Money_Flow <= 33980.7 )
									ret := -0.136628
								if( Negative_Money_Flow > 33980.7 )
									ret := 0.047619
							if( Raw_Money_Flow > 921859 )
								if( Raw_Money_Flow <= 1.46789e+07 )
									ret := 0.175254
								if( Raw_Money_Flow > 1.46789e+07 )
									ret := 0.052866
				if( Negative_Money_Flow_Sum > 1.68674e+09 )
					if( ema3 <= 511.054 )
						if( Raw_Money_Flow <= 4.26488e+06 )
							if( Positive_Money_Flow_Sum <= 1.85531e+09 )
								if( MFI <= 1.05072 )
									ret := 0.074766
								if( MFI > 1.05072 )
									ret := -0.277249
							if( Positive_Money_Flow_Sum > 1.85531e+09 )
								if( Negative_Money_Flow_Sum <= 2.1006e+09 )
									ret := -0.169291
								if( Negative_Money_Flow_Sum > 2.1006e+09 )
									ret := 0.067114
						if( Raw_Money_Flow > 4.26488e+06 )
							if( Positive_Money_Flow <= 5.24406e+06 )
								if( Money_Flow_Ratio <= 1.02364 )
									ret := 0.192201
								if( Money_Flow_Ratio > 1.02364 )
									ret := -0.074866
							if( Positive_Money_Flow > 5.24406e+06 )
								if( MFI_Low <= 42.1573 )
									ret := -0.099744
								if( MFI_Low > 42.1573 )
									ret := -0.727273 // sell
					if( ema3 > 511.054 )
						if( Raw_Money_Flow <= 1.26031e+06 )
							if( Positive_Money_Flow_Sum <= 1.47241e+09 )
								ret := -0.166667
							if( Positive_Money_Flow_Sum > 1.47241e+09 )
								ret := 0.000000
						if( Raw_Money_Flow > 1.26031e+06 )
							if( ema12 <= 1.00522 )
								if( Positive_Money_Flow <= 37571.5 )
									ret := 0.250000
								if( Positive_Money_Flow > 37571.5 )
									ret := 0.794118 // buy
							if( ema12 > 1.00522 )
								ret := -0.071429
		if( Raw_Money_Flow > 2.01755e+08 )
			if( Negative_Money_Flow_Sum <= 4.82256e+08 )
				if( ema12 <= 0.202808 )
					if( Raw_Money_Flow <= 4.26495e+08 )
						if( Positive_Money_Flow_Sum <= 2.59036e+06 )
							if( Positive_Money_Flow_Sum <= 1.7296e+06 )
								ret := 0.250000
							if( Positive_Money_Flow_Sum > 1.7296e+06 )
								ret := 0.888889 // buy
						if( Positive_Money_Flow_Sum > 2.59036e+06 )
							if( ema13 <= -0.256798 )
								if( Negative_Money_Flow_Sum <= 3.43828e+08 )
									ret := -0.187500
								if( Negative_Money_Flow_Sum > 3.43828e+08 )
									ret := 0.397590
							if( ema13 > -0.256798 )
								if( ema3 <= 120.583 )
									ret := 0.186667
								if( ema3 > 120.583 )
									ret := -0.203065
					if( Raw_Money_Flow > 4.26495e+08 )
						if( Positive_Money_Flow_Sum <= 2.7855e+07 )
							if( MFI_High <= -78.885 )
								ret := -0.153846
							if( MFI_High > -78.885 )
								if( ema12 <= -0.130979 )
									ret := 0.280000
								if( ema12 > -0.130979 )
									ret := 0.800000 // buy
						if( Positive_Money_Flow_Sum > 2.7855e+07 )
							ret := -0.166667
				if( ema12 > 0.202808 )
					if( Typical_Price <= 329.318 )
						if( ema1 <= 135.382 )
							ret := 0.214286
						if( ema1 > 135.382 )
							if( Negative_Money_Flow <= 2.27538e+08 )
								if( MFI_High <= -31.0412 )
									ret := 0.954545 // buy
								if( MFI_High > -31.0412 )
									ret := 0.090909
							if( Negative_Money_Flow > 2.27538e+08 )
								if( ema12 <= 0.300782 )
									ret := 0.666667
								if( ema12 > 0.300782 )
									ret := 0.942308 // buy
					if( Typical_Price > 329.318 )
						if( ema3 <= 379.981 )
							ret := -0.363636
						if( ema3 > 379.981 )
							ret := 1.000000 // buy
			if( Negative_Money_Flow_Sum > 4.82256e+08 )
				if( ema12 <= -2.14158 )
					if( Negative_Money_Flow_Sum <= 2.57827e+09 )
						if( ema2 <= 455.253 )
							if( ema3 <= 319.752 )
								if( Negative_Money_Flow_Sum <= 2.16999e+09 )
									ret := -0.068966
								if( Negative_Money_Flow_Sum > 2.16999e+09 )
									ret := 0.590909
							if( ema3 > 319.752 )
								if( Negative_Money_Flow_Sum <= 2.52256e+09 )
									ret := 0.977778 // buy
								if( Negative_Money_Flow_Sum > 2.52256e+09 )
									ret := 0.666667
						if( ema2 > 455.253 )
							if( ema2 <= 473.671 )
								ret := -0.611111
							if( ema2 > 473.671 )
								if( Typical_Price <= 510.882 )
									ret := 0.857143 // buy
								if( Typical_Price > 510.882 )
									ret := -0.166667
					if( Negative_Money_Flow_Sum > 2.57827e+09 )
						if( ema13 <= -3.44245 )
							if( ema2 <= 162.505 )
								if( ema13 <= -5.25102 )
									ret := -1.000000 // sell
								if( ema13 > -5.25102 )
									ret := -0.181818
							if( ema2 > 162.505 )
								if( ema12 <= -5.14451 )
									ret := 0.593750
								if( ema12 > -5.14451 )
									ret := 0.079745
						if( ema13 > -3.44245 )
							if( Typical_Price <= 317.767 )
								if( MFI_Low <= -15.8757 )
									ret := -0.500000
								if( MFI_Low > -15.8757 )
									ret := -0.842105 // sell
							if( Typical_Price > 317.767 )
								if( Negative_Money_Flow_Sum <= 3.66222e+09 )
									ret := 0.285714
								if( Negative_Money_Flow_Sum > 3.66222e+09 )
									ret := -0.538462
				if( ema12 > -2.14158 )
					if( ema2 <= 183.277 )
						if( MFI <= 25.7219 )
							if( ema12 <= 0.961766 )
								if( ema12 <= 0.254459 )
									ret := -0.056897
								if( ema12 > 0.254459 )
									ret := -0.486842
							if( ema12 > 0.961766 )
								ret := 0.750000 // buy
						if( MFI > 25.7219 )
							if( ema13 <= 3.74783 )
								if( Positive_Money_Flow_Sum <= 4.01469e+09 )
									ret := 0.121441
								if( Positive_Money_Flow_Sum > 4.01469e+09 )
									ret := -0.195531
							if( ema13 > 3.74783 )
								if( MFI <= 61.4787 )
									ret := 1.000000 // buy
								if( MFI > 61.4787 )
									ret := 0.636364
					if( ema2 > 183.277 )
						if( Typical_Price <= 207.778 )
							if( ema13 <= 1.83972 )
								if( Positive_Money_Flow_Sum <= 2.72756e+09 )
									ret := -0.182999
								if( Positive_Money_Flow_Sum > 2.72756e+09 )
									ret := 0.251397
							if( ema13 > 1.83972 )
								if( Negative_Money_Flow_Sum <= 1.78964e+09 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 1.78964e+09 )
									ret := -0.240000
						if( Typical_Price > 207.778 )
							if( MFI_Low <= -19.311 )
								if( Negative_Money_Flow <= 9.75532e+08 )
									ret := 0.451807
								if( Negative_Money_Flow > 9.75532e+08 )
									ret := -0.636364
							if( MFI_Low > -19.311 )
								if( tema <= 208.27 )
									ret := 0.740741 // buy
								if( tema > 208.27 )
									ret := -0.035850
	if( Money_Flow_Ratio > 1.90294 )
		if( ema12 <= -0.077556 )
			if( ema13 <= -1.49627 )
				if( tema <= 273.151 )
					if( Negative_Money_Flow_Sum <= 1.41741e+07 )
						if( ema1 <= 160.603 )
							ret := 0.736842 // buy
						if( ema1 > 160.603 )
							ret := 0.052632
					if( Negative_Money_Flow_Sum > 1.41741e+07 )
						if( MFI_Low <= 61.6673 )
							if( MFI_Low <= 50.5873 )
								if( Negative_Money_Flow_Sum <= 5.42572e+08 )
									ret := -0.250000
								if( Negative_Money_Flow_Sum > 5.42572e+08 )
									ret := -0.793103 // sell
							if( MFI_Low > 50.5873 )
								if( Negative_Money_Flow <= 453216 )
									ret := -0.480000
								if( Negative_Money_Flow > 453216 )
									ret := 0.600000
						if( MFI_Low > 61.6673 )
							if( Raw_Money_Flow <= 8.49201e+08 )
								if( Raw_Money_Flow <= 4.09948e+06 )
									ret := -0.370370
								if( Raw_Money_Flow > 4.09948e+06 )
									ret := -0.952381 // sell
							if( Raw_Money_Flow > 8.49201e+08 )
								if( ema3 <= 210.152 )
									ret := -0.736842 // sell
								if( ema3 > 210.152 )
									ret := 0.375000
				if( tema > 273.151 )
					if( ema13 <= -2.60105 )
						if( Positive_Money_Flow_Sum <= 3.00645e+09 )
							if( ema3 <= 472.135 )
								if( ema1 <= 383.338 )
									ret := 0.714286 // buy
								if( ema1 > 383.338 )
									ret := 1.000000 // buy
							if( ema3 > 472.135 )
								ret := 0.285714
						if( Positive_Money_Flow_Sum > 3.00645e+09 )
							ret := 0.000000
					if( ema13 > -2.60105 )
						if( Negative_Money_Flow <= 8.94587e+06 )
							if( Raw_Money_Flow <= 6.20573e+06 )
								if( Positive_Money_Flow <= 198042 )
									ret := 0.695652
								if( Positive_Money_Flow > 198042 )
									ret := 0.185185
							if( Raw_Money_Flow > 6.20573e+06 )
								if( MFI_Low <= 75.4028 )
									ret := -0.300000
								if( MFI_Low > 75.4028 )
									ret := 0.545455
						if( Negative_Money_Flow > 8.94587e+06 )
							ret := -0.722222 // sell
			if( ema13 > -1.49627 )
				if( Negative_Money_Flow_Sum <= 1.15981e+09 )
					if( ema3 <= 190.677 )
						if( Negative_Money_Flow <= 1.36127e+06 )
							if( Positive_Money_Flow <= 6.23181e+08 )
								if( Positive_Money_Flow <= 5.37604e+08 )
									ret := 0.237307
								if( Positive_Money_Flow > 5.37604e+08 )
									ret := -0.800000 // sell
							if( Positive_Money_Flow > 6.23181e+08 )
								if( Raw_Money_Flow <= 1.04998e+09 )
									ret := 0.696429
								if( Raw_Money_Flow > 1.04998e+09 )
									ret := -0.307692
						if( Negative_Money_Flow > 1.36127e+06 )
							if( Negative_Money_Flow <= 1.2827e+08 )
								if( tema <= 127.178 )
									ret := 0.289474
								if( tema > 127.178 )
									ret := -0.278788
							if( Negative_Money_Flow > 1.2827e+08 )
								if( ema1 <= 173.628 )
									ret := 0.789474 // buy
								if( ema1 > 173.628 )
									ret := 0.000000
					if( ema3 > 190.677 )
						if( MFI_High <= 19.8592 )
							if( tema <= 500.649 )
								if( Raw_Money_Flow <= 1.40655e+09 )
									ret := 0.358789
								if( Raw_Money_Flow > 1.40655e+09 )
									ret := -0.466667
							if( tema > 500.649 )
								if( ema3 <= 506.572 )
									ret := -0.411765
								if( ema3 > 506.572 )
									ret := 0.031250
						if( MFI_High > 19.8592 )
							ret := -0.909091 // sell
				if( Negative_Money_Flow_Sum > 1.15981e+09 )
					if( Positive_Money_Flow <= 42059 )
						if( ema12 <= -0.20141 )
							ret := 0.533333
						if( ema12 > -0.20141 )
							ret := -0.333333
					if( Positive_Money_Flow > 42059 )
						if( ema1 <= 345.609 )
							if( ema13 <= -0.941437 )
								ret := -1.000000 // sell
							if( ema13 > -0.941437 )
								if( ema1 <= 233.087 )
									ret := -0.200000
								if( ema1 > 233.087 )
									ret := -0.846154 // sell
						if( ema1 > 345.609 )
							ret := 0.000000
		if( ema12 > -0.077556 )
			if( Positive_Money_Flow <= 2.50091e+09 )
				if( Raw_Money_Flow <= 7.78414e+06 )
					if( Money_Flow_Ratio <= 113.661 )
						if( ema13 <= 0.26862 )
							if( Negative_Money_Flow_Sum <= 4.75436e+08 )
								if( MFI <= 78.7373 )
									ret := 0.108853
								if( MFI > 78.7373 )
									ret := -0.097665
							if( Negative_Money_Flow_Sum > 4.75436e+08 )
								if( Positive_Money_Flow_Sum <= 1.51571e+09 )
									ret := -0.451389
								if( Positive_Money_Flow_Sum > 1.51571e+09 )
									ret := -0.060185
						if( ema13 > 0.26862 )
							if( Positive_Money_Flow_Sum <= 1.08197e+07 )
								if( ema13 <= 0.493726 )
									ret := 0.140000
								if( ema13 > 0.493726 )
									ret := 0.679245
							if( Positive_Money_Flow_Sum > 1.08197e+07 )
								if( ema12 <= 1.19396 )
									ret := 0.090667
								if( ema12 > 1.19396 )
									ret := -0.075571
					if( Money_Flow_Ratio > 113.661 )
						if( MFI_High <= 19.1304 )
							if( Positive_Money_Flow <= 983884 )
								if( ema12 <= 0.079224 )
									ret := -0.529412
								if( ema12 > 0.079224 )
									ret := -0.931818 // sell
							if( Positive_Money_Flow > 983884 )
								ret := 0.100000
						if( MFI_High > 19.1304 )
							if( Positive_Money_Flow <= 1.12708e+06 )
								if( Raw_Money_Flow <= 587386 )
									ret := 0.049096
								if( Raw_Money_Flow > 587386 )
									ret := -0.128440
							if( Positive_Money_Flow > 1.12708e+06 )
								if( tema <= 163.762 )
									ret := -0.737705 // sell
								if( tema > 163.762 )
									ret := -0.123967
				if( Raw_Money_Flow > 7.78414e+06 )
					if( Negative_Money_Flow_Sum <= 2.04222e+07 )
						if( Typical_Price <= 217.684 )
							if( Raw_Money_Flow <= 1.4629e+07 )
								if( Raw_Money_Flow <= 7.97567e+06 )
									ret := 0.708333 // buy
								if( Raw_Money_Flow > 7.97567e+06 )
									ret := -0.356589
							if( Raw_Money_Flow > 1.4629e+07 )
								if( ema13 <= 0.365344 )
									ret := 0.012177
								if( ema13 > 0.365344 )
									ret := 0.234899
						if( Typical_Price > 217.684 )
							if( Raw_Money_Flow <= 9.92007e+08 )
								if( Raw_Money_Flow <= 8.36987e+08 )
									ret := 0.264331
								if( Raw_Money_Flow > 8.36987e+08 )
									ret := -0.326531
							if( Raw_Money_Flow > 9.92007e+08 )
								if( ema13 <= 1.46052 )
									ret := 0.133333
								if( ema13 > 1.46052 )
									ret := 0.816667 // buy
					if( Negative_Money_Flow_Sum > 2.04222e+07 )
						if( MFI_Low <= 59.3072 )
							if( Negative_Money_Flow <= 6.52484e+08 )
								if( Raw_Money_Flow <= 1.3376e+09 )
									ret := 0.134000
								if( Raw_Money_Flow > 1.3376e+09 )
									ret := 0.851852 // buy
							if( Negative_Money_Flow > 6.52484e+08 )
								if( Negative_Money_Flow_Sum <= 1.22753e+09 )
									ret := -0.641026
								if( Negative_Money_Flow_Sum > 1.22753e+09 )
									ret := -0.097561
						if( MFI_Low > 59.3072 )
							if( Negative_Money_Flow_Sum <= 2.10012e+07 )
								if( MFI_High <= 17.6371 )
									ret := -0.444444
								if( MFI_High > 17.6371 )
									ret := -0.925926 // sell
							if( Negative_Money_Flow_Sum > 2.10012e+07 )
								if( Typical_Price <= 163.809 )
									ret := 0.137034
								if( Typical_Price > 163.809 )
									ret := -0.006928
			if( Positive_Money_Flow > 2.50091e+09 )
				if( Money_Flow_Ratio <= 14.2164 )
					ret := -0.307692
				if( Money_Flow_Ratio > 14.2164 )
					ret := -0.960000 // sell
	
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
float op_operation = decision_tree_0_META_30Min_78fca6cb(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)

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


