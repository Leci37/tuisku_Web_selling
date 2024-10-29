//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: DOTUSDT_15Min_2MM0_d048b29e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_15Min_2MM0_d048b29e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_15Min_d048b29e(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 138809 )
		if( Negative_Money_Flow_Sum <= 1.40069e+07 )
			if( Typical_Price <= 10.2131 )
				if( Negative_Money_Flow_Sum <= 1.85972e+06 )
					if( Long_MA <= 6.41491 )
						if( MFI <= 98.2674 )
							if( Positive_Money_Flow_Sum <= 806644 )
								if( Short_Long_Diff <= -0.001831 )
									ret := -0.029978
								if( Short_Long_Diff > -0.001831 )
									ret := 0.027932
							if( Positive_Money_Flow_Sum > 806644 )
								if( Positive_Money_Flow_Sum <= 1.3232e+06 )
									ret := 0.080343
								if( Positive_Money_Flow_Sum > 1.3232e+06 )
									ret := -0.011177
						if( MFI > 98.2674 )
							ret := 1.000000 // buy
					if( Long_MA > 6.41491 )
						if( Short_Long_Diff <= 0.04898 )
							if( Raw_Money_Flow <= 144137 )
								if( Short_MA <= 6.94927 )
									ret := -0.072207
								if( Short_MA > 6.94927 )
									ret := 0.055638
							if( Raw_Money_Flow > 144137 )
								if( Positive_Money_Flow_Sum <= 7.62486e+06 )
									ret := -0.075960
								if( Positive_Money_Flow_Sum > 7.62486e+06 )
									ret := -0.800000 // sell
						if( Short_Long_Diff > 0.04898 )
							if( Short_Long_Diff <= 0.077616 )
								if( Positive_Money_Flow_Sum <= 1.0123e+07 )
									ret := 0.205323
								if( Positive_Money_Flow_Sum > 1.0123e+07 )
									ret := -0.700000 // sell
							if( Short_Long_Diff > 0.077616 )
								if( Money_Flow_Ratio <= 4.83414 )
									ret := 0.333333
								if( Money_Flow_Ratio > 4.83414 )
									ret := -0.151515
				if( Negative_Money_Flow_Sum > 1.85972e+06 )
					if( Typical_Price <= 6.36835 )
						if( Raw_Money_Flow <= 711889 )
							if( MFI_High <= -56.8149 )
								if( Negative_Money_Flow <= 30782.7 )
									ret := -0.094883
								if( Negative_Money_Flow > 30782.7 )
									ret := 0.118694
							if( MFI_High > -56.8149 )
								if( MFI <= 62.9401 )
									ret := 0.105791
								if( MFI > 62.9401 )
									ret := -0.071770
						if( Raw_Money_Flow > 711889 )
							if( Positive_Money_Flow_Sum <= 1.37108e+07 )
								if( Money_Flow_Ratio <= 0.33557 )
									ret := 0.571429
								if( Money_Flow_Ratio > 0.33557 )
									ret := 0.256677
							if( Positive_Money_Flow_Sum > 1.37108e+07 )
								if( MFI_Low <= 65.7631 )
									ret := -0.500000
								if( MFI_Low > 65.7631 )
									ret := -0.941176 // sell
					if( Typical_Price > 6.36835 )
						if( Positive_Money_Flow <= 205763 )
							if( MA_Cross <= 2.12598 )
								if( Money_Flow_Ratio <= 0.297868 )
									ret := -0.070552
								if( Money_Flow_Ratio > 0.297868 )
									ret := 0.126777
							if( MA_Cross > 2.12598 )
								if( Money_Flow_Ratio <= 1.39946 )
									ret := 0.608247
								if( Money_Flow_Ratio > 1.39946 )
									ret := -0.555556
						if( Positive_Money_Flow > 205763 )
							if( Raw_Money_Flow <= 2.30709e+06 )
								if( Short_Long_Diff <= -0.055143 )
									ret := 0.087278
								if( Short_Long_Diff > -0.055143 )
									ret := -0.022880
							if( Raw_Money_Flow > 2.30709e+06 )
								if( Typical_Price <= 9.71269 )
									ret := 0.311321
								if( Typical_Price > 9.71269 )
									ret := -0.276316
			if( Typical_Price > 10.2131 )
				if( Short_Long_Diff <= -0.01983 )
					if( Negative_Money_Flow_Sum <= 1.13215e+07 )
						if( Negative_Money_Flow_Sum <= 8.88888e+06 )
							if( Negative_Money_Flow_Sum <= 5.55977e+06 )
								if( MFI_High <= -21.3235 )
									ret := 0.416000
								if( MFI_High > -21.3235 )
									ret := -0.380952
							if( Negative_Money_Flow_Sum > 5.55977e+06 )
								if( Positive_Money_Flow_Sum <= 8.32682e+06 )
									ret := -0.287879
								if( Positive_Money_Flow_Sum > 8.32682e+06 )
									ret := 0.437500
						if( Negative_Money_Flow_Sum > 8.88888e+06 )
							if( Positive_Money_Flow_Sum <= 9.83478e+06 )
								if( Short_MA <= 15.0272 )
									ret := 0.631068
								if( Short_MA > 15.0272 )
									ret := -0.428571
							if( Positive_Money_Flow_Sum > 9.83478e+06 )
								if( Raw_Money_Flow <= 1.06438e+06 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 1.06438e+06 )
									ret := -0.200000
					if( Negative_Money_Flow_Sum > 1.13215e+07 )
						if( Positive_Money_Flow_Sum <= 6.15234e+06 )
							if( Positive_Money_Flow_Sum <= 5.95041e+06 )
								if( Positive_Money_Flow <= 1.34935e+06 )
									ret := 0.052632
								if( Positive_Money_Flow > 1.34935e+06 )
									ret := -0.900000 // sell
							if( Positive_Money_Flow_Sum > 5.95041e+06 )
								ret := 0.800000 // buy
						if( Positive_Money_Flow_Sum > 6.15234e+06 )
							if( Typical_Price <= 10.4513 )
								if( Positive_Money_Flow <= 1.36211e+06 )
									ret := -0.666667
								if( Positive_Money_Flow > 1.36211e+06 )
									ret := 0.333333
							if( Typical_Price > 10.4513 )
								if( MFI_Low <= 19.9724 )
									ret := -0.925000 // sell
								if( MFI_Low > 19.9724 )
									ret := -0.578947
				if( Short_Long_Diff > -0.01983 )
					if( Positive_Money_Flow_Sum <= 8.3539e+06 )
						if( MFI_Low <= 29.0528 )
							if( Positive_Money_Flow <= 680215 )
								if( Typical_Price <= 10.9984 )
									ret := -0.043478
								if( Typical_Price > 10.9984 )
									ret := -0.698413
							if( Positive_Money_Flow > 680215 )
								if( MFI_Low <= 27.3948 )
									ret := 0.325581
								if( MFI_Low > 27.3948 )
									ret := -0.857143 // sell
						if( MFI_Low > 29.0528 )
							if( Positive_Money_Flow <= 452221 )
								if( MFI_Low <= 31.3116 )
									ret := 0.657143
								if( MFI_Low > 31.3116 )
									ret := 0.075949
							if( Positive_Money_Flow > 452221 )
								if( Negative_Money_Flow_Sum <= 2.35675e+06 )
									ret := -0.494949
								if( Negative_Money_Flow_Sum > 2.35675e+06 )
									ret := -0.007605
					if( Positive_Money_Flow_Sum > 8.3539e+06 )
						if( Positive_Money_Flow_Sum <= 1.87136e+07 )
							if( Long_MA <= 10.3678 )
								if( Long_MA <= 10.1403 )
									ret := -0.777778 // sell
								if( Long_MA > 10.1403 )
									ret := 0.067797
							if( Long_MA > 10.3678 )
								if( MFI_Low <= 42.1493 )
									ret := -0.632812
								if( MFI_Low > 42.1493 )
									ret := -0.395939
						if( Positive_Money_Flow_Sum > 1.87136e+07 )
							if( Positive_Money_Flow <= 1.77943e+06 )
								if( Short_Long_Diff <= 0.242922 )
									ret := -0.793103 // sell
								if( Short_Long_Diff > 0.242922 )
									ret := 0.352941
							if( Positive_Money_Flow > 1.77943e+06 )
								if( Positive_Money_Flow_Sum <= 2.32149e+07 )
									ret := 0.709677 // buy
								if( Positive_Money_Flow_Sum > 2.32149e+07 )
									ret := -0.090909
		if( Negative_Money_Flow_Sum > 1.40069e+07 )
			if( Money_Flow_Ratio <= 0.686448 )
				if( Money_Flow_Ratio <= 0.306535 )
					if( Short_MA <= 8.97333 )
						if( Short_MA <= 6.25558 )
							if( Short_Long_Diff <= -0.293779 )
								ret := -1.000000 // sell
							if( Short_Long_Diff > -0.293779 )
								ret := -0.750000 // sell
						if( Short_MA > 6.25558 )
							if( MFI <= 8.52217 )
								if( Short_Long_Diff <= -0.242222 )
									ret := 0.250000
								if( Short_Long_Diff > -0.242222 )
									ret := -1.000000 // sell
							if( MFI > 8.52217 )
								if( Short_Long_Diff <= -0.079232 )
									ret := 0.625000
								if( Short_Long_Diff > -0.079232 )
									ret := -0.375000
					if( Short_MA > 8.97333 )
						if( Raw_Money_Flow <= 3.00574e+06 )
							if( Negative_Money_Flow_Sum <= 1.8095e+07 )
								if( MFI_Low <= 0.992397 )
									ret := -0.500000
								if( MFI_Low > 0.992397 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 1.8095e+07 )
								if( Short_Long_Diff <= -0.32848 )
									ret := -0.666667
								if( Short_Long_Diff > -0.32848 )
									ret := -0.920000 // sell
						if( Raw_Money_Flow > 3.00574e+06 )
							if( Negative_Money_Flow_Sum <= 3.77845e+07 )
								ret := -0.250000
							if( Negative_Money_Flow_Sum > 3.77845e+07 )
								ret := 0.750000 // buy
				if( Money_Flow_Ratio > 0.306535 )
					if( Positive_Money_Flow <= 758993 )
						if( Positive_Money_Flow_Sum <= 8.71143e+06 )
							if( Positive_Money_Flow_Sum <= 7.3994e+06 )
								if( MFI_Low <= 12.9417 )
									ret := -0.444444
								if( MFI_Low > 12.9417 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 7.3994e+06 )
								if( Positive_Money_Flow_Sum <= 8.0787e+06 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 8.0787e+06 )
									ret := -0.666667
						if( Positive_Money_Flow_Sum > 8.71143e+06 )
							if( MFI_Low <= 19.7383 )
								if( Money_Flow_Ratio <= 0.553161 )
									ret := 0.500000
								if( Money_Flow_Ratio > 0.553161 )
									ret := 1.000000 // buy
							if( MFI_Low > 19.7383 )
								ret := -0.250000
					if( Positive_Money_Flow > 758993 )
						if( Short_Long_Diff <= -0.087893 )
							if( Typical_Price <= 10.6777 )
								if( MFI_Low <= 16.1875 )
									ret := 0.796078 // buy
								if( MFI_Low > 16.1875 )
									ret := 0.457143
							if( Typical_Price > 10.6777 )
								if( Negative_Money_Flow_Sum <= 3.0472e+07 )
									ret := 0.476190
								if( Negative_Money_Flow_Sum > 3.0472e+07 )
									ret := -0.606061
						if( Short_Long_Diff > -0.087893 )
							if( Negative_Money_Flow_Sum <= 1.92006e+07 )
								if( MFI_Low <= 14.7195 )
									ret := -0.123288
								if( MFI_Low > 14.7195 )
									ret := 0.560000
							if( Negative_Money_Flow_Sum > 1.92006e+07 )
								if( Positive_Money_Flow_Sum <= 1.50666e+07 )
									ret := 0.788462 // buy
								if( Positive_Money_Flow_Sum > 1.50666e+07 )
									ret := -0.200000
			if( Money_Flow_Ratio > 0.686448 )
				if( Negative_Money_Flow_Sum <= 2.3147e+07 )
					if( Long_MA <= 7.57101 )
						if( Raw_Money_Flow <= 1.14632e+06 )
							ret := -0.333333
						if( Raw_Money_Flow > 1.14632e+06 )
							if( Raw_Money_Flow <= 1.52514e+06 )
								ret := -0.750000 // sell
							if( Raw_Money_Flow > 1.52514e+06 )
								ret := -1.000000 // sell
					if( Long_MA > 7.57101 )
						if( Positive_Money_Flow <= 2.8466e+06 )
							if( Typical_Price <= 11.1723 )
								if( Short_Long_Diff <= -0.031244 )
									ret := -0.283019
								if( Short_Long_Diff > -0.031244 )
									ret := 0.226667
							if( Typical_Price > 11.1723 )
								if( Short_MA <= 12.8333 )
									ret := -0.833333 // sell
								if( Short_MA > 12.8333 )
									ret := -0.125000
						if( Positive_Money_Flow > 2.8466e+06 )
							if( Positive_Money_Flow_Sum <= 3.47924e+07 )
								if( Negative_Money_Flow_Sum <= 2.24104e+07 )
									ret := 0.706667 // buy
								if( Negative_Money_Flow_Sum > 2.24104e+07 )
									ret := -0.714286 // sell
							if( Positive_Money_Flow_Sum > 3.47924e+07 )
								ret := -1.000000 // sell
				if( Negative_Money_Flow_Sum > 2.3147e+07 )
					if( Typical_Price <= 9.49197 )
						if( MFI <= 41.1832 )
							ret := -0.833333 // sell
						if( MFI > 41.1832 )
							if( Positive_Money_Flow <= 3.89949e+06 )
								if( MFI_High <= -33.6204 )
									ret := 1.000000 // buy
								if( MFI_High > -33.6204 )
									ret := 0.625000
							if( Positive_Money_Flow > 3.89949e+06 )
								ret := -0.600000
					if( Typical_Price > 9.49197 )
						if( MFI_Low <= 24.2319 )
							if( MFI <= 42.9962 )
								ret := -0.714286 // sell
							if( MFI > 42.9962 )
								ret := 0.571429
						if( MFI_Low > 24.2319 )
							if( Positive_Money_Flow_Sum <= 2.33519e+07 )
								if( Negative_Money_Flow_Sum <= 2.4193e+07 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 2.4193e+07 )
									ret := -0.200000
							if( Positive_Money_Flow_Sum > 2.33519e+07 )
								if( Negative_Money_Flow_Sum <= 2.4204e+07 )
									ret := -0.750000 // sell
								if( Negative_Money_Flow_Sum > 2.4204e+07 )
									ret := -1.000000 // sell
	if( Negative_Money_Flow > 138809 )
		if( Short_Long_Diff <= -0.020432 )
			if( Long_MA <= 9.98677 )
				if( Raw_Money_Flow <= 245458 )
					if( Typical_Price <= 6.99392 )
						if( Money_Flow_Ratio <= 0.254197 )
							if( Negative_Money_Flow_Sum <= 3.74398e+06 )
								if( MFI <= 12.8783 )
									ret := 0.082192
								if( MFI > 12.8783 )
									ret := -0.312169
							if( Negative_Money_Flow_Sum > 3.74398e+06 )
								if( Negative_Money_Flow_Sum <= 1.05019e+07 )
									ret := 0.197080
								if( Negative_Money_Flow_Sum > 1.05019e+07 )
									ret := -1.000000 // sell
						if( Money_Flow_Ratio > 0.254197 )
							if( Negative_Money_Flow_Sum <= 2.15734e+06 )
								if( MFI <= 29.7331 )
									ret := -0.315789
								if( MFI > 29.7331 )
									ret := 0.102740
							if( Negative_Money_Flow_Sum > 2.15734e+06 )
								if( Positive_Money_Flow_Sum <= 1.10375e+06 )
									ret := 0.564935
								if( Positive_Money_Flow_Sum > 1.10375e+06 )
									ret := 0.147186
					if( Typical_Price > 6.99392 )
						if( Negative_Money_Flow_Sum <= 3.46926e+06 )
							if( Negative_Money_Flow_Sum <= 2.72969e+06 )
								if( MFI <= 33.9005 )
									ret := 0.093023
								if( MFI > 33.9005 )
									ret := -0.290323
							if( Negative_Money_Flow_Sum > 2.72969e+06 )
								if( Positive_Money_Flow_Sum <= 968114 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 968114 )
									ret := 0.316456
						if( Negative_Money_Flow_Sum > 3.46926e+06 )
							if( Short_Long_Diff <= -0.035476 )
								if( Short_Long_Diff <= -0.049095 )
									ret := -0.371429
								if( Short_Long_Diff > -0.049095 )
									ret := 0.090909
							if( Short_Long_Diff > -0.035476 )
								if( Positive_Money_Flow_Sum <= 2.76659e+06 )
									ret := -0.785714 // sell
								if( Positive_Money_Flow_Sum > 2.76659e+06 )
									ret := 0.100000
				if( Raw_Money_Flow > 245458 )
					if( Raw_Money_Flow <= 1.04569e+06 )
						if( MFI_Low <= -2.65558 )
							if( Positive_Money_Flow_Sum <= 1.97596e+06 )
								if( Short_MA <= 8.30838 )
									ret := 0.125000
								if( Short_MA > 8.30838 )
									ret := -0.317073
							if( Positive_Money_Flow_Sum > 1.97596e+06 )
								if( MFI_High <= -64.9983 )
									ret := -0.872340 // sell
								if( MFI_High > -64.9983 )
									ret := -0.214286
						if( MFI_Low > -2.65558 )
							if( Negative_Money_Flow_Sum <= 2.10993e+07 )
								if( Negative_Money_Flow_Sum <= 1.51712e+06 )
									ret := -0.363636
								if( Negative_Money_Flow_Sum > 1.51712e+06 )
									ret := 0.224958
							if( Negative_Money_Flow_Sum > 2.10993e+07 )
								if( Negative_Money_Flow_Sum <= 2.60911e+07 )
									ret := -0.909091 // sell
								if( Negative_Money_Flow_Sum > 2.60911e+07 )
									ret := 0.800000 // buy
					if( Raw_Money_Flow > 1.04569e+06 )
						if( MFI <= 44.3821 )
							if( Typical_Price <= 6.50356 )
								if( Short_Long_Diff <= -0.105722 )
									ret := 0.734043 // buy
								if( Short_Long_Diff > -0.105722 )
									ret := 0.372685
							if( Typical_Price > 6.50356 )
								if( Positive_Money_Flow_Sum <= 1.35589e+06 )
									ret := 0.075117
								if( Positive_Money_Flow_Sum > 1.35589e+06 )
									ret := 0.300398
						if( MFI > 44.3821 )
							if( MFI_High <= -33.3509 )
								if( Short_Long_Diff <= -0.083333 )
									ret := -0.500000
								if( Short_Long_Diff > -0.083333 )
									ret := -0.888889 // sell
							if( MFI_High > -33.3509 )
								if( Typical_Price <= 7.97667 )
									ret := 0.395833
								if( Typical_Price > 7.97667 )
									ret := -0.326087
			if( Long_MA > 9.98677 )
				if( Negative_Money_Flow <= 3.97677e+06 )
					if( Negative_Money_Flow_Sum <= 4.11351e+07 )
						if( Short_MA <= 11.198 )
							if( Money_Flow_Ratio <= 0.2842 )
								if( Positive_Money_Flow_Sum <= 2.38256e+06 )
									ret := 0.022222
								if( Positive_Money_Flow_Sum > 2.38256e+06 )
									ret := -0.595960
							if( Money_Flow_Ratio > 0.2842 )
								if( MFI <= 25.5974 )
									ret := 0.600000
								if( MFI > 25.5974 )
									ret := 0.123364
						if( Short_MA > 11.198 )
							if( Raw_Money_Flow <= 863253 )
								if( Money_Flow_Ratio <= 0.566587 )
									ret := -0.155340
								if( Money_Flow_Ratio > 0.566587 )
									ret := 0.280899
							if( Raw_Money_Flow > 863253 )
								if( Positive_Money_Flow_Sum <= 2.36435e+06 )
									ret := 0.156863
								if( Positive_Money_Flow_Sum > 2.36435e+06 )
									ret := -0.407407
					if( Negative_Money_Flow_Sum > 4.11351e+07 )
						if( Long_MA <= 10.3331 )
							ret := -1.000000 // sell
						if( Long_MA > 10.3331 )
							ret := -0.714286 // sell
				if( Negative_Money_Flow > 3.97677e+06 )
					if( Typical_Price <= 14.6252 )
						if( Short_Long_Diff <= -0.106642 )
							if( Typical_Price <= 10.0563 )
								if( Negative_Money_Flow_Sum <= 4.95596e+07 )
									ret := -0.500000
								if( Negative_Money_Flow_Sum > 4.95596e+07 )
									ret := 1.000000 // buy
							if( Typical_Price > 10.0563 )
								if( Positive_Money_Flow_Sum <= 6.43074e+06 )
									ret := 0.517241
								if( Positive_Money_Flow_Sum > 6.43074e+06 )
									ret := 0.931034 // buy
						if( Short_Long_Diff > -0.106642 )
							if( Positive_Money_Flow_Sum <= 9.86023e+06 )
								if( Positive_Money_Flow_Sum <= 4.5267e+06 )
									ret := -0.600000
								if( Positive_Money_Flow_Sum > 4.5267e+06 )
									ret := 0.791667 // buy
							if( Positive_Money_Flow_Sum > 9.86023e+06 )
								if( MFI_High <= -42.4516 )
									ret := -1.000000 // sell
								if( MFI_High > -42.4516 )
									ret := 0.000000
					if( Typical_Price > 14.6252 )
						if( Long_MA <= 15.7667 )
							ret := -0.750000 // sell
						if( Long_MA > 15.7667 )
							ret := -1.000000 // sell
		if( Short_Long_Diff > -0.020432 )
			if( Short_Long_Diff <= 0.139157 )
				if( Typical_Price <= 7.16979 )
					if( Raw_Money_Flow <= 1.19494e+06 )
						if( MFI_Low <= 16.1842 )
							if( Negative_Money_Flow_Sum <= 1.83974e+06 )
								if( Negative_Money_Flow <= 278566 )
									ret := 0.015353
								if( Negative_Money_Flow > 278566 )
									ret := -0.183636
							if( Negative_Money_Flow_Sum > 1.83974e+06 )
								if( MFI_High <= -66.9374 )
									ret := -0.387097
								if( MFI_High > -66.9374 )
									ret := 0.092105
						if( MFI_Low > 16.1842 )
							if( MFI <= 51.2859 )
								if( Raw_Money_Flow <= 914592 )
									ret := 0.147879
								if( Raw_Money_Flow > 914592 )
									ret := -0.133858
							if( MFI > 51.2859 )
								if( Positive_Money_Flow_Sum <= 1.91927e+06 )
									ret := -0.010139
								if( Positive_Money_Flow_Sum > 1.91927e+06 )
									ret := 0.115332
					if( Raw_Money_Flow > 1.19494e+06 )
						if( Money_Flow_Ratio <= 2.94598 )
							if( Negative_Money_Flow <= 2.27864e+06 )
								if( Short_MA <= 7.19429 )
									ret := 0.229268
								if( Short_MA > 7.19429 )
									ret := -0.750000 // sell
							if( Negative_Money_Flow > 2.27864e+06 )
								if( Negative_Money_Flow <= 3.95964e+06 )
									ret := 0.695652
								if( Negative_Money_Flow > 3.95964e+06 )
									ret := -0.181818
						if( Money_Flow_Ratio > 2.94598 )
							if( Raw_Money_Flow <= 1.81262e+06 )
								if( Negative_Money_Flow_Sum <= 2.30568e+06 )
									ret := 0.428571
								if( Negative_Money_Flow_Sum > 2.30568e+06 )
									ret := 0.948718 // buy
							if( Raw_Money_Flow > 1.81262e+06 )
								ret := -0.200000
				if( Typical_Price > 7.16979 )
					if( Negative_Money_Flow_Sum <= 9.56231e+06 )
						if( Negative_Money_Flow_Sum <= 7.51509e+06 )
							if( Positive_Money_Flow_Sum <= 5.90019e+06 )
								if( Raw_Money_Flow <= 481335 )
									ret := 0.042086
								if( Raw_Money_Flow > 481335 )
									ret := -0.066667
							if( Positive_Money_Flow_Sum > 5.90019e+06 )
								if( Positive_Money_Flow <= 3558.78 )
									ret := 0.100225
								if( Positive_Money_Flow > 3558.78 )
									ret := -0.422222
						if( Negative_Money_Flow_Sum > 7.51509e+06 )
							if( Positive_Money_Flow_Sum <= 4.43109e+06 )
								if( Raw_Money_Flow <= 1.92131e+06 )
									ret := 0.648649
								if( Raw_Money_Flow > 1.92131e+06 )
									ret := -0.600000
							if( Positive_Money_Flow_Sum > 4.43109e+06 )
								if( Short_MA <= 10.4894 )
									ret := -0.197772
								if( Short_MA > 10.4894 )
									ret := -0.543103
					if( Negative_Money_Flow_Sum > 9.56231e+06 )
						if( Short_MA <= 10.9562 )
							if( MFI_High <= -32.3887 )
								if( Positive_Money_Flow_Sum <= 9.5771e+06 )
									ret := 0.235294
								if( Positive_Money_Flow_Sum > 9.5771e+06 )
									ret := -0.216561
							if( MFI_High > -32.3887 )
								if( Raw_Money_Flow <= 3.09045e+06 )
									ret := 0.528125
								if( Raw_Money_Flow > 3.09045e+06 )
									ret := -0.111111
						if( Short_MA > 10.9562 )
							if( Negative_Money_Flow <= 3.05325e+06 )
								if( Long_MA <= 12.7345 )
									ret := -0.494949
								if( Long_MA > 12.7345 )
									ret := 0.416667
							if( Negative_Money_Flow > 3.05325e+06 )
								ret := 1.000000 // buy
			if( Short_Long_Diff > 0.139157 )
				if( Short_MA <= 11.2068 )
					if( Positive_Money_Flow_Sum <= 9.61984e+06 )
						if( Negative_Money_Flow_Sum <= 2.47784e+06 )
							if( Money_Flow_Ratio <= 3.83093 )
								ret := 0.250000
							if( Money_Flow_Ratio > 3.83093 )
								ret := 0.000000
						if( Negative_Money_Flow_Sum > 2.47784e+06 )
							if( MFI_High <= -12.6939 )
								ret := -0.500000
							if( MFI_High > -12.6939 )
								ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 9.61984e+06 )
						if( Long_MA <= 8.63554 )
							if( Negative_Money_Flow_Sum <= 2.97638e+06 )
								if( Negative_Money_Flow_Sum <= 2.42046e+06 )
									ret := 0.568182
								if( Negative_Money_Flow_Sum > 2.42046e+06 )
									ret := -0.260870
							if( Negative_Money_Flow_Sum > 2.97638e+06 )
								if( Raw_Money_Flow <= 5.27455e+06 )
									ret := 0.721519 // buy
								if( Raw_Money_Flow > 5.27455e+06 )
									ret := -0.142857
						if( Long_MA > 8.63554 )
							if( MFI_High <= -21.4862 )
								if( Positive_Money_Flow_Sum <= 1.73395e+07 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 1.73395e+07 )
									ret := -0.200000
							if( MFI_High > -21.4862 )
								if( Raw_Money_Flow <= 1.92336e+06 )
									ret := 0.475177
								if( Raw_Money_Flow > 1.92336e+06 )
									ret := 0.024096
				if( Short_MA > 11.2068 )
					if( Positive_Money_Flow_Sum <= 9.80443e+06 )
						ret := 0.857143 // buy
					if( Positive_Money_Flow_Sum > 9.80443e+06 )
						if( Negative_Money_Flow_Sum <= 1.9926e+07 )
							if( Raw_Money_Flow <= 1.85968e+06 )
								if( Positive_Money_Flow_Sum <= 1.3275e+07 )
									ret := -0.904762 // sell
								if( Positive_Money_Flow_Sum > 1.3275e+07 )
									ret := 0.600000
							if( Raw_Money_Flow > 1.85968e+06 )
								ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 1.9926e+07 )
							ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_MA_Cross_SMA 
//@version=5
//indicator title="MA Cross", overlay=true)

shortlen = input.int(9, title="Short MA Length", minval=1)
longlen = input.int(21, title="Long MA Length", minval=1)

// Calculate the short and long simple moving averages (SMA)
Short_MA = ta.sma(close, shortlen)
Long_MA = ta.sma(close, longlen)

// Calculate the difference between short MA and long MA
Short_Long_Diff = Short_MA - Long_MA

// Identify crossover points where short MA crosses above or below the long MA
MA_Cross = ta.valuewhen(ta.crossover(Short_MA, Long_MA), Short_MA, 0)

// Plot the results
plot(Short_MA, color=color.orange, title="Short MA")
plot(Long_MA, color=color.green, title="Long MA")
plotshape(na(MA_Cross) ? na : MA_Cross, style=shape.cross, location=location.absolute, color=color.blue, title="Cross")


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
float op_operation = decision_tree_0_DOTUSDT_15Min_d048b29e(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


