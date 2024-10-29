//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: LINKUSDT_15Min_1M00_6f7b92ca Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LINKUSDT_15Min_1M00_6f7b92ca", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LINKUSDT_15Min_6f7b92ca(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 123655 )
		if( Positive_Money_Flow_Sum <= 7.39529e+06 )
			if( Positive_Money_Flow_Sum <= 3.20144e+06 )
				if( Negative_Money_Flow_Sum <= 2.47835e+06 )
					if( Negative_Money_Flow_Sum <= 679031 )
						if( Raw_Money_Flow <= 37685.3 )
							if( Positive_Money_Flow <= 29589.2 )
								if( MFI_High <= -31.3341 )
									ret := -0.111702
								if( MFI_High > -31.3341 )
									ret := 0.045872
							if( Positive_Money_Flow > 29589.2 )
								if( Typical_Price <= 5.53822 )
									ret := -0.666667
								if( Typical_Price > 5.53822 )
									ret := -0.141975
						if( Raw_Money_Flow > 37685.3 )
							if( Negative_Money_Flow_Sum <= 582696 )
								if( Typical_Price <= 10.2465 )
									ret := 0.039124
								if( Typical_Price > 10.2465 )
									ret := -0.066574
							if( Negative_Money_Flow_Sum > 582696 )
								if( Positive_Money_Flow <= 143359 )
									ret := 0.087160
								if( Positive_Money_Flow > 143359 )
									ret := 0.236967
					if( Negative_Money_Flow_Sum > 679031 )
						if( Raw_Money_Flow <= 85342.9 )
							if( Positive_Money_Flow_Sum <= 826736 )
								if( Money_Flow_Ratio <= 0.424951 )
									ret := 0.080760
								if( Money_Flow_Ratio > 0.424951 )
									ret := -0.057622
							if( Positive_Money_Flow_Sum > 826736 )
								if( MFI_Low <= 32.3153 )
									ret := 0.173959
								if( MFI_Low > 32.3153 )
									ret := 0.003766
						if( Raw_Money_Flow > 85342.9 )
							if( Raw_Money_Flow <= 380991 )
								if( Positive_Money_Flow <= 209457 )
									ret := -0.020620
								if( Positive_Money_Flow > 209457 )
									ret := -0.080212
							if( Raw_Money_Flow > 380991 )
								if( Negative_Money_Flow_Sum <= 842187 )
									ret := 0.381818
								if( Negative_Money_Flow_Sum > 842187 )
									ret := 0.018138
				if( Negative_Money_Flow_Sum > 2.47835e+06 )
					if( Negative_Money_Flow_Sum <= 1.13161e+07 )
						if( Negative_Money_Flow_Sum <= 2.63299e+06 )
							if( Positive_Money_Flow_Sum <= 765282 )
								if( Typical_Price <= 6.38977 )
									ret := 0.071429
								if( Typical_Price > 6.38977 )
									ret := -0.448276
							if( Positive_Money_Flow_Sum > 765282 )
								if( Positive_Money_Flow <= 854688 )
									ret := 0.182990
								if( Positive_Money_Flow > 854688 )
									ret := 0.909091 // buy
						if( Negative_Money_Flow_Sum > 2.63299e+06 )
							if( Positive_Money_Flow_Sum <= 1.54674e+06 )
								if( Money_Flow_Ratio <= 0.369641 )
									ret := 0.053293
								if( Money_Flow_Ratio > 0.369641 )
									ret := 0.199697
							if( Positive_Money_Flow_Sum > 1.54674e+06 )
								if( Raw_Money_Flow <= 181393 )
									ret := 0.119110
								if( Raw_Money_Flow > 181393 )
									ret := 0.000000
					if( Negative_Money_Flow_Sum > 1.13161e+07 )
						if( Raw_Money_Flow <= 1.30288e+06 )
							if( Positive_Money_Flow_Sum <= 2.6586e+06 )
								if( Positive_Money_Flow_Sum <= 1.37295e+06 )
									ret := 0.333333
								if( Positive_Money_Flow_Sum > 1.37295e+06 )
									ret := -0.602273
							if( Positive_Money_Flow_Sum > 2.6586e+06 )
								if( Positive_Money_Flow <= 446052 )
									ret := 0.250000
								if( Positive_Money_Flow > 446052 )
									ret := -0.366667
						if( Raw_Money_Flow > 1.30288e+06 )
							if( Negative_Money_Flow_Sum <= 1.59339e+07 )
								if( Raw_Money_Flow <= 1.38585e+06 )
									ret := 0.750000 // buy
								if( Raw_Money_Flow > 1.38585e+06 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 1.59339e+07 )
								ret := 0.285714
			if( Positive_Money_Flow_Sum > 3.20144e+06 )
				if( MFI_High <= -29.6666 )
					if( Negative_Money_Flow_Sum <= 1.97882e+07 )
						if( Negative_Money_Flow_Sum <= 1.11277e+07 )
							if( Negative_Money_Flow_Sum <= 1.0798e+07 )
								if( Positive_Money_Flow <= 776037 )
									ret := 0.101883
								if( Positive_Money_Flow > 776037 )
									ret := 0.212800
							if( Negative_Money_Flow_Sum > 1.0798e+07 )
								if( Money_Flow_Ratio <= 0.306928 )
									ret := 0.875000 // buy
								if( Money_Flow_Ratio > 0.306928 )
									ret := -0.293333
						if( Negative_Money_Flow_Sum > 1.11277e+07 )
							if( Positive_Money_Flow <= 1.72099e+06 )
								if( Negative_Money_Flow_Sum <= 1.17784e+07 )
									ret := 0.664773
								if( Negative_Money_Flow_Sum > 1.17784e+07 )
									ret := 0.219907
							if( Positive_Money_Flow > 1.72099e+06 )
								if( MFI_Low <= 7.07786 )
									ret := -0.500000
								if( MFI_Low > 7.07786 )
									ret := 0.160714
					if( Negative_Money_Flow_Sum > 1.97882e+07 )
						if( Typical_Price <= 13.6915 )
							if( Raw_Money_Flow <= 1.73075e+06 )
								if( Raw_Money_Flow <= 860034 )
									ret := 0.333333
								if( Raw_Money_Flow > 860034 )
									ret := -0.454545
							if( Raw_Money_Flow > 1.73075e+06 )
								ret := 1.000000 // buy
						if( Typical_Price > 13.6915 )
							if( Negative_Money_Flow_Sum <= 2.53332e+07 )
								if( Negative_Money_Flow_Sum <= 2.09009e+07 )
									ret := -0.545455
								if( Negative_Money_Flow_Sum > 2.09009e+07 )
									ret := 0.120000
							if( Negative_Money_Flow_Sum > 2.53332e+07 )
								if( Positive_Money_Flow <= 2.50242e+06 )
									ret := -0.960000 // sell
								if( Positive_Money_Flow > 2.50242e+06 )
									ret := -0.250000
				if( MFI_High > -29.6666 )
					if( MFI_High <= -29.0085 )
						if( Negative_Money_Flow_Sum <= 3.36728e+06 )
							if( Negative_Money_Flow_Sum <= 3.13159e+06 )
								ret := -0.500000
							if( Negative_Money_Flow_Sum > 3.13159e+06 )
								if( Typical_Price <= 6.80014 )
									ret := 0.125000
								if( Typical_Price > 6.80014 )
									ret := 0.681818
						if( Negative_Money_Flow_Sum > 3.36728e+06 )
							if( Positive_Money_Flow_Sum <= 5.85174e+06 )
								if( Typical_Price <= 8.48253 )
									ret := -0.246154
								if( Typical_Price > 8.48253 )
									ret := -0.580952
							if( Positive_Money_Flow_Sum > 5.85174e+06 )
								if( Positive_Money_Flow_Sum <= 6.59665e+06 )
									ret := 0.303030
								if( Positive_Money_Flow_Sum > 6.59665e+06 )
									ret := -0.846154 // sell
					if( MFI_High > -29.0085 )
						if( Typical_Price <= 7.69282 )
							if( Positive_Money_Flow_Sum <= 4.96241e+06 )
								if( Negative_Money_Flow_Sum <= 3.69314e+06 )
									ret := 0.114196
								if( Negative_Money_Flow_Sum > 3.69314e+06 )
									ret := 0.386364
							if( Positive_Money_Flow_Sum > 4.96241e+06 )
								if( Positive_Money_Flow <= 609124 )
									ret := 0.061392
								if( Positive_Money_Flow > 609124 )
									ret := -0.193344
						if( Typical_Price > 7.69282 )
							if( Negative_Money_Flow_Sum <= 4.90038e+06 )
								if( Negative_Money_Flow_Sum <= 4.24013e+06 )
									ret := -0.006025
								if( Negative_Money_Flow_Sum > 4.24013e+06 )
									ret := -0.197708
							if( Negative_Money_Flow_Sum > 4.90038e+06 )
								if( Negative_Money_Flow_Sum <= 5.40822e+06 )
									ret := 0.479592
								if( Negative_Money_Flow_Sum > 5.40822e+06 )
									ret := -0.140078
		if( Positive_Money_Flow_Sum > 7.39529e+06 )
			if( Money_Flow_Ratio <= 0.42318 )
				if( Negative_Money_Flow_Sum <= 2.05249e+07 )
					if( Raw_Money_Flow <= 1.77932e+06 )
						if( Raw_Money_Flow <= 1.10634e+06 )
							ret := 0.142857
						if( Raw_Money_Flow > 1.10634e+06 )
							ret := 0.750000 // buy
					if( Raw_Money_Flow > 1.77932e+06 )
						ret := -1.000000 // sell
				if( Negative_Money_Flow_Sum > 2.05249e+07 )
					if( Positive_Money_Flow_Sum <= 2.04564e+07 )
						if( Positive_Money_Flow_Sum <= 1.53789e+07 )
							if( Typical_Price <= 17.5406 )
								if( Raw_Money_Flow <= 3.7096e+06 )
									ret := 0.739130 // buy
								if( Raw_Money_Flow > 3.7096e+06 )
									ret := 0.000000
							if( Typical_Price > 17.5406 )
								if( Positive_Money_Flow_Sum <= 8.00364e+06 )
									ret := -0.727273 // sell
								if( Positive_Money_Flow_Sum > 8.00364e+06 )
									ret := 0.451613
						if( Positive_Money_Flow_Sum > 1.53789e+07 )
							if( Positive_Money_Flow_Sum <= 1.76247e+07 )
								if( Raw_Money_Flow <= 3.37549e+06 )
									ret := 0.600000
								if( Raw_Money_Flow > 3.37549e+06 )
									ret := -0.400000
							if( Positive_Money_Flow_Sum > 1.76247e+07 )
								ret := -0.714286 // sell
					if( Positive_Money_Flow_Sum > 2.04564e+07 )
						if( Typical_Price <= 13.1224 )
							ret := 1.000000 // buy
						if( Typical_Price > 13.1224 )
							if( MFI_Low <= 2.4768 )
								ret := 1.000000 // buy
							if( MFI_Low > 2.4768 )
								ret := 0.250000
			if( Money_Flow_Ratio > 0.42318 )
				if( Negative_Money_Flow_Sum <= 2.16874e+06 )
					if( Positive_Money_Flow_Sum <= 7.89558e+06 )
						if( Positive_Money_Flow <= 3.54339e+06 )
							if( Positive_Money_Flow_Sum <= 7.69275e+06 )
								if( Raw_Money_Flow <= 978330 )
									ret := 0.311111
								if( Raw_Money_Flow > 978330 )
									ret := -0.446809
							if( Positive_Money_Flow_Sum > 7.69275e+06 )
								if( MFI_Low <= 64.8103 )
									ret := -0.500000
								if( MFI_Low > 64.8103 )
									ret := -0.944444 // sell
						if( Positive_Money_Flow > 3.54339e+06 )
							ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 7.89558e+06 )
						if( MFI <= 83.3662 )
							if( MFI_Low <= 60.1848 )
								ret := -0.800000 // sell
							if( MFI_Low > 60.1848 )
								if( Typical_Price <= 17.2808 )
									ret := 0.648352
								if( Typical_Price > 17.2808 )
									ret := -0.272727
						if( MFI > 83.3662 )
							if( Raw_Money_Flow <= 635282 )
								if( Money_Flow_Ratio <= 9.90902 )
									ret := 0.014925
								if( Money_Flow_Ratio > 9.90902 )
									ret := -0.518519
							if( Raw_Money_Flow > 635282 )
								if( MFI <= 84.6087 )
									ret := -0.325581
								if( MFI > 84.6087 )
									ret := 0.267717
				if( Negative_Money_Flow_Sum > 2.16874e+06 )
					if( Raw_Money_Flow <= 3.69257e+06 )
						if( Positive_Money_Flow_Sum <= 2.63801e+07 )
							if( Positive_Money_Flow_Sum <= 1.37055e+07 )
								if( Negative_Money_Flow_Sum <= 8.84496e+06 )
									ret := -0.097146
								if( Negative_Money_Flow_Sum > 8.84496e+06 )
									ret := 0.007312
							if( Positive_Money_Flow_Sum > 1.37055e+07 )
								if( Negative_Money_Flow_Sum <= 6.61255e+06 )
									ret := -0.338806
								if( Negative_Money_Flow_Sum > 6.61255e+06 )
									ret := -0.134046
						if( Positive_Money_Flow_Sum > 2.63801e+07 )
							if( Money_Flow_Ratio <= 0.720366 )
								if( MFI <= 38.048 )
									ret := -0.400000
								if( MFI > 38.048 )
									ret := -0.928571 // sell
							if( Money_Flow_Ratio > 0.720366 )
								if( Money_Flow_Ratio <= 8.15654 )
									ret := 0.304183
								if( Money_Flow_Ratio > 8.15654 )
									ret := -0.650000
					if( Raw_Money_Flow > 3.69257e+06 )
						if( Positive_Money_Flow_Sum <= 3.68077e+07 )
							if( Positive_Money_Flow_Sum <= 2.22029e+07 )
								if( Negative_Money_Flow_Sum <= 1.94716e+07 )
									ret := -0.042308
								if( Negative_Money_Flow_Sum > 1.94716e+07 )
									ret := 0.666667
							if( Positive_Money_Flow_Sum > 2.22029e+07 )
								if( MFI <= 57.4147 )
									ret := -0.090909
								if( MFI > 57.4147 )
									ret := 0.625000
						if( Positive_Money_Flow_Sum > 3.68077e+07 )
							if( Positive_Money_Flow <= 1.07527e+07 )
								if( Positive_Money_Flow <= 6.18337e+06 )
									ret := -0.283951
								if( Positive_Money_Flow > 6.18337e+06 )
									ret := 0.434783
							if( Positive_Money_Flow > 1.07527e+07 )
								ret := -1.000000 // sell
	if( Negative_Money_Flow > 123655 )
		if( Negative_Money_Flow_Sum <= 3.25979e+06 )
			if( Positive_Money_Flow_Sum <= 1.60491e+07 )
				if( Typical_Price <= 12.6764 )
					if( Positive_Money_Flow_Sum <= 1.63306e+06 )
						if( MFI_High <= -65.9059 )
							if( Negative_Money_Flow <= 184283 )
								if( Positive_Money_Flow_Sum <= 134262 )
									ret := -0.125000
								if( Positive_Money_Flow_Sum > 134262 )
									ret := 0.444444
							if( Negative_Money_Flow > 184283 )
								if( Negative_Money_Flow_Sum <= 3.07514e+06 )
									ret := -0.229885
								if( Negative_Money_Flow_Sum > 3.07514e+06 )
									ret := -0.696970
						if( MFI_High > -65.9059 )
							if( Money_Flow_Ratio <= 0.209269 )
								if( Negative_Money_Flow_Sum <= 2.07958e+06 )
									ret := -0.027027
								if( Negative_Money_Flow_Sum > 2.07958e+06 )
									ret := 0.462963
							if( Money_Flow_Ratio > 0.209269 )
								if( Typical_Price <= 5.81379 )
									ret := 0.233333
								if( Typical_Price > 5.81379 )
									ret := 0.028133
					if( Positive_Money_Flow_Sum > 1.63306e+06 )
						if( MFI_High <= -41.1231 )
							if( Typical_Price <= 8.03787 )
								if( Negative_Money_Flow <= 401461 )
									ret := 0.528736
								if( Negative_Money_Flow > 401461 )
									ret := 0.243902
							if( Typical_Price > 8.03787 )
								if( Negative_Money_Flow <= 541966 )
									ret := 0.875000 // buy
								if( Negative_Money_Flow > 541966 )
									ret := 0.000000
						if( MFI_High > -41.1231 )
							if( Negative_Money_Flow_Sum <= 2.41864e+06 )
								if( Raw_Money_Flow <= 1.07412e+06 )
									ret := 0.120198
								if( Raw_Money_Flow > 1.07412e+06 )
									ret := 0.543860
							if( Negative_Money_Flow_Sum > 2.41864e+06 )
								if( Raw_Money_Flow <= 367639 )
									ret := 0.116954
								if( Raw_Money_Flow > 367639 )
									ret := -0.050000
				if( Typical_Price > 12.6764 )
					if( Money_Flow_Ratio <= 4.92009 )
						if( Raw_Money_Flow <= 220513 )
							if( MFI_High <= -18.487 )
								if( MFI_High <= -22.2436 )
									ret := 0.070735
								if( MFI_High > -22.2436 )
									ret := -0.123711
							if( MFI_High > -18.487 )
								if( MFI_Low <= 44.5764 )
									ret := 0.396825
								if( MFI_Low > 44.5764 )
									ret := 0.059172
						if( Raw_Money_Flow > 220513 )
							if( Negative_Money_Flow <= 473214 )
								if( Negative_Money_Flow_Sum <= 2.7256e+06 )
									ret := -0.125823
								if( Negative_Money_Flow_Sum > 2.7256e+06 )
									ret := 0.009346
							if( Negative_Money_Flow > 473214 )
								if( MFI_High <= -21.0196 )
									ret := 0.152000
								if( MFI_High > -21.0196 )
									ret := -0.093439
					if( Money_Flow_Ratio > 4.92009 )
						if( Negative_Money_Flow <= 571749 )
							if( Negative_Money_Flow_Sum <= 2.14478e+06 )
								if( Negative_Money_Flow_Sum <= 1.85987e+06 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 1.85987e+06 )
									ret := -0.750000 // sell
							if( Negative_Money_Flow_Sum > 2.14478e+06 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow > 571749 )
							if( MFI <= 86.7394 )
								if( Negative_Money_Flow_Sum <= 2.46911e+06 )
									ret := 0.892857 // buy
								if( Negative_Money_Flow_Sum > 2.46911e+06 )
									ret := 0.250000
							if( MFI > 86.7394 )
								if( Positive_Money_Flow_Sum <= 7.99283e+06 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 7.99283e+06 )
									ret := 0.000000
			if( Positive_Money_Flow_Sum > 1.60491e+07 )
				if( Negative_Money_Flow_Sum <= 2.3515e+06 )
					if( MFI_Low <= 69.1 )
						ret := 1.000000 // buy
					if( MFI_Low > 69.1 )
						if( MFI_Low <= 71.6066 )
							ret := 0.500000
						if( MFI_Low > 71.6066 )
							ret := 1.000000 // buy
				if( Negative_Money_Flow_Sum > 2.3515e+06 )
					if( Negative_Money_Flow_Sum <= 2.44241e+06 )
						if( MFI_Low <= 68.1076 )
							ret := -1.000000 // sell
						if( MFI_Low > 68.1076 )
							ret := 0.250000
					if( Negative_Money_Flow_Sum > 2.44241e+06 )
						if( Money_Flow_Ratio <= 8.443 )
							if( Raw_Money_Flow <= 921761 )
								if( Money_Flow_Ratio <= 6.84298 )
									ret := 0.500000
								if( Money_Flow_Ratio > 6.84298 )
									ret := 0.750000 // buy
							if( Raw_Money_Flow > 921761 )
								ret := 1.000000 // buy
						if( Money_Flow_Ratio > 8.443 )
							ret := 0.333333
		if( Negative_Money_Flow_Sum > 3.25979e+06 )
			if( Positive_Money_Flow_Sum <= 7.3976e+06 )
				if( Negative_Money_Flow_Sum <= 1.16333e+07 )
					if( Positive_Money_Flow_Sum <= 350333 )
						if( Negative_Money_Flow_Sum <= 3.98878e+06 )
							if( Raw_Money_Flow <= 480943 )
								if( Typical_Price <= 8.47149 )
									ret := -0.928571 // sell
								if( Typical_Price > 8.47149 )
									ret := -0.636364
							if( Raw_Money_Flow > 480943 )
								ret := 0.000000
						if( Negative_Money_Flow_Sum > 3.98878e+06 )
							if( Raw_Money_Flow <= 800020 )
								if( MFI_High <= -77.8786 )
									ret := 0.714286 // buy
								if( MFI_High > -77.8786 )
									ret := 0.037037
							if( Raw_Money_Flow > 800020 )
								if( Positive_Money_Flow_Sum <= 300955 )
									ret := -0.875000 // sell
								if( Positive_Money_Flow_Sum > 300955 )
									ret := 0.000000
					if( Positive_Money_Flow_Sum > 350333 )
						if( Positive_Money_Flow_Sum <= 7.15569e+06 )
							if( MFI <= 60.1347 )
								if( Negative_Money_Flow <= 433907 )
									ret := 0.115077
								if( Negative_Money_Flow > 433907 )
									ret := 0.170404
							if( MFI > 60.1347 )
								if( Negative_Money_Flow <= 822133 )
									ret := -0.210526
								if( Negative_Money_Flow > 822133 )
									ret := 0.318182
						if( Positive_Money_Flow_Sum > 7.15569e+06 )
							if( Negative_Money_Flow <= 1.81587e+06 )
								if( Negative_Money_Flow <= 384719 )
									ret := -0.454545
								if( Negative_Money_Flow > 384719 )
									ret := 0.515306
							if( Negative_Money_Flow > 1.81587e+06 )
								if( Negative_Money_Flow <= 2.47977e+06 )
									ret := -0.800000 // sell
								if( Negative_Money_Flow > 2.47977e+06 )
									ret := 0.750000 // buy
				if( Negative_Money_Flow_Sum > 1.16333e+07 )
					if( Money_Flow_Ratio <= 0.306633 )
						if( Raw_Money_Flow <= 2.91662e+06 )
							if( Positive_Money_Flow_Sum <= 2.87087e+06 )
								if( Typical_Price <= 10.5063 )
									ret := 0.513661
								if( Typical_Price > 10.5063 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 2.87087e+06 )
								if( Positive_Money_Flow_Sum <= 3.79784e+06 )
									ret := -0.333333
								if( Positive_Money_Flow_Sum > 3.79784e+06 )
									ret := 0.127946
						if( Raw_Money_Flow > 2.91662e+06 )
							if( Positive_Money_Flow_Sum <= 6.9732e+06 )
								if( Positive_Money_Flow_Sum <= 4.30364e+06 )
									ret := 0.358025
								if( Positive_Money_Flow_Sum > 4.30364e+06 )
									ret := 0.767123 // buy
							if( Positive_Money_Flow_Sum > 6.9732e+06 )
								if( Positive_Money_Flow_Sum <= 7.14185e+06 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 7.14185e+06 )
									ret := -0.500000
					if( Money_Flow_Ratio > 0.306633 )
						if( Raw_Money_Flow <= 1.44719e+06 )
							if( Raw_Money_Flow <= 385324 )
								if( Positive_Money_Flow_Sum <= 4.52377e+06 )
									ret := -0.666667
								if( Positive_Money_Flow_Sum > 4.52377e+06 )
									ret := 0.250000
							if( Raw_Money_Flow > 385324 )
								if( Positive_Money_Flow_Sum <= 4.79751e+06 )
									ret := 0.191489
								if( Positive_Money_Flow_Sum > 4.79751e+06 )
									ret := 0.642005
						if( Raw_Money_Flow > 1.44719e+06 )
							if( MFI_High <= -50.8011 )
								if( Negative_Money_Flow <= 1.826e+06 )
									ret := -0.100000
								if( Negative_Money_Flow > 1.826e+06 )
									ret := 0.526786
							if( MFI_High > -50.8011 )
								if( Positive_Money_Flow_Sum <= 6.13297e+06 )
									ret := -0.425926
								if( Positive_Money_Flow_Sum > 6.13297e+06 )
									ret := 0.241379
			if( Positive_Money_Flow_Sum > 7.3976e+06 )
				if( Negative_Money_Flow_Sum <= 9.37683e+06 )
					if( MFI <= 78.5829 )
						if( Negative_Money_Flow_Sum <= 5.55694e+06 )
							if( Raw_Money_Flow <= 518441 )
								if( Positive_Money_Flow <= 101738 )
									ret := -0.312169
								if( Positive_Money_Flow > 101738 )
									ret := 1.000000 // buy
							if( Raw_Money_Flow > 518441 )
								if( Positive_Money_Flow_Sum <= 1.05656e+07 )
									ret := 0.194487
								if( Positive_Money_Flow_Sum > 1.05656e+07 )
									ret := -0.123919
						if( Negative_Money_Flow_Sum > 5.55694e+06 )
							if( Raw_Money_Flow <= 1.01071e+06 )
								if( Negative_Money_Flow_Sum <= 5.90219e+06 )
									ret := -0.336000
								if( Negative_Money_Flow_Sum > 5.90219e+06 )
									ret := 0.014360
							if( Raw_Money_Flow > 1.01071e+06 )
								if( Negative_Money_Flow <= 1.5062e+06 )
									ret := -0.344583
								if( Negative_Money_Flow > 1.5062e+06 )
									ret := -0.019608
					if( MFI > 78.5829 )
						if( Raw_Money_Flow <= 2.29758e+06 )
							if( Positive_Money_Flow_Sum <= 3.62091e+07 )
								if( Negative_Money_Flow <= 1.01745e+06 )
									ret := 0.414634
								if( Negative_Money_Flow > 1.01745e+06 )
									ret := 0.031250
							if( Positive_Money_Flow_Sum > 3.62091e+07 )
								if( MFI <= 86.594 )
									ret := -0.750000 // sell
								if( MFI > 86.594 )
									ret := -1.000000 // sell
						if( Raw_Money_Flow > 2.29758e+06 )
							if( MFI_Low <= 70.1557 )
								if( Negative_Money_Flow_Sum <= 5.2959e+06 )
									ret := 0.615385
								if( Negative_Money_Flow_Sum > 5.2959e+06 )
									ret := 0.925000 // buy
							if( MFI_Low > 70.1557 )
								ret := -0.500000
				if( Negative_Money_Flow_Sum > 9.37683e+06 )
					if( MFI_High <= -63.4382 )
						ret := 1.000000 // buy
					if( MFI_High > -63.4382 )
						if( Typical_Price <= 20.6595 )
							if( Positive_Money_Flow <= 2.0871e+06 )
								if( MFI_High <= -0.463036 )
									ret := 0.110386
								if( MFI_High > -0.463036 )
									ret := 0.840000 // buy
							if( Positive_Money_Flow > 2.0871e+06 )
								if( Typical_Price <= 19.2509 )
									ret := -0.612903
								if( Typical_Price > 19.2509 )
									ret := 0.500000
						if( Typical_Price > 20.6595 )
							if( Positive_Money_Flow_Sum <= 2.19833e+07 )
								if( MFI <= 41.0212 )
									ret := 0.470588
								if( MFI > 41.0212 )
									ret := -0.190476
							if( Positive_Money_Flow_Sum > 2.19833e+07 )
								if( Positive_Money_Flow_Sum <= 9.07477e+07 )
									ret := -0.717391 // sell
								if( Positive_Money_Flow_Sum > 9.07477e+07 )
									ret := 0.000000
	
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
float op_operation = decision_tree_0_LINKUSDT_15Min_6f7b92ca(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


